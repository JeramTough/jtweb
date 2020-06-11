package com.jeramtough.jtweb.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jeramtough.jtweb.component.apiresponse.BeanValidator;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseException;
import com.jeramtough.jtweb.model.QueryPage;
import com.jeramtough.jtweb.model.dto.PageDto;
import com.jeramtough.jtweb.model.params.QueryByPageParams;
import com.jeramtough.jtweb.service.BaseDtoService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * Created on 2020/1/30 14:41
 * by @author JeramTough
 * </pre>
 */
public abstract class BaseDtoServiceImpl<M extends BaseMapper<T>, T, D>
        extends ServiceImpl<M, T> implements BaseDtoService<T, D> {

    private WebApplicationContext wc;
    private MapperFacade mapperFacade;

    public BaseDtoServiceImpl(WebApplicationContext wc,
                              MapperFacade mapperFacade) {
        this.wc = wc;
        this.mapperFacade = mapperFacade;
    }

    public WebApplicationContext getWC() {
        return wc;
    }

    public MapperFacade getMapperFacade() {
        return mapperFacade;
    }

    public D getBaseDto(T t) {
        return toDto(t);
    }

    public List<D> getDtoList(List<T> tList) {
        List<D> dList = new ArrayList<>(tList.size());
        for (T t : tList) {
            dList.add(toDto(t));
        }
        return dList;
    }

    @Override
    public PageDto<D> getBaseDtoListByPage(QueryByPageParams queryByPageParams) {
        BeanValidator.verifyDto(queryByPageParams);
        QueryPage<T> queryPage = getBaseMapper().selectPage(
                new QueryPage<>(queryByPageParams), null);
        return getPageDto(queryPage);
    }

    @Override
    public List<D> getAllBaseDto() {
        List<T> list = getBaseMapper().selectList(null);
        return getDtoList(list);
    }

    @Override
    public D getBaseDtoById(Long id) {
        T t = getById(id);
        if (t == null) {
            throw new ApiResponseException(669);
        }
        return toDto(t);
    }

    public PageDto<D> getPageDto(QueryPage<T> queryPage) {
        PageDto<D> pageDto = new PageDto<>();
        pageDto.setIndex(queryPage.getCurrent());
        pageDto.setSize(queryPage.getSize());
        pageDto.setTotal(queryPage.getTotal());
        pageDto.setList(getDtoList(queryPage.getRecords()));
        return pageDto;
    }

    protected abstract D toDto(T t);

}

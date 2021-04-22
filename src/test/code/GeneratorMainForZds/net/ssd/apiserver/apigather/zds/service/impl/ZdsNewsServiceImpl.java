package net.ssd.apiserver.apigather.zds.service.impl;

import net.ssd.apiserver.apigather.zds.model.entity.ZdsNews;
import net.ssd.apiserver.apigather.zds.dao.mapper.ZdsNewsMapper;
import net.ssd.apiserver.apigather.zds.service.ZdsNewsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-03-08
 */
@Service
public class ZdsNewsServiceImpl extends ServiceImpl<ZdsNewsMapper, ZdsNews> implements ZdsNewsService {

}

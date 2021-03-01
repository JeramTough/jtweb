package com.jeramtough.jtweb.model.dto;

import java.io.Serializable;
import java.util.List;

/**
 * <pre>.params
 *
 * Created on 2020/2/9 11:41
 * by @author JeramTough
 * </pre>
 */
public class PageDto<T> implements Serializable {

    private static final long serialVersionUID = 7653183466891188047L;

    private Long index;

    private Long size;

    private Long total;

    private List<T> list;

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}

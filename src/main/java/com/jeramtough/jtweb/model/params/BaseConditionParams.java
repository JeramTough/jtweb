package com.jeramtough.jtweb.model.params;

import com.alibaba.fastjson.annotation.JSONField;
import com.jeramtough.jtweb.component.validation.constraints.NotBlankButNull;
import com.jeramtough.jtweb.model.error.ErrorU;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * <pre>
 * Created on 2020/10/30 16:56
 * by @author WeiBoWen
 * </pre>
 */
@ApiModel
public class BaseConditionParams {


    @ApiModelProperty(value = "关键词", example = "某某", required = false)
    @NotBlankButNull(payload = ErrorU.CODE_2.class, isSetNullAuto = true)
    private String keyword;

    @JSONField(format = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "时间环查询的开始时间", example = "1996-02-23", required = false)
    private LocalDate startDate;

    @JSONField(format = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "时间环查询的结束时间", example = "2021-02-23", required = false)
    private LocalDate endDate;


    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }


    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }


}

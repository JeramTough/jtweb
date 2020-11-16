package com.jeramtough.jtweb.component.apiresponse.exception;

import com.jeramtough.jtweb.component.apiresponse.bean.FailureReason;

import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 * Created on 2020/10/13 0:27
 * by @author WeiBoWen
 * </pre>
 */
public class ApiResponseBeanException extends ApiResponseException {

    private String fieldName;

    public ApiResponseBeanException(FailureReason failureReason, String fieldName) {
        super(failureReason);
        this.fieldName = fieldName;
    }

    public ApiResponseBeanException(int code, String fieldName, String... placeholders) {
        super(new FailureReason(code, Arrays.asList(placeholders)));
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
package com.ecommerce.common.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusinessException extends RuntimeException {

    private List<FieldError> fieldErrors = new ArrayList<>();
    private Map<String, Object> mapList = new HashMap<>();

    public BusinessException() {

    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(List<FieldError> fieldErrors) {
        this.fieldErrors.addAll(fieldErrors);
    }

    public BusinessException(Map<String, Object> mapList) {
        this.mapList.putAll(mapList);
    }

    public List<FieldError> getFieldErrors() {
        return fieldErrors;
    }

    public Map<String, Object> getMapList() {
        return mapList;
    }
}

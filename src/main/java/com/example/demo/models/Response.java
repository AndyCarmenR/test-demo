package com.example.demo.models;

import java.util.HashMap;

public class Response {

    private String description;
    private Integer httpCode;
    private Boolean isSuccess;
    private HashMap<String, Object> serviceResponse;

    public Response(String description, Integer httpCode, Boolean isSuccess, HashMap<String, Object> serviceResponse) {
        this.description = description;
        this.httpCode = httpCode;
        this.isSuccess = isSuccess;
        this.serviceResponse = serviceResponse;
    }

    public Response() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public HashMap<String, Object> getServiceResponse() {
        return serviceResponse;
    }

    public void setServiceResponse(HashMap<String, Object> serviceResponse) {
        this.serviceResponse = serviceResponse;
    }
}

package com.perfios.exception;

import io.swagger.annotations.ApiModelProperty;

public class ExceptionResponse {

    @ApiModelProperty(value = "status", example = "500,400")
    private String status;
    @ApiModelProperty(value = "error", example = "Internal Server Error, Bad Request")
    private String error;

    public ExceptionResponse() {
    }

    public ExceptionResponse(String status, String error) {
        this.status = status;
        this.error = error;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
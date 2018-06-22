package com.binzhou.zhy.model.result;

import org.springframework.http.HttpStatus;

public class Result<T> extends BaseResultDO {

    private T data;
    private int totalNum;
    private int result = 1;
    private HttpStatus status;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}

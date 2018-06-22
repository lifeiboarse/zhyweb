package com.binzhou.zhy.model.result;

import com.binzhou.zhy.exception.ErrorCodeEnum;
import com.binzhou.zhy.model.BaseDO;

/**
 * 基础返回结果
 */
public class BaseResultDO extends BaseDO {

    /**
     * 默认操作成功
     */
    private Boolean success = Boolean.TRUE;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误信息
     */
    private String errorMessage;

    /**
     * 备注信息
     */
    private String remark;





    public void setErrorCode(ErrorCodeEnum error) {
        this.errorCode = error.getCode();
        this.errorMessage = error.getMsg();
        this.success = Boolean.FALSE;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "BaseResultDO{" +
                "success=" + success +
                ", errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}

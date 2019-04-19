package com.aiyi.server.manager.nginx.bean.result;

/**
 * HttpResponse结果封装类
 *
 * @ModificationHistory Who When What
 * > 2019-04-19 | 郭胜凯 | create
 */
public class Result {

    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 状态码：非Http状态码
     */
    private String code;

    /**
     * 结果描述
     */
    private String message;

    /**
     * 结果内容
     */
    private Object result;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public String toString() {
        StringBuffer bf = new StringBuffer("{");
        bf.append("\"success\":").append(success)
                .append(",\"code\":\"").append(code).append("\"")
                .append(",\"message\":\"").append(message).append("\"").append("}");
        return bf.toString();
    }

}

package com.aiyi.server.manager.nginx.bean.nginx;

/**
 * @ModificationHistory Who When What
 * > 2019-04-19 | 郭胜凯 | create
 */
public class NginxProxySetHeader {

    /**
     * 头
     */
    private String header;

    /**
     * 值
     */
    private String value;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

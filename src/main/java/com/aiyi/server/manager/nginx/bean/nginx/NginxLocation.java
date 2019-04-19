package com.aiyi.server.manager.nginx.bean.nginx;

import java.util.List;

/**
 * @ModificationHistory Who When What
 * > 2018/4/11 | 郭胜凯 | create
 */
public class NginxLocation {

    /**
     * 名称/标识
     */
    private String name;

    /**
     * 规则映射(地址)
     */
    private String path;

    /**
     * 资源跟路径
     */
    private String root;

    /**
     * 索引文件
     */
    private String index;

    /**
     * 转发地址(负载地址)
     */
    private String proxyPass;

    /**
     * Http头
     */
    private List<NginxProxySetHeader> proxySetHeader;

    /**
     * 映射规则Id(Base64UrlEncoding)
     */
    private String pathId;

    public String getPathId() {
        return pathId;
    }

    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getProxyPass() {
        return proxyPass;
    }

    public void setProxyPass(String proxyPass) {
        this.proxyPass = proxyPass;
    }

    public List<NginxProxySetHeader> getProxySetHeader() {
        return proxySetHeader;
    }

    public void setProxySetHeader(List<NginxProxySetHeader> proxySetHeader) {
        this.proxySetHeader = proxySetHeader;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}

package com.aiyi.server.manager.nginx.bean;

/**
 * 用户实体
 *
 * @Author : 郭胜凯
 * @create : 2018年2月26日 上午9:41:50
 * @ModificationHistory Who When What
 * 郭胜凯 2018年2月26日 create
 */
public class User {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

package com.lee.demo.pojo;

import java.util.Date;

public class User {
    private String id;// id

    private String username;// 用户名

    private String password;// 密码

    private String mobile;// 手机号

    private Date createtime;// 创建时间

    private Date lastupdatetime;// 最后修改时间

    private Integer status;// 状态:0不启用，1启用

    public User() {
    }

    public User(String id, String username, String password, String mobile, Date createtime, Date lastupdatetime, Integer status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.mobile = mobile;
        this.createtime = createtime;
        this.lastupdatetime = lastupdatetime;
        this.status = status;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

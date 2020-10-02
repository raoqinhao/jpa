package com.hh.jpa.pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author zhouxinlei
 * @version 0.1
 * @application 系统用户库
 * @Copyright 上海危网信息科技有限公司版权所有
 * @company wwsoft
 * @time 2018年12月10日 下午6:43:44
 */
@Entity
@Table(name = "U_USER_1")
public class Uuser1 implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -7062569821893316344L;

    @Id
    @GeneratedValue(generator = "uuidGenerator")
    @GenericGenerator(name = "uuidGenerator", strategy = "com.hh.jpa.util.UuidGenerator")
    /**用户id*/
    @Column(name = "USERID")
    private String userId;

    /**
     * 账户是否启用 0：不可用，1:可用
     */
    @Column(name = "ISACCOUNTENABLE")
    private Long accountEnabled;

    /**
     * 密码
     */
    @Column(name = "PASSWORD")
    private String password;

    /**
     * 显示名称
     */
    @Column(name = "SHOWNAME")
    private String showName;

    /**
     * 用户名
     */
    @Column(name = "USERNAME")
    private String userName;

    /**
     * 部门Id 企业账号：只放企业社会信用代码，政府账号：机构社会信用代码+部门id
     */
    @Column(name = "DEPARTMENTID")
    private String departmentId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getAccountEnabled() {
        return accountEnabled;
    }

    public void setAccountEnabled(Long accountEnabled) {
        this.accountEnabled = accountEnabled;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
}
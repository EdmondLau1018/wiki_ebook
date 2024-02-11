package com.edmond.wiki.domain;

import java.io.Serializable;

/**
 * 测试(Test)实体类
 *
 * @author edmond
 * @since 2024-02-11 09:27:06
 */
public class Test implements Serializable {
    private static final long serialVersionUID = -53231296374926710L;
    /**
     * id
     */
    private Long id;
    /**
     * 名称
     */
    private String name;
    /**
     * 密码
     */
    private String password;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}


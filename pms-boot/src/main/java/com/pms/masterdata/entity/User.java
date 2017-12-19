package com.pms.masterdata.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * <p>Field serialVersionUID: TODO</p>
     */
    private static final long serialVersionUID = 5883442362636790304L;
    
    private int id;
    private String name;
    private Date birthday;
    private String address;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    
}

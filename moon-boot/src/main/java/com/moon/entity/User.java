package com.moon.entity;

import java.io.Serializable;
import javax.persistence.*;

public class User implements Serializable {
    @Id
    private Integer uid;

    private String upass;

    private String uname;

    private Integer uage;

    private static final long serialVersionUID = 1L;

    /**
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return upass
     */
    public String getUpass() {
        return upass;
    }

    /**
     * @param upass
     */
    public void setUpass(String upass) {
        this.upass = upass;
    }

    /**
     * @return uname
     */
    public String getUname() {
        return uname;
    }

    /**
     * @param uname
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * @return uage
     */
    public Integer getUage() {
        return uage;
    }

    /**
     * @param uage
     */
    public void setUage(Integer uage) {
        this.uage = uage;
    }
}
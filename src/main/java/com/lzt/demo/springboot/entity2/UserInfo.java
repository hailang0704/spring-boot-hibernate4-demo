package com.lzt.demo.springboot.entity2;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "UserInfo", schema = "test")
public class UserInfo {
    private long uid;
    private String name;
    private String username;
    private String password;
    private String salt;
    private byte state;

    @Id
    @Column(name = "uid")
    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "salt")
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Basic
    @Column(name = "state")
    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo userInfo = (UserInfo) o;
        return uid == userInfo.uid &&
                state == userInfo.state &&
                Objects.equals(name, userInfo.name) &&
                Objects.equals(username, userInfo.username) &&
                Objects.equals(password, userInfo.password) &&
                Objects.equals(salt, userInfo.salt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, name, username, password, salt, state);
    }
}

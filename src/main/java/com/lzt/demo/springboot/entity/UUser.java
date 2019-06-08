package com.lzt.demo.springboot.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "u_user", schema = "shiro_demo")
public class UUser {
    private long id;
    private String nickname;
    private String email;
    private String pswd;
    private Timestamp createTime;
    private Timestamp lastLoginTime;
    private Long status;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "pswd")
    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "last_login_time")
    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Basic
    @Column(name = "status")
    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UUser uUser = (UUser) o;
        return id == uUser.id &&
                Objects.equals(nickname, uUser.nickname) &&
                Objects.equals(email, uUser.email) &&
                Objects.equals(pswd, uUser.pswd) &&
                Objects.equals(createTime, uUser.createTime) &&
                Objects.equals(lastLoginTime, uUser.lastLoginTime) &&
                Objects.equals(status, uUser.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname, email, pswd, createTime, lastLoginTime, status);
    }
}

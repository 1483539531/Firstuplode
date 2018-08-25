package main.java.entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DevUser {
    @Min(7)
    @Max(10)
    private Integer id;//主键id
    @NotEmpty(message="用户名不能为空")
    private String devCode;//开发者帐号(系统登录账号)
    private String devName;//开发者名称
    private String devPassword;//开发者密码
    private String devEmail;//开发者邮箱
    private String devInfo;    //开发者简介
    private Integer createdBy;//创建者
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date creationDate;//创建时间
    private Integer modifyBy;//更新者
    private Date modifyDate;//更新时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDevCode() {
        return devCode;
    }

    public void setDevCode(String devCode) {
        this.devCode = devCode;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public String getDevPassword() {
        return devPassword;
    }

    public void setDevPassword(String devPassword) {
        this.devPassword = devPassword;
    }

    public String getDevEmail() {
        return devEmail;
    }

    public void setDevEmail(String devEmail) {
        this.devEmail = devEmail;
    }

    public String getDevInfo() {
        return devInfo;
    }

    public void setDevInfo(String devInfo) {
        this.devInfo = devInfo;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Integer modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public String toString() {
        return "DevUser [id=" + id + ", devCode=" + devCode + ", devName=" + devName + ", devPassword=" + devPassword
                + ", devEmail=" + devEmail + ", devInfo=" + devInfo + ", createdBy=" + createdBy + ", creationDate="
                + creationDate.toString() + ", modifyBy=" + modifyBy + ", modifyDate=" + modifyDate + "]";
    }


}

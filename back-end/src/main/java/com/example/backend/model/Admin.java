package com.example.backend.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;

public class Admin {
    @Id
    @GeneratedValue

    private Integer AdminId;
    private String AdminFirstName;
    private String AdminLastName;
    private String AdminType;
    private String AdminEmail;
    private String AdminPhoneNo;
    private String AdminUsername;
    private String AdminPassword;

    public Integer getAdminId() {
        return AdminId;
    }

    public void setAdminId(Integer adminId) {
        AdminId = adminId;
    }

    public String getAdminFirstName() {
        return AdminFirstName;
    }

    public void setAdminFirstName(String adminFirstName) {
        AdminFirstName = adminFirstName;
    }

    public String getAdminLastName() {
        return AdminLastName;
    }

    public void setAdminLastName(String adminLastName) {
        AdminLastName = adminLastName;
    }

    public String getAdminType() {
        return AdminType;
    }

    public void setAdminType(String adminType) {
        AdminType = adminType;
    }

    public String getAdminEmail() {
        return AdminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        AdminEmail = adminEmail;
    }

    public String getAdminPhoneNo() {
        return AdminPhoneNo;
    }

    public void setAdminPhoneNo(String adminPhoneNo) {
        AdminPhoneNo = adminPhoneNo;
    }

    public String getAdminUsername() {
        return AdminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        AdminUsername = adminUsername;
    }

    public String getAdminPassword() {
        return AdminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        AdminPassword = adminPassword;
    }
}

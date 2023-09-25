package com.submit.user.management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    private Integer userId;
    @NotBlank(message = "Username is required")
    private String userName;
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Date of Birth should be in yyyy-MM-dd format")
    private String dob;


    @Email(message = "Invalid email format")
    private String email;

    @NotBlank
    private Integer phoneNumber;
    @Column(name = "user_date")
    private String userDate;
    private String userTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    public String getUserDate() {
//        return userDate;
//    }
//
//    public void setUserDate(String userDate) {
//        this.userDate = userDate;
//    }
//
//    public String getUserTime() {
//        return userTime;
//    }
//
//    public void setUserTime(String userTime) {
//        this.userTime = userTime;
//    }
}

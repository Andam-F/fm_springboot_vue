package com.andam.fp.domain.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;

import java.util.Date;

public class User {
    @JsonIgnore
    private Integer userId;

    private String loginId;

    private String nickname;

    private String password;

    private String signature;

    private Byte sex;

    private Date birthday;

    private String telephone;

    private String userName;

    private String email;

    private String intro;

    private String headportrait;

    private Integer age;

    private String constellation;

    private String bloodtype;

    private String schooltag;

    private String vocation;

    private Integer nationId;

    private Integer provinceId;

    private Integer cityId;

    private Integer friendShipPolicyId;

    private Integer userStateId;

    private String friendPolicyQuestion;

    private String friendPolicyAnswer;

    private String friendPolicyPassword;

    private Date createTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getHeadportrait() {
        return headportrait;
    }

    public void setHeadportrait(String headportrait) {
        this.headportrait = headportrait == null ? null : headportrait.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation == null ? null : constellation.trim();
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype == null ? null : bloodtype.trim();
    }

    public String getSchooltag() {
        return schooltag;
    }

    public void setSchooltag(String schooltag) {
        this.schooltag = schooltag == null ? null : schooltag.trim();
    }

    public String getVocation() {
        return vocation;
    }

    public void setVocation(String vocation) {
        this.vocation = vocation == null ? null : vocation.trim();
    }

    public Integer getNationId() {
        return nationId;
    }

    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getFriendShipPolicyId() {
        return friendShipPolicyId;
    }

    public void setFriendShipPolicyId(Integer friendShipPolicyId) {
        this.friendShipPolicyId = friendShipPolicyId;
    }

    public Integer getUserStateId() {
        return userStateId;
    }

    public void setUserStateId(Integer userStateId) {
        this.userStateId = userStateId;
    }

    public String getFriendPolicyQuestion() {
        return friendPolicyQuestion;
    }

    public void setFriendPolicyQuestion(String friendPolicyQuestion) {
        this.friendPolicyQuestion = friendPolicyQuestion == null ? null : friendPolicyQuestion.trim();
    }

    public String getFriendPolicyAnswer() {
        return friendPolicyAnswer;
    }

    public void setFriendPolicyAnswer(String friendPolicyAnswer) {
        this.friendPolicyAnswer = friendPolicyAnswer == null ? null : friendPolicyAnswer.trim();
    }

    public String getFriendPolicyPassword() {
        return friendPolicyPassword;
    }

    public void setFriendPolicyPassword(String friendPolicyPassword) {
        this.friendPolicyPassword = friendPolicyPassword == null ? null : friendPolicyPassword.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
package com.cy.store.entity;

        import java.io.Serializable;
        import java.util.Objects;

/**
 * 用户的实体类 ： SpringBoot做开发的时候极为简洁，遵循约定大于配置
 */
public class User extends BaseEntity implements Serializable {
    //类型建议用包装类
    private Integer uid;
    private String username ;
    private String password;
    private String salt;
    private String phone;
    private String email;
    private Integer gender; //'性别:0-女，1-男',
    private String avatar ;//'头像',
    private Integer isDelete;

    //任何实体类都要作训三个规则 get()set()方法 、equals()和HashCode()方法、  ToString()方法


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return getUid().equals(user.getUid()) &&
                getUsername().equals(user.getUsername()) &&
                getPassword().equals(user.getPassword()) &&
                getSalt().equals(user.getSalt()) &&
                getPhone().equals(user.getPhone()) &&
                getEmail().equals(user.getEmail()) &&
                getGender().equals(user.getGender()) &&
                getAvatar().equals(user.getAvatar()) &&
                getIsDelete().equals(user.getIsDelete());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getUid(), getUsername(), getPassword(), getSalt(), getPhone(), getEmail(), getGender(), getAvatar(), getIsDelete());
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", avatar='" + avatar + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}

package com.ssmssm.entity.system;

import java.beans.Transient;
import java.io.Serializable;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class User extends UserKey implements UserDetails, Serializable {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_auth_user.user_name
     * @mbggenerated
     */
    private String userName;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_auth_user.user_psw
     * @mbggenerated
     */
    private String userPsw;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_auth_user.user_type
     * @mbggenerated
     */
    private Short userType;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_auth_user.user_enabled
     * @mbggenerated
     */
    private Short userEnabled;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_auth_user.full_name
     * @mbggenerated
     */
    private String fullName;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_auth_user.sex
     * @mbggenerated
     */
    private Short sex;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_auth_user.email
     * @mbggenerated
     */
    private String email;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_auth_user.mobile_phone
     * @mbggenerated
     */
    private Long mobilePhone;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_auth_user.comments
     * @mbggenerated
     */
    private String comments;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_auth_user.head_sculpture
     * @mbggenerated
     */
    private String headSculpture;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table t_auth_user
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_auth_user.user_name
     * @return  the value of t_auth_user.user_name
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_auth_user.user_name
     * @param userName  the value for t_auth_user.user_name
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_auth_user.user_psw
     * @return  the value of t_auth_user.user_psw
     * @mbggenerated
     */
    public String getUserPsw() {
        return userPsw;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_auth_user.user_psw
     * @param userPsw  the value for t_auth_user.user_psw
     * @mbggenerated
     */
    public void setUserPsw(String userPsw) {
        this.userPsw = userPsw == null ? null : userPsw.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_auth_user.user_type
     * @return  the value of t_auth_user.user_type
     * @mbggenerated
     */
    public Short getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_auth_user.user_type
     * @param userType  the value for t_auth_user.user_type
     * @mbggenerated
     */
    public void setUserType(Short userType) {
        this.userType = userType;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_auth_user.user_enabled
     * @return  the value of t_auth_user.user_enabled
     * @mbggenerated
     */
    public Short getUserEnabled() {
        return userEnabled;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_auth_user.user_enabled
     * @param userEnabled  the value for t_auth_user.user_enabled
     * @mbggenerated
     */
    public void setUserEnabled(Short userEnabled) {
        this.userEnabled = userEnabled;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_auth_user.full_name
     * @return  the value of t_auth_user.full_name
     * @mbggenerated
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_auth_user.full_name
     * @param fullName  the value for t_auth_user.full_name
     * @mbggenerated
     */
    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_auth_user.sex
     * @return  the value of t_auth_user.sex
     * @mbggenerated
     */
    public Short getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_auth_user.sex
     * @param sex  the value for t_auth_user.sex
     * @mbggenerated
     */
    public void setSex(Short sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_auth_user.email
     * @return  the value of t_auth_user.email
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_auth_user.email
     * @param email  the value for t_auth_user.email
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_auth_user.mobile_phone
     * @return  the value of t_auth_user.mobile_phone
     * @mbggenerated
     */
    public Long getMobilePhone() {
        return mobilePhone;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_auth_user.mobile_phone
     * @param mobilePhone  the value for t_auth_user.mobile_phone
     * @mbggenerated
     */
    public void setMobilePhone(Long mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_auth_user.comments
     * @return  the value of t_auth_user.comments
     * @mbggenerated
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_auth_user.comments
     * @param comments  the value for t_auth_user.comments
     * @mbggenerated
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_auth_user.head_sculpture
     * @return  the value of t_auth_user.head_sculpture
     * @mbggenerated
     */
    public String getHeadSculpture() {
        return headSculpture;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_auth_user.head_sculpture
     * @param headSculpture  the value for t_auth_user.head_sculpture
     * @mbggenerated
     */
    public void setHeadSculpture(String headSculpture) {
        this.headSculpture = headSculpture == null ? null : headSculpture.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_auth_user
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userName=").append(userName);
        sb.append(", userPsw=").append(userPsw);
        sb.append(", userType=").append(userType);
        sb.append(", userEnabled=").append(userEnabled);
        sb.append(", fullName=").append(fullName);
        sb.append(", sex=").append(sex);
        sb.append(", email=").append(email);
        sb.append(", mobilePhone=").append(mobilePhone);
        sb.append(", comments=").append(comments);
        sb.append(", headSculpture=").append(headSculpture);
        sb.append("]");
        return sb.toString();
    }

    /** authorities(List<GrantedAuthority>):用户角色列表. */
    private List<GrantedAuthority> authorities;
    
    /**
     * 获取用户角色列表.
     */
    @Transient
    //@JsonIgnore
    public List<GrantedAuthority> getAuthorities() {
        return authorities;
    }
    
    /**
     * 设置用户角色列表.
     */
    public void setAuthorities(List<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

	public boolean isAccountNonExpired() {
		return true;
	}
	public boolean isAccountNonLocked() {
		return true;
	}
	public boolean isCredentialsNonExpired() {
		return true;
	}
	public boolean isEnabled() {
		return true;
	}

	@Override
	public String getPassword() {
		return this.userPsw;
	}

	@Override
	public String getUsername() {
		return this.userName;
	}
}
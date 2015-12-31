package com.ssmssm.entity.system;

import com.ssmssm.core.entity.BaseEntity;

import java.io.Serializable;

public class BolbFileKey extends BaseEntity implements Serializable {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_sys_blob_file.id
     * @mbggenerated
     */
    private String id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table t_sys_blob_file
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_sys_blob_file.id
     * @return  the value of t_sys_blob_file.id
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_sys_blob_file.id
     * @param id  the value for t_sys_blob_file.id
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_sys_blob_file
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append("]");
        return sb.toString();
    }
}
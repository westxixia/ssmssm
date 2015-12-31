package com.ssmssm.dao.system;

import com.ssmssm.core.annotation.MyBatisRepository;
import com.ssmssm.core.dao.BaseDao;
import com.ssmssm.entity.system.UserRole;
import com.ssmssm.entity.system.UserRoleCriteria;
import com.ssmssm.entity.system.UserRoleKey;

import java.util.List;

import org.apache.ibatis.annotations.Param;

@MyBatisRepository
public interface UserRoleMapper extends BaseDao{

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_auth_user_role
     * @mbggenerated
     */
    int countByExample(UserRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_auth_user_role
     * @mbggenerated
     */
    int deleteByExample(UserRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_auth_user_role
     * @mbggenerated
     */
    int deleteByPrimaryKey(UserRoleKey key);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_auth_user_role
     * @mbggenerated
     */
    int insert(UserRole record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_auth_user_role
     * @mbggenerated
     */
    int insertSelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_auth_user_role
     * @mbggenerated
     */
    List<UserRole> selectByExample(UserRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_auth_user_role
     * @mbggenerated
     */
    UserRole selectByPrimaryKey(UserRoleKey key);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_auth_user_role
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_auth_user_role
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_auth_user_role
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_auth_user_role
     * @mbggenerated
     */
    int updateByPrimaryKey(UserRole record);
}
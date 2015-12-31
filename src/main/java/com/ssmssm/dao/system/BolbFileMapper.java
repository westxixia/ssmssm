package com.ssmssm.dao.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssmssm.core.annotation.MyBatisRepository;
import com.ssmssm.core.dao.BaseDao;
import com.ssmssm.entity.system.BolbFile;
import com.ssmssm.entity.system.BolbFileCriteria;
import com.ssmssm.entity.system.BolbFileKey;

@MyBatisRepository
public interface BolbFileMapper extends BaseDao{

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_sys_blob_file
     * @mbggenerated
     */
    int countByExample(BolbFileCriteria example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_sys_blob_file
     * @mbggenerated
     */
    int deleteByExample(BolbFileCriteria example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_sys_blob_file
     * @mbggenerated
     */
    int deleteByPrimaryKey(BolbFileKey key);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_sys_blob_file
     * @mbggenerated
     */
    int insert(BolbFile record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_sys_blob_file
     * @mbggenerated
     */
    int insertSelective(BolbFile record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_sys_blob_file
     * @mbggenerated
     */
    List<BolbFile> selectByExample(BolbFileCriteria example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_sys_blob_file
     * @mbggenerated
     */
    BolbFile selectByPrimaryKey(BolbFileKey key);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_sys_blob_file
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BolbFile record, @Param("example") BolbFileCriteria example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_sys_blob_file
     * @mbggenerated
     */
    int updateByExample(@Param("record") BolbFile record, @Param("example") BolbFileCriteria example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_sys_blob_file
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BolbFile record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_sys_blob_file
     * @mbggenerated
     */
    int updateByPrimaryKey(BolbFile record);
}
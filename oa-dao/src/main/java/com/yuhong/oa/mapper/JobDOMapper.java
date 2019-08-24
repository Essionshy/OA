package com.yuhong.oa.mapper;

import com.yuhong.oa.entity.JobDO;
import com.yuhong.oa.entity.JobDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobDOMapper {
    long countByExample(JobDOExample example);

    int deleteByExample(JobDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JobDO record);

    int insertSelective(JobDO record);

    List<JobDO> selectByExample(JobDOExample example);

    JobDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JobDO record, @Param("example") JobDOExample example);

    int updateByExample(@Param("record") JobDO record, @Param("example") JobDOExample example);

    int updateByPrimaryKeySelective(JobDO record);

    int updateByPrimaryKey(JobDO record);
}
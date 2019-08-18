package com.yuhong.oa.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.yuhong.oa.entity.DepartmentDO;
import com.yuhong.oa.entity.DepartmentDOExample;

public interface DepartmentDOMapper {
    long countByExample(DepartmentDOExample example);

    int deleteByExample(DepartmentDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DepartmentDO record);

    int insertSelective(DepartmentDO record);

    List<DepartmentDO> selectByExample(DepartmentDOExample example);

    DepartmentDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DepartmentDO record, @Param("example") DepartmentDOExample example);

    int updateByExample(@Param("record") DepartmentDO record, @Param("example") DepartmentDOExample example);

    int updateByPrimaryKeySelective(DepartmentDO record);

    int updateByPrimaryKey(DepartmentDO record);
}
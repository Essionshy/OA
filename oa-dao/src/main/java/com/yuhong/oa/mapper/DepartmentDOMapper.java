package com.yuhong.oa.mapper;

import com.yuhong.oa.entity.DepartmentDO;
import com.yuhong.oa.entity.DepartmentDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentDOMapper {
    long countByExample(DepartmentDOExample example);

    int deleteByExample(DepartmentDOExample example);

    int insert(DepartmentDO record);

    int insertSelective(DepartmentDO record);

    List<DepartmentDO> selectByExample(DepartmentDOExample example);

    int updateByExampleSelective(@Param("record") DepartmentDO record, @Param("example") DepartmentDOExample example);

    int updateByExample(@Param("record") DepartmentDO record, @Param("example") DepartmentDOExample example);
}
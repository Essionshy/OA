package com.yuhong.oa.mapper;

import com.yuhong.oa.entity.EmployeeDO;
import com.yuhong.oa.entity.EmployeeDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeDOMapper {
    long countByExample(EmployeeDOExample example);

    int deleteByExample(EmployeeDOExample example);

    int insert(EmployeeDO record);

    int insertSelective(EmployeeDO record);

    List<EmployeeDO> selectByExample(EmployeeDOExample example);

    int updateByExampleSelective(@Param("record") EmployeeDO record, @Param("example") EmployeeDOExample example);

    int updateByExample(@Param("record") EmployeeDO record, @Param("example") EmployeeDOExample example);
}
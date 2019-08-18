package com.yuhong.oa.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.yuhong.oa.entity.RoleDO;
import com.yuhong.oa.entity.RoleDOExample;

public interface RoleDOMapper {
    long countByExample(RoleDOExample example);

    int deleteByExample(RoleDOExample example);

    int insert(RoleDO record);

    int insertSelective(RoleDO record);

    List<RoleDO> selectByExample(RoleDOExample example);

    int updateByExampleSelective(@Param("record") RoleDO record, @Param("example") RoleDOExample example);

    int updateByExample(@Param("record") RoleDO record, @Param("example") RoleDOExample example);
}
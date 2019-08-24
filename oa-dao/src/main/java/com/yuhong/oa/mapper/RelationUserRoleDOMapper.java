package com.yuhong.oa.mapper;

import com.yuhong.oa.entity.RelationUserRoleDO;
import com.yuhong.oa.entity.RelationUserRoleDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationUserRoleDOMapper {
    long countByExample(RelationUserRoleDOExample example);

    int deleteByExample(RelationUserRoleDOExample example);

    int insert(RelationUserRoleDO record);

    int insertSelective(RelationUserRoleDO record);

    List<RelationUserRoleDO> selectByExample(RelationUserRoleDOExample example);

    int updateByExampleSelective(@Param("record") RelationUserRoleDO record, @Param("example") RelationUserRoleDOExample example);

    int updateByExample(@Param("record") RelationUserRoleDO record, @Param("example") RelationUserRoleDOExample example);
}
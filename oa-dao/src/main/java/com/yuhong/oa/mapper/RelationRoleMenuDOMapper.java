package com.yuhong.oa.mapper;

import com.yuhong.oa.entity.RelationRoleMenuDO;
import com.yuhong.oa.entity.RelationRoleMenuDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationRoleMenuDOMapper {
    long countByExample(RelationRoleMenuDOExample example);

    int deleteByExample(RelationRoleMenuDOExample example);

    int insert(RelationRoleMenuDO record);

    int insertSelective(RelationRoleMenuDO record);

    List<RelationRoleMenuDO> selectByExample(RelationRoleMenuDOExample example);

    int updateByExampleSelective(@Param("record") RelationRoleMenuDO record, @Param("example") RelationRoleMenuDOExample example);

    int updateByExample(@Param("record") RelationRoleMenuDO record, @Param("example") RelationRoleMenuDOExample example);
}
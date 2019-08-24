package com.yuhong.oa.mapper;

import com.yuhong.oa.entity.PositionDO;
import com.yuhong.oa.entity.PositionDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PositionDOMapper {
    long countByExample(PositionDOExample example);

    int deleteByExample(PositionDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PositionDO record);

    int insertSelective(PositionDO record);

    List<PositionDO> selectByExample(PositionDOExample example);

    PositionDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PositionDO record, @Param("example") PositionDOExample example);

    int updateByExample(@Param("record") PositionDO record, @Param("example") PositionDOExample example);

    int updateByPrimaryKeySelective(PositionDO record);

    int updateByPrimaryKey(PositionDO record);
}
package com.yuhong.oa.mapper;

import com.yuhong.oa.entity.PositionClassDO;
import com.yuhong.oa.entity.PositionClassDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PositionClassDOMapper {
    long countByExample(PositionClassDOExample example);

    int deleteByExample(PositionClassDOExample example);

    int insert(PositionClassDO record);

    int insertSelective(PositionClassDO record);

    List<PositionClassDO> selectByExample(PositionClassDOExample example);

    int updateByExampleSelective(@Param("record") PositionClassDO record, @Param("example") PositionClassDOExample example);

    int updateByExample(@Param("record") PositionClassDO record, @Param("example") PositionClassDOExample example);
}
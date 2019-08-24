package com.yuhong.oa.mapper;

import com.yuhong.oa.entity.LinktypeDO;
import com.yuhong.oa.entity.LinktypeDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LinktypeDOMapper {
    long countByExample(LinktypeDOExample example);

    int deleteByExample(LinktypeDOExample example);

    int insert(LinktypeDO record);

    int insertSelective(LinktypeDO record);

    List<LinktypeDO> selectByExample(LinktypeDOExample example);

    int updateByExampleSelective(@Param("record") LinktypeDO record, @Param("example") LinktypeDOExample example);

    int updateByExample(@Param("record") LinktypeDO record, @Param("example") LinktypeDOExample example);
}
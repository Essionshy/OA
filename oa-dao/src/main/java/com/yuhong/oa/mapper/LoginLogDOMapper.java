package com.yuhong.oa.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.yuhong.oa.entity.LoginLogDO;
import com.yuhong.oa.entity.LoginLogDOExample;

public interface LoginLogDOMapper {
    long countByExample(LoginLogDOExample example);

    int deleteByExample(LoginLogDOExample example);

    int insert(LoginLogDO record);

    int insertSelective(LoginLogDO record);

    List<LoginLogDO> selectByExample(LoginLogDOExample example);

    int updateByExampleSelective(@Param("record") LoginLogDO record, @Param("example") LoginLogDOExample example);

    int updateByExample(@Param("record") LoginLogDO record, @Param("example") LoginLogDOExample example);
}
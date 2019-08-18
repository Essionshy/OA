package com.yuhong.oa.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.yuhong.oa.entity.UserDO;
import com.yuhong.oa.entity.UserDOExample;

public interface UserDOMapper {
    long countByExample(UserDOExample example);

    int deleteByExample(UserDOExample example);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    List<UserDO> selectByExample(UserDOExample example);

    int updateByExampleSelective(@Param("record") UserDO record, @Param("example") UserDOExample example);

    int updateByExample(@Param("record") UserDO record, @Param("example") UserDOExample example);
}
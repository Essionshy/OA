package com.yuhong.oa.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.yuhong.oa.entity.MenuDO;
import com.yuhong.oa.entity.MenuDOExample;

public interface MenuDOMapper {
    long countByExample(MenuDOExample example);

    int deleteByExample(MenuDOExample example);

    int insert(MenuDO record);

    int insertSelective(MenuDO record);

    List<MenuDO> selectByExample(MenuDOExample example);

    int updateByExampleSelective(@Param("record") MenuDO record, @Param("example") MenuDOExample example);

    int updateByExample(@Param("record") MenuDO record, @Param("example") MenuDOExample example);
}
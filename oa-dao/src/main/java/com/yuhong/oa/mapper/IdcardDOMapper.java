package com.yuhong.oa.mapper;

import com.yuhong.oa.entity.IdcardDO;
import com.yuhong.oa.entity.IdcardDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IdcardDOMapper {
    long countByExample(IdcardDOExample example);

    int deleteByExample(IdcardDOExample example);

    int insert(IdcardDO record);

    int insertSelective(IdcardDO record);

    List<IdcardDO> selectByExample(IdcardDOExample example);

    int updateByExampleSelective(@Param("record") IdcardDO record, @Param("example") IdcardDOExample example);

    int updateByExample(@Param("record") IdcardDO record, @Param("example") IdcardDOExample example);
}
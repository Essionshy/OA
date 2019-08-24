package com.yuhong.oa.mapper;

import com.yuhong.oa.entity.EducationDO;
import com.yuhong.oa.entity.EducationDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EducationDOMapper {
    long countByExample(EducationDOExample example);

    int deleteByExample(EducationDOExample example);

    int insert(EducationDO record);

    int insertSelective(EducationDO record);

    List<EducationDO> selectByExample(EducationDOExample example);

    int updateByExampleSelective(@Param("record") EducationDO record, @Param("example") EducationDOExample example);

    int updateByExample(@Param("record") EducationDO record, @Param("example") EducationDOExample example);
}
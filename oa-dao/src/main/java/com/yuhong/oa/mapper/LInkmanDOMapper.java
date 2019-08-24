package com.yuhong.oa.mapper;

import com.yuhong.oa.entity.LInkmanDO;
import com.yuhong.oa.entity.LInkmanDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LInkmanDOMapper {
    long countByExample(LInkmanDOExample example);

    int deleteByExample(LInkmanDOExample example);

    int insert(LInkmanDO record);

    int insertSelective(LInkmanDO record);

    List<LInkmanDO> selectByExample(LInkmanDOExample example);

    int updateByExampleSelective(@Param("record") LInkmanDO record, @Param("example") LInkmanDOExample example);

    int updateByExample(@Param("record") LInkmanDO record, @Param("example") LInkmanDOExample example);
}
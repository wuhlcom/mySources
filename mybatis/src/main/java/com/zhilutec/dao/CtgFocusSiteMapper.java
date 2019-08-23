package com.zhilutec.dao;

import com.zhilutec.entity.CtgFocusSite;
import com.zhilutec.entity.CtgFocusSiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtgFocusSiteMapper {
    int countByExample(CtgFocusSiteExample example);

    int deleteByExample(CtgFocusSiteExample example);

    int deleteByPrimaryKey(Integer fsId);

    int insert(CtgFocusSite record);

    int insertSelective(CtgFocusSite record);

    List<CtgFocusSite> selectByExample(CtgFocusSiteExample example);

    CtgFocusSite selectByPrimaryKey(Integer fsId);

    int updateByExampleSelective(@Param("record") CtgFocusSite record, @Param("example") CtgFocusSiteExample example);

    int updateByExample(@Param("record") CtgFocusSite record, @Param("example") CtgFocusSiteExample example);

    int updateByPrimaryKeySelective(CtgFocusSite record);

    int updateByPrimaryKey(CtgFocusSite record);
}
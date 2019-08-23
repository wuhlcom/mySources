package com.zhilutec.dao;

import com.zhilutec.entity.CtgUnitFocus;
import com.zhilutec.entity.CtgUnitFocusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtgUnitFocusMapper {
    int countByExample(CtgUnitFocusExample example);

    int deleteByExample(CtgUnitFocusExample example);

    int deleteByPrimaryKey(Integer ufId);

    int insert(CtgUnitFocus record);

    int insertSelective(CtgUnitFocus record);

    List<CtgUnitFocus> selectByExample(CtgUnitFocusExample example);

    CtgUnitFocus selectByPrimaryKey(Integer ufId);

    int updateByExampleSelective(@Param("record") CtgUnitFocus record, @Param("example") CtgUnitFocusExample example);

    int updateByExample(@Param("record") CtgUnitFocus record, @Param("example") CtgUnitFocusExample example);

    int updateByPrimaryKeySelective(CtgUnitFocus record);

    int updateByPrimaryKey(CtgUnitFocus record);
}
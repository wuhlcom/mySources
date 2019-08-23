package com.zhilutec.dao;

import com.zhilutec.entity.CtgFocus;
import com.zhilutec.entity.CtgFocusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtgFocusMapper {
    int countByExample(CtgFocusExample example);

    int deleteByExample(CtgFocusExample example);

    int deleteByPrimaryKey(String fcsId);

    int insert(CtgFocus record);

    int insertSelective(CtgFocus record);

    List<CtgFocus> selectByExample(CtgFocusExample example);

    CtgFocus selectByPrimaryKey(String fcsId);

    int updateByExampleSelective(@Param("record") CtgFocus record, @Param("example") CtgFocusExample example);

    int updateByExample(@Param("record") CtgFocus record, @Param("example") CtgFocusExample example);

    int updateByPrimaryKeySelective(CtgFocus record);

    int updateByPrimaryKey(CtgFocus record);
}
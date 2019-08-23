package com.zhilutec.dao;

import com.zhilutec.entity.CtgUnitRecord;
import com.zhilutec.entity.CtgUnitRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtgUnitRecordMapper {
    int countByExample(CtgUnitRecordExample example);

    int deleteByExample(CtgUnitRecordExample example);

    int deleteByPrimaryKey(Integer urId);

    int insert(CtgUnitRecord record);

    int insertSelective(CtgUnitRecord record);

    List<CtgUnitRecord> selectByExample(CtgUnitRecordExample example);

    CtgUnitRecord selectByPrimaryKey(Integer urId);

    int updateByExampleSelective(@Param("record") CtgUnitRecord record, @Param("example") CtgUnitRecordExample example);

    int updateByExample(@Param("record") CtgUnitRecord record, @Param("example") CtgUnitRecordExample example);

    int updateByPrimaryKeySelective(CtgUnitRecord record);

    int updateByPrimaryKey(CtgUnitRecord record);
}
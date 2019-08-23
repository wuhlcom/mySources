package com.zhilutec.dao;

import com.zhilutec.entity.CtgBurner;
import com.zhilutec.entity.CtgBurnerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtgBurnerMapper {
    int countByExample(CtgBurnerExample example);

    int deleteByExample(CtgBurnerExample example);

    int deleteByPrimaryKey(String bnrId);

    int insert(CtgBurner record);

    int insertSelective(CtgBurner record);

    List<CtgBurner> selectByExample(CtgBurnerExample example);

    CtgBurner selectByPrimaryKey(String bnrId);

    int updateByExampleSelective(@Param("record") CtgBurner record, @Param("example") CtgBurnerExample example);

    int updateByExample(@Param("record") CtgBurner record, @Param("example") CtgBurnerExample example);

    int updateByPrimaryKeySelective(CtgBurner record);

    int updateByPrimaryKey(CtgBurner record);
}
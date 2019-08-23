package com.zhilutec.dao;

import com.zhilutec.entity.CtgUnitBurner;
import com.zhilutec.entity.CtgUnitBurnerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtgUnitBurnerMapper {
    int countByExample(CtgUnitBurnerExample example);

    int deleteByExample(CtgUnitBurnerExample example);

    int deleteByPrimaryKey(Integer ubId);

    int insert(CtgUnitBurner record);

    int insertSelective(CtgUnitBurner record);

    List<CtgUnitBurner> selectByExample(CtgUnitBurnerExample example);

    CtgUnitBurner selectByPrimaryKey(Integer ubId);

    int updateByExampleSelective(@Param("record") CtgUnitBurner record, @Param("example") CtgUnitBurnerExample example);

    int updateByExample(@Param("record") CtgUnitBurner record, @Param("example") CtgUnitBurnerExample example);

    int updateByPrimaryKeySelective(CtgUnitBurner record);

    int updateByPrimaryKey(CtgUnitBurner record);
}
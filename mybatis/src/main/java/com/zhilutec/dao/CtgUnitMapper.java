package com.zhilutec.dao;

import com.zhilutec.entity.CtgUnit;
import com.zhilutec.entity.CtgUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtgUnitMapper {
    int countByExample(CtgUnitExample example);

    int deleteByExample(CtgUnitExample example);

    int deleteByPrimaryKey(String untId);

    int insert(CtgUnit record);

    int insertSelective(CtgUnit record);

    List<CtgUnit> selectByExample(CtgUnitExample example);

    CtgUnit selectByPrimaryKey(String untId);

    int updateByExampleSelective(@Param("record") CtgUnit record, @Param("example") CtgUnitExample example);

    int updateByExample(@Param("record") CtgUnit record, @Param("example") CtgUnitExample example);

    int updateByPrimaryKeySelective(CtgUnit record);

    int updateByPrimaryKey(CtgUnit record);
}
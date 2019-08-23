package com.zhilutec.dao;

import com.zhilutec.entity.CtgUnitSupervisor;
import com.zhilutec.entity.CtgUnitSupervisorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtgUnitSupervisorMapper {
    int countByExample(CtgUnitSupervisorExample example);

    int deleteByExample(CtgUnitSupervisorExample example);

    int deleteByPrimaryKey(Integer usId);

    int insert(CtgUnitSupervisor record);

    int insertSelective(CtgUnitSupervisor record);

    List<CtgUnitSupervisor> selectByExample(CtgUnitSupervisorExample example);

    CtgUnitSupervisor selectByPrimaryKey(Integer usId);

    int updateByExampleSelective(@Param("record") CtgUnitSupervisor record, @Param("example") CtgUnitSupervisorExample example);

    int updateByExample(@Param("record") CtgUnitSupervisor record, @Param("example") CtgUnitSupervisorExample example);

    int updateByPrimaryKeySelective(CtgUnitSupervisor record);

    int updateByPrimaryKey(CtgUnitSupervisor record);
}
package com.zhilutec.dao;

import com.zhilutec.entity.CtgSupervisor;
import com.zhilutec.entity.CtgSupervisorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtgSupervisorMapper {
    int countByExample(CtgSupervisorExample example);

    int deleteByExample(CtgSupervisorExample example);

    int deleteByPrimaryKey(String spvId);

    int insert(CtgSupervisor record);

    int insertSelective(CtgSupervisor record);

    List<CtgSupervisor> selectByExample(CtgSupervisorExample example);

    CtgSupervisor selectByPrimaryKey(String spvId);

    int updateByExampleSelective(@Param("record") CtgSupervisor record, @Param("example") CtgSupervisorExample example);

    int updateByExample(@Param("record") CtgSupervisor record, @Param("example") CtgSupervisorExample example);

    int updateByPrimaryKeySelective(CtgSupervisor record);

    int updateByPrimaryKey(CtgSupervisor record);
}
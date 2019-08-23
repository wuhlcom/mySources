package com.zhilutec.dao;

import com.zhilutec.entity.CtgOperateLog;
import com.zhilutec.entity.CtgOperateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtgOperateLogMapper {
    int countByExample(CtgOperateLogExample example);

    int deleteByExample(CtgOperateLogExample example);

    int deleteByPrimaryKey(String logId);

    int insert(CtgOperateLog record);

    int insertSelective(CtgOperateLog record);

    List<CtgOperateLog> selectByExample(CtgOperateLogExample example);

    CtgOperateLog selectByPrimaryKey(String logId);

    int updateByExampleSelective(@Param("record") CtgOperateLog record, @Param("example") CtgOperateLogExample example);

    int updateByExample(@Param("record") CtgOperateLog record, @Param("example") CtgOperateLogExample example);

    int updateByPrimaryKeySelective(CtgOperateLog record);

    int updateByPrimaryKey(CtgOperateLog record);
}
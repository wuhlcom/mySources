package com.zhilutec.dao;

import com.zhilutec.entity.CtgDevice;
import com.zhilutec.entity.CtgDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtgDeviceMapper {
    int countByExample(CtgDeviceExample example);

    int deleteByExample(CtgDeviceExample example);

    int deleteByPrimaryKey(String devId);

    int insert(CtgDevice record);

    int insertSelective(CtgDevice record);

    List<CtgDevice> selectByExample(CtgDeviceExample example);

    CtgDevice selectByPrimaryKey(String devId);

    int updateByExampleSelective(@Param("record") CtgDevice record, @Param("example") CtgDeviceExample example);

    int updateByExample(@Param("record") CtgDevice record, @Param("example") CtgDeviceExample example);

    int updateByPrimaryKeySelective(CtgDevice record);

    int updateByPrimaryKey(CtgDevice record);
}
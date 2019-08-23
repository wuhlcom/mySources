package com.zhilutec.dao;

import com.zhilutec.entity.CtgSiteDevice;
import com.zhilutec.entity.CtgSiteDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtgSiteDeviceMapper {
    int countByExample(CtgSiteDeviceExample example);

    int deleteByExample(CtgSiteDeviceExample example);

    int deleteByPrimaryKey(Integer sdId);

    int insert(CtgSiteDevice record);

    int insertSelective(CtgSiteDevice record);

    List<CtgSiteDevice> selectByExample(CtgSiteDeviceExample example);

    CtgSiteDevice selectByPrimaryKey(Integer sdId);

    int updateByExampleSelective(@Param("record") CtgSiteDevice record, @Param("example") CtgSiteDeviceExample example);

    int updateByExample(@Param("record") CtgSiteDevice record, @Param("example") CtgSiteDeviceExample example);

    int updateByPrimaryKeySelective(CtgSiteDevice record);

    int updateByPrimaryKey(CtgSiteDevice record);
}
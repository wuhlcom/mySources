package com.zhilutec.dao;

import com.zhilutec.entity.CtgSite;
import com.zhilutec.entity.CtgSiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtgSiteMapper {
    int countByExample(CtgSiteExample example);

    int deleteByExample(CtgSiteExample example);

    int deleteByPrimaryKey(String sitId);

    int insert(CtgSite record);

    int insertSelective(CtgSite record);

    List<CtgSite> selectByExample(CtgSiteExample example);

    CtgSite selectByPrimaryKey(String sitId);

    int updateByExampleSelective(@Param("record") CtgSite record, @Param("example") CtgSiteExample example);

    int updateByExample(@Param("record") CtgSite record, @Param("example") CtgSiteExample example);

    int updateByPrimaryKeySelective(CtgSite record);

    int updateByPrimaryKey(CtgSite record);
}
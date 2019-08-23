package com.zhilutec.dao;

import com.zhilutec.entity.CtgSiteCheck;
import com.zhilutec.entity.CtgSiteCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtgSiteCheckMapper {
    int countByExample(CtgSiteCheckExample example);

    int deleteByExample(CtgSiteCheckExample example);

    int deleteByPrimaryKey(Integer chcId);

    int insert(CtgSiteCheck record);

    int insertSelective(CtgSiteCheck record);

    List<CtgSiteCheck> selectByExample(CtgSiteCheckExample example);

    CtgSiteCheck selectByPrimaryKey(Integer chcId);

    int updateByExampleSelective(@Param("record") CtgSiteCheck record, @Param("example") CtgSiteCheckExample example);

    int updateByExample(@Param("record") CtgSiteCheck record, @Param("example") CtgSiteCheckExample example);

    int updateByPrimaryKeySelective(CtgSiteCheck record);

    int updateByPrimaryKey(CtgSiteCheck record);
}
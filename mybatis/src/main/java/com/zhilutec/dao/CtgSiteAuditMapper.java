package com.zhilutec.dao;

import com.zhilutec.entity.CtgSiteAudit;
import com.zhilutec.entity.CtgSiteAuditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtgSiteAuditMapper {
    int countByExample(CtgSiteAuditExample example);

    int deleteByExample(CtgSiteAuditExample example);

    int deleteByPrimaryKey(Integer adtId);

    int insert(CtgSiteAudit record);

    int insertSelective(CtgSiteAudit record);

    List<CtgSiteAudit> selectByExample(CtgSiteAuditExample example);

    CtgSiteAudit selectByPrimaryKey(Integer adtId);

    int updateByExampleSelective(@Param("record") CtgSiteAudit record, @Param("example") CtgSiteAuditExample example);

    int updateByExample(@Param("record") CtgSiteAudit record, @Param("example") CtgSiteAuditExample example);

    int updateByPrimaryKeySelective(CtgSiteAudit record);

    int updateByPrimaryKey(CtgSiteAudit record);
}
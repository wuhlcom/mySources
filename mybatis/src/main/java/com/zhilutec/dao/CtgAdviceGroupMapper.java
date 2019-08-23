package com.zhilutec.dao;

import com.zhilutec.entity.CtgAdviceGroup;
import com.zhilutec.entity.CtgAdviceGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtgAdviceGroupMapper {
    int countByExample(CtgAdviceGroupExample example);

    int deleteByExample(CtgAdviceGroupExample example);

    int deleteByPrimaryKey(String grpId);

    int insert(CtgAdviceGroup record);

    int insertSelective(CtgAdviceGroup record);

    List<CtgAdviceGroup> selectByExample(CtgAdviceGroupExample example);

    CtgAdviceGroup selectByPrimaryKey(String grpId);

    int updateByExampleSelective(@Param("record") CtgAdviceGroup record, @Param("example") CtgAdviceGroupExample example);

    int updateByExample(@Param("record") CtgAdviceGroup record, @Param("example") CtgAdviceGroupExample example);

    int updateByPrimaryKeySelective(CtgAdviceGroup record);

    int updateByPrimaryKey(CtgAdviceGroup record);
}
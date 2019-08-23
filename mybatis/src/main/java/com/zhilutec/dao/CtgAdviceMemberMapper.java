package com.zhilutec.dao;

import com.zhilutec.entity.CtgAdviceMember;
import com.zhilutec.entity.CtgAdviceMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtgAdviceMemberMapper {
    int countByExample(CtgAdviceMemberExample example);

    int deleteByExample(CtgAdviceMemberExample example);

    int deleteByPrimaryKey(String mbrId);

    int insert(CtgAdviceMember record);

    int insertSelective(CtgAdviceMember record);

    List<CtgAdviceMember> selectByExample(CtgAdviceMemberExample example);

    CtgAdviceMember selectByPrimaryKey(String mbrId);

    int updateByExampleSelective(@Param("record") CtgAdviceMember record, @Param("example") CtgAdviceMemberExample example);

    int updateByExample(@Param("record") CtgAdviceMember record, @Param("example") CtgAdviceMemberExample example);

    int updateByPrimaryKeySelective(CtgAdviceMember record);

    int updateByPrimaryKey(CtgAdviceMember record);
}
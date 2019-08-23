package com.zhilutec.dao;

import com.zhilutec.entity.CtgGroupMember;
import com.zhilutec.entity.CtgGroupMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtgGroupMemberMapper {
    int countByExample(CtgGroupMemberExample example);

    int deleteByExample(CtgGroupMemberExample example);

    int deleteByPrimaryKey(Integer gmId);

    int insert(CtgGroupMember record);

    int insertSelective(CtgGroupMember record);

    List<CtgGroupMember> selectByExample(CtgGroupMemberExample example);

    CtgGroupMember selectByPrimaryKey(Integer gmId);

    int updateByExampleSelective(@Param("record") CtgGroupMember record, @Param("example") CtgGroupMemberExample example);

    int updateByExample(@Param("record") CtgGroupMember record, @Param("example") CtgGroupMemberExample example);

    int updateByPrimaryKeySelective(CtgGroupMember record);

    int updateByPrimaryKey(CtgGroupMember record);
}
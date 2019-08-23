package com.zhilutec.dao;

import com.zhilutec.entity.CtgVendor;
import com.zhilutec.entity.CtgVendorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtgVendorMapper {
    int countByExample(CtgVendorExample example);

    int deleteByExample(CtgVendorExample example);

    int deleteByPrimaryKey(String venId);

    int insert(CtgVendor record);

    int insertSelective(CtgVendor record);

    List<CtgVendor> selectByExample(CtgVendorExample example);

    CtgVendor selectByPrimaryKey(String venId);

    int updateByExampleSelective(@Param("record") CtgVendor record, @Param("example") CtgVendorExample example);

    int updateByExample(@Param("record") CtgVendor record, @Param("example") CtgVendorExample example);

    int updateByPrimaryKeySelective(CtgVendor record);

    int updateByPrimaryKey(CtgVendor record);
}
package com.zhilutec.dao;

import com.zhilutec.entity.CtgDictionary;
import com.zhilutec.entity.CtgDictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtgDictionaryMapper {
    int countByExample(CtgDictionaryExample example);

    int deleteByExample(CtgDictionaryExample example);

    int deleteByPrimaryKey(Integer dctId);

    int insert(CtgDictionary record);

    int insertSelective(CtgDictionary record);

    List<CtgDictionary> selectByExample(CtgDictionaryExample example);

    CtgDictionary selectByPrimaryKey(Integer dctId);

    int updateByExampleSelective(@Param("record") CtgDictionary record, @Param("example") CtgDictionaryExample example);

    int updateByExample(@Param("record") CtgDictionary record, @Param("example") CtgDictionaryExample example);

    int updateByPrimaryKeySelective(CtgDictionary record);

    int updateByPrimaryKey(CtgDictionary record);
}
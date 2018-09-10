package com.zzuli.ssm.mapper;

import com.zzuli.ssm.po.MoneyKind;
import com.zzuli.ssm.po.MoneyKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoneyKindMapper {
    int countByExample(MoneyKindExample example);

    int deleteByExample(MoneyKindExample example);

    int deleteByPrimaryKey(String kindId);

    int insert(MoneyKind record);

    int insertSelective(MoneyKind record);

    List<MoneyKind> selectByExample(MoneyKindExample example);

    MoneyKind selectByPrimaryKey(String kindId);

    int updateByExampleSelective(@Param("record") MoneyKind record, @Param("example") MoneyKindExample example);

    int updateByExample(@Param("record") MoneyKind record, @Param("example") MoneyKindExample example);

    int updateByPrimaryKeySelective(MoneyKind record);

    int updateByPrimaryKey(MoneyKind record);
}
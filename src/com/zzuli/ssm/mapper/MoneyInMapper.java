package com.zzuli.ssm.mapper;

import com.zzuli.ssm.po.MoneyIn;
import com.zzuli.ssm.po.MoneyInExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoneyInMapper {
    int countByExample(MoneyInExample example);

    int deleteByExample(MoneyInExample example);

    int deleteByPrimaryKey(Integer inId);

    int insert(MoneyIn record);

    int insertSelective(MoneyIn record);

    List<MoneyIn> selectByExample(MoneyInExample example);

    MoneyIn selectByPrimaryKey(Integer inId);

    int updateByExampleSelective(@Param("record") MoneyIn record, @Param("example") MoneyInExample example);

    int updateByExample(@Param("record") MoneyIn record, @Param("example") MoneyInExample example);

    int updateByPrimaryKeySelective(MoneyIn record);

    int updateByPrimaryKey(MoneyIn record);
}
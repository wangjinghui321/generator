package com.zzuli.ssm.mapper;

import com.zzuli.ssm.po.MoneyTurn;
import com.zzuli.ssm.po.MoneyTurnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoneyTurnMapper {
    int countByExample(MoneyTurnExample example);

    int deleteByExample(MoneyTurnExample example);

    int deleteByPrimaryKey(Integer turnId);

    int insert(MoneyTurn record);

    int insertSelective(MoneyTurn record);

    List<MoneyTurn> selectByExample(MoneyTurnExample example);

    MoneyTurn selectByPrimaryKey(Integer turnId);

    int updateByExampleSelective(@Param("record") MoneyTurn record, @Param("example") MoneyTurnExample example);

    int updateByExample(@Param("record") MoneyTurn record, @Param("example") MoneyTurnExample example);

    int updateByPrimaryKeySelective(MoneyTurn record);

    int updateByPrimaryKey(MoneyTurn record);
}
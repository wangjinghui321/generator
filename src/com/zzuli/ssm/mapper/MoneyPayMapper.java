package com.zzuli.ssm.mapper;

import com.zzuli.ssm.po.MoneyPay;
import com.zzuli.ssm.po.MoneyPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoneyPayMapper {
    int countByExample(MoneyPayExample example);

    int deleteByExample(MoneyPayExample example);

    int deleteByPrimaryKey(Integer payId);

    int insert(MoneyPay record);

    int insertSelective(MoneyPay record);

    List<MoneyPay> selectByExample(MoneyPayExample example);

    MoneyPay selectByPrimaryKey(Integer payId);

    int updateByExampleSelective(@Param("record") MoneyPay record, @Param("example") MoneyPayExample example);

    int updateByExample(@Param("record") MoneyPay record, @Param("example") MoneyPayExample example);

    int updateByPrimaryKeySelective(MoneyPay record);

    int updateByPrimaryKey(MoneyPay record);
}
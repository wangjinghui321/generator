package com.zzuli.ssm.po;

import java.util.Date;

public class MoneyPay {
    private Integer payId;

    private String payMoney;

    private Date payTime;

    private String payMemo;

    private String payKind;

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public String getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(String payMoney) {
        this.payMoney = payMoney == null ? null : payMoney.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayMemo() {
        return payMemo;
    }

    public void setPayMemo(String payMemo) {
        this.payMemo = payMemo == null ? null : payMemo.trim();
    }

    public String getPayKind() {
        return payKind;
    }

    public void setPayKind(String payKind) {
        this.payKind = payKind == null ? null : payKind.trim();
    }
}
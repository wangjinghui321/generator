package com.zzuli.ssm.po;

public class MoneyKind {
    private String kindId;

    private String kindCode;

    private String kindName;

    private String kindItem;

    public String getKindId() {
        return kindId;
    }

    public void setKindId(String kindId) {
        this.kindId = kindId == null ? null : kindId.trim();
    }

    public String getKindCode() {
        return kindCode;
    }

    public void setKindCode(String kindCode) {
        this.kindCode = kindCode == null ? null : kindCode.trim();
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName == null ? null : kindName.trim();
    }

    public String getKindItem() {
        return kindItem;
    }

    public void setKindItem(String kindItem) {
        this.kindItem = kindItem == null ? null : kindItem.trim();
    }
}
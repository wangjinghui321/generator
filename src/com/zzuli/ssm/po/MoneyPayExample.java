package com.zzuli.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MoneyPayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoneyPayExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPayIdIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(Integer value) {
            addCriterion("pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(Integer value) {
            addCriterion("pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(Integer value) {
            addCriterion("pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(Integer value) {
            addCriterion("pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(Integer value) {
            addCriterion("pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<Integer> values) {
            addCriterion("pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<Integer> values) {
            addCriterion("pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(Integer value1, Integer value2) {
            addCriterion("pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_id not between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIsNull() {
            addCriterion("pay_money is null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIsNotNull() {
            addCriterion("pay_money is not null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyEqualTo(String value) {
            addCriterion("pay_money =", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotEqualTo(String value) {
            addCriterion("pay_money <>", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyGreaterThan(String value) {
            addCriterion("pay_money >", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("pay_money >=", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLessThan(String value) {
            addCriterion("pay_money <", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLessThanOrEqualTo(String value) {
            addCriterion("pay_money <=", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLike(String value) {
            addCriterion("pay_money like", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotLike(String value) {
            addCriterion("pay_money not like", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIn(List<String> values) {
            addCriterion("pay_money in", values, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotIn(List<String> values) {
            addCriterion("pay_money not in", values, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyBetween(String value1, String value2) {
            addCriterion("pay_money between", value1, value2, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotBetween(String value1, String value2) {
            addCriterion("pay_money not between", value1, value2, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayMemoIsNull() {
            addCriterion("pay_memo is null");
            return (Criteria) this;
        }

        public Criteria andPayMemoIsNotNull() {
            addCriterion("pay_memo is not null");
            return (Criteria) this;
        }

        public Criteria andPayMemoEqualTo(String value) {
            addCriterion("pay_memo =", value, "payMemo");
            return (Criteria) this;
        }

        public Criteria andPayMemoNotEqualTo(String value) {
            addCriterion("pay_memo <>", value, "payMemo");
            return (Criteria) this;
        }

        public Criteria andPayMemoGreaterThan(String value) {
            addCriterion("pay_memo >", value, "payMemo");
            return (Criteria) this;
        }

        public Criteria andPayMemoGreaterThanOrEqualTo(String value) {
            addCriterion("pay_memo >=", value, "payMemo");
            return (Criteria) this;
        }

        public Criteria andPayMemoLessThan(String value) {
            addCriterion("pay_memo <", value, "payMemo");
            return (Criteria) this;
        }

        public Criteria andPayMemoLessThanOrEqualTo(String value) {
            addCriterion("pay_memo <=", value, "payMemo");
            return (Criteria) this;
        }

        public Criteria andPayMemoLike(String value) {
            addCriterion("pay_memo like", value, "payMemo");
            return (Criteria) this;
        }

        public Criteria andPayMemoNotLike(String value) {
            addCriterion("pay_memo not like", value, "payMemo");
            return (Criteria) this;
        }

        public Criteria andPayMemoIn(List<String> values) {
            addCriterion("pay_memo in", values, "payMemo");
            return (Criteria) this;
        }

        public Criteria andPayMemoNotIn(List<String> values) {
            addCriterion("pay_memo not in", values, "payMemo");
            return (Criteria) this;
        }

        public Criteria andPayMemoBetween(String value1, String value2) {
            addCriterion("pay_memo between", value1, value2, "payMemo");
            return (Criteria) this;
        }

        public Criteria andPayMemoNotBetween(String value1, String value2) {
            addCriterion("pay_memo not between", value1, value2, "payMemo");
            return (Criteria) this;
        }

        public Criteria andPayKindIsNull() {
            addCriterion("pay_kind is null");
            return (Criteria) this;
        }

        public Criteria andPayKindIsNotNull() {
            addCriterion("pay_kind is not null");
            return (Criteria) this;
        }

        public Criteria andPayKindEqualTo(String value) {
            addCriterion("pay_kind =", value, "payKind");
            return (Criteria) this;
        }

        public Criteria andPayKindNotEqualTo(String value) {
            addCriterion("pay_kind <>", value, "payKind");
            return (Criteria) this;
        }

        public Criteria andPayKindGreaterThan(String value) {
            addCriterion("pay_kind >", value, "payKind");
            return (Criteria) this;
        }

        public Criteria andPayKindGreaterThanOrEqualTo(String value) {
            addCriterion("pay_kind >=", value, "payKind");
            return (Criteria) this;
        }

        public Criteria andPayKindLessThan(String value) {
            addCriterion("pay_kind <", value, "payKind");
            return (Criteria) this;
        }

        public Criteria andPayKindLessThanOrEqualTo(String value) {
            addCriterion("pay_kind <=", value, "payKind");
            return (Criteria) this;
        }

        public Criteria andPayKindLike(String value) {
            addCriterion("pay_kind like", value, "payKind");
            return (Criteria) this;
        }

        public Criteria andPayKindNotLike(String value) {
            addCriterion("pay_kind not like", value, "payKind");
            return (Criteria) this;
        }

        public Criteria andPayKindIn(List<String> values) {
            addCriterion("pay_kind in", values, "payKind");
            return (Criteria) this;
        }

        public Criteria andPayKindNotIn(List<String> values) {
            addCriterion("pay_kind not in", values, "payKind");
            return (Criteria) this;
        }

        public Criteria andPayKindBetween(String value1, String value2) {
            addCriterion("pay_kind between", value1, value2, "payKind");
            return (Criteria) this;
        }

        public Criteria andPayKindNotBetween(String value1, String value2) {
            addCriterion("pay_kind not between", value1, value2, "payKind");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
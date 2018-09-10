package com.zzuli.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class MoneyKindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoneyKindExample() {
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

        public Criteria andKindIdIsNull() {
            addCriterion("kind_id is null");
            return (Criteria) this;
        }

        public Criteria andKindIdIsNotNull() {
            addCriterion("kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andKindIdEqualTo(String value) {
            addCriterion("kind_id =", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotEqualTo(String value) {
            addCriterion("kind_id <>", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdGreaterThan(String value) {
            addCriterion("kind_id >", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("kind_id >=", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdLessThan(String value) {
            addCriterion("kind_id <", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdLessThanOrEqualTo(String value) {
            addCriterion("kind_id <=", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdLike(String value) {
            addCriterion("kind_id like", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotLike(String value) {
            addCriterion("kind_id not like", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdIn(List<String> values) {
            addCriterion("kind_id in", values, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotIn(List<String> values) {
            addCriterion("kind_id not in", values, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdBetween(String value1, String value2) {
            addCriterion("kind_id between", value1, value2, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotBetween(String value1, String value2) {
            addCriterion("kind_id not between", value1, value2, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindCodeIsNull() {
            addCriterion("kind_code is null");
            return (Criteria) this;
        }

        public Criteria andKindCodeIsNotNull() {
            addCriterion("kind_code is not null");
            return (Criteria) this;
        }

        public Criteria andKindCodeEqualTo(String value) {
            addCriterion("kind_code =", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeNotEqualTo(String value) {
            addCriterion("kind_code <>", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeGreaterThan(String value) {
            addCriterion("kind_code >", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeGreaterThanOrEqualTo(String value) {
            addCriterion("kind_code >=", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeLessThan(String value) {
            addCriterion("kind_code <", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeLessThanOrEqualTo(String value) {
            addCriterion("kind_code <=", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeLike(String value) {
            addCriterion("kind_code like", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeNotLike(String value) {
            addCriterion("kind_code not like", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeIn(List<String> values) {
            addCriterion("kind_code in", values, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeNotIn(List<String> values) {
            addCriterion("kind_code not in", values, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeBetween(String value1, String value2) {
            addCriterion("kind_code between", value1, value2, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeNotBetween(String value1, String value2) {
            addCriterion("kind_code not between", value1, value2, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindNameIsNull() {
            addCriterion("kind_name is null");
            return (Criteria) this;
        }

        public Criteria andKindNameIsNotNull() {
            addCriterion("kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andKindNameEqualTo(String value) {
            addCriterion("kind_name =", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotEqualTo(String value) {
            addCriterion("kind_name <>", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameGreaterThan(String value) {
            addCriterion("kind_name >", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("kind_name >=", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameLessThan(String value) {
            addCriterion("kind_name <", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameLessThanOrEqualTo(String value) {
            addCriterion("kind_name <=", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameLike(String value) {
            addCriterion("kind_name like", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotLike(String value) {
            addCriterion("kind_name not like", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameIn(List<String> values) {
            addCriterion("kind_name in", values, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotIn(List<String> values) {
            addCriterion("kind_name not in", values, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameBetween(String value1, String value2) {
            addCriterion("kind_name between", value1, value2, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotBetween(String value1, String value2) {
            addCriterion("kind_name not between", value1, value2, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindItemIsNull() {
            addCriterion("kind_item is null");
            return (Criteria) this;
        }

        public Criteria andKindItemIsNotNull() {
            addCriterion("kind_item is not null");
            return (Criteria) this;
        }

        public Criteria andKindItemEqualTo(String value) {
            addCriterion("kind_item =", value, "kindItem");
            return (Criteria) this;
        }

        public Criteria andKindItemNotEqualTo(String value) {
            addCriterion("kind_item <>", value, "kindItem");
            return (Criteria) this;
        }

        public Criteria andKindItemGreaterThan(String value) {
            addCriterion("kind_item >", value, "kindItem");
            return (Criteria) this;
        }

        public Criteria andKindItemGreaterThanOrEqualTo(String value) {
            addCriterion("kind_item >=", value, "kindItem");
            return (Criteria) this;
        }

        public Criteria andKindItemLessThan(String value) {
            addCriterion("kind_item <", value, "kindItem");
            return (Criteria) this;
        }

        public Criteria andKindItemLessThanOrEqualTo(String value) {
            addCriterion("kind_item <=", value, "kindItem");
            return (Criteria) this;
        }

        public Criteria andKindItemLike(String value) {
            addCriterion("kind_item like", value, "kindItem");
            return (Criteria) this;
        }

        public Criteria andKindItemNotLike(String value) {
            addCriterion("kind_item not like", value, "kindItem");
            return (Criteria) this;
        }

        public Criteria andKindItemIn(List<String> values) {
            addCriterion("kind_item in", values, "kindItem");
            return (Criteria) this;
        }

        public Criteria andKindItemNotIn(List<String> values) {
            addCriterion("kind_item not in", values, "kindItem");
            return (Criteria) this;
        }

        public Criteria andKindItemBetween(String value1, String value2) {
            addCriterion("kind_item between", value1, value2, "kindItem");
            return (Criteria) this;
        }

        public Criteria andKindItemNotBetween(String value1, String value2) {
            addCriterion("kind_item not between", value1, value2, "kindItem");
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
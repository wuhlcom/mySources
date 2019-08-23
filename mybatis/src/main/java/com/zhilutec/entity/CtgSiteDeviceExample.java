package com.zhilutec.entity;

import java.util.ArrayList;
import java.util.List;

public class CtgSiteDeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CtgSiteDeviceExample() {
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

        public Criteria andSdIdIsNull() {
            addCriterion("sd_id is null");
            return (Criteria) this;
        }

        public Criteria andSdIdIsNotNull() {
            addCriterion("sd_id is not null");
            return (Criteria) this;
        }

        public Criteria andSdIdEqualTo(Integer value) {
            addCriterion("sd_id =", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdNotEqualTo(Integer value) {
            addCriterion("sd_id <>", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdGreaterThan(Integer value) {
            addCriterion("sd_id >", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sd_id >=", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdLessThan(Integer value) {
            addCriterion("sd_id <", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdLessThanOrEqualTo(Integer value) {
            addCriterion("sd_id <=", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdIn(List<Integer> values) {
            addCriterion("sd_id in", values, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdNotIn(List<Integer> values) {
            addCriterion("sd_id not in", values, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdBetween(Integer value1, Integer value2) {
            addCriterion("sd_id between", value1, value2, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sd_id not between", value1, value2, "sdId");
            return (Criteria) this;
        }

        public Criteria andSitIdIsNull() {
            addCriterion("sit_id is null");
            return (Criteria) this;
        }

        public Criteria andSitIdIsNotNull() {
            addCriterion("sit_id is not null");
            return (Criteria) this;
        }

        public Criteria andSitIdEqualTo(String value) {
            addCriterion("sit_id =", value, "sitId");
            return (Criteria) this;
        }

        public Criteria andSitIdNotEqualTo(String value) {
            addCriterion("sit_id <>", value, "sitId");
            return (Criteria) this;
        }

        public Criteria andSitIdGreaterThan(String value) {
            addCriterion("sit_id >", value, "sitId");
            return (Criteria) this;
        }

        public Criteria andSitIdGreaterThanOrEqualTo(String value) {
            addCriterion("sit_id >=", value, "sitId");
            return (Criteria) this;
        }

        public Criteria andSitIdLessThan(String value) {
            addCriterion("sit_id <", value, "sitId");
            return (Criteria) this;
        }

        public Criteria andSitIdLessThanOrEqualTo(String value) {
            addCriterion("sit_id <=", value, "sitId");
            return (Criteria) this;
        }

        public Criteria andSitIdLike(String value) {
            addCriterion("sit_id like", value, "sitId");
            return (Criteria) this;
        }

        public Criteria andSitIdNotLike(String value) {
            addCriterion("sit_id not like", value, "sitId");
            return (Criteria) this;
        }

        public Criteria andSitIdIn(List<String> values) {
            addCriterion("sit_id in", values, "sitId");
            return (Criteria) this;
        }

        public Criteria andSitIdNotIn(List<String> values) {
            addCriterion("sit_id not in", values, "sitId");
            return (Criteria) this;
        }

        public Criteria andSitIdBetween(String value1, String value2) {
            addCriterion("sit_id between", value1, value2, "sitId");
            return (Criteria) this;
        }

        public Criteria andSitIdNotBetween(String value1, String value2) {
            addCriterion("sit_id not between", value1, value2, "sitId");
            return (Criteria) this;
        }

        public Criteria andDevIdIsNull() {
            addCriterion("dev_id is null");
            return (Criteria) this;
        }

        public Criteria andDevIdIsNotNull() {
            addCriterion("dev_id is not null");
            return (Criteria) this;
        }

        public Criteria andDevIdEqualTo(String value) {
            addCriterion("dev_id =", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdNotEqualTo(String value) {
            addCriterion("dev_id <>", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdGreaterThan(String value) {
            addCriterion("dev_id >", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdGreaterThanOrEqualTo(String value) {
            addCriterion("dev_id >=", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdLessThan(String value) {
            addCriterion("dev_id <", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdLessThanOrEqualTo(String value) {
            addCriterion("dev_id <=", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdLike(String value) {
            addCriterion("dev_id like", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdNotLike(String value) {
            addCriterion("dev_id not like", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdIn(List<String> values) {
            addCriterion("dev_id in", values, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdNotIn(List<String> values) {
            addCriterion("dev_id not in", values, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdBetween(String value1, String value2) {
            addCriterion("dev_id between", value1, value2, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdNotBetween(String value1, String value2) {
            addCriterion("dev_id not between", value1, value2, "devId");
            return (Criteria) this;
        }

        public Criteria andActivityIsNull() {
            addCriterion("sd_activity is null");
            return (Criteria) this;
        }

        public Criteria andActivityIsNotNull() {
            addCriterion("sd_activity is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEqualTo(Integer value) {
            addCriterion("sd_activity =", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotEqualTo(Integer value) {
            addCriterion("sd_activity <>", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThan(Integer value) {
            addCriterion("sd_activity >", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThanOrEqualTo(Integer value) {
            addCriterion("sd_activity >=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThan(Integer value) {
            addCriterion("sd_activity <", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThanOrEqualTo(Integer value) {
            addCriterion("sd_activity <=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityIn(List<Integer> values) {
            addCriterion("sd_activity in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotIn(List<Integer> values) {
            addCriterion("sd_activity not in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityBetween(Integer value1, Integer value2) {
            addCriterion("sd_activity between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotBetween(Integer value1, Integer value2) {
            addCriterion("sd_activity not between", value1, value2, "activity");
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
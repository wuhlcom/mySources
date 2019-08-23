package com.zhilutec.entity;

import java.util.ArrayList;
import java.util.List;

public class CtgUnitSupervisorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CtgUnitSupervisorExample() {
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

        public Criteria andUsIdIsNull() {
            addCriterion("us_id is null");
            return (Criteria) this;
        }

        public Criteria andUsIdIsNotNull() {
            addCriterion("us_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsIdEqualTo(Integer value) {
            addCriterion("us_id =", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdNotEqualTo(Integer value) {
            addCriterion("us_id <>", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdGreaterThan(Integer value) {
            addCriterion("us_id >", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("us_id >=", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdLessThan(Integer value) {
            addCriterion("us_id <", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdLessThanOrEqualTo(Integer value) {
            addCriterion("us_id <=", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdIn(List<Integer> values) {
            addCriterion("us_id in", values, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdNotIn(List<Integer> values) {
            addCriterion("us_id not in", values, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdBetween(Integer value1, Integer value2) {
            addCriterion("us_id between", value1, value2, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("us_id not between", value1, value2, "usId");
            return (Criteria) this;
        }

        public Criteria andUntIdIsNull() {
            addCriterion("unt_id is null");
            return (Criteria) this;
        }

        public Criteria andUntIdIsNotNull() {
            addCriterion("unt_id is not null");
            return (Criteria) this;
        }

        public Criteria andUntIdEqualTo(String value) {
            addCriterion("unt_id =", value, "untId");
            return (Criteria) this;
        }

        public Criteria andUntIdNotEqualTo(String value) {
            addCriterion("unt_id <>", value, "untId");
            return (Criteria) this;
        }

        public Criteria andUntIdGreaterThan(String value) {
            addCriterion("unt_id >", value, "untId");
            return (Criteria) this;
        }

        public Criteria andUntIdGreaterThanOrEqualTo(String value) {
            addCriterion("unt_id >=", value, "untId");
            return (Criteria) this;
        }

        public Criteria andUntIdLessThan(String value) {
            addCriterion("unt_id <", value, "untId");
            return (Criteria) this;
        }

        public Criteria andUntIdLessThanOrEqualTo(String value) {
            addCriterion("unt_id <=", value, "untId");
            return (Criteria) this;
        }

        public Criteria andUntIdLike(String value) {
            addCriterion("unt_id like", value, "untId");
            return (Criteria) this;
        }

        public Criteria andUntIdNotLike(String value) {
            addCriterion("unt_id not like", value, "untId");
            return (Criteria) this;
        }

        public Criteria andUntIdIn(List<String> values) {
            addCriterion("unt_id in", values, "untId");
            return (Criteria) this;
        }

        public Criteria andUntIdNotIn(List<String> values) {
            addCriterion("unt_id not in", values, "untId");
            return (Criteria) this;
        }

        public Criteria andUntIdBetween(String value1, String value2) {
            addCriterion("unt_id between", value1, value2, "untId");
            return (Criteria) this;
        }

        public Criteria andUntIdNotBetween(String value1, String value2) {
            addCriterion("unt_id not between", value1, value2, "untId");
            return (Criteria) this;
        }

        public Criteria andSpvIdIsNull() {
            addCriterion("spv_id is null");
            return (Criteria) this;
        }

        public Criteria andSpvIdIsNotNull() {
            addCriterion("spv_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpvIdEqualTo(String value) {
            addCriterion("spv_id =", value, "spvId");
            return (Criteria) this;
        }

        public Criteria andSpvIdNotEqualTo(String value) {
            addCriterion("spv_id <>", value, "spvId");
            return (Criteria) this;
        }

        public Criteria andSpvIdGreaterThan(String value) {
            addCriterion("spv_id >", value, "spvId");
            return (Criteria) this;
        }

        public Criteria andSpvIdGreaterThanOrEqualTo(String value) {
            addCriterion("spv_id >=", value, "spvId");
            return (Criteria) this;
        }

        public Criteria andSpvIdLessThan(String value) {
            addCriterion("spv_id <", value, "spvId");
            return (Criteria) this;
        }

        public Criteria andSpvIdLessThanOrEqualTo(String value) {
            addCriterion("spv_id <=", value, "spvId");
            return (Criteria) this;
        }

        public Criteria andSpvIdLike(String value) {
            addCriterion("spv_id like", value, "spvId");
            return (Criteria) this;
        }

        public Criteria andSpvIdNotLike(String value) {
            addCriterion("spv_id not like", value, "spvId");
            return (Criteria) this;
        }

        public Criteria andSpvIdIn(List<String> values) {
            addCriterion("spv_id in", values, "spvId");
            return (Criteria) this;
        }

        public Criteria andSpvIdNotIn(List<String> values) {
            addCriterion("spv_id not in", values, "spvId");
            return (Criteria) this;
        }

        public Criteria andSpvIdBetween(String value1, String value2) {
            addCriterion("spv_id between", value1, value2, "spvId");
            return (Criteria) this;
        }

        public Criteria andSpvIdNotBetween(String value1, String value2) {
            addCriterion("spv_id not between", value1, value2, "spvId");
            return (Criteria) this;
        }

        public Criteria andActivityIsNull() {
            addCriterion("us_activity is null");
            return (Criteria) this;
        }

        public Criteria andActivityIsNotNull() {
            addCriterion("us_activity is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEqualTo(Integer value) {
            addCriterion("us_activity =", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotEqualTo(Integer value) {
            addCriterion("us_activity <>", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThan(Integer value) {
            addCriterion("us_activity >", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThanOrEqualTo(Integer value) {
            addCriterion("us_activity >=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThan(Integer value) {
            addCriterion("us_activity <", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThanOrEqualTo(Integer value) {
            addCriterion("us_activity <=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityIn(List<Integer> values) {
            addCriterion("us_activity in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotIn(List<Integer> values) {
            addCriterion("us_activity not in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityBetween(Integer value1, Integer value2) {
            addCriterion("us_activity between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotBetween(Integer value1, Integer value2) {
            addCriterion("us_activity not between", value1, value2, "activity");
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
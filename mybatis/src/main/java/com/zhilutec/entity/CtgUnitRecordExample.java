package com.zhilutec.entity;

import java.util.ArrayList;
import java.util.List;

public class CtgUnitRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CtgUnitRecordExample() {
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

        public Criteria andUrIdIsNull() {
            addCriterion("ur_id is null");
            return (Criteria) this;
        }

        public Criteria andUrIdIsNotNull() {
            addCriterion("ur_id is not null");
            return (Criteria) this;
        }

        public Criteria andUrIdEqualTo(Integer value) {
            addCriterion("ur_id =", value, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdNotEqualTo(Integer value) {
            addCriterion("ur_id <>", value, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdGreaterThan(Integer value) {
            addCriterion("ur_id >", value, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ur_id >=", value, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdLessThan(Integer value) {
            addCriterion("ur_id <", value, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdLessThanOrEqualTo(Integer value) {
            addCriterion("ur_id <=", value, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdIn(List<Integer> values) {
            addCriterion("ur_id in", values, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdNotIn(List<Integer> values) {
            addCriterion("ur_id not in", values, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdBetween(Integer value1, Integer value2) {
            addCriterion("ur_id between", value1, value2, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ur_id not between", value1, value2, "urId");
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

        public Criteria andFileIdIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Integer value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Integer value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Integer value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Integer value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Integer value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Integer> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Integer> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Integer value1, Integer value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andDctCodeIsNull() {
            addCriterion("ur_dct_code is null");
            return (Criteria) this;
        }

        public Criteria andDctCodeIsNotNull() {
            addCriterion("ur_dct_code is not null");
            return (Criteria) this;
        }

        public Criteria andDctCodeEqualTo(String value) {
            addCriterion("ur_dct_code =", value, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeNotEqualTo(String value) {
            addCriterion("ur_dct_code <>", value, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeGreaterThan(String value) {
            addCriterion("ur_dct_code >", value, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ur_dct_code >=", value, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeLessThan(String value) {
            addCriterion("ur_dct_code <", value, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeLessThanOrEqualTo(String value) {
            addCriterion("ur_dct_code <=", value, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeLike(String value) {
            addCriterion("ur_dct_code like", value, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeNotLike(String value) {
            addCriterion("ur_dct_code not like", value, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeIn(List<String> values) {
            addCriterion("ur_dct_code in", values, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeNotIn(List<String> values) {
            addCriterion("ur_dct_code not in", values, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeBetween(String value1, String value2) {
            addCriterion("ur_dct_code between", value1, value2, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeNotBetween(String value1, String value2) {
            addCriterion("ur_dct_code not between", value1, value2, "dctCode");
            return (Criteria) this;
        }

        public Criteria andActivityIsNull() {
            addCriterion("ur_activity is null");
            return (Criteria) this;
        }

        public Criteria andActivityIsNotNull() {
            addCriterion("ur_activity is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEqualTo(Integer value) {
            addCriterion("ur_activity =", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotEqualTo(Integer value) {
            addCriterion("ur_activity <>", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThan(Integer value) {
            addCriterion("ur_activity >", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThanOrEqualTo(Integer value) {
            addCriterion("ur_activity >=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThan(Integer value) {
            addCriterion("ur_activity <", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThanOrEqualTo(Integer value) {
            addCriterion("ur_activity <=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityIn(List<Integer> values) {
            addCriterion("ur_activity in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotIn(List<Integer> values) {
            addCriterion("ur_activity not in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityBetween(Integer value1, Integer value2) {
            addCriterion("ur_activity between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotBetween(Integer value1, Integer value2) {
            addCriterion("ur_activity not between", value1, value2, "activity");
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
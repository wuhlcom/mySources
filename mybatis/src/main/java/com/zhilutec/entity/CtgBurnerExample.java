package com.zhilutec.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CtgBurnerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CtgBurnerExample() {
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

        public Criteria andBnrIdIsNull() {
            addCriterion("bnr_id is null");
            return (Criteria) this;
        }

        public Criteria andBnrIdIsNotNull() {
            addCriterion("bnr_id is not null");
            return (Criteria) this;
        }

        public Criteria andBnrIdEqualTo(String value) {
            addCriterion("bnr_id =", value, "bnrId");
            return (Criteria) this;
        }

        public Criteria andBnrIdNotEqualTo(String value) {
            addCriterion("bnr_id <>", value, "bnrId");
            return (Criteria) this;
        }

        public Criteria andBnrIdGreaterThan(String value) {
            addCriterion("bnr_id >", value, "bnrId");
            return (Criteria) this;
        }

        public Criteria andBnrIdGreaterThanOrEqualTo(String value) {
            addCriterion("bnr_id >=", value, "bnrId");
            return (Criteria) this;
        }

        public Criteria andBnrIdLessThan(String value) {
            addCriterion("bnr_id <", value, "bnrId");
            return (Criteria) this;
        }

        public Criteria andBnrIdLessThanOrEqualTo(String value) {
            addCriterion("bnr_id <=", value, "bnrId");
            return (Criteria) this;
        }

        public Criteria andBnrIdLike(String value) {
            addCriterion("bnr_id like", value, "bnrId");
            return (Criteria) this;
        }

        public Criteria andBnrIdNotLike(String value) {
            addCriterion("bnr_id not like", value, "bnrId");
            return (Criteria) this;
        }

        public Criteria andBnrIdIn(List<String> values) {
            addCriterion("bnr_id in", values, "bnrId");
            return (Criteria) this;
        }

        public Criteria andBnrIdNotIn(List<String> values) {
            addCriterion("bnr_id not in", values, "bnrId");
            return (Criteria) this;
        }

        public Criteria andBnrIdBetween(String value1, String value2) {
            addCriterion("bnr_id between", value1, value2, "bnrId");
            return (Criteria) this;
        }

        public Criteria andBnrIdNotBetween(String value1, String value2) {
            addCriterion("bnr_id not between", value1, value2, "bnrId");
            return (Criteria) this;
        }

        public Criteria andDctCodeIsNull() {
            addCriterion("bnr_dct_code is null");
            return (Criteria) this;
        }

        public Criteria andDctCodeIsNotNull() {
            addCriterion("bnr_dct_code is not null");
            return (Criteria) this;
        }

        public Criteria andDctCodeEqualTo(String value) {
            addCriterion("bnr_dct_code =", value, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeNotEqualTo(String value) {
            addCriterion("bnr_dct_code <>", value, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeGreaterThan(String value) {
            addCriterion("bnr_dct_code >", value, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bnr_dct_code >=", value, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeLessThan(String value) {
            addCriterion("bnr_dct_code <", value, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeLessThanOrEqualTo(String value) {
            addCriterion("bnr_dct_code <=", value, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeLike(String value) {
            addCriterion("bnr_dct_code like", value, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeNotLike(String value) {
            addCriterion("bnr_dct_code not like", value, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeIn(List<String> values) {
            addCriterion("bnr_dct_code in", values, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeNotIn(List<String> values) {
            addCriterion("bnr_dct_code not in", values, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeBetween(String value1, String value2) {
            addCriterion("bnr_dct_code between", value1, value2, "dctCode");
            return (Criteria) this;
        }

        public Criteria andDctCodeNotBetween(String value1, String value2) {
            addCriterion("bnr_dct_code not between", value1, value2, "dctCode");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("bnr_number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("bnr_number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("bnr_number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("bnr_number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("bnr_number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("bnr_number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("bnr_number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("bnr_number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("bnr_number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("bnr_number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("bnr_number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("bnr_number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("bnr_power is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("bnr_power is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(BigDecimal value) {
            addCriterion("bnr_power =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(BigDecimal value) {
            addCriterion("bnr_power <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(BigDecimal value) {
            addCriterion("bnr_power >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bnr_power >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(BigDecimal value) {
            addCriterion("bnr_power <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bnr_power <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<BigDecimal> values) {
            addCriterion("bnr_power in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<BigDecimal> values) {
            addCriterion("bnr_power not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bnr_power between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bnr_power not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andFuelDctCodeIsNull() {
            addCriterion("fuel_dct_code is null");
            return (Criteria) this;
        }

        public Criteria andFuelDctCodeIsNotNull() {
            addCriterion("fuel_dct_code is not null");
            return (Criteria) this;
        }

        public Criteria andFuelDctCodeEqualTo(String value) {
            addCriterion("fuel_dct_code =", value, "fuelDctCode");
            return (Criteria) this;
        }

        public Criteria andFuelDctCodeNotEqualTo(String value) {
            addCriterion("fuel_dct_code <>", value, "fuelDctCode");
            return (Criteria) this;
        }

        public Criteria andFuelDctCodeGreaterThan(String value) {
            addCriterion("fuel_dct_code >", value, "fuelDctCode");
            return (Criteria) this;
        }

        public Criteria andFuelDctCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fuel_dct_code >=", value, "fuelDctCode");
            return (Criteria) this;
        }

        public Criteria andFuelDctCodeLessThan(String value) {
            addCriterion("fuel_dct_code <", value, "fuelDctCode");
            return (Criteria) this;
        }

        public Criteria andFuelDctCodeLessThanOrEqualTo(String value) {
            addCriterion("fuel_dct_code <=", value, "fuelDctCode");
            return (Criteria) this;
        }

        public Criteria andFuelDctCodeLike(String value) {
            addCriterion("fuel_dct_code like", value, "fuelDctCode");
            return (Criteria) this;
        }

        public Criteria andFuelDctCodeNotLike(String value) {
            addCriterion("fuel_dct_code not like", value, "fuelDctCode");
            return (Criteria) this;
        }

        public Criteria andFuelDctCodeIn(List<String> values) {
            addCriterion("fuel_dct_code in", values, "fuelDctCode");
            return (Criteria) this;
        }

        public Criteria andFuelDctCodeNotIn(List<String> values) {
            addCriterion("fuel_dct_code not in", values, "fuelDctCode");
            return (Criteria) this;
        }

        public Criteria andFuelDctCodeBetween(String value1, String value2) {
            addCriterion("fuel_dct_code between", value1, value2, "fuelDctCode");
            return (Criteria) this;
        }

        public Criteria andFuelDctCodeNotBetween(String value1, String value2) {
            addCriterion("fuel_dct_code not between", value1, value2, "fuelDctCode");
            return (Criteria) this;
        }

        public Criteria andActivityIsNull() {
            addCriterion("bnr_activity is null");
            return (Criteria) this;
        }

        public Criteria andActivityIsNotNull() {
            addCriterion("bnr_activity is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEqualTo(Integer value) {
            addCriterion("bnr_activity =", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotEqualTo(Integer value) {
            addCriterion("bnr_activity <>", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThan(Integer value) {
            addCriterion("bnr_activity >", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThanOrEqualTo(Integer value) {
            addCriterion("bnr_activity >=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThan(Integer value) {
            addCriterion("bnr_activity <", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThanOrEqualTo(Integer value) {
            addCriterion("bnr_activity <=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityIn(List<Integer> values) {
            addCriterion("bnr_activity in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotIn(List<Integer> values) {
            addCriterion("bnr_activity not in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityBetween(Integer value1, Integer value2) {
            addCriterion("bnr_activity between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotBetween(Integer value1, Integer value2) {
            addCriterion("bnr_activity not between", value1, value2, "activity");
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
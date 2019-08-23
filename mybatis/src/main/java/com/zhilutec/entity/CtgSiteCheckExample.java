package com.zhilutec.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CtgSiteCheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CtgSiteCheckExample() {
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

        public Criteria andChcIdIsNull() {
            addCriterion("chc_id is null");
            return (Criteria) this;
        }

        public Criteria andChcIdIsNotNull() {
            addCriterion("chc_id is not null");
            return (Criteria) this;
        }

        public Criteria andChcIdEqualTo(Integer value) {
            addCriterion("chc_id =", value, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdNotEqualTo(Integer value) {
            addCriterion("chc_id <>", value, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdGreaterThan(Integer value) {
            addCriterion("chc_id >", value, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chc_id >=", value, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdLessThan(Integer value) {
            addCriterion("chc_id <", value, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdLessThanOrEqualTo(Integer value) {
            addCriterion("chc_id <=", value, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdIn(List<Integer> values) {
            addCriterion("chc_id in", values, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdNotIn(List<Integer> values) {
            addCriterion("chc_id not in", values, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdBetween(Integer value1, Integer value2) {
            addCriterion("chc_id between", value1, value2, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chc_id not between", value1, value2, "chcId");
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

        public Criteria andChcStatusIsNull() {
            addCriterion("chc_status is null");
            return (Criteria) this;
        }

        public Criteria andChcStatusIsNotNull() {
            addCriterion("chc_status is not null");
            return (Criteria) this;
        }

        public Criteria andChcStatusEqualTo(Integer value) {
            addCriterion("chc_status =", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusNotEqualTo(Integer value) {
            addCriterion("chc_status <>", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusGreaterThan(Integer value) {
            addCriterion("chc_status >", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("chc_status >=", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusLessThan(Integer value) {
            addCriterion("chc_status <", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusLessThanOrEqualTo(Integer value) {
            addCriterion("chc_status <=", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusIn(List<Integer> values) {
            addCriterion("chc_status in", values, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusNotIn(List<Integer> values) {
            addCriterion("chc_status not in", values, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusBetween(Integer value1, Integer value2) {
            addCriterion("chc_status between", value1, value2, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("chc_status not between", value1, value2, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcTimeIsNull() {
            addCriterion("chc_time is null");
            return (Criteria) this;
        }

        public Criteria andChcTimeIsNotNull() {
            addCriterion("chc_time is not null");
            return (Criteria) this;
        }

        public Criteria andChcTimeEqualTo(Date value) {
            addCriterion("chc_time =", value, "chcTime");
            return (Criteria) this;
        }

        public Criteria andChcTimeNotEqualTo(Date value) {
            addCriterion("chc_time <>", value, "chcTime");
            return (Criteria) this;
        }

        public Criteria andChcTimeGreaterThan(Date value) {
            addCriterion("chc_time >", value, "chcTime");
            return (Criteria) this;
        }

        public Criteria andChcTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("chc_time >=", value, "chcTime");
            return (Criteria) this;
        }

        public Criteria andChcTimeLessThan(Date value) {
            addCriterion("chc_time <", value, "chcTime");
            return (Criteria) this;
        }

        public Criteria andChcTimeLessThanOrEqualTo(Date value) {
            addCriterion("chc_time <=", value, "chcTime");
            return (Criteria) this;
        }

        public Criteria andChcTimeIn(List<Date> values) {
            addCriterion("chc_time in", values, "chcTime");
            return (Criteria) this;
        }

        public Criteria andChcTimeNotIn(List<Date> values) {
            addCriterion("chc_time not in", values, "chcTime");
            return (Criteria) this;
        }

        public Criteria andChcTimeBetween(Date value1, Date value2) {
            addCriterion("chc_time between", value1, value2, "chcTime");
            return (Criteria) this;
        }

        public Criteria andChcTimeNotBetween(Date value1, Date value2) {
            addCriterion("chc_time not between", value1, value2, "chcTime");
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
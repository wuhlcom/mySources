package com.zhilutec.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CtgSiteAuditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CtgSiteAuditExample() {
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

        public Criteria andAdtIdIsNull() {
            addCriterion("adt_id is null");
            return (Criteria) this;
        }

        public Criteria andAdtIdIsNotNull() {
            addCriterion("adt_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdtIdEqualTo(Integer value) {
            addCriterion("adt_id =", value, "adtId");
            return (Criteria) this;
        }

        public Criteria andAdtIdNotEqualTo(Integer value) {
            addCriterion("adt_id <>", value, "adtId");
            return (Criteria) this;
        }

        public Criteria andAdtIdGreaterThan(Integer value) {
            addCriterion("adt_id >", value, "adtId");
            return (Criteria) this;
        }

        public Criteria andAdtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("adt_id >=", value, "adtId");
            return (Criteria) this;
        }

        public Criteria andAdtIdLessThan(Integer value) {
            addCriterion("adt_id <", value, "adtId");
            return (Criteria) this;
        }

        public Criteria andAdtIdLessThanOrEqualTo(Integer value) {
            addCriterion("adt_id <=", value, "adtId");
            return (Criteria) this;
        }

        public Criteria andAdtIdIn(List<Integer> values) {
            addCriterion("adt_id in", values, "adtId");
            return (Criteria) this;
        }

        public Criteria andAdtIdNotIn(List<Integer> values) {
            addCriterion("adt_id not in", values, "adtId");
            return (Criteria) this;
        }

        public Criteria andAdtIdBetween(Integer value1, Integer value2) {
            addCriterion("adt_id between", value1, value2, "adtId");
            return (Criteria) this;
        }

        public Criteria andAdtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("adt_id not between", value1, value2, "adtId");
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

        public Criteria andAdtStatusIsNull() {
            addCriterion("adt_status is null");
            return (Criteria) this;
        }

        public Criteria andAdtStatusIsNotNull() {
            addCriterion("adt_status is not null");
            return (Criteria) this;
        }

        public Criteria andAdtStatusEqualTo(Integer value) {
            addCriterion("adt_status =", value, "adtStatus");
            return (Criteria) this;
        }

        public Criteria andAdtStatusNotEqualTo(Integer value) {
            addCriterion("adt_status <>", value, "adtStatus");
            return (Criteria) this;
        }

        public Criteria andAdtStatusGreaterThan(Integer value) {
            addCriterion("adt_status >", value, "adtStatus");
            return (Criteria) this;
        }

        public Criteria andAdtStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("adt_status >=", value, "adtStatus");
            return (Criteria) this;
        }

        public Criteria andAdtStatusLessThan(Integer value) {
            addCriterion("adt_status <", value, "adtStatus");
            return (Criteria) this;
        }

        public Criteria andAdtStatusLessThanOrEqualTo(Integer value) {
            addCriterion("adt_status <=", value, "adtStatus");
            return (Criteria) this;
        }

        public Criteria andAdtStatusIn(List<Integer> values) {
            addCriterion("adt_status in", values, "adtStatus");
            return (Criteria) this;
        }

        public Criteria andAdtStatusNotIn(List<Integer> values) {
            addCriterion("adt_status not in", values, "adtStatus");
            return (Criteria) this;
        }

        public Criteria andAdtStatusBetween(Integer value1, Integer value2) {
            addCriterion("adt_status between", value1, value2, "adtStatus");
            return (Criteria) this;
        }

        public Criteria andAdtStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("adt_status not between", value1, value2, "adtStatus");
            return (Criteria) this;
        }

        public Criteria andAdtTimeIsNull() {
            addCriterion("adt_time is null");
            return (Criteria) this;
        }

        public Criteria andAdtTimeIsNotNull() {
            addCriterion("adt_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdtTimeEqualTo(Date value) {
            addCriterion("adt_time =", value, "adtTime");
            return (Criteria) this;
        }

        public Criteria andAdtTimeNotEqualTo(Date value) {
            addCriterion("adt_time <>", value, "adtTime");
            return (Criteria) this;
        }

        public Criteria andAdtTimeGreaterThan(Date value) {
            addCriterion("adt_time >", value, "adtTime");
            return (Criteria) this;
        }

        public Criteria andAdtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("adt_time >=", value, "adtTime");
            return (Criteria) this;
        }

        public Criteria andAdtTimeLessThan(Date value) {
            addCriterion("adt_time <", value, "adtTime");
            return (Criteria) this;
        }

        public Criteria andAdtTimeLessThanOrEqualTo(Date value) {
            addCriterion("adt_time <=", value, "adtTime");
            return (Criteria) this;
        }

        public Criteria andAdtTimeIn(List<Date> values) {
            addCriterion("adt_time in", values, "adtTime");
            return (Criteria) this;
        }

        public Criteria andAdtTimeNotIn(List<Date> values) {
            addCriterion("adt_time not in", values, "adtTime");
            return (Criteria) this;
        }

        public Criteria andAdtTimeBetween(Date value1, Date value2) {
            addCriterion("adt_time between", value1, value2, "adtTime");
            return (Criteria) this;
        }

        public Criteria andAdtTimeNotBetween(Date value1, Date value2) {
            addCriterion("adt_time not between", value1, value2, "adtTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("adt_expire_time is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("adt_expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(Date value) {
            addCriterion("adt_expire_time =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(Date value) {
            addCriterion("adt_expire_time <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(Date value) {
            addCriterion("adt_expire_time >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("adt_expire_time >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(Date value) {
            addCriterion("adt_expire_time <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("adt_expire_time <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<Date> values) {
            addCriterion("adt_expire_time in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<Date> values) {
            addCriterion("adt_expire_time not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(Date value1, Date value2) {
            addCriterion("adt_expire_time between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("adt_expire_time not between", value1, value2, "expireTime");
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
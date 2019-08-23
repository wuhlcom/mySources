package com.zhilutec.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CtgOperateLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CtgOperateLogExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(String value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(String value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(String value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(String value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(String value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(String value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLike(String value) {
            addCriterion("log_id like", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotLike(String value) {
            addCriterion("log_id not like", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<String> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<String> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(String value1, String value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(String value1, String value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserIpIsNull() {
            addCriterion("user_ip is null");
            return (Criteria) this;
        }

        public Criteria andUserIpIsNotNull() {
            addCriterion("user_ip is not null");
            return (Criteria) this;
        }

        public Criteria andUserIpEqualTo(String value) {
            addCriterion("user_ip =", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotEqualTo(String value) {
            addCriterion("user_ip <>", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpGreaterThan(String value) {
            addCriterion("user_ip >", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpGreaterThanOrEqualTo(String value) {
            addCriterion("user_ip >=", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLessThan(String value) {
            addCriterion("user_ip <", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLessThanOrEqualTo(String value) {
            addCriterion("user_ip <=", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLike(String value) {
            addCriterion("user_ip like", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotLike(String value) {
            addCriterion("user_ip not like", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpIn(List<String> values) {
            addCriterion("user_ip in", values, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotIn(List<String> values) {
            addCriterion("user_ip not in", values, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpBetween(String value1, String value2) {
            addCriterion("user_ip between", value1, value2, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotBetween(String value1, String value2) {
            addCriterion("user_ip not between", value1, value2, "userIp");
            return (Criteria) this;
        }

        public Criteria andLogObjIsNull() {
            addCriterion("log_obj is null");
            return (Criteria) this;
        }

        public Criteria andLogObjIsNotNull() {
            addCriterion("log_obj is not null");
            return (Criteria) this;
        }

        public Criteria andLogObjEqualTo(String value) {
            addCriterion("log_obj =", value, "logObj");
            return (Criteria) this;
        }

        public Criteria andLogObjNotEqualTo(String value) {
            addCriterion("log_obj <>", value, "logObj");
            return (Criteria) this;
        }

        public Criteria andLogObjGreaterThan(String value) {
            addCriterion("log_obj >", value, "logObj");
            return (Criteria) this;
        }

        public Criteria andLogObjGreaterThanOrEqualTo(String value) {
            addCriterion("log_obj >=", value, "logObj");
            return (Criteria) this;
        }

        public Criteria andLogObjLessThan(String value) {
            addCriterion("log_obj <", value, "logObj");
            return (Criteria) this;
        }

        public Criteria andLogObjLessThanOrEqualTo(String value) {
            addCriterion("log_obj <=", value, "logObj");
            return (Criteria) this;
        }

        public Criteria andLogObjLike(String value) {
            addCriterion("log_obj like", value, "logObj");
            return (Criteria) this;
        }

        public Criteria andLogObjNotLike(String value) {
            addCriterion("log_obj not like", value, "logObj");
            return (Criteria) this;
        }

        public Criteria andLogObjIn(List<String> values) {
            addCriterion("log_obj in", values, "logObj");
            return (Criteria) this;
        }

        public Criteria andLogObjNotIn(List<String> values) {
            addCriterion("log_obj not in", values, "logObj");
            return (Criteria) this;
        }

        public Criteria andLogObjBetween(String value1, String value2) {
            addCriterion("log_obj between", value1, value2, "logObj");
            return (Criteria) this;
        }

        public Criteria andLogObjNotBetween(String value1, String value2) {
            addCriterion("log_obj not between", value1, value2, "logObj");
            return (Criteria) this;
        }

        public Criteria andLogDtlIsNull() {
            addCriterion("log_dtl is null");
            return (Criteria) this;
        }

        public Criteria andLogDtlIsNotNull() {
            addCriterion("log_dtl is not null");
            return (Criteria) this;
        }

        public Criteria andLogDtlEqualTo(String value) {
            addCriterion("log_dtl =", value, "logDtl");
            return (Criteria) this;
        }

        public Criteria andLogDtlNotEqualTo(String value) {
            addCriterion("log_dtl <>", value, "logDtl");
            return (Criteria) this;
        }

        public Criteria andLogDtlGreaterThan(String value) {
            addCriterion("log_dtl >", value, "logDtl");
            return (Criteria) this;
        }

        public Criteria andLogDtlGreaterThanOrEqualTo(String value) {
            addCriterion("log_dtl >=", value, "logDtl");
            return (Criteria) this;
        }

        public Criteria andLogDtlLessThan(String value) {
            addCriterion("log_dtl <", value, "logDtl");
            return (Criteria) this;
        }

        public Criteria andLogDtlLessThanOrEqualTo(String value) {
            addCriterion("log_dtl <=", value, "logDtl");
            return (Criteria) this;
        }

        public Criteria andLogDtlLike(String value) {
            addCriterion("log_dtl like", value, "logDtl");
            return (Criteria) this;
        }

        public Criteria andLogDtlNotLike(String value) {
            addCriterion("log_dtl not like", value, "logDtl");
            return (Criteria) this;
        }

        public Criteria andLogDtlIn(List<String> values) {
            addCriterion("log_dtl in", values, "logDtl");
            return (Criteria) this;
        }

        public Criteria andLogDtlNotIn(List<String> values) {
            addCriterion("log_dtl not in", values, "logDtl");
            return (Criteria) this;
        }

        public Criteria andLogDtlBetween(String value1, String value2) {
            addCriterion("log_dtl between", value1, value2, "logDtl");
            return (Criteria) this;
        }

        public Criteria andLogDtlNotBetween(String value1, String value2) {
            addCriterion("log_dtl not between", value1, value2, "logDtl");
            return (Criteria) this;
        }

        public Criteria andLogLevelIsNull() {
            addCriterion("log_level is null");
            return (Criteria) this;
        }

        public Criteria andLogLevelIsNotNull() {
            addCriterion("log_level is not null");
            return (Criteria) this;
        }

        public Criteria andLogLevelEqualTo(Byte value) {
            addCriterion("log_level =", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelNotEqualTo(Byte value) {
            addCriterion("log_level <>", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelGreaterThan(Byte value) {
            addCriterion("log_level >", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("log_level >=", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelLessThan(Byte value) {
            addCriterion("log_level <", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelLessThanOrEqualTo(Byte value) {
            addCriterion("log_level <=", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelIn(List<Byte> values) {
            addCriterion("log_level in", values, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelNotIn(List<Byte> values) {
            addCriterion("log_level not in", values, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelBetween(Byte value1, Byte value2) {
            addCriterion("log_level between", value1, value2, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("log_level not between", value1, value2, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNull() {
            addCriterion("log_time is null");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNotNull() {
            addCriterion("log_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogTimeEqualTo(Date value) {
            addCriterion("log_time =", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotEqualTo(Date value) {
            addCriterion("log_time <>", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThan(Date value) {
            addCriterion("log_time >", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("log_time >=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThan(Date value) {
            addCriterion("log_time <", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThanOrEqualTo(Date value) {
            addCriterion("log_time <=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeIn(List<Date> values) {
            addCriterion("log_time in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotIn(List<Date> values) {
            addCriterion("log_time not in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeBetween(Date value1, Date value2) {
            addCriterion("log_time between", value1, value2, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotBetween(Date value1, Date value2) {
            addCriterion("log_time not between", value1, value2, "logTime");
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
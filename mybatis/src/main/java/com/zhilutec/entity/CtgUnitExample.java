package com.zhilutec.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CtgUnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CtgUnitExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andNameIsNull() {
            addCriterion("unt_name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("unt_name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("unt_name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("unt_name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("unt_name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("unt_name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("unt_name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("unt_name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("unt_name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("unt_name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("unt_name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("unt_name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("unt_name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("unt_name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNull() {
            addCriterion("unt_license is null");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNotNull() {
            addCriterion("unt_license is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseEqualTo(String value) {
            addCriterion("unt_license =", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotEqualTo(String value) {
            addCriterion("unt_license <>", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThan(String value) {
            addCriterion("unt_license >", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("unt_license >=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThan(String value) {
            addCriterion("unt_license <", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThanOrEqualTo(String value) {
            addCriterion("unt_license <=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLike(String value) {
            addCriterion("unt_license like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotLike(String value) {
            addCriterion("unt_license not like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseIn(List<String> values) {
            addCriterion("unt_license in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotIn(List<String> values) {
            addCriterion("unt_license not in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseBetween(String value1, String value2) {
            addCriterion("unt_license between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotBetween(String value1, String value2) {
            addCriterion("unt_license not between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andStoreIsNull() {
            addCriterion("unt_store is null");
            return (Criteria) this;
        }

        public Criteria andStoreIsNotNull() {
            addCriterion("unt_store is not null");
            return (Criteria) this;
        }

        public Criteria andStoreEqualTo(String value) {
            addCriterion("unt_store =", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotEqualTo(String value) {
            addCriterion("unt_store <>", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreGreaterThan(String value) {
            addCriterion("unt_store >", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreGreaterThanOrEqualTo(String value) {
            addCriterion("unt_store >=", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreLessThan(String value) {
            addCriterion("unt_store <", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreLessThanOrEqualTo(String value) {
            addCriterion("unt_store <=", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreLike(String value) {
            addCriterion("unt_store like", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotLike(String value) {
            addCriterion("unt_store not like", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreIn(List<String> values) {
            addCriterion("unt_store in", values, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotIn(List<String> values) {
            addCriterion("unt_store not in", values, "store");
            return (Criteria) this;
        }

        public Criteria andStoreBetween(String value1, String value2) {
            addCriterion("unt_store between", value1, value2, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotBetween(String value1, String value2) {
            addCriterion("unt_store not between", value1, value2, "store");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeIsNull() {
            addCriterion("unt_opening_time is null");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeIsNotNull() {
            addCriterion("unt_opening_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeEqualTo(String value) {
            addCriterion("unt_opening_time =", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeNotEqualTo(String value) {
            addCriterion("unt_opening_time <>", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeGreaterThan(String value) {
            addCriterion("unt_opening_time >", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeGreaterThanOrEqualTo(String value) {
            addCriterion("unt_opening_time >=", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeLessThan(String value) {
            addCriterion("unt_opening_time <", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeLessThanOrEqualTo(String value) {
            addCriterion("unt_opening_time <=", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeLike(String value) {
            addCriterion("unt_opening_time like", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeNotLike(String value) {
            addCriterion("unt_opening_time not like", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeIn(List<String> values) {
            addCriterion("unt_opening_time in", values, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeNotIn(List<String> values) {
            addCriterion("unt_opening_time not in", values, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeBetween(String value1, String value2) {
            addCriterion("unt_opening_time between", value1, value2, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeNotBetween(String value1, String value2) {
            addCriterion("unt_opening_time not between", value1, value2, "openingTime");
            return (Criteria) this;
        }

        public Criteria andProvcodeIsNull() {
            addCriterion("unt_provcode is null");
            return (Criteria) this;
        }

        public Criteria andProvcodeIsNotNull() {
            addCriterion("unt_provcode is not null");
            return (Criteria) this;
        }

        public Criteria andProvcodeEqualTo(String value) {
            addCriterion("unt_provcode =", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotEqualTo(String value) {
            addCriterion("unt_provcode <>", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeGreaterThan(String value) {
            addCriterion("unt_provcode >", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeGreaterThanOrEqualTo(String value) {
            addCriterion("unt_provcode >=", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeLessThan(String value) {
            addCriterion("unt_provcode <", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeLessThanOrEqualTo(String value) {
            addCriterion("unt_provcode <=", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeLike(String value) {
            addCriterion("unt_provcode like", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotLike(String value) {
            addCriterion("unt_provcode not like", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeIn(List<String> values) {
            addCriterion("unt_provcode in", values, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotIn(List<String> values) {
            addCriterion("unt_provcode not in", values, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeBetween(String value1, String value2) {
            addCriterion("unt_provcode between", value1, value2, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotBetween(String value1, String value2) {
            addCriterion("unt_provcode not between", value1, value2, "provcode");
            return (Criteria) this;
        }

        public Criteria andTowncodeIsNull() {
            addCriterion("unt_towncode is null");
            return (Criteria) this;
        }

        public Criteria andTowncodeIsNotNull() {
            addCriterion("unt_towncode is not null");
            return (Criteria) this;
        }

        public Criteria andTowncodeEqualTo(String value) {
            addCriterion("unt_towncode =", value, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeNotEqualTo(String value) {
            addCriterion("unt_towncode <>", value, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeGreaterThan(String value) {
            addCriterion("unt_towncode >", value, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeGreaterThanOrEqualTo(String value) {
            addCriterion("unt_towncode >=", value, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeLessThan(String value) {
            addCriterion("unt_towncode <", value, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeLessThanOrEqualTo(String value) {
            addCriterion("unt_towncode <=", value, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeLike(String value) {
            addCriterion("unt_towncode like", value, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeNotLike(String value) {
            addCriterion("unt_towncode not like", value, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeIn(List<String> values) {
            addCriterion("unt_towncode in", values, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeNotIn(List<String> values) {
            addCriterion("unt_towncode not in", values, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeBetween(String value1, String value2) {
            addCriterion("unt_towncode between", value1, value2, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeNotBetween(String value1, String value2) {
            addCriterion("unt_towncode not between", value1, value2, "towncode");
            return (Criteria) this;
        }

        public Criteria andDistcodeIsNull() {
            addCriterion("unt_distcode is null");
            return (Criteria) this;
        }

        public Criteria andDistcodeIsNotNull() {
            addCriterion("unt_distcode is not null");
            return (Criteria) this;
        }

        public Criteria andDistcodeEqualTo(String value) {
            addCriterion("unt_distcode =", value, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeNotEqualTo(String value) {
            addCriterion("unt_distcode <>", value, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeGreaterThan(String value) {
            addCriterion("unt_distcode >", value, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeGreaterThanOrEqualTo(String value) {
            addCriterion("unt_distcode >=", value, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeLessThan(String value) {
            addCriterion("unt_distcode <", value, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeLessThanOrEqualTo(String value) {
            addCriterion("unt_distcode <=", value, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeLike(String value) {
            addCriterion("unt_distcode like", value, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeNotLike(String value) {
            addCriterion("unt_distcode not like", value, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeIn(List<String> values) {
            addCriterion("unt_distcode in", values, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeNotIn(List<String> values) {
            addCriterion("unt_distcode not in", values, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeBetween(String value1, String value2) {
            addCriterion("unt_distcode between", value1, value2, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeNotBetween(String value1, String value2) {
            addCriterion("unt_distcode not between", value1, value2, "distcode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNull() {
            addCriterion("unt_citycode is null");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNotNull() {
            addCriterion("unt_citycode is not null");
            return (Criteria) this;
        }

        public Criteria andCitycodeEqualTo(String value) {
            addCriterion("unt_citycode =", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotEqualTo(String value) {
            addCriterion("unt_citycode <>", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThan(String value) {
            addCriterion("unt_citycode >", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("unt_citycode >=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThan(String value) {
            addCriterion("unt_citycode <", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThanOrEqualTo(String value) {
            addCriterion("unt_citycode <=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLike(String value) {
            addCriterion("unt_citycode like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotLike(String value) {
            addCriterion("unt_citycode not like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIn(List<String> values) {
            addCriterion("unt_citycode in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotIn(List<String> values) {
            addCriterion("unt_citycode not in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeBetween(String value1, String value2) {
            addCriterion("unt_citycode between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotBetween(String value1, String value2) {
            addCriterion("unt_citycode not between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("unt_address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("unt_address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("unt_address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("unt_address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("unt_address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("unt_address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("unt_address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("unt_address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("unt_address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("unt_address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("unt_address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("unt_address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("unt_address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("unt_address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("unt_lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("unt_lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(BigDecimal value) {
            addCriterion("unt_lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(BigDecimal value) {
            addCriterion("unt_lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(BigDecimal value) {
            addCriterion("unt_lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unt_lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(BigDecimal value) {
            addCriterion("unt_lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unt_lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<BigDecimal> values) {
            addCriterion("unt_lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<BigDecimal> values) {
            addCriterion("unt_lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unt_lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unt_lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("unt_lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("unt_lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(BigDecimal value) {
            addCriterion("unt_lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(BigDecimal value) {
            addCriterion("unt_lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(BigDecimal value) {
            addCriterion("unt_lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unt_lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(BigDecimal value) {
            addCriterion("unt_lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unt_lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<BigDecimal> values) {
            addCriterion("unt_lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<BigDecimal> values) {
            addCriterion("unt_lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unt_lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unt_lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("unt_contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("unt_contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("unt_contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("unt_contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("unt_contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("unt_contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("unt_contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("unt_contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("unt_contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("unt_contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("unt_contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("unt_contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("unt_contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("unt_contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("unt_phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("unt_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("unt_phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("unt_phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("unt_phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("unt_phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("unt_phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("unt_phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("unt_phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("unt_phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("unt_phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("unt_phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("unt_phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("unt_phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("unt_legal_person is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("unt_legal_person is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("unt_legal_person =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("unt_legal_person <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("unt_legal_person >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("unt_legal_person >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("unt_legal_person <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("unt_legal_person <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("unt_legal_person like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("unt_legal_person not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("unt_legal_person in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("unt_legal_person not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("unt_legal_person between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("unt_legal_person not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIsNull() {
            addCriterion("unt_business_code is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIsNotNull() {
            addCriterion("unt_business_code is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeEqualTo(String value) {
            addCriterion("unt_business_code =", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotEqualTo(String value) {
            addCriterion("unt_business_code <>", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeGreaterThan(String value) {
            addCriterion("unt_business_code >", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeGreaterThanOrEqualTo(String value) {
            addCriterion("unt_business_code >=", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLessThan(String value) {
            addCriterion("unt_business_code <", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLessThanOrEqualTo(String value) {
            addCriterion("unt_business_code <=", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLike(String value) {
            addCriterion("unt_business_code like", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotLike(String value) {
            addCriterion("unt_business_code not like", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIn(List<String> values) {
            addCriterion("unt_business_code in", values, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotIn(List<String> values) {
            addCriterion("unt_business_code not in", values, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeBetween(String value1, String value2) {
            addCriterion("unt_business_code between", value1, value2, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotBetween(String value1, String value2) {
            addCriterion("unt_business_code not between", value1, value2, "businessCode");
            return (Criteria) this;
        }

        public Criteria andSoptimeIsNull() {
            addCriterion("unt_soptime is null");
            return (Criteria) this;
        }

        public Criteria andSoptimeIsNotNull() {
            addCriterion("unt_soptime is not null");
            return (Criteria) this;
        }

        public Criteria andSoptimeEqualTo(Date value) {
            addCriterionForJDBCDate("unt_soptime =", value, "soptime");
            return (Criteria) this;
        }

        public Criteria andSoptimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("unt_soptime <>", value, "soptime");
            return (Criteria) this;
        }

        public Criteria andSoptimeGreaterThan(Date value) {
            addCriterionForJDBCDate("unt_soptime >", value, "soptime");
            return (Criteria) this;
        }

        public Criteria andSoptimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("unt_soptime >=", value, "soptime");
            return (Criteria) this;
        }

        public Criteria andSoptimeLessThan(Date value) {
            addCriterionForJDBCDate("unt_soptime <", value, "soptime");
            return (Criteria) this;
        }

        public Criteria andSoptimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("unt_soptime <=", value, "soptime");
            return (Criteria) this;
        }

        public Criteria andSoptimeIn(List<Date> values) {
            addCriterionForJDBCDate("unt_soptime in", values, "soptime");
            return (Criteria) this;
        }

        public Criteria andSoptimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("unt_soptime not in", values, "soptime");
            return (Criteria) this;
        }

        public Criteria andSoptimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("unt_soptime between", value1, value2, "soptime");
            return (Criteria) this;
        }

        public Criteria andSoptimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("unt_soptime not between", value1, value2, "soptime");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsNull() {
            addCriterion("unt_employee is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsNotNull() {
            addCriterion("unt_employee is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEqualTo(Integer value) {
            addCriterion("unt_employee =", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeNotEqualTo(Integer value) {
            addCriterion("unt_employee <>", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeGreaterThan(Integer value) {
            addCriterion("unt_employee >", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("unt_employee >=", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeLessThan(Integer value) {
            addCriterion("unt_employee <", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeLessThanOrEqualTo(Integer value) {
            addCriterion("unt_employee <=", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeIn(List<Integer> values) {
            addCriterion("unt_employee in", values, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeNotIn(List<Integer> values) {
            addCriterion("unt_employee not in", values, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeBetween(Integer value1, Integer value2) {
            addCriterion("unt_employee between", value1, value2, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeNotBetween(Integer value1, Integer value2) {
            addCriterion("unt_employee not between", value1, value2, "employee");
            return (Criteria) this;
        }

        public Criteria andMonitorIsNull() {
            addCriterion("unt_monitor is null");
            return (Criteria) this;
        }

        public Criteria andMonitorIsNotNull() {
            addCriterion("unt_monitor is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorEqualTo(Integer value) {
            addCriterion("unt_monitor =", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorNotEqualTo(Integer value) {
            addCriterion("unt_monitor <>", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorGreaterThan(Integer value) {
            addCriterion("unt_monitor >", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorGreaterThanOrEqualTo(Integer value) {
            addCriterion("unt_monitor >=", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorLessThan(Integer value) {
            addCriterion("unt_monitor <", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorLessThanOrEqualTo(Integer value) {
            addCriterion("unt_monitor <=", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorIn(List<Integer> values) {
            addCriterion("unt_monitor in", values, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorNotIn(List<Integer> values) {
            addCriterion("unt_monitor not in", values, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorBetween(Integer value1, Integer value2) {
            addCriterion("unt_monitor between", value1, value2, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorNotBetween(Integer value1, Integer value2) {
            addCriterion("unt_monitor not between", value1, value2, "monitor");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNull() {
            addCriterion("unt_attention is null");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNotNull() {
            addCriterion("unt_attention is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionEqualTo(Integer value) {
            addCriterion("unt_attention =", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotEqualTo(Integer value) {
            addCriterion("unt_attention <>", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThan(Integer value) {
            addCriterion("unt_attention >", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThanOrEqualTo(Integer value) {
            addCriterion("unt_attention >=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThan(Integer value) {
            addCriterion("unt_attention <", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThanOrEqualTo(Integer value) {
            addCriterion("unt_attention <=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionIn(List<Integer> values) {
            addCriterion("unt_attention in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotIn(List<Integer> values) {
            addCriterion("unt_attention not in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionBetween(Integer value1, Integer value2) {
            addCriterion("unt_attention between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotBetween(Integer value1, Integer value2) {
            addCriterion("unt_attention not between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andDiningtableIsNull() {
            addCriterion("unt_diningtable is null");
            return (Criteria) this;
        }

        public Criteria andDiningtableIsNotNull() {
            addCriterion("unt_diningtable is not null");
            return (Criteria) this;
        }

        public Criteria andDiningtableEqualTo(Integer value) {
            addCriterion("unt_diningtable =", value, "diningtable");
            return (Criteria) this;
        }

        public Criteria andDiningtableNotEqualTo(Integer value) {
            addCriterion("unt_diningtable <>", value, "diningtable");
            return (Criteria) this;
        }

        public Criteria andDiningtableGreaterThan(Integer value) {
            addCriterion("unt_diningtable >", value, "diningtable");
            return (Criteria) this;
        }

        public Criteria andDiningtableGreaterThanOrEqualTo(Integer value) {
            addCriterion("unt_diningtable >=", value, "diningtable");
            return (Criteria) this;
        }

        public Criteria andDiningtableLessThan(Integer value) {
            addCriterion("unt_diningtable <", value, "diningtable");
            return (Criteria) this;
        }

        public Criteria andDiningtableLessThanOrEqualTo(Integer value) {
            addCriterion("unt_diningtable <=", value, "diningtable");
            return (Criteria) this;
        }

        public Criteria andDiningtableIn(List<Integer> values) {
            addCriterion("unt_diningtable in", values, "diningtable");
            return (Criteria) this;
        }

        public Criteria andDiningtableNotIn(List<Integer> values) {
            addCriterion("unt_diningtable not in", values, "diningtable");
            return (Criteria) this;
        }

        public Criteria andDiningtableBetween(Integer value1, Integer value2) {
            addCriterion("unt_diningtable between", value1, value2, "diningtable");
            return (Criteria) this;
        }

        public Criteria andDiningtableNotBetween(Integer value1, Integer value2) {
            addCriterion("unt_diningtable not between", value1, value2, "diningtable");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNull() {
            addCriterion("unt_capacity is null");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNotNull() {
            addCriterion("unt_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityEqualTo(Integer value) {
            addCriterion("unt_capacity =", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotEqualTo(Integer value) {
            addCriterion("unt_capacity <>", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThan(Integer value) {
            addCriterion("unt_capacity >", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("unt_capacity >=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThan(Integer value) {
            addCriterion("unt_capacity <", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("unt_capacity <=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityIn(List<Integer> values) {
            addCriterion("unt_capacity in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotIn(List<Integer> values) {
            addCriterion("unt_capacity not in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityBetween(Integer value1, Integer value2) {
            addCriterion("unt_capacity between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("unt_capacity not between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andFacadeAreaIsNull() {
            addCriterion("unt_facade_area is null");
            return (Criteria) this;
        }

        public Criteria andFacadeAreaIsNotNull() {
            addCriterion("unt_facade_area is not null");
            return (Criteria) this;
        }

        public Criteria andFacadeAreaEqualTo(BigDecimal value) {
            addCriterion("unt_facade_area =", value, "facadeArea");
            return (Criteria) this;
        }

        public Criteria andFacadeAreaNotEqualTo(BigDecimal value) {
            addCriterion("unt_facade_area <>", value, "facadeArea");
            return (Criteria) this;
        }

        public Criteria andFacadeAreaGreaterThan(BigDecimal value) {
            addCriterion("unt_facade_area >", value, "facadeArea");
            return (Criteria) this;
        }

        public Criteria andFacadeAreaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unt_facade_area >=", value, "facadeArea");
            return (Criteria) this;
        }

        public Criteria andFacadeAreaLessThan(BigDecimal value) {
            addCriterion("unt_facade_area <", value, "facadeArea");
            return (Criteria) this;
        }

        public Criteria andFacadeAreaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unt_facade_area <=", value, "facadeArea");
            return (Criteria) this;
        }

        public Criteria andFacadeAreaIn(List<BigDecimal> values) {
            addCriterion("unt_facade_area in", values, "facadeArea");
            return (Criteria) this;
        }

        public Criteria andFacadeAreaNotIn(List<BigDecimal> values) {
            addCriterion("unt_facade_area not in", values, "facadeArea");
            return (Criteria) this;
        }

        public Criteria andFacadeAreaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unt_facade_area between", value1, value2, "facadeArea");
            return (Criteria) this;
        }

        public Criteria andFacadeAreaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unt_facade_area not between", value1, value2, "facadeArea");
            return (Criteria) this;
        }

        public Criteria andWaterConsumptionIsNull() {
            addCriterion("unt_water_consumption is null");
            return (Criteria) this;
        }

        public Criteria andWaterConsumptionIsNotNull() {
            addCriterion("unt_water_consumption is not null");
            return (Criteria) this;
        }

        public Criteria andWaterConsumptionEqualTo(BigDecimal value) {
            addCriterion("unt_water_consumption =", value, "waterConsumption");
            return (Criteria) this;
        }

        public Criteria andWaterConsumptionNotEqualTo(BigDecimal value) {
            addCriterion("unt_water_consumption <>", value, "waterConsumption");
            return (Criteria) this;
        }

        public Criteria andWaterConsumptionGreaterThan(BigDecimal value) {
            addCriterion("unt_water_consumption >", value, "waterConsumption");
            return (Criteria) this;
        }

        public Criteria andWaterConsumptionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unt_water_consumption >=", value, "waterConsumption");
            return (Criteria) this;
        }

        public Criteria andWaterConsumptionLessThan(BigDecimal value) {
            addCriterion("unt_water_consumption <", value, "waterConsumption");
            return (Criteria) this;
        }

        public Criteria andWaterConsumptionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unt_water_consumption <=", value, "waterConsumption");
            return (Criteria) this;
        }

        public Criteria andWaterConsumptionIn(List<BigDecimal> values) {
            addCriterion("unt_water_consumption in", values, "waterConsumption");
            return (Criteria) this;
        }

        public Criteria andWaterConsumptionNotIn(List<BigDecimal> values) {
            addCriterion("unt_water_consumption not in", values, "waterConsumption");
            return (Criteria) this;
        }

        public Criteria andWaterConsumptionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unt_water_consumption between", value1, value2, "waterConsumption");
            return (Criteria) this;
        }

        public Criteria andWaterConsumptionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unt_water_consumption not between", value1, value2, "waterConsumption");
            return (Criteria) this;
        }

        public Criteria andScaleIsNull() {
            addCriterion("unt_scale is null");
            return (Criteria) this;
        }

        public Criteria andScaleIsNotNull() {
            addCriterion("unt_scale is not null");
            return (Criteria) this;
        }

        public Criteria andScaleEqualTo(Integer value) {
            addCriterion("unt_scale =", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotEqualTo(Integer value) {
            addCriterion("unt_scale <>", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleGreaterThan(Integer value) {
            addCriterion("unt_scale >", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("unt_scale >=", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLessThan(Integer value) {
            addCriterion("unt_scale <", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLessThanOrEqualTo(Integer value) {
            addCriterion("unt_scale <=", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleIn(List<Integer> values) {
            addCriterion("unt_scale in", values, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotIn(List<Integer> values) {
            addCriterion("unt_scale not in", values, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleBetween(Integer value1, Integer value2) {
            addCriterion("unt_scale between", value1, value2, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotBetween(Integer value1, Integer value2) {
            addCriterion("unt_scale not between", value1, value2, "scale");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedIsNull() {
            addCriterion("gmt_created is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedIsNotNull() {
            addCriterion("gmt_created is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedEqualTo(Date value) {
            addCriterion("gmt_created =", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedNotEqualTo(Date value) {
            addCriterion("gmt_created <>", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedGreaterThan(Date value) {
            addCriterion("gmt_created >", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_created >=", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedLessThan(Date value) {
            addCriterion("gmt_created <", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_created <=", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedIn(List<Date> values) {
            addCriterion("gmt_created in", values, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedNotIn(List<Date> values) {
            addCriterion("gmt_created not in", values, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedBetween(Date value1, Date value2) {
            addCriterion("gmt_created between", value1, value2, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_created not between", value1, value2, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andActivityIsNull() {
            addCriterion("unt_activity is null");
            return (Criteria) this;
        }

        public Criteria andActivityIsNotNull() {
            addCriterion("unt_activity is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEqualTo(Integer value) {
            addCriterion("unt_activity =", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotEqualTo(Integer value) {
            addCriterion("unt_activity <>", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThan(Integer value) {
            addCriterion("unt_activity >", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThanOrEqualTo(Integer value) {
            addCriterion("unt_activity >=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThan(Integer value) {
            addCriterion("unt_activity <", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThanOrEqualTo(Integer value) {
            addCriterion("unt_activity <=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityIn(List<Integer> values) {
            addCriterion("unt_activity in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotIn(List<Integer> values) {
            addCriterion("unt_activity not in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityBetween(Integer value1, Integer value2) {
            addCriterion("unt_activity between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotBetween(Integer value1, Integer value2) {
            addCriterion("unt_activity not between", value1, value2, "activity");
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
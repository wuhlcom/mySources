package com.zhilutec.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CtgSiteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CtgSiteExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("sit_name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("sit_name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("sit_name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("sit_name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("sit_name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("sit_name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("sit_name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("sit_name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("sit_name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("sit_name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("sit_name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("sit_name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("sit_name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("sit_name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("sit_type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("sit_type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("sit_type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("sit_type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("sit_type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sit_type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("sit_type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("sit_type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("sit_type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("sit_type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("sit_type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sit_type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andOriginalIsNull() {
            addCriterion("sit_original is null");
            return (Criteria) this;
        }

        public Criteria andOriginalIsNotNull() {
            addCriterion("sit_original is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalEqualTo(String value) {
            addCriterion("sit_original =", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalNotEqualTo(String value) {
            addCriterion("sit_original <>", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalGreaterThan(String value) {
            addCriterion("sit_original >", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalGreaterThanOrEqualTo(String value) {
            addCriterion("sit_original >=", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalLessThan(String value) {
            addCriterion("sit_original <", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalLessThanOrEqualTo(String value) {
            addCriterion("sit_original <=", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalLike(String value) {
            addCriterion("sit_original like", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalNotLike(String value) {
            addCriterion("sit_original not like", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalIn(List<String> values) {
            addCriterion("sit_original in", values, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalNotIn(List<String> values) {
            addCriterion("sit_original not in", values, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalBetween(String value1, String value2) {
            addCriterion("sit_original between", value1, value2, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalNotBetween(String value1, String value2) {
            addCriterion("sit_original not between", value1, value2, "original");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("sit_location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("sit_location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("sit_location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("sit_location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("sit_location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("sit_location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("sit_location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("sit_location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("sit_location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("sit_location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("sit_location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("sit_location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("sit_location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("sit_location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("sit_lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("sit_lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(BigDecimal value) {
            addCriterion("sit_lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(BigDecimal value) {
            addCriterion("sit_lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(BigDecimal value) {
            addCriterion("sit_lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sit_lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(BigDecimal value) {
            addCriterion("sit_lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sit_lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<BigDecimal> values) {
            addCriterion("sit_lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<BigDecimal> values) {
            addCriterion("sit_lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sit_lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sit_lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("sit_lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("sit_lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(BigDecimal value) {
            addCriterion("sit_lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(BigDecimal value) {
            addCriterion("sit_lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(BigDecimal value) {
            addCriterion("sit_lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sit_lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(BigDecimal value) {
            addCriterion("sit_lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sit_lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<BigDecimal> values) {
            addCriterion("sit_lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<BigDecimal> values) {
            addCriterion("sit_lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sit_lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sit_lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andDistcodeIsNull() {
            addCriterion("sit_distcode is null");
            return (Criteria) this;
        }

        public Criteria andDistcodeIsNotNull() {
            addCriterion("sit_distcode is not null");
            return (Criteria) this;
        }

        public Criteria andDistcodeEqualTo(String value) {
            addCriterion("sit_distcode =", value, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeNotEqualTo(String value) {
            addCriterion("sit_distcode <>", value, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeGreaterThan(String value) {
            addCriterion("sit_distcode >", value, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeGreaterThanOrEqualTo(String value) {
            addCriterion("sit_distcode >=", value, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeLessThan(String value) {
            addCriterion("sit_distcode <", value, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeLessThanOrEqualTo(String value) {
            addCriterion("sit_distcode <=", value, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeLike(String value) {
            addCriterion("sit_distcode like", value, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeNotLike(String value) {
            addCriterion("sit_distcode not like", value, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeIn(List<String> values) {
            addCriterion("sit_distcode in", values, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeNotIn(List<String> values) {
            addCriterion("sit_distcode not in", values, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeBetween(String value1, String value2) {
            addCriterion("sit_distcode between", value1, value2, "distcode");
            return (Criteria) this;
        }

        public Criteria andDistcodeNotBetween(String value1, String value2) {
            addCriterion("sit_distcode not between", value1, value2, "distcode");
            return (Criteria) this;
        }

        public Criteria andMaintainerIsNull() {
            addCriterion("sit_maintainer is null");
            return (Criteria) this;
        }

        public Criteria andMaintainerIsNotNull() {
            addCriterion("sit_maintainer is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainerEqualTo(String value) {
            addCriterion("sit_maintainer =", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotEqualTo(String value) {
            addCriterion("sit_maintainer <>", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerGreaterThan(String value) {
            addCriterion("sit_maintainer >", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerGreaterThanOrEqualTo(String value) {
            addCriterion("sit_maintainer >=", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerLessThan(String value) {
            addCriterion("sit_maintainer <", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerLessThanOrEqualTo(String value) {
            addCriterion("sit_maintainer <=", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerLike(String value) {
            addCriterion("sit_maintainer like", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotLike(String value) {
            addCriterion("sit_maintainer not like", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerIn(List<String> values) {
            addCriterion("sit_maintainer in", values, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotIn(List<String> values) {
            addCriterion("sit_maintainer not in", values, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerBetween(String value1, String value2) {
            addCriterion("sit_maintainer between", value1, value2, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotBetween(String value1, String value2) {
            addCriterion("sit_maintainer not between", value1, value2, "maintainer");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("sit_phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("sit_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("sit_phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("sit_phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("sit_phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("sit_phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("sit_phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("sit_phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("sit_phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("sit_phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("sit_phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("sit_phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("sit_phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("sit_phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andChcTimeIsNull() {
            addCriterion("sit_chc_time is null");
            return (Criteria) this;
        }

        public Criteria andChcTimeIsNotNull() {
            addCriterion("sit_chc_time is not null");
            return (Criteria) this;
        }

        public Criteria andChcTimeEqualTo(Date value) {
            addCriterion("sit_chc_time =", value, "chcTime");
            return (Criteria) this;
        }

        public Criteria andChcTimeNotEqualTo(Date value) {
            addCriterion("sit_chc_time <>", value, "chcTime");
            return (Criteria) this;
        }

        public Criteria andChcTimeGreaterThan(Date value) {
            addCriterion("sit_chc_time >", value, "chcTime");
            return (Criteria) this;
        }

        public Criteria andChcTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sit_chc_time >=", value, "chcTime");
            return (Criteria) this;
        }

        public Criteria andChcTimeLessThan(Date value) {
            addCriterion("sit_chc_time <", value, "chcTime");
            return (Criteria) this;
        }

        public Criteria andChcTimeLessThanOrEqualTo(Date value) {
            addCriterion("sit_chc_time <=", value, "chcTime");
            return (Criteria) this;
        }

        public Criteria andChcTimeIn(List<Date> values) {
            addCriterion("sit_chc_time in", values, "chcTime");
            return (Criteria) this;
        }

        public Criteria andChcTimeNotIn(List<Date> values) {
            addCriterion("sit_chc_time not in", values, "chcTime");
            return (Criteria) this;
        }

        public Criteria andChcTimeBetween(Date value1, Date value2) {
            addCriterion("sit_chc_time between", value1, value2, "chcTime");
            return (Criteria) this;
        }

        public Criteria andChcTimeNotBetween(Date value1, Date value2) {
            addCriterion("sit_chc_time not between", value1, value2, "chcTime");
            return (Criteria) this;
        }

        public Criteria andCheckIsNull() {
            addCriterion("sit_check is null");
            return (Criteria) this;
        }

        public Criteria andCheckIsNotNull() {
            addCriterion("sit_check is not null");
            return (Criteria) this;
        }

        public Criteria andCheckEqualTo(Byte value) {
            addCriterion("sit_check =", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckNotEqualTo(Byte value) {
            addCriterion("sit_check <>", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckGreaterThan(Byte value) {
            addCriterion("sit_check >", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckGreaterThanOrEqualTo(Byte value) {
            addCriterion("sit_check >=", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckLessThan(Byte value) {
            addCriterion("sit_check <", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckLessThanOrEqualTo(Byte value) {
            addCriterion("sit_check <=", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckIn(List<Byte> values) {
            addCriterion("sit_check in", values, "check");
            return (Criteria) this;
        }

        public Criteria andCheckNotIn(List<Byte> values) {
            addCriterion("sit_check not in", values, "check");
            return (Criteria) this;
        }

        public Criteria andCheckBetween(Byte value1, Byte value2) {
            addCriterion("sit_check between", value1, value2, "check");
            return (Criteria) this;
        }

        public Criteria andCheckNotBetween(Byte value1, Byte value2) {
            addCriterion("sit_check not between", value1, value2, "check");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("sit_expire_time is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("sit_expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(Date value) {
            addCriterion("sit_expire_time =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(Date value) {
            addCriterion("sit_expire_time <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(Date value) {
            addCriterion("sit_expire_time >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sit_expire_time >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(Date value) {
            addCriterion("sit_expire_time <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("sit_expire_time <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<Date> values) {
            addCriterion("sit_expire_time in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<Date> values) {
            addCriterion("sit_expire_time not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(Date value1, Date value2) {
            addCriterion("sit_expire_time between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("sit_expire_time not between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andAdtTimeIsNull() {
            addCriterion("sit_adt_time is null");
            return (Criteria) this;
        }

        public Criteria andAdtTimeIsNotNull() {
            addCriterion("sit_adt_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdtTimeEqualTo(Date value) {
            addCriterion("sit_adt_time =", value, "adtTime");
            return (Criteria) this;
        }

        public Criteria andAdtTimeNotEqualTo(Date value) {
            addCriterion("sit_adt_time <>", value, "adtTime");
            return (Criteria) this;
        }

        public Criteria andAdtTimeGreaterThan(Date value) {
            addCriterion("sit_adt_time >", value, "adtTime");
            return (Criteria) this;
        }

        public Criteria andAdtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sit_adt_time >=", value, "adtTime");
            return (Criteria) this;
        }

        public Criteria andAdtTimeLessThan(Date value) {
            addCriterion("sit_adt_time <", value, "adtTime");
            return (Criteria) this;
        }

        public Criteria andAdtTimeLessThanOrEqualTo(Date value) {
            addCriterion("sit_adt_time <=", value, "adtTime");
            return (Criteria) this;
        }

        public Criteria andAdtTimeIn(List<Date> values) {
            addCriterion("sit_adt_time in", values, "adtTime");
            return (Criteria) this;
        }

        public Criteria andAdtTimeNotIn(List<Date> values) {
            addCriterion("sit_adt_time not in", values, "adtTime");
            return (Criteria) this;
        }

        public Criteria andAdtTimeBetween(Date value1, Date value2) {
            addCriterion("sit_adt_time between", value1, value2, "adtTime");
            return (Criteria) this;
        }

        public Criteria andAdtTimeNotBetween(Date value1, Date value2) {
            addCriterion("sit_adt_time not between", value1, value2, "adtTime");
            return (Criteria) this;
        }

        public Criteria andAuditIsNull() {
            addCriterion("sit_audit is null");
            return (Criteria) this;
        }

        public Criteria andAuditIsNotNull() {
            addCriterion("sit_audit is not null");
            return (Criteria) this;
        }

        public Criteria andAuditEqualTo(Byte value) {
            addCriterion("sit_audit =", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotEqualTo(Byte value) {
            addCriterion("sit_audit <>", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThan(Byte value) {
            addCriterion("sit_audit >", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThanOrEqualTo(Byte value) {
            addCriterion("sit_audit >=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThan(Byte value) {
            addCriterion("sit_audit <", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThanOrEqualTo(Byte value) {
            addCriterion("sit_audit <=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditIn(List<Byte> values) {
            addCriterion("sit_audit in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotIn(List<Byte> values) {
            addCriterion("sit_audit not in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditBetween(Byte value1, Byte value2) {
            addCriterion("sit_audit between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotBetween(Byte value1, Byte value2) {
            addCriterion("sit_audit not between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andFactorsIsNull() {
            addCriterion("sit_factors is null");
            return (Criteria) this;
        }

        public Criteria andFactorsIsNotNull() {
            addCriterion("sit_factors is not null");
            return (Criteria) this;
        }

        public Criteria andFactorsEqualTo(String value) {
            addCriterion("sit_factors =", value, "factors");
            return (Criteria) this;
        }

        public Criteria andFactorsNotEqualTo(String value) {
            addCriterion("sit_factors <>", value, "factors");
            return (Criteria) this;
        }

        public Criteria andFactorsGreaterThan(String value) {
            addCriterion("sit_factors >", value, "factors");
            return (Criteria) this;
        }

        public Criteria andFactorsGreaterThanOrEqualTo(String value) {
            addCriterion("sit_factors >=", value, "factors");
            return (Criteria) this;
        }

        public Criteria andFactorsLessThan(String value) {
            addCriterion("sit_factors <", value, "factors");
            return (Criteria) this;
        }

        public Criteria andFactorsLessThanOrEqualTo(String value) {
            addCriterion("sit_factors <=", value, "factors");
            return (Criteria) this;
        }

        public Criteria andFactorsLike(String value) {
            addCriterion("sit_factors like", value, "factors");
            return (Criteria) this;
        }

        public Criteria andFactorsNotLike(String value) {
            addCriterion("sit_factors not like", value, "factors");
            return (Criteria) this;
        }

        public Criteria andFactorsIn(List<String> values) {
            addCriterion("sit_factors in", values, "factors");
            return (Criteria) this;
        }

        public Criteria andFactorsNotIn(List<String> values) {
            addCriterion("sit_factors not in", values, "factors");
            return (Criteria) this;
        }

        public Criteria andFactorsBetween(String value1, String value2) {
            addCriterion("sit_factors between", value1, value2, "factors");
            return (Criteria) this;
        }

        public Criteria andFactorsNotBetween(String value1, String value2) {
            addCriterion("sit_factors not between", value1, value2, "factors");
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
            addCriterion("sit_activity is null");
            return (Criteria) this;
        }

        public Criteria andActivityIsNotNull() {
            addCriterion("sit_activity is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEqualTo(Integer value) {
            addCriterion("sit_activity =", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotEqualTo(Integer value) {
            addCriterion("sit_activity <>", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThan(Integer value) {
            addCriterion("sit_activity >", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThanOrEqualTo(Integer value) {
            addCriterion("sit_activity >=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThan(Integer value) {
            addCriterion("sit_activity <", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThanOrEqualTo(Integer value) {
            addCriterion("sit_activity <=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityIn(List<Integer> values) {
            addCriterion("sit_activity in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotIn(List<Integer> values) {
            addCriterion("sit_activity not in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityBetween(Integer value1, Integer value2) {
            addCriterion("sit_activity between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotBetween(Integer value1, Integer value2) {
            addCriterion("sit_activity not between", value1, value2, "activity");
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
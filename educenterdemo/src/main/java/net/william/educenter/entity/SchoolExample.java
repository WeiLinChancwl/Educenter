package net.william.educenter.entity;

import java.util.ArrayList;
import java.util.List;

public class SchoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchoolExample() {
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

        public Criteria andSchIdIsNull() {
            addCriterion("sch_id is null");
            return (Criteria) this;
        }

        public Criteria andSchIdIsNotNull() {
            addCriterion("sch_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchIdEqualTo(Integer value) {
            addCriterion("sch_id =", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdNotEqualTo(Integer value) {
            addCriterion("sch_id <>", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdGreaterThan(Integer value) {
            addCriterion("sch_id >", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sch_id >=", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdLessThan(Integer value) {
            addCriterion("sch_id <", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdLessThanOrEqualTo(Integer value) {
            addCriterion("sch_id <=", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdIn(List<Integer> values) {
            addCriterion("sch_id in", values, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdNotIn(List<Integer> values) {
            addCriterion("sch_id not in", values, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdBetween(Integer value1, Integer value2) {
            addCriterion("sch_id between", value1, value2, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sch_id not between", value1, value2, "schId");
            return (Criteria) this;
        }

        public Criteria andSchNameIsNull() {
            addCriterion("sch_name is null");
            return (Criteria) this;
        }

        public Criteria andSchNameIsNotNull() {
            addCriterion("sch_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchNameEqualTo(String value) {
            addCriterion("sch_name =", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameNotEqualTo(String value) {
            addCriterion("sch_name <>", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameGreaterThan(String value) {
            addCriterion("sch_name >", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameGreaterThanOrEqualTo(String value) {
            addCriterion("sch_name >=", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameLessThan(String value) {
            addCriterion("sch_name <", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameLessThanOrEqualTo(String value) {
            addCriterion("sch_name <=", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameLike(String value) {
            addCriterion("sch_name like", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameNotLike(String value) {
            addCriterion("sch_name not like", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameIn(List<String> values) {
            addCriterion("sch_name in", values, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameNotIn(List<String> values) {
            addCriterion("sch_name not in", values, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameBetween(String value1, String value2) {
            addCriterion("sch_name between", value1, value2, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameNotBetween(String value1, String value2) {
            addCriterion("sch_name not between", value1, value2, "schName");
            return (Criteria) this;
        }

        public Criteria andSchChairmanIsNull() {
            addCriterion("sch_chairman is null");
            return (Criteria) this;
        }

        public Criteria andSchChairmanIsNotNull() {
            addCriterion("sch_chairman is not null");
            return (Criteria) this;
        }

        public Criteria andSchChairmanEqualTo(String value) {
            addCriterion("sch_chairman =", value, "schChairman");
            return (Criteria) this;
        }

        public Criteria andSchChairmanNotEqualTo(String value) {
            addCriterion("sch_chairman <>", value, "schChairman");
            return (Criteria) this;
        }

        public Criteria andSchChairmanGreaterThan(String value) {
            addCriterion("sch_chairman >", value, "schChairman");
            return (Criteria) this;
        }

        public Criteria andSchChairmanGreaterThanOrEqualTo(String value) {
            addCriterion("sch_chairman >=", value, "schChairman");
            return (Criteria) this;
        }

        public Criteria andSchChairmanLessThan(String value) {
            addCriterion("sch_chairman <", value, "schChairman");
            return (Criteria) this;
        }

        public Criteria andSchChairmanLessThanOrEqualTo(String value) {
            addCriterion("sch_chairman <=", value, "schChairman");
            return (Criteria) this;
        }

        public Criteria andSchChairmanLike(String value) {
            addCriterion("sch_chairman like", value, "schChairman");
            return (Criteria) this;
        }

        public Criteria andSchChairmanNotLike(String value) {
            addCriterion("sch_chairman not like", value, "schChairman");
            return (Criteria) this;
        }

        public Criteria andSchChairmanIn(List<String> values) {
            addCriterion("sch_chairman in", values, "schChairman");
            return (Criteria) this;
        }

        public Criteria andSchChairmanNotIn(List<String> values) {
            addCriterion("sch_chairman not in", values, "schChairman");
            return (Criteria) this;
        }

        public Criteria andSchChairmanBetween(String value1, String value2) {
            addCriterion("sch_chairman between", value1, value2, "schChairman");
            return (Criteria) this;
        }

        public Criteria andSchChairmanNotBetween(String value1, String value2) {
            addCriterion("sch_chairman not between", value1, value2, "schChairman");
            return (Criteria) this;
        }

        public Criteria andSchEmailIsNull() {
            addCriterion("sch_email is null");
            return (Criteria) this;
        }

        public Criteria andSchEmailIsNotNull() {
            addCriterion("sch_email is not null");
            return (Criteria) this;
        }

        public Criteria andSchEmailEqualTo(String value) {
            addCriterion("sch_email =", value, "schEmail");
            return (Criteria) this;
        }

        public Criteria andSchEmailNotEqualTo(String value) {
            addCriterion("sch_email <>", value, "schEmail");
            return (Criteria) this;
        }

        public Criteria andSchEmailGreaterThan(String value) {
            addCriterion("sch_email >", value, "schEmail");
            return (Criteria) this;
        }

        public Criteria andSchEmailGreaterThanOrEqualTo(String value) {
            addCriterion("sch_email >=", value, "schEmail");
            return (Criteria) this;
        }

        public Criteria andSchEmailLessThan(String value) {
            addCriterion("sch_email <", value, "schEmail");
            return (Criteria) this;
        }

        public Criteria andSchEmailLessThanOrEqualTo(String value) {
            addCriterion("sch_email <=", value, "schEmail");
            return (Criteria) this;
        }

        public Criteria andSchEmailLike(String value) {
            addCriterion("sch_email like", value, "schEmail");
            return (Criteria) this;
        }

        public Criteria andSchEmailNotLike(String value) {
            addCriterion("sch_email not like", value, "schEmail");
            return (Criteria) this;
        }

        public Criteria andSchEmailIn(List<String> values) {
            addCriterion("sch_email in", values, "schEmail");
            return (Criteria) this;
        }

        public Criteria andSchEmailNotIn(List<String> values) {
            addCriterion("sch_email not in", values, "schEmail");
            return (Criteria) this;
        }

        public Criteria andSchEmailBetween(String value1, String value2) {
            addCriterion("sch_email between", value1, value2, "schEmail");
            return (Criteria) this;
        }

        public Criteria andSchEmailNotBetween(String value1, String value2) {
            addCriterion("sch_email not between", value1, value2, "schEmail");
            return (Criteria) this;
        }

        public Criteria andSchTelIsNull() {
            addCriterion("sch_tel is null");
            return (Criteria) this;
        }

        public Criteria andSchTelIsNotNull() {
            addCriterion("sch_tel is not null");
            return (Criteria) this;
        }

        public Criteria andSchTelEqualTo(String value) {
            addCriterion("sch_tel =", value, "schTel");
            return (Criteria) this;
        }

        public Criteria andSchTelNotEqualTo(String value) {
            addCriterion("sch_tel <>", value, "schTel");
            return (Criteria) this;
        }

        public Criteria andSchTelGreaterThan(String value) {
            addCriterion("sch_tel >", value, "schTel");
            return (Criteria) this;
        }

        public Criteria andSchTelGreaterThanOrEqualTo(String value) {
            addCriterion("sch_tel >=", value, "schTel");
            return (Criteria) this;
        }

        public Criteria andSchTelLessThan(String value) {
            addCriterion("sch_tel <", value, "schTel");
            return (Criteria) this;
        }

        public Criteria andSchTelLessThanOrEqualTo(String value) {
            addCriterion("sch_tel <=", value, "schTel");
            return (Criteria) this;
        }

        public Criteria andSchTelLike(String value) {
            addCriterion("sch_tel like", value, "schTel");
            return (Criteria) this;
        }

        public Criteria andSchTelNotLike(String value) {
            addCriterion("sch_tel not like", value, "schTel");
            return (Criteria) this;
        }

        public Criteria andSchTelIn(List<String> values) {
            addCriterion("sch_tel in", values, "schTel");
            return (Criteria) this;
        }

        public Criteria andSchTelNotIn(List<String> values) {
            addCriterion("sch_tel not in", values, "schTel");
            return (Criteria) this;
        }

        public Criteria andSchTelBetween(String value1, String value2) {
            addCriterion("sch_tel between", value1, value2, "schTel");
            return (Criteria) this;
        }

        public Criteria andSchTelNotBetween(String value1, String value2) {
            addCriterion("sch_tel not between", value1, value2, "schTel");
            return (Criteria) this;
        }

        public Criteria andSchLocationIsNull() {
            addCriterion("sch_location is null");
            return (Criteria) this;
        }

        public Criteria andSchLocationIsNotNull() {
            addCriterion("sch_location is not null");
            return (Criteria) this;
        }

        public Criteria andSchLocationEqualTo(String value) {
            addCriterion("sch_location =", value, "schLocation");
            return (Criteria) this;
        }

        public Criteria andSchLocationNotEqualTo(String value) {
            addCriterion("sch_location <>", value, "schLocation");
            return (Criteria) this;
        }

        public Criteria andSchLocationGreaterThan(String value) {
            addCriterion("sch_location >", value, "schLocation");
            return (Criteria) this;
        }

        public Criteria andSchLocationGreaterThanOrEqualTo(String value) {
            addCriterion("sch_location >=", value, "schLocation");
            return (Criteria) this;
        }

        public Criteria andSchLocationLessThan(String value) {
            addCriterion("sch_location <", value, "schLocation");
            return (Criteria) this;
        }

        public Criteria andSchLocationLessThanOrEqualTo(String value) {
            addCriterion("sch_location <=", value, "schLocation");
            return (Criteria) this;
        }

        public Criteria andSchLocationLike(String value) {
            addCriterion("sch_location like", value, "schLocation");
            return (Criteria) this;
        }

        public Criteria andSchLocationNotLike(String value) {
            addCriterion("sch_location not like", value, "schLocation");
            return (Criteria) this;
        }

        public Criteria andSchLocationIn(List<String> values) {
            addCriterion("sch_location in", values, "schLocation");
            return (Criteria) this;
        }

        public Criteria andSchLocationNotIn(List<String> values) {
            addCriterion("sch_location not in", values, "schLocation");
            return (Criteria) this;
        }

        public Criteria andSchLocationBetween(String value1, String value2) {
            addCriterion("sch_location between", value1, value2, "schLocation");
            return (Criteria) this;
        }

        public Criteria andSchLocationNotBetween(String value1, String value2) {
            addCriterion("sch_location not between", value1, value2, "schLocation");
            return (Criteria) this;
        }

        public Criteria andSchDescIsNull() {
            addCriterion("sch_desc is null");
            return (Criteria) this;
        }

        public Criteria andSchDescIsNotNull() {
            addCriterion("sch_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSchDescEqualTo(String value) {
            addCriterion("sch_desc =", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescNotEqualTo(String value) {
            addCriterion("sch_desc <>", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescGreaterThan(String value) {
            addCriterion("sch_desc >", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescGreaterThanOrEqualTo(String value) {
            addCriterion("sch_desc >=", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescLessThan(String value) {
            addCriterion("sch_desc <", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescLessThanOrEqualTo(String value) {
            addCriterion("sch_desc <=", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescLike(String value) {
            addCriterion("sch_desc like", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescNotLike(String value) {
            addCriterion("sch_desc not like", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescIn(List<String> values) {
            addCriterion("sch_desc in", values, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescNotIn(List<String> values) {
            addCriterion("sch_desc not in", values, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescBetween(String value1, String value2) {
            addCriterion("sch_desc between", value1, value2, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescNotBetween(String value1, String value2) {
            addCriterion("sch_desc not between", value1, value2, "schDesc");
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
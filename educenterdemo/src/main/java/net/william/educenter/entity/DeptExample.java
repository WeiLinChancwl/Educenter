package net.william.educenter.entity;

import java.util.ArrayList;
import java.util.List;

public class DeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeptExample() {
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

        public Criteria andDIdIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(Integer value) {
            addCriterion("d_id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(Integer value) {
            addCriterion("d_id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(Integer value) {
            addCriterion("d_id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(Integer value) {
            addCriterion("d_id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(Integer value) {
            addCriterion("d_id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<Integer> values) {
            addCriterion("d_id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<Integer> values) {
            addCriterion("d_id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(Integer value1, Integer value2) {
            addCriterion("d_id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("d_id not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDNameIsNull() {
            addCriterion("d_name is null");
            return (Criteria) this;
        }

        public Criteria andDNameIsNotNull() {
            addCriterion("d_name is not null");
            return (Criteria) this;
        }

        public Criteria andDNameEqualTo(String value) {
            addCriterion("d_name =", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotEqualTo(String value) {
            addCriterion("d_name <>", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThan(String value) {
            addCriterion("d_name >", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThanOrEqualTo(String value) {
            addCriterion("d_name >=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThan(String value) {
            addCriterion("d_name <", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThanOrEqualTo(String value) {
            addCriterion("d_name <=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLike(String value) {
            addCriterion("d_name like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotLike(String value) {
            addCriterion("d_name not like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameIn(List<String> values) {
            addCriterion("d_name in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotIn(List<String> values) {
            addCriterion("d_name not in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameBetween(String value1, String value2) {
            addCriterion("d_name between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotBetween(String value1, String value2) {
            addCriterion("d_name not between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDChairmanIsNull() {
            addCriterion("d_chairman is null");
            return (Criteria) this;
        }

        public Criteria andDChairmanIsNotNull() {
            addCriterion("d_chairman is not null");
            return (Criteria) this;
        }

        public Criteria andDChairmanEqualTo(String value) {
            addCriterion("d_chairman =", value, "dChairman");
            return (Criteria) this;
        }

        public Criteria andDChairmanNotEqualTo(String value) {
            addCriterion("d_chairman <>", value, "dChairman");
            return (Criteria) this;
        }

        public Criteria andDChairmanGreaterThan(String value) {
            addCriterion("d_chairman >", value, "dChairman");
            return (Criteria) this;
        }

        public Criteria andDChairmanGreaterThanOrEqualTo(String value) {
            addCriterion("d_chairman >=", value, "dChairman");
            return (Criteria) this;
        }

        public Criteria andDChairmanLessThan(String value) {
            addCriterion("d_chairman <", value, "dChairman");
            return (Criteria) this;
        }

        public Criteria andDChairmanLessThanOrEqualTo(String value) {
            addCriterion("d_chairman <=", value, "dChairman");
            return (Criteria) this;
        }

        public Criteria andDChairmanLike(String value) {
            addCriterion("d_chairman like", value, "dChairman");
            return (Criteria) this;
        }

        public Criteria andDChairmanNotLike(String value) {
            addCriterion("d_chairman not like", value, "dChairman");
            return (Criteria) this;
        }

        public Criteria andDChairmanIn(List<String> values) {
            addCriterion("d_chairman in", values, "dChairman");
            return (Criteria) this;
        }

        public Criteria andDChairmanNotIn(List<String> values) {
            addCriterion("d_chairman not in", values, "dChairman");
            return (Criteria) this;
        }

        public Criteria andDChairmanBetween(String value1, String value2) {
            addCriterion("d_chairman between", value1, value2, "dChairman");
            return (Criteria) this;
        }

        public Criteria andDChairmanNotBetween(String value1, String value2) {
            addCriterion("d_chairman not between", value1, value2, "dChairman");
            return (Criteria) this;
        }

        public Criteria andDEmailIsNull() {
            addCriterion("d_email is null");
            return (Criteria) this;
        }

        public Criteria andDEmailIsNotNull() {
            addCriterion("d_email is not null");
            return (Criteria) this;
        }

        public Criteria andDEmailEqualTo(String value) {
            addCriterion("d_email =", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailNotEqualTo(String value) {
            addCriterion("d_email <>", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailGreaterThan(String value) {
            addCriterion("d_email >", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailGreaterThanOrEqualTo(String value) {
            addCriterion("d_email >=", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailLessThan(String value) {
            addCriterion("d_email <", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailLessThanOrEqualTo(String value) {
            addCriterion("d_email <=", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailLike(String value) {
            addCriterion("d_email like", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailNotLike(String value) {
            addCriterion("d_email not like", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailIn(List<String> values) {
            addCriterion("d_email in", values, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailNotIn(List<String> values) {
            addCriterion("d_email not in", values, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailBetween(String value1, String value2) {
            addCriterion("d_email between", value1, value2, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailNotBetween(String value1, String value2) {
            addCriterion("d_email not between", value1, value2, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDDescIsNull() {
            addCriterion("d_desc is null");
            return (Criteria) this;
        }

        public Criteria andDDescIsNotNull() {
            addCriterion("d_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDDescEqualTo(String value) {
            addCriterion("d_desc =", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescNotEqualTo(String value) {
            addCriterion("d_desc <>", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescGreaterThan(String value) {
            addCriterion("d_desc >", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescGreaterThanOrEqualTo(String value) {
            addCriterion("d_desc >=", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescLessThan(String value) {
            addCriterion("d_desc <", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescLessThanOrEqualTo(String value) {
            addCriterion("d_desc <=", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescLike(String value) {
            addCriterion("d_desc like", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescNotLike(String value) {
            addCriterion("d_desc not like", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescIn(List<String> values) {
            addCriterion("d_desc in", values, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescNotIn(List<String> values) {
            addCriterion("d_desc not in", values, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescBetween(String value1, String value2) {
            addCriterion("d_desc between", value1, value2, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescNotBetween(String value1, String value2) {
            addCriterion("d_desc not between", value1, value2, "dDesc");
            return (Criteria) this;
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
package net.william.educenter.entity;

import java.util.ArrayList;
import java.util.List;

public class OrganizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExample() {
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

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(Integer value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(Integer value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(Integer value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(Integer value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(Integer value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<Integer> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<Integer> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(Integer value1, Integer value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(Integer value1, Integer value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOAccountIsNull() {
            addCriterion("o_account is null");
            return (Criteria) this;
        }

        public Criteria andOAccountIsNotNull() {
            addCriterion("o_account is not null");
            return (Criteria) this;
        }

        public Criteria andOAccountEqualTo(String value) {
            addCriterion("o_account =", value, "oAccount");
            return (Criteria) this;
        }

        public Criteria andOAccountNotEqualTo(String value) {
            addCriterion("o_account <>", value, "oAccount");
            return (Criteria) this;
        }

        public Criteria andOAccountGreaterThan(String value) {
            addCriterion("o_account >", value, "oAccount");
            return (Criteria) this;
        }

        public Criteria andOAccountGreaterThanOrEqualTo(String value) {
            addCriterion("o_account >=", value, "oAccount");
            return (Criteria) this;
        }

        public Criteria andOAccountLessThan(String value) {
            addCriterion("o_account <", value, "oAccount");
            return (Criteria) this;
        }

        public Criteria andOAccountLessThanOrEqualTo(String value) {
            addCriterion("o_account <=", value, "oAccount");
            return (Criteria) this;
        }

        public Criteria andOAccountLike(String value) {
            addCriterion("o_account like", value, "oAccount");
            return (Criteria) this;
        }

        public Criteria andOAccountNotLike(String value) {
            addCriterion("o_account not like", value, "oAccount");
            return (Criteria) this;
        }

        public Criteria andOAccountIn(List<String> values) {
            addCriterion("o_account in", values, "oAccount");
            return (Criteria) this;
        }

        public Criteria andOAccountNotIn(List<String> values) {
            addCriterion("o_account not in", values, "oAccount");
            return (Criteria) this;
        }

        public Criteria andOAccountBetween(String value1, String value2) {
            addCriterion("o_account between", value1, value2, "oAccount");
            return (Criteria) this;
        }

        public Criteria andOAccountNotBetween(String value1, String value2) {
            addCriterion("o_account not between", value1, value2, "oAccount");
            return (Criteria) this;
        }

        public Criteria andOPswIsNull() {
            addCriterion("o_psw is null");
            return (Criteria) this;
        }

        public Criteria andOPswIsNotNull() {
            addCriterion("o_psw is not null");
            return (Criteria) this;
        }

        public Criteria andOPswEqualTo(String value) {
            addCriterion("o_psw =", value, "oPsw");
            return (Criteria) this;
        }

        public Criteria andOPswNotEqualTo(String value) {
            addCriterion("o_psw <>", value, "oPsw");
            return (Criteria) this;
        }

        public Criteria andOPswGreaterThan(String value) {
            addCriterion("o_psw >", value, "oPsw");
            return (Criteria) this;
        }

        public Criteria andOPswGreaterThanOrEqualTo(String value) {
            addCriterion("o_psw >=", value, "oPsw");
            return (Criteria) this;
        }

        public Criteria andOPswLessThan(String value) {
            addCriterion("o_psw <", value, "oPsw");
            return (Criteria) this;
        }

        public Criteria andOPswLessThanOrEqualTo(String value) {
            addCriterion("o_psw <=", value, "oPsw");
            return (Criteria) this;
        }

        public Criteria andOPswLike(String value) {
            addCriterion("o_psw like", value, "oPsw");
            return (Criteria) this;
        }

        public Criteria andOPswNotLike(String value) {
            addCriterion("o_psw not like", value, "oPsw");
            return (Criteria) this;
        }

        public Criteria andOPswIn(List<String> values) {
            addCriterion("o_psw in", values, "oPsw");
            return (Criteria) this;
        }

        public Criteria andOPswNotIn(List<String> values) {
            addCriterion("o_psw not in", values, "oPsw");
            return (Criteria) this;
        }

        public Criteria andOPswBetween(String value1, String value2) {
            addCriterion("o_psw between", value1, value2, "oPsw");
            return (Criteria) this;
        }

        public Criteria andOPswNotBetween(String value1, String value2) {
            addCriterion("o_psw not between", value1, value2, "oPsw");
            return (Criteria) this;
        }

        public Criteria andONameIsNull() {
            addCriterion("o_name is null");
            return (Criteria) this;
        }

        public Criteria andONameIsNotNull() {
            addCriterion("o_name is not null");
            return (Criteria) this;
        }

        public Criteria andONameEqualTo(String value) {
            addCriterion("o_name =", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameNotEqualTo(String value) {
            addCriterion("o_name <>", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameGreaterThan(String value) {
            addCriterion("o_name >", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameGreaterThanOrEqualTo(String value) {
            addCriterion("o_name >=", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameLessThan(String value) {
            addCriterion("o_name <", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameLessThanOrEqualTo(String value) {
            addCriterion("o_name <=", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameLike(String value) {
            addCriterion("o_name like", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameNotLike(String value) {
            addCriterion("o_name not like", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameIn(List<String> values) {
            addCriterion("o_name in", values, "oName");
            return (Criteria) this;
        }

        public Criteria andONameNotIn(List<String> values) {
            addCriterion("o_name not in", values, "oName");
            return (Criteria) this;
        }

        public Criteria andONameBetween(String value1, String value2) {
            addCriterion("o_name between", value1, value2, "oName");
            return (Criteria) this;
        }

        public Criteria andONameNotBetween(String value1, String value2) {
            addCriterion("o_name not between", value1, value2, "oName");
            return (Criteria) this;
        }

        public Criteria andOEmailIsNull() {
            addCriterion("o_email is null");
            return (Criteria) this;
        }

        public Criteria andOEmailIsNotNull() {
            addCriterion("o_email is not null");
            return (Criteria) this;
        }

        public Criteria andOEmailEqualTo(String value) {
            addCriterion("o_email =", value, "oEmail");
            return (Criteria) this;
        }

        public Criteria andOEmailNotEqualTo(String value) {
            addCriterion("o_email <>", value, "oEmail");
            return (Criteria) this;
        }

        public Criteria andOEmailGreaterThan(String value) {
            addCriterion("o_email >", value, "oEmail");
            return (Criteria) this;
        }

        public Criteria andOEmailGreaterThanOrEqualTo(String value) {
            addCriterion("o_email >=", value, "oEmail");
            return (Criteria) this;
        }

        public Criteria andOEmailLessThan(String value) {
            addCriterion("o_email <", value, "oEmail");
            return (Criteria) this;
        }

        public Criteria andOEmailLessThanOrEqualTo(String value) {
            addCriterion("o_email <=", value, "oEmail");
            return (Criteria) this;
        }

        public Criteria andOEmailLike(String value) {
            addCriterion("o_email like", value, "oEmail");
            return (Criteria) this;
        }

        public Criteria andOEmailNotLike(String value) {
            addCriterion("o_email not like", value, "oEmail");
            return (Criteria) this;
        }

        public Criteria andOEmailIn(List<String> values) {
            addCriterion("o_email in", values, "oEmail");
            return (Criteria) this;
        }

        public Criteria andOEmailNotIn(List<String> values) {
            addCriterion("o_email not in", values, "oEmail");
            return (Criteria) this;
        }

        public Criteria andOEmailBetween(String value1, String value2) {
            addCriterion("o_email between", value1, value2, "oEmail");
            return (Criteria) this;
        }

        public Criteria andOEmailNotBetween(String value1, String value2) {
            addCriterion("o_email not between", value1, value2, "oEmail");
            return (Criteria) this;
        }

        public Criteria andOTelIsNull() {
            addCriterion("o_tel is null");
            return (Criteria) this;
        }

        public Criteria andOTelIsNotNull() {
            addCriterion("o_tel is not null");
            return (Criteria) this;
        }

        public Criteria andOTelEqualTo(String value) {
            addCriterion("o_tel =", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelNotEqualTo(String value) {
            addCriterion("o_tel <>", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelGreaterThan(String value) {
            addCriterion("o_tel >", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelGreaterThanOrEqualTo(String value) {
            addCriterion("o_tel >=", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelLessThan(String value) {
            addCriterion("o_tel <", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelLessThanOrEqualTo(String value) {
            addCriterion("o_tel <=", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelLike(String value) {
            addCriterion("o_tel like", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelNotLike(String value) {
            addCriterion("o_tel not like", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelIn(List<String> values) {
            addCriterion("o_tel in", values, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelNotIn(List<String> values) {
            addCriterion("o_tel not in", values, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelBetween(String value1, String value2) {
            addCriterion("o_tel between", value1, value2, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelNotBetween(String value1, String value2) {
            addCriterion("o_tel not between", value1, value2, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTitleIsNull() {
            addCriterion("o_title is null");
            return (Criteria) this;
        }

        public Criteria andOTitleIsNotNull() {
            addCriterion("o_title is not null");
            return (Criteria) this;
        }

        public Criteria andOTitleEqualTo(String value) {
            addCriterion("o_title =", value, "oTitle");
            return (Criteria) this;
        }

        public Criteria andOTitleNotEqualTo(String value) {
            addCriterion("o_title <>", value, "oTitle");
            return (Criteria) this;
        }

        public Criteria andOTitleGreaterThan(String value) {
            addCriterion("o_title >", value, "oTitle");
            return (Criteria) this;
        }

        public Criteria andOTitleGreaterThanOrEqualTo(String value) {
            addCriterion("o_title >=", value, "oTitle");
            return (Criteria) this;
        }

        public Criteria andOTitleLessThan(String value) {
            addCriterion("o_title <", value, "oTitle");
            return (Criteria) this;
        }

        public Criteria andOTitleLessThanOrEqualTo(String value) {
            addCriterion("o_title <=", value, "oTitle");
            return (Criteria) this;
        }

        public Criteria andOTitleLike(String value) {
            addCriterion("o_title like", value, "oTitle");
            return (Criteria) this;
        }

        public Criteria andOTitleNotLike(String value) {
            addCriterion("o_title not like", value, "oTitle");
            return (Criteria) this;
        }

        public Criteria andOTitleIn(List<String> values) {
            addCriterion("o_title in", values, "oTitle");
            return (Criteria) this;
        }

        public Criteria andOTitleNotIn(List<String> values) {
            addCriterion("o_title not in", values, "oTitle");
            return (Criteria) this;
        }

        public Criteria andOTitleBetween(String value1, String value2) {
            addCriterion("o_title between", value1, value2, "oTitle");
            return (Criteria) this;
        }

        public Criteria andOTitleNotBetween(String value1, String value2) {
            addCriterion("o_title not between", value1, value2, "oTitle");
            return (Criteria) this;
        }

        public Criteria andODescIsNull() {
            addCriterion("o_desc is null");
            return (Criteria) this;
        }

        public Criteria andODescIsNotNull() {
            addCriterion("o_desc is not null");
            return (Criteria) this;
        }

        public Criteria andODescEqualTo(String value) {
            addCriterion("o_desc =", value, "oDesc");
            return (Criteria) this;
        }

        public Criteria andODescNotEqualTo(String value) {
            addCriterion("o_desc <>", value, "oDesc");
            return (Criteria) this;
        }

        public Criteria andODescGreaterThan(String value) {
            addCriterion("o_desc >", value, "oDesc");
            return (Criteria) this;
        }

        public Criteria andODescGreaterThanOrEqualTo(String value) {
            addCriterion("o_desc >=", value, "oDesc");
            return (Criteria) this;
        }

        public Criteria andODescLessThan(String value) {
            addCriterion("o_desc <", value, "oDesc");
            return (Criteria) this;
        }

        public Criteria andODescLessThanOrEqualTo(String value) {
            addCriterion("o_desc <=", value, "oDesc");
            return (Criteria) this;
        }

        public Criteria andODescLike(String value) {
            addCriterion("o_desc like", value, "oDesc");
            return (Criteria) this;
        }

        public Criteria andODescNotLike(String value) {
            addCriterion("o_desc not like", value, "oDesc");
            return (Criteria) this;
        }

        public Criteria andODescIn(List<String> values) {
            addCriterion("o_desc in", values, "oDesc");
            return (Criteria) this;
        }

        public Criteria andODescNotIn(List<String> values) {
            addCriterion("o_desc not in", values, "oDesc");
            return (Criteria) this;
        }

        public Criteria andODescBetween(String value1, String value2) {
            addCriterion("o_desc between", value1, value2, "oDesc");
            return (Criteria) this;
        }

        public Criteria andODescNotBetween(String value1, String value2) {
            addCriterion("o_desc not between", value1, value2, "oDesc");
            return (Criteria) this;
        }

        public Criteria andOLocationIsNull() {
            addCriterion("o_location is null");
            return (Criteria) this;
        }

        public Criteria andOLocationIsNotNull() {
            addCriterion("o_location is not null");
            return (Criteria) this;
        }

        public Criteria andOLocationEqualTo(String value) {
            addCriterion("o_location =", value, "oLocation");
            return (Criteria) this;
        }

        public Criteria andOLocationNotEqualTo(String value) {
            addCriterion("o_location <>", value, "oLocation");
            return (Criteria) this;
        }

        public Criteria andOLocationGreaterThan(String value) {
            addCriterion("o_location >", value, "oLocation");
            return (Criteria) this;
        }

        public Criteria andOLocationGreaterThanOrEqualTo(String value) {
            addCriterion("o_location >=", value, "oLocation");
            return (Criteria) this;
        }

        public Criteria andOLocationLessThan(String value) {
            addCriterion("o_location <", value, "oLocation");
            return (Criteria) this;
        }

        public Criteria andOLocationLessThanOrEqualTo(String value) {
            addCriterion("o_location <=", value, "oLocation");
            return (Criteria) this;
        }

        public Criteria andOLocationLike(String value) {
            addCriterion("o_location like", value, "oLocation");
            return (Criteria) this;
        }

        public Criteria andOLocationNotLike(String value) {
            addCriterion("o_location not like", value, "oLocation");
            return (Criteria) this;
        }

        public Criteria andOLocationIn(List<String> values) {
            addCriterion("o_location in", values, "oLocation");
            return (Criteria) this;
        }

        public Criteria andOLocationNotIn(List<String> values) {
            addCriterion("o_location not in", values, "oLocation");
            return (Criteria) this;
        }

        public Criteria andOLocationBetween(String value1, String value2) {
            addCriterion("o_location between", value1, value2, "oLocation");
            return (Criteria) this;
        }

        public Criteria andOLocationNotBetween(String value1, String value2) {
            addCriterion("o_location not between", value1, value2, "oLocation");
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
package net.william.educenter.entity;

import java.util.ArrayList;
import java.util.List;

public class SuperUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SuperUserExample() {
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

        public Criteria andSupIdIsNull() {
            addCriterion("sup_id is null");
            return (Criteria) this;
        }

        public Criteria andSupIdIsNotNull() {
            addCriterion("sup_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupIdEqualTo(Integer value) {
            addCriterion("sup_id =", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdNotEqualTo(Integer value) {
            addCriterion("sup_id <>", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdGreaterThan(Integer value) {
            addCriterion("sup_id >", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sup_id >=", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdLessThan(Integer value) {
            addCriterion("sup_id <", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdLessThanOrEqualTo(Integer value) {
            addCriterion("sup_id <=", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdIn(List<Integer> values) {
            addCriterion("sup_id in", values, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdNotIn(List<Integer> values) {
            addCriterion("sup_id not in", values, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdBetween(Integer value1, Integer value2) {
            addCriterion("sup_id between", value1, value2, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sup_id not between", value1, value2, "supId");
            return (Criteria) this;
        }

        public Criteria andSupAccountIsNull() {
            addCriterion("sup_account is null");
            return (Criteria) this;
        }

        public Criteria andSupAccountIsNotNull() {
            addCriterion("sup_account is not null");
            return (Criteria) this;
        }

        public Criteria andSupAccountEqualTo(String value) {
            addCriterion("sup_account =", value, "supAccount");
            return (Criteria) this;
        }

        public Criteria andSupAccountNotEqualTo(String value) {
            addCriterion("sup_account <>", value, "supAccount");
            return (Criteria) this;
        }

        public Criteria andSupAccountGreaterThan(String value) {
            addCriterion("sup_account >", value, "supAccount");
            return (Criteria) this;
        }

        public Criteria andSupAccountGreaterThanOrEqualTo(String value) {
            addCriterion("sup_account >=", value, "supAccount");
            return (Criteria) this;
        }

        public Criteria andSupAccountLessThan(String value) {
            addCriterion("sup_account <", value, "supAccount");
            return (Criteria) this;
        }

        public Criteria andSupAccountLessThanOrEqualTo(String value) {
            addCriterion("sup_account <=", value, "supAccount");
            return (Criteria) this;
        }

        public Criteria andSupAccountLike(String value) {
            addCriterion("sup_account like", value, "supAccount");
            return (Criteria) this;
        }

        public Criteria andSupAccountNotLike(String value) {
            addCriterion("sup_account not like", value, "supAccount");
            return (Criteria) this;
        }

        public Criteria andSupAccountIn(List<String> values) {
            addCriterion("sup_account in", values, "supAccount");
            return (Criteria) this;
        }

        public Criteria andSupAccountNotIn(List<String> values) {
            addCriterion("sup_account not in", values, "supAccount");
            return (Criteria) this;
        }

        public Criteria andSupAccountBetween(String value1, String value2) {
            addCriterion("sup_account between", value1, value2, "supAccount");
            return (Criteria) this;
        }

        public Criteria andSupAccountNotBetween(String value1, String value2) {
            addCriterion("sup_account not between", value1, value2, "supAccount");
            return (Criteria) this;
        }

        public Criteria andSupPswIsNull() {
            addCriterion("sup_psw is null");
            return (Criteria) this;
        }

        public Criteria andSupPswIsNotNull() {
            addCriterion("sup_psw is not null");
            return (Criteria) this;
        }

        public Criteria andSupPswEqualTo(String value) {
            addCriterion("sup_psw =", value, "supPsw");
            return (Criteria) this;
        }

        public Criteria andSupPswNotEqualTo(String value) {
            addCriterion("sup_psw <>", value, "supPsw");
            return (Criteria) this;
        }

        public Criteria andSupPswGreaterThan(String value) {
            addCriterion("sup_psw >", value, "supPsw");
            return (Criteria) this;
        }

        public Criteria andSupPswGreaterThanOrEqualTo(String value) {
            addCriterion("sup_psw >=", value, "supPsw");
            return (Criteria) this;
        }

        public Criteria andSupPswLessThan(String value) {
            addCriterion("sup_psw <", value, "supPsw");
            return (Criteria) this;
        }

        public Criteria andSupPswLessThanOrEqualTo(String value) {
            addCriterion("sup_psw <=", value, "supPsw");
            return (Criteria) this;
        }

        public Criteria andSupPswLike(String value) {
            addCriterion("sup_psw like", value, "supPsw");
            return (Criteria) this;
        }

        public Criteria andSupPswNotLike(String value) {
            addCriterion("sup_psw not like", value, "supPsw");
            return (Criteria) this;
        }

        public Criteria andSupPswIn(List<String> values) {
            addCriterion("sup_psw in", values, "supPsw");
            return (Criteria) this;
        }

        public Criteria andSupPswNotIn(List<String> values) {
            addCriterion("sup_psw not in", values, "supPsw");
            return (Criteria) this;
        }

        public Criteria andSupPswBetween(String value1, String value2) {
            addCriterion("sup_psw between", value1, value2, "supPsw");
            return (Criteria) this;
        }

        public Criteria andSupPswNotBetween(String value1, String value2) {
            addCriterion("sup_psw not between", value1, value2, "supPsw");
            return (Criteria) this;
        }

        public Criteria andSupNameIsNull() {
            addCriterion("sup_name is null");
            return (Criteria) this;
        }

        public Criteria andSupNameIsNotNull() {
            addCriterion("sup_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupNameEqualTo(String value) {
            addCriterion("sup_name =", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameNotEqualTo(String value) {
            addCriterion("sup_name <>", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameGreaterThan(String value) {
            addCriterion("sup_name >", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameGreaterThanOrEqualTo(String value) {
            addCriterion("sup_name >=", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameLessThan(String value) {
            addCriterion("sup_name <", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameLessThanOrEqualTo(String value) {
            addCriterion("sup_name <=", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameLike(String value) {
            addCriterion("sup_name like", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameNotLike(String value) {
            addCriterion("sup_name not like", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameIn(List<String> values) {
            addCriterion("sup_name in", values, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameNotIn(List<String> values) {
            addCriterion("sup_name not in", values, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameBetween(String value1, String value2) {
            addCriterion("sup_name between", value1, value2, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameNotBetween(String value1, String value2) {
            addCriterion("sup_name not between", value1, value2, "supName");
            return (Criteria) this;
        }

        public Criteria andSupEmailIsNull() {
            addCriterion("sup_email is null");
            return (Criteria) this;
        }

        public Criteria andSupEmailIsNotNull() {
            addCriterion("sup_email is not null");
            return (Criteria) this;
        }

        public Criteria andSupEmailEqualTo(String value) {
            addCriterion("sup_email =", value, "supEmail");
            return (Criteria) this;
        }

        public Criteria andSupEmailNotEqualTo(String value) {
            addCriterion("sup_email <>", value, "supEmail");
            return (Criteria) this;
        }

        public Criteria andSupEmailGreaterThan(String value) {
            addCriterion("sup_email >", value, "supEmail");
            return (Criteria) this;
        }

        public Criteria andSupEmailGreaterThanOrEqualTo(String value) {
            addCriterion("sup_email >=", value, "supEmail");
            return (Criteria) this;
        }

        public Criteria andSupEmailLessThan(String value) {
            addCriterion("sup_email <", value, "supEmail");
            return (Criteria) this;
        }

        public Criteria andSupEmailLessThanOrEqualTo(String value) {
            addCriterion("sup_email <=", value, "supEmail");
            return (Criteria) this;
        }

        public Criteria andSupEmailLike(String value) {
            addCriterion("sup_email like", value, "supEmail");
            return (Criteria) this;
        }

        public Criteria andSupEmailNotLike(String value) {
            addCriterion("sup_email not like", value, "supEmail");
            return (Criteria) this;
        }

        public Criteria andSupEmailIn(List<String> values) {
            addCriterion("sup_email in", values, "supEmail");
            return (Criteria) this;
        }

        public Criteria andSupEmailNotIn(List<String> values) {
            addCriterion("sup_email not in", values, "supEmail");
            return (Criteria) this;
        }

        public Criteria andSupEmailBetween(String value1, String value2) {
            addCriterion("sup_email between", value1, value2, "supEmail");
            return (Criteria) this;
        }

        public Criteria andSupEmailNotBetween(String value1, String value2) {
            addCriterion("sup_email not between", value1, value2, "supEmail");
            return (Criteria) this;
        }

        public Criteria andSupTelIsNull() {
            addCriterion("sup_tel is null");
            return (Criteria) this;
        }

        public Criteria andSupTelIsNotNull() {
            addCriterion("sup_tel is not null");
            return (Criteria) this;
        }

        public Criteria andSupTelEqualTo(String value) {
            addCriterion("sup_tel =", value, "supTel");
            return (Criteria) this;
        }

        public Criteria andSupTelNotEqualTo(String value) {
            addCriterion("sup_tel <>", value, "supTel");
            return (Criteria) this;
        }

        public Criteria andSupTelGreaterThan(String value) {
            addCriterion("sup_tel >", value, "supTel");
            return (Criteria) this;
        }

        public Criteria andSupTelGreaterThanOrEqualTo(String value) {
            addCriterion("sup_tel >=", value, "supTel");
            return (Criteria) this;
        }

        public Criteria andSupTelLessThan(String value) {
            addCriterion("sup_tel <", value, "supTel");
            return (Criteria) this;
        }

        public Criteria andSupTelLessThanOrEqualTo(String value) {
            addCriterion("sup_tel <=", value, "supTel");
            return (Criteria) this;
        }

        public Criteria andSupTelLike(String value) {
            addCriterion("sup_tel like", value, "supTel");
            return (Criteria) this;
        }

        public Criteria andSupTelNotLike(String value) {
            addCriterion("sup_tel not like", value, "supTel");
            return (Criteria) this;
        }

        public Criteria andSupTelIn(List<String> values) {
            addCriterion("sup_tel in", values, "supTel");
            return (Criteria) this;
        }

        public Criteria andSupTelNotIn(List<String> values) {
            addCriterion("sup_tel not in", values, "supTel");
            return (Criteria) this;
        }

        public Criteria andSupTelBetween(String value1, String value2) {
            addCriterion("sup_tel between", value1, value2, "supTel");
            return (Criteria) this;
        }

        public Criteria andSupTelNotBetween(String value1, String value2) {
            addCriterion("sup_tel not between", value1, value2, "supTel");
            return (Criteria) this;
        }

        public Criteria andSupSexIsNull() {
            addCriterion("sup_sex is null");
            return (Criteria) this;
        }

        public Criteria andSupSexIsNotNull() {
            addCriterion("sup_sex is not null");
            return (Criteria) this;
        }

        public Criteria andSupSexEqualTo(String value) {
            addCriterion("sup_sex =", value, "supSex");
            return (Criteria) this;
        }

        public Criteria andSupSexNotEqualTo(String value) {
            addCriterion("sup_sex <>", value, "supSex");
            return (Criteria) this;
        }

        public Criteria andSupSexGreaterThan(String value) {
            addCriterion("sup_sex >", value, "supSex");
            return (Criteria) this;
        }

        public Criteria andSupSexGreaterThanOrEqualTo(String value) {
            addCriterion("sup_sex >=", value, "supSex");
            return (Criteria) this;
        }

        public Criteria andSupSexLessThan(String value) {
            addCriterion("sup_sex <", value, "supSex");
            return (Criteria) this;
        }

        public Criteria andSupSexLessThanOrEqualTo(String value) {
            addCriterion("sup_sex <=", value, "supSex");
            return (Criteria) this;
        }

        public Criteria andSupSexLike(String value) {
            addCriterion("sup_sex like", value, "supSex");
            return (Criteria) this;
        }

        public Criteria andSupSexNotLike(String value) {
            addCriterion("sup_sex not like", value, "supSex");
            return (Criteria) this;
        }

        public Criteria andSupSexIn(List<String> values) {
            addCriterion("sup_sex in", values, "supSex");
            return (Criteria) this;
        }

        public Criteria andSupSexNotIn(List<String> values) {
            addCriterion("sup_sex not in", values, "supSex");
            return (Criteria) this;
        }

        public Criteria andSupSexBetween(String value1, String value2) {
            addCriterion("sup_sex between", value1, value2, "supSex");
            return (Criteria) this;
        }

        public Criteria andSupSexNotBetween(String value1, String value2) {
            addCriterion("sup_sex not between", value1, value2, "supSex");
            return (Criteria) this;
        }

        public Criteria andSupBirthdayIsNull() {
            addCriterion("sup_birthday is null");
            return (Criteria) this;
        }

        public Criteria andSupBirthdayIsNotNull() {
            addCriterion("sup_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andSupBirthdayEqualTo(String value) {
            addCriterion("sup_birthday =", value, "supBirthday");
            return (Criteria) this;
        }

        public Criteria andSupBirthdayNotEqualTo(String value) {
            addCriterion("sup_birthday <>", value, "supBirthday");
            return (Criteria) this;
        }

        public Criteria andSupBirthdayGreaterThan(String value) {
            addCriterion("sup_birthday >", value, "supBirthday");
            return (Criteria) this;
        }

        public Criteria andSupBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("sup_birthday >=", value, "supBirthday");
            return (Criteria) this;
        }

        public Criteria andSupBirthdayLessThan(String value) {
            addCriterion("sup_birthday <", value, "supBirthday");
            return (Criteria) this;
        }

        public Criteria andSupBirthdayLessThanOrEqualTo(String value) {
            addCriterion("sup_birthday <=", value, "supBirthday");
            return (Criteria) this;
        }

        public Criteria andSupBirthdayLike(String value) {
            addCriterion("sup_birthday like", value, "supBirthday");
            return (Criteria) this;
        }

        public Criteria andSupBirthdayNotLike(String value) {
            addCriterion("sup_birthday not like", value, "supBirthday");
            return (Criteria) this;
        }

        public Criteria andSupBirthdayIn(List<String> values) {
            addCriterion("sup_birthday in", values, "supBirthday");
            return (Criteria) this;
        }

        public Criteria andSupBirthdayNotIn(List<String> values) {
            addCriterion("sup_birthday not in", values, "supBirthday");
            return (Criteria) this;
        }

        public Criteria andSupBirthdayBetween(String value1, String value2) {
            addCriterion("sup_birthday between", value1, value2, "supBirthday");
            return (Criteria) this;
        }

        public Criteria andSupBirthdayNotBetween(String value1, String value2) {
            addCriterion("sup_birthday not between", value1, value2, "supBirthday");
            return (Criteria) this;
        }

        public Criteria andSupAuthorityIsNull() {
            addCriterion("sup_authority is null");
            return (Criteria) this;
        }

        public Criteria andSupAuthorityIsNotNull() {
            addCriterion("sup_authority is not null");
            return (Criteria) this;
        }

        public Criteria andSupAuthorityEqualTo(Integer value) {
            addCriterion("sup_authority =", value, "supAuthority");
            return (Criteria) this;
        }

        public Criteria andSupAuthorityNotEqualTo(Integer value) {
            addCriterion("sup_authority <>", value, "supAuthority");
            return (Criteria) this;
        }

        public Criteria andSupAuthorityGreaterThan(Integer value) {
            addCriterion("sup_authority >", value, "supAuthority");
            return (Criteria) this;
        }

        public Criteria andSupAuthorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("sup_authority >=", value, "supAuthority");
            return (Criteria) this;
        }

        public Criteria andSupAuthorityLessThan(Integer value) {
            addCriterion("sup_authority <", value, "supAuthority");
            return (Criteria) this;
        }

        public Criteria andSupAuthorityLessThanOrEqualTo(Integer value) {
            addCriterion("sup_authority <=", value, "supAuthority");
            return (Criteria) this;
        }

        public Criteria andSupAuthorityIn(List<Integer> values) {
            addCriterion("sup_authority in", values, "supAuthority");
            return (Criteria) this;
        }

        public Criteria andSupAuthorityNotIn(List<Integer> values) {
            addCriterion("sup_authority not in", values, "supAuthority");
            return (Criteria) this;
        }

        public Criteria andSupAuthorityBetween(Integer value1, Integer value2) {
            addCriterion("sup_authority between", value1, value2, "supAuthority");
            return (Criteria) this;
        }

        public Criteria andSupAuthorityNotBetween(Integer value1, Integer value2) {
            addCriterion("sup_authority not between", value1, value2, "supAuthority");
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
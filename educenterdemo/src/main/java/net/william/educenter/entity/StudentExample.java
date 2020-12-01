package net.william.educenter.entity;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSAccountIsNull() {
            addCriterion("s_account is null");
            return (Criteria) this;
        }

        public Criteria andSAccountIsNotNull() {
            addCriterion("s_account is not null");
            return (Criteria) this;
        }

        public Criteria andSAccountEqualTo(String value) {
            addCriterion("s_account =", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountNotEqualTo(String value) {
            addCriterion("s_account <>", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountGreaterThan(String value) {
            addCriterion("s_account >", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountGreaterThanOrEqualTo(String value) {
            addCriterion("s_account >=", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountLessThan(String value) {
            addCriterion("s_account <", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountLessThanOrEqualTo(String value) {
            addCriterion("s_account <=", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountLike(String value) {
            addCriterion("s_account like", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountNotLike(String value) {
            addCriterion("s_account not like", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountIn(List<String> values) {
            addCriterion("s_account in", values, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountNotIn(List<String> values) {
            addCriterion("s_account not in", values, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountBetween(String value1, String value2) {
            addCriterion("s_account between", value1, value2, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountNotBetween(String value1, String value2) {
            addCriterion("s_account not between", value1, value2, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSPswIsNull() {
            addCriterion("s_psw is null");
            return (Criteria) this;
        }

        public Criteria andSPswIsNotNull() {
            addCriterion("s_psw is not null");
            return (Criteria) this;
        }

        public Criteria andSPswEqualTo(String value) {
            addCriterion("s_psw =", value, "sPsw");
            return (Criteria) this;
        }

        public Criteria andSPswNotEqualTo(String value) {
            addCriterion("s_psw <>", value, "sPsw");
            return (Criteria) this;
        }

        public Criteria andSPswGreaterThan(String value) {
            addCriterion("s_psw >", value, "sPsw");
            return (Criteria) this;
        }

        public Criteria andSPswGreaterThanOrEqualTo(String value) {
            addCriterion("s_psw >=", value, "sPsw");
            return (Criteria) this;
        }

        public Criteria andSPswLessThan(String value) {
            addCriterion("s_psw <", value, "sPsw");
            return (Criteria) this;
        }

        public Criteria andSPswLessThanOrEqualTo(String value) {
            addCriterion("s_psw <=", value, "sPsw");
            return (Criteria) this;
        }

        public Criteria andSPswLike(String value) {
            addCriterion("s_psw like", value, "sPsw");
            return (Criteria) this;
        }

        public Criteria andSPswNotLike(String value) {
            addCriterion("s_psw not like", value, "sPsw");
            return (Criteria) this;
        }

        public Criteria andSPswIn(List<String> values) {
            addCriterion("s_psw in", values, "sPsw");
            return (Criteria) this;
        }

        public Criteria andSPswNotIn(List<String> values) {
            addCriterion("s_psw not in", values, "sPsw");
            return (Criteria) this;
        }

        public Criteria andSPswBetween(String value1, String value2) {
            addCriterion("s_psw between", value1, value2, "sPsw");
            return (Criteria) this;
        }

        public Criteria andSPswNotBetween(String value1, String value2) {
            addCriterion("s_psw not between", value1, value2, "sPsw");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSEmailIsNull() {
            addCriterion("s_email is null");
            return (Criteria) this;
        }

        public Criteria andSEmailIsNotNull() {
            addCriterion("s_email is not null");
            return (Criteria) this;
        }

        public Criteria andSEmailEqualTo(String value) {
            addCriterion("s_email =", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotEqualTo(String value) {
            addCriterion("s_email <>", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailGreaterThan(String value) {
            addCriterion("s_email >", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailGreaterThanOrEqualTo(String value) {
            addCriterion("s_email >=", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailLessThan(String value) {
            addCriterion("s_email <", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailLessThanOrEqualTo(String value) {
            addCriterion("s_email <=", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailLike(String value) {
            addCriterion("s_email like", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotLike(String value) {
            addCriterion("s_email not like", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailIn(List<String> values) {
            addCriterion("s_email in", values, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotIn(List<String> values) {
            addCriterion("s_email not in", values, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailBetween(String value1, String value2) {
            addCriterion("s_email between", value1, value2, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotBetween(String value1, String value2) {
            addCriterion("s_email not between", value1, value2, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSTelIsNull() {
            addCriterion("s_tel is null");
            return (Criteria) this;
        }

        public Criteria andSTelIsNotNull() {
            addCriterion("s_tel is not null");
            return (Criteria) this;
        }

        public Criteria andSTelEqualTo(String value) {
            addCriterion("s_tel =", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelNotEqualTo(String value) {
            addCriterion("s_tel <>", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelGreaterThan(String value) {
            addCriterion("s_tel >", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelGreaterThanOrEqualTo(String value) {
            addCriterion("s_tel >=", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelLessThan(String value) {
            addCriterion("s_tel <", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelLessThanOrEqualTo(String value) {
            addCriterion("s_tel <=", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelLike(String value) {
            addCriterion("s_tel like", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelNotLike(String value) {
            addCriterion("s_tel not like", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelIn(List<String> values) {
            addCriterion("s_tel in", values, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelNotIn(List<String> values) {
            addCriterion("s_tel not in", values, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelBetween(String value1, String value2) {
            addCriterion("s_tel between", value1, value2, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelNotBetween(String value1, String value2) {
            addCriterion("s_tel not between", value1, value2, "sTel");
            return (Criteria) this;
        }

        public Criteria andSSexIsNull() {
            addCriterion("s_sex is null");
            return (Criteria) this;
        }

        public Criteria andSSexIsNotNull() {
            addCriterion("s_sex is not null");
            return (Criteria) this;
        }

        public Criteria andSSexEqualTo(String value) {
            addCriterion("s_sex =", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotEqualTo(String value) {
            addCriterion("s_sex <>", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThan(String value) {
            addCriterion("s_sex >", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThanOrEqualTo(String value) {
            addCriterion("s_sex >=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThan(String value) {
            addCriterion("s_sex <", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThanOrEqualTo(String value) {
            addCriterion("s_sex <=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLike(String value) {
            addCriterion("s_sex like", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotLike(String value) {
            addCriterion("s_sex not like", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexIn(List<String> values) {
            addCriterion("s_sex in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotIn(List<String> values) {
            addCriterion("s_sex not in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexBetween(String value1, String value2) {
            addCriterion("s_sex between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotBetween(String value1, String value2) {
            addCriterion("s_sex not between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSBirthdayIsNull() {
            addCriterion("s_birthday is null");
            return (Criteria) this;
        }

        public Criteria andSBirthdayIsNotNull() {
            addCriterion("s_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andSBirthdayEqualTo(String value) {
            addCriterion("s_birthday =", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayNotEqualTo(String value) {
            addCriterion("s_birthday <>", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayGreaterThan(String value) {
            addCriterion("s_birthday >", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("s_birthday >=", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayLessThan(String value) {
            addCriterion("s_birthday <", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayLessThanOrEqualTo(String value) {
            addCriterion("s_birthday <=", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayLike(String value) {
            addCriterion("s_birthday like", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayNotLike(String value) {
            addCriterion("s_birthday not like", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayIn(List<String> values) {
            addCriterion("s_birthday in", values, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayNotIn(List<String> values) {
            addCriterion("s_birthday not in", values, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayBetween(String value1, String value2) {
            addCriterion("s_birthday between", value1, value2, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayNotBetween(String value1, String value2) {
            addCriterion("s_birthday not between", value1, value2, "sBirthday");
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

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
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
package net.william.educenter.entity;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(Integer value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(Integer value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(Integer value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(Integer value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<Integer> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<Integer> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(Integer value1, Integer value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTAccountIsNull() {
            addCriterion("t_account is null");
            return (Criteria) this;
        }

        public Criteria andTAccountIsNotNull() {
            addCriterion("t_account is not null");
            return (Criteria) this;
        }

        public Criteria andTAccountEqualTo(String value) {
            addCriterion("t_account =", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountNotEqualTo(String value) {
            addCriterion("t_account <>", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountGreaterThan(String value) {
            addCriterion("t_account >", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountGreaterThanOrEqualTo(String value) {
            addCriterion("t_account >=", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountLessThan(String value) {
            addCriterion("t_account <", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountLessThanOrEqualTo(String value) {
            addCriterion("t_account <=", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountLike(String value) {
            addCriterion("t_account like", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountNotLike(String value) {
            addCriterion("t_account not like", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountIn(List<String> values) {
            addCriterion("t_account in", values, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountNotIn(List<String> values) {
            addCriterion("t_account not in", values, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountBetween(String value1, String value2) {
            addCriterion("t_account between", value1, value2, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountNotBetween(String value1, String value2) {
            addCriterion("t_account not between", value1, value2, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTPswIsNull() {
            addCriterion("t_psw is null");
            return (Criteria) this;
        }

        public Criteria andTPswIsNotNull() {
            addCriterion("t_psw is not null");
            return (Criteria) this;
        }

        public Criteria andTPswEqualTo(String value) {
            addCriterion("t_psw =", value, "tPsw");
            return (Criteria) this;
        }

        public Criteria andTPswNotEqualTo(String value) {
            addCriterion("t_psw <>", value, "tPsw");
            return (Criteria) this;
        }

        public Criteria andTPswGreaterThan(String value) {
            addCriterion("t_psw >", value, "tPsw");
            return (Criteria) this;
        }

        public Criteria andTPswGreaterThanOrEqualTo(String value) {
            addCriterion("t_psw >=", value, "tPsw");
            return (Criteria) this;
        }

        public Criteria andTPswLessThan(String value) {
            addCriterion("t_psw <", value, "tPsw");
            return (Criteria) this;
        }

        public Criteria andTPswLessThanOrEqualTo(String value) {
            addCriterion("t_psw <=", value, "tPsw");
            return (Criteria) this;
        }

        public Criteria andTPswLike(String value) {
            addCriterion("t_psw like", value, "tPsw");
            return (Criteria) this;
        }

        public Criteria andTPswNotLike(String value) {
            addCriterion("t_psw not like", value, "tPsw");
            return (Criteria) this;
        }

        public Criteria andTPswIn(List<String> values) {
            addCriterion("t_psw in", values, "tPsw");
            return (Criteria) this;
        }

        public Criteria andTPswNotIn(List<String> values) {
            addCriterion("t_psw not in", values, "tPsw");
            return (Criteria) this;
        }

        public Criteria andTPswBetween(String value1, String value2) {
            addCriterion("t_psw between", value1, value2, "tPsw");
            return (Criteria) this;
        }

        public Criteria andTPswNotBetween(String value1, String value2) {
            addCriterion("t_psw not between", value1, value2, "tPsw");
            return (Criteria) this;
        }

        public Criteria andTNameIsNull() {
            addCriterion("t_name is null");
            return (Criteria) this;
        }

        public Criteria andTNameIsNotNull() {
            addCriterion("t_name is not null");
            return (Criteria) this;
        }

        public Criteria andTNameEqualTo(String value) {
            addCriterion("t_name =", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotEqualTo(String value) {
            addCriterion("t_name <>", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThan(String value) {
            addCriterion("t_name >", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_name >=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThan(String value) {
            addCriterion("t_name <", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThanOrEqualTo(String value) {
            addCriterion("t_name <=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLike(String value) {
            addCriterion("t_name like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotLike(String value) {
            addCriterion("t_name not like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameIn(List<String> values) {
            addCriterion("t_name in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotIn(List<String> values) {
            addCriterion("t_name not in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameBetween(String value1, String value2) {
            addCriterion("t_name between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotBetween(String value1, String value2) {
            addCriterion("t_name not between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTEmailIsNull() {
            addCriterion("t_email is null");
            return (Criteria) this;
        }

        public Criteria andTEmailIsNotNull() {
            addCriterion("t_email is not null");
            return (Criteria) this;
        }

        public Criteria andTEmailEqualTo(String value) {
            addCriterion("t_email =", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailNotEqualTo(String value) {
            addCriterion("t_email <>", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailGreaterThan(String value) {
            addCriterion("t_email >", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailGreaterThanOrEqualTo(String value) {
            addCriterion("t_email >=", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailLessThan(String value) {
            addCriterion("t_email <", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailLessThanOrEqualTo(String value) {
            addCriterion("t_email <=", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailLike(String value) {
            addCriterion("t_email like", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailNotLike(String value) {
            addCriterion("t_email not like", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailIn(List<String> values) {
            addCriterion("t_email in", values, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailNotIn(List<String> values) {
            addCriterion("t_email not in", values, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailBetween(String value1, String value2) {
            addCriterion("t_email between", value1, value2, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailNotBetween(String value1, String value2) {
            addCriterion("t_email not between", value1, value2, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTTelIsNull() {
            addCriterion("t_tel is null");
            return (Criteria) this;
        }

        public Criteria andTTelIsNotNull() {
            addCriterion("t_tel is not null");
            return (Criteria) this;
        }

        public Criteria andTTelEqualTo(String value) {
            addCriterion("t_tel =", value, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelNotEqualTo(String value) {
            addCriterion("t_tel <>", value, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelGreaterThan(String value) {
            addCriterion("t_tel >", value, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelGreaterThanOrEqualTo(String value) {
            addCriterion("t_tel >=", value, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelLessThan(String value) {
            addCriterion("t_tel <", value, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelLessThanOrEqualTo(String value) {
            addCriterion("t_tel <=", value, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelLike(String value) {
            addCriterion("t_tel like", value, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelNotLike(String value) {
            addCriterion("t_tel not like", value, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelIn(List<String> values) {
            addCriterion("t_tel in", values, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelNotIn(List<String> values) {
            addCriterion("t_tel not in", values, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelBetween(String value1, String value2) {
            addCriterion("t_tel between", value1, value2, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelNotBetween(String value1, String value2) {
            addCriterion("t_tel not between", value1, value2, "tTel");
            return (Criteria) this;
        }

        public Criteria andTSexIsNull() {
            addCriterion("t_sex is null");
            return (Criteria) this;
        }

        public Criteria andTSexIsNotNull() {
            addCriterion("t_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTSexEqualTo(String value) {
            addCriterion("t_sex =", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotEqualTo(String value) {
            addCriterion("t_sex <>", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexGreaterThan(String value) {
            addCriterion("t_sex >", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexGreaterThanOrEqualTo(String value) {
            addCriterion("t_sex >=", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexLessThan(String value) {
            addCriterion("t_sex <", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexLessThanOrEqualTo(String value) {
            addCriterion("t_sex <=", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexLike(String value) {
            addCriterion("t_sex like", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotLike(String value) {
            addCriterion("t_sex not like", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexIn(List<String> values) {
            addCriterion("t_sex in", values, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotIn(List<String> values) {
            addCriterion("t_sex not in", values, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexBetween(String value1, String value2) {
            addCriterion("t_sex between", value1, value2, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotBetween(String value1, String value2) {
            addCriterion("t_sex not between", value1, value2, "tSex");
            return (Criteria) this;
        }

        public Criteria andTTitleIsNull() {
            addCriterion("t_title is null");
            return (Criteria) this;
        }

        public Criteria andTTitleIsNotNull() {
            addCriterion("t_title is not null");
            return (Criteria) this;
        }

        public Criteria andTTitleEqualTo(String value) {
            addCriterion("t_title =", value, "tTitle");
            return (Criteria) this;
        }

        public Criteria andTTitleNotEqualTo(String value) {
            addCriterion("t_title <>", value, "tTitle");
            return (Criteria) this;
        }

        public Criteria andTTitleGreaterThan(String value) {
            addCriterion("t_title >", value, "tTitle");
            return (Criteria) this;
        }

        public Criteria andTTitleGreaterThanOrEqualTo(String value) {
            addCriterion("t_title >=", value, "tTitle");
            return (Criteria) this;
        }

        public Criteria andTTitleLessThan(String value) {
            addCriterion("t_title <", value, "tTitle");
            return (Criteria) this;
        }

        public Criteria andTTitleLessThanOrEqualTo(String value) {
            addCriterion("t_title <=", value, "tTitle");
            return (Criteria) this;
        }

        public Criteria andTTitleLike(String value) {
            addCriterion("t_title like", value, "tTitle");
            return (Criteria) this;
        }

        public Criteria andTTitleNotLike(String value) {
            addCriterion("t_title not like", value, "tTitle");
            return (Criteria) this;
        }

        public Criteria andTTitleIn(List<String> values) {
            addCriterion("t_title in", values, "tTitle");
            return (Criteria) this;
        }

        public Criteria andTTitleNotIn(List<String> values) {
            addCriterion("t_title not in", values, "tTitle");
            return (Criteria) this;
        }

        public Criteria andTTitleBetween(String value1, String value2) {
            addCriterion("t_title between", value1, value2, "tTitle");
            return (Criteria) this;
        }

        public Criteria andTTitleNotBetween(String value1, String value2) {
            addCriterion("t_title not between", value1, value2, "tTitle");
            return (Criteria) this;
        }

        public Criteria andTImgIsNull() {
            addCriterion("t_img is null");
            return (Criteria) this;
        }

        public Criteria andTImgIsNotNull() {
            addCriterion("t_img is not null");
            return (Criteria) this;
        }

        public Criteria andTImgEqualTo(String value) {
            addCriterion("t_img =", value, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgNotEqualTo(String value) {
            addCriterion("t_img <>", value, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgGreaterThan(String value) {
            addCriterion("t_img >", value, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgGreaterThanOrEqualTo(String value) {
            addCriterion("t_img >=", value, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgLessThan(String value) {
            addCriterion("t_img <", value, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgLessThanOrEqualTo(String value) {
            addCriterion("t_img <=", value, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgLike(String value) {
            addCriterion("t_img like", value, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgNotLike(String value) {
            addCriterion("t_img not like", value, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgIn(List<String> values) {
            addCriterion("t_img in", values, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgNotIn(List<String> values) {
            addCriterion("t_img not in", values, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgBetween(String value1, String value2) {
            addCriterion("t_img between", value1, value2, "tImg");
            return (Criteria) this;
        }

        public Criteria andTImgNotBetween(String value1, String value2) {
            addCriterion("t_img not between", value1, value2, "tImg");
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
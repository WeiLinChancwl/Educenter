package net.william.educenter.entity;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("c_name is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("c_name is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("c_name =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("c_name <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("c_name >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_name >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("c_name <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("c_name <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("c_name like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("c_name not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("c_name in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("c_name not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("c_name between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("c_name not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCCreditIsNull() {
            addCriterion("c_credit is null");
            return (Criteria) this;
        }

        public Criteria andCCreditIsNotNull() {
            addCriterion("c_credit is not null");
            return (Criteria) this;
        }

        public Criteria andCCreditEqualTo(Float value) {
            addCriterion("c_credit =", value, "cCredit");
            return (Criteria) this;
        }

        public Criteria andCCreditNotEqualTo(Float value) {
            addCriterion("c_credit <>", value, "cCredit");
            return (Criteria) this;
        }

        public Criteria andCCreditGreaterThan(Float value) {
            addCriterion("c_credit >", value, "cCredit");
            return (Criteria) this;
        }

        public Criteria andCCreditGreaterThanOrEqualTo(Float value) {
            addCriterion("c_credit >=", value, "cCredit");
            return (Criteria) this;
        }

        public Criteria andCCreditLessThan(Float value) {
            addCriterion("c_credit <", value, "cCredit");
            return (Criteria) this;
        }

        public Criteria andCCreditLessThanOrEqualTo(Float value) {
            addCriterion("c_credit <=", value, "cCredit");
            return (Criteria) this;
        }

        public Criteria andCCreditIn(List<Float> values) {
            addCriterion("c_credit in", values, "cCredit");
            return (Criteria) this;
        }

        public Criteria andCCreditNotIn(List<Float> values) {
            addCriterion("c_credit not in", values, "cCredit");
            return (Criteria) this;
        }

        public Criteria andCCreditBetween(Float value1, Float value2) {
            addCriterion("c_credit between", value1, value2, "cCredit");
            return (Criteria) this;
        }

        public Criteria andCCreditNotBetween(Float value1, Float value2) {
            addCriterion("c_credit not between", value1, value2, "cCredit");
            return (Criteria) this;
        }

        public Criteria andCClassIsNull() {
            addCriterion("c_class is null");
            return (Criteria) this;
        }

        public Criteria andCClassIsNotNull() {
            addCriterion("c_class is not null");
            return (Criteria) this;
        }

        public Criteria andCClassEqualTo(Integer value) {
            addCriterion("c_class =", value, "cClass");
            return (Criteria) this;
        }

        public Criteria andCClassNotEqualTo(Integer value) {
            addCriterion("c_class <>", value, "cClass");
            return (Criteria) this;
        }

        public Criteria andCClassGreaterThan(Integer value) {
            addCriterion("c_class >", value, "cClass");
            return (Criteria) this;
        }

        public Criteria andCClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_class >=", value, "cClass");
            return (Criteria) this;
        }

        public Criteria andCClassLessThan(Integer value) {
            addCriterion("c_class <", value, "cClass");
            return (Criteria) this;
        }

        public Criteria andCClassLessThanOrEqualTo(Integer value) {
            addCriterion("c_class <=", value, "cClass");
            return (Criteria) this;
        }

        public Criteria andCClassIn(List<Integer> values) {
            addCriterion("c_class in", values, "cClass");
            return (Criteria) this;
        }

        public Criteria andCClassNotIn(List<Integer> values) {
            addCriterion("c_class not in", values, "cClass");
            return (Criteria) this;
        }

        public Criteria andCClassBetween(Integer value1, Integer value2) {
            addCriterion("c_class between", value1, value2, "cClass");
            return (Criteria) this;
        }

        public Criteria andCClassNotBetween(Integer value1, Integer value2) {
            addCriterion("c_class not between", value1, value2, "cClass");
            return (Criteria) this;
        }

        public Criteria andCDescIsNull() {
            addCriterion("c_desc is null");
            return (Criteria) this;
        }

        public Criteria andCDescIsNotNull() {
            addCriterion("c_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCDescEqualTo(String value) {
            addCriterion("c_desc =", value, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescNotEqualTo(String value) {
            addCriterion("c_desc <>", value, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescGreaterThan(String value) {
            addCriterion("c_desc >", value, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescGreaterThanOrEqualTo(String value) {
            addCriterion("c_desc >=", value, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescLessThan(String value) {
            addCriterion("c_desc <", value, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescLessThanOrEqualTo(String value) {
            addCriterion("c_desc <=", value, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescLike(String value) {
            addCriterion("c_desc like", value, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescNotLike(String value) {
            addCriterion("c_desc not like", value, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescIn(List<String> values) {
            addCriterion("c_desc in", values, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescNotIn(List<String> values) {
            addCriterion("c_desc not in", values, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescBetween(String value1, String value2) {
            addCriterion("c_desc between", value1, value2, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescNotBetween(String value1, String value2) {
            addCriterion("c_desc not between", value1, value2, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCPlanIsNull() {
            addCriterion("c_plan is null");
            return (Criteria) this;
        }

        public Criteria andCPlanIsNotNull() {
            addCriterion("c_plan is not null");
            return (Criteria) this;
        }

        public Criteria andCPlanEqualTo(String value) {
            addCriterion("c_plan =", value, "cPlan");
            return (Criteria) this;
        }

        public Criteria andCPlanNotEqualTo(String value) {
            addCriterion("c_plan <>", value, "cPlan");
            return (Criteria) this;
        }

        public Criteria andCPlanGreaterThan(String value) {
            addCriterion("c_plan >", value, "cPlan");
            return (Criteria) this;
        }

        public Criteria andCPlanGreaterThanOrEqualTo(String value) {
            addCriterion("c_plan >=", value, "cPlan");
            return (Criteria) this;
        }

        public Criteria andCPlanLessThan(String value) {
            addCriterion("c_plan <", value, "cPlan");
            return (Criteria) this;
        }

        public Criteria andCPlanLessThanOrEqualTo(String value) {
            addCriterion("c_plan <=", value, "cPlan");
            return (Criteria) this;
        }

        public Criteria andCPlanLike(String value) {
            addCriterion("c_plan like", value, "cPlan");
            return (Criteria) this;
        }

        public Criteria andCPlanNotLike(String value) {
            addCriterion("c_plan not like", value, "cPlan");
            return (Criteria) this;
        }

        public Criteria andCPlanIn(List<String> values) {
            addCriterion("c_plan in", values, "cPlan");
            return (Criteria) this;
        }

        public Criteria andCPlanNotIn(List<String> values) {
            addCriterion("c_plan not in", values, "cPlan");
            return (Criteria) this;
        }

        public Criteria andCPlanBetween(String value1, String value2) {
            addCriterion("c_plan between", value1, value2, "cPlan");
            return (Criteria) this;
        }

        public Criteria andCPlanNotBetween(String value1, String value2) {
            addCriterion("c_plan not between", value1, value2, "cPlan");
            return (Criteria) this;
        }

        public Criteria andCContentIsNull() {
            addCriterion("c_content is null");
            return (Criteria) this;
        }

        public Criteria andCContentIsNotNull() {
            addCriterion("c_content is not null");
            return (Criteria) this;
        }

        public Criteria andCContentEqualTo(String value) {
            addCriterion("c_content =", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotEqualTo(String value) {
            addCriterion("c_content <>", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentGreaterThan(String value) {
            addCriterion("c_content >", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentGreaterThanOrEqualTo(String value) {
            addCriterion("c_content >=", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLessThan(String value) {
            addCriterion("c_content <", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLessThanOrEqualTo(String value) {
            addCriterion("c_content <=", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLike(String value) {
            addCriterion("c_content like", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotLike(String value) {
            addCriterion("c_content not like", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentIn(List<String> values) {
            addCriterion("c_content in", values, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotIn(List<String> values) {
            addCriterion("c_content not in", values, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentBetween(String value1, String value2) {
            addCriterion("c_content between", value1, value2, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotBetween(String value1, String value2) {
            addCriterion("c_content not between", value1, value2, "cContent");
            return (Criteria) this;
        }

        public Criteria andCTestIsNull() {
            addCriterion("c_test is null");
            return (Criteria) this;
        }

        public Criteria andCTestIsNotNull() {
            addCriterion("c_test is not null");
            return (Criteria) this;
        }

        public Criteria andCTestEqualTo(String value) {
            addCriterion("c_test =", value, "cTest");
            return (Criteria) this;
        }

        public Criteria andCTestNotEqualTo(String value) {
            addCriterion("c_test <>", value, "cTest");
            return (Criteria) this;
        }

        public Criteria andCTestGreaterThan(String value) {
            addCriterion("c_test >", value, "cTest");
            return (Criteria) this;
        }

        public Criteria andCTestGreaterThanOrEqualTo(String value) {
            addCriterion("c_test >=", value, "cTest");
            return (Criteria) this;
        }

        public Criteria andCTestLessThan(String value) {
            addCriterion("c_test <", value, "cTest");
            return (Criteria) this;
        }

        public Criteria andCTestLessThanOrEqualTo(String value) {
            addCriterion("c_test <=", value, "cTest");
            return (Criteria) this;
        }

        public Criteria andCTestLike(String value) {
            addCriterion("c_test like", value, "cTest");
            return (Criteria) this;
        }

        public Criteria andCTestNotLike(String value) {
            addCriterion("c_test not like", value, "cTest");
            return (Criteria) this;
        }

        public Criteria andCTestIn(List<String> values) {
            addCriterion("c_test in", values, "cTest");
            return (Criteria) this;
        }

        public Criteria andCTestNotIn(List<String> values) {
            addCriterion("c_test not in", values, "cTest");
            return (Criteria) this;
        }

        public Criteria andCTestBetween(String value1, String value2) {
            addCriterion("c_test between", value1, value2, "cTest");
            return (Criteria) this;
        }

        public Criteria andCTestNotBetween(String value1, String value2) {
            addCriterion("c_test not between", value1, value2, "cTest");
            return (Criteria) this;
        }

        public Criteria andCImgIsNull() {
            addCriterion("c_img is null");
            return (Criteria) this;
        }

        public Criteria andCImgIsNotNull() {
            addCriterion("c_img is not null");
            return (Criteria) this;
        }

        public Criteria andCImgEqualTo(String value) {
            addCriterion("c_img =", value, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgNotEqualTo(String value) {
            addCriterion("c_img <>", value, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgGreaterThan(String value) {
            addCriterion("c_img >", value, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgGreaterThanOrEqualTo(String value) {
            addCriterion("c_img >=", value, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgLessThan(String value) {
            addCriterion("c_img <", value, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgLessThanOrEqualTo(String value) {
            addCriterion("c_img <=", value, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgLike(String value) {
            addCriterion("c_img like", value, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgNotLike(String value) {
            addCriterion("c_img not like", value, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgIn(List<String> values) {
            addCriterion("c_img in", values, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgNotIn(List<String> values) {
            addCriterion("c_img not in", values, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgBetween(String value1, String value2) {
            addCriterion("c_img between", value1, value2, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgNotBetween(String value1, String value2) {
            addCriterion("c_img not between", value1, value2, "cImg");
            return (Criteria) this;
        }

        public Criteria andCDateIsNull() {
            addCriterion("c_date is null");
            return (Criteria) this;
        }

        public Criteria andCDateIsNotNull() {
            addCriterion("c_date is not null");
            return (Criteria) this;
        }

        public Criteria andCDateEqualTo(String value) {
            addCriterion("c_date =", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateNotEqualTo(String value) {
            addCriterion("c_date <>", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateGreaterThan(String value) {
            addCriterion("c_date >", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateGreaterThanOrEqualTo(String value) {
            addCriterion("c_date >=", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateLessThan(String value) {
            addCriterion("c_date <", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateLessThanOrEqualTo(String value) {
            addCriterion("c_date <=", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateLike(String value) {
            addCriterion("c_date like", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateNotLike(String value) {
            addCriterion("c_date not like", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateIn(List<String> values) {
            addCriterion("c_date in", values, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateNotIn(List<String> values) {
            addCriterion("c_date not in", values, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateBetween(String value1, String value2) {
            addCriterion("c_date between", value1, value2, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateNotBetween(String value1, String value2) {
            addCriterion("c_date not between", value1, value2, "cDate");
            return (Criteria) this;
        }

        public Criteria andCTypeIsNull() {
            addCriterion("c_type is null");
            return (Criteria) this;
        }

        public Criteria andCTypeIsNotNull() {
            addCriterion("c_type is not null");
            return (Criteria) this;
        }

        public Criteria andCTypeEqualTo(String value) {
            addCriterion("c_type =", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotEqualTo(String value) {
            addCriterion("c_type <>", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeGreaterThan(String value) {
            addCriterion("c_type >", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_type >=", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLessThan(String value) {
            addCriterion("c_type <", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLessThanOrEqualTo(String value) {
            addCriterion("c_type <=", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLike(String value) {
            addCriterion("c_type like", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotLike(String value) {
            addCriterion("c_type not like", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeIn(List<String> values) {
            addCriterion("c_type in", values, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotIn(List<String> values) {
            addCriterion("c_type not in", values, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeBetween(String value1, String value2) {
            addCriterion("c_type between", value1, value2, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotBetween(String value1, String value2) {
            addCriterion("c_type not between", value1, value2, "cType");
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

        public Criteria andMNameIsNull() {
            addCriterion("m_name is null");
            return (Criteria) this;
        }

        public Criteria andMNameIsNotNull() {
            addCriterion("m_name is not null");
            return (Criteria) this;
        }

        public Criteria andMNameEqualTo(String value) {
            addCriterion("m_name =", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotEqualTo(String value) {
            addCriterion("m_name <>", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThan(String value) {
            addCriterion("m_name >", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThanOrEqualTo(String value) {
            addCriterion("m_name >=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThan(String value) {
            addCriterion("m_name <", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThanOrEqualTo(String value) {
            addCriterion("m_name <=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLike(String value) {
            addCriterion("m_name like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotLike(String value) {
            addCriterion("m_name not like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameIn(List<String> values) {
            addCriterion("m_name in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotIn(List<String> values) {
            addCriterion("m_name not in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameBetween(String value1, String value2) {
            addCriterion("m_name between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotBetween(String value1, String value2) {
            addCriterion("m_name not between", value1, value2, "mName");
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
package net.william.educenter.entity;

import java.util.ArrayList;
import java.util.List;

public class IfTakeCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IfTakeCourseExample() {
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

        public Criteria andIfTakeIdIsNull() {
            addCriterion("if_take_id is null");
            return (Criteria) this;
        }

        public Criteria andIfTakeIdIsNotNull() {
            addCriterion("if_take_id is not null");
            return (Criteria) this;
        }

        public Criteria andIfTakeIdEqualTo(Integer value) {
            addCriterion("if_take_id =", value, "ifTakeId");
            return (Criteria) this;
        }

        public Criteria andIfTakeIdNotEqualTo(Integer value) {
            addCriterion("if_take_id <>", value, "ifTakeId");
            return (Criteria) this;
        }

        public Criteria andIfTakeIdGreaterThan(Integer value) {
            addCriterion("if_take_id >", value, "ifTakeId");
            return (Criteria) this;
        }

        public Criteria andIfTakeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_take_id >=", value, "ifTakeId");
            return (Criteria) this;
        }

        public Criteria andIfTakeIdLessThan(Integer value) {
            addCriterion("if_take_id <", value, "ifTakeId");
            return (Criteria) this;
        }

        public Criteria andIfTakeIdLessThanOrEqualTo(Integer value) {
            addCriterion("if_take_id <=", value, "ifTakeId");
            return (Criteria) this;
        }

        public Criteria andIfTakeIdIn(List<Integer> values) {
            addCriterion("if_take_id in", values, "ifTakeId");
            return (Criteria) this;
        }

        public Criteria andIfTakeIdNotIn(List<Integer> values) {
            addCriterion("if_take_id not in", values, "ifTakeId");
            return (Criteria) this;
        }

        public Criteria andIfTakeIdBetween(Integer value1, Integer value2) {
            addCriterion("if_take_id between", value1, value2, "ifTakeId");
            return (Criteria) this;
        }

        public Criteria andIfTakeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("if_take_id not between", value1, value2, "ifTakeId");
            return (Criteria) this;
        }

        public Criteria andIfTakeCourseIsNull() {
            addCriterion("if_take_course is null");
            return (Criteria) this;
        }

        public Criteria andIfTakeCourseIsNotNull() {
            addCriterion("if_take_course is not null");
            return (Criteria) this;
        }

        public Criteria andIfTakeCourseEqualTo(String value) {
            addCriterion("if_take_course =", value, "ifTakeCourse");
            return (Criteria) this;
        }

        public Criteria andIfTakeCourseNotEqualTo(String value) {
            addCriterion("if_take_course <>", value, "ifTakeCourse");
            return (Criteria) this;
        }

        public Criteria andIfTakeCourseGreaterThan(String value) {
            addCriterion("if_take_course >", value, "ifTakeCourse");
            return (Criteria) this;
        }

        public Criteria andIfTakeCourseGreaterThanOrEqualTo(String value) {
            addCriterion("if_take_course >=", value, "ifTakeCourse");
            return (Criteria) this;
        }

        public Criteria andIfTakeCourseLessThan(String value) {
            addCriterion("if_take_course <", value, "ifTakeCourse");
            return (Criteria) this;
        }

        public Criteria andIfTakeCourseLessThanOrEqualTo(String value) {
            addCriterion("if_take_course <=", value, "ifTakeCourse");
            return (Criteria) this;
        }

        public Criteria andIfTakeCourseLike(String value) {
            addCriterion("if_take_course like", value, "ifTakeCourse");
            return (Criteria) this;
        }

        public Criteria andIfTakeCourseNotLike(String value) {
            addCriterion("if_take_course not like", value, "ifTakeCourse");
            return (Criteria) this;
        }

        public Criteria andIfTakeCourseIn(List<String> values) {
            addCriterion("if_take_course in", values, "ifTakeCourse");
            return (Criteria) this;
        }

        public Criteria andIfTakeCourseNotIn(List<String> values) {
            addCriterion("if_take_course not in", values, "ifTakeCourse");
            return (Criteria) this;
        }

        public Criteria andIfTakeCourseBetween(String value1, String value2) {
            addCriterion("if_take_course between", value1, value2, "ifTakeCourse");
            return (Criteria) this;
        }

        public Criteria andIfTakeCourseNotBetween(String value1, String value2) {
            addCriterion("if_take_course not between", value1, value2, "ifTakeCourse");
            return (Criteria) this;
        }

        public Criteria andIfInputGradeIsNull() {
            addCriterion("if_input_grade is null");
            return (Criteria) this;
        }

        public Criteria andIfInputGradeIsNotNull() {
            addCriterion("if_input_grade is not null");
            return (Criteria) this;
        }

        public Criteria andIfInputGradeEqualTo(String value) {
            addCriterion("if_input_grade =", value, "ifInputGrade");
            return (Criteria) this;
        }

        public Criteria andIfInputGradeNotEqualTo(String value) {
            addCriterion("if_input_grade <>", value, "ifInputGrade");
            return (Criteria) this;
        }

        public Criteria andIfInputGradeGreaterThan(String value) {
            addCriterion("if_input_grade >", value, "ifInputGrade");
            return (Criteria) this;
        }

        public Criteria andIfInputGradeGreaterThanOrEqualTo(String value) {
            addCriterion("if_input_grade >=", value, "ifInputGrade");
            return (Criteria) this;
        }

        public Criteria andIfInputGradeLessThan(String value) {
            addCriterion("if_input_grade <", value, "ifInputGrade");
            return (Criteria) this;
        }

        public Criteria andIfInputGradeLessThanOrEqualTo(String value) {
            addCriterion("if_input_grade <=", value, "ifInputGrade");
            return (Criteria) this;
        }

        public Criteria andIfInputGradeLike(String value) {
            addCriterion("if_input_grade like", value, "ifInputGrade");
            return (Criteria) this;
        }

        public Criteria andIfInputGradeNotLike(String value) {
            addCriterion("if_input_grade not like", value, "ifInputGrade");
            return (Criteria) this;
        }

        public Criteria andIfInputGradeIn(List<String> values) {
            addCriterion("if_input_grade in", values, "ifInputGrade");
            return (Criteria) this;
        }

        public Criteria andIfInputGradeNotIn(List<String> values) {
            addCriterion("if_input_grade not in", values, "ifInputGrade");
            return (Criteria) this;
        }

        public Criteria andIfInputGradeBetween(String value1, String value2) {
            addCriterion("if_input_grade between", value1, value2, "ifInputGrade");
            return (Criteria) this;
        }

        public Criteria andIfInputGradeNotBetween(String value1, String value2) {
            addCriterion("if_input_grade not between", value1, value2, "ifInputGrade");
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
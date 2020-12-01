package net.william.educenter.entity;

import java.util.ArrayList;
import java.util.List;

public class SlideExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SlideExample() {
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

        public Criteria andSlideIdIsNull() {
            addCriterion("slide_id is null");
            return (Criteria) this;
        }

        public Criteria andSlideIdIsNotNull() {
            addCriterion("slide_id is not null");
            return (Criteria) this;
        }

        public Criteria andSlideIdEqualTo(Integer value) {
            addCriterion("slide_id =", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdNotEqualTo(Integer value) {
            addCriterion("slide_id <>", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdGreaterThan(Integer value) {
            addCriterion("slide_id >", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("slide_id >=", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdLessThan(Integer value) {
            addCriterion("slide_id <", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdLessThanOrEqualTo(Integer value) {
            addCriterion("slide_id <=", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdIn(List<Integer> values) {
            addCriterion("slide_id in", values, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdNotIn(List<Integer> values) {
            addCriterion("slide_id not in", values, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdBetween(Integer value1, Integer value2) {
            addCriterion("slide_id between", value1, value2, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdNotBetween(Integer value1, Integer value2) {
            addCriterion("slide_id not between", value1, value2, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideImgIsNull() {
            addCriterion("slide_img is null");
            return (Criteria) this;
        }

        public Criteria andSlideImgIsNotNull() {
            addCriterion("slide_img is not null");
            return (Criteria) this;
        }

        public Criteria andSlideImgEqualTo(String value) {
            addCriterion("slide_img =", value, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgNotEqualTo(String value) {
            addCriterion("slide_img <>", value, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgGreaterThan(String value) {
            addCriterion("slide_img >", value, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgGreaterThanOrEqualTo(String value) {
            addCriterion("slide_img >=", value, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgLessThan(String value) {
            addCriterion("slide_img <", value, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgLessThanOrEqualTo(String value) {
            addCriterion("slide_img <=", value, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgLike(String value) {
            addCriterion("slide_img like", value, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgNotLike(String value) {
            addCriterion("slide_img not like", value, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgIn(List<String> values) {
            addCriterion("slide_img in", values, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgNotIn(List<String> values) {
            addCriterion("slide_img not in", values, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgBetween(String value1, String value2) {
            addCriterion("slide_img between", value1, value2, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgNotBetween(String value1, String value2) {
            addCriterion("slide_img not between", value1, value2, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideTitleIsNull() {
            addCriterion("slide_title is null");
            return (Criteria) this;
        }

        public Criteria andSlideTitleIsNotNull() {
            addCriterion("slide_title is not null");
            return (Criteria) this;
        }

        public Criteria andSlideTitleEqualTo(String value) {
            addCriterion("slide_title =", value, "slideTitle");
            return (Criteria) this;
        }

        public Criteria andSlideTitleNotEqualTo(String value) {
            addCriterion("slide_title <>", value, "slideTitle");
            return (Criteria) this;
        }

        public Criteria andSlideTitleGreaterThan(String value) {
            addCriterion("slide_title >", value, "slideTitle");
            return (Criteria) this;
        }

        public Criteria andSlideTitleGreaterThanOrEqualTo(String value) {
            addCriterion("slide_title >=", value, "slideTitle");
            return (Criteria) this;
        }

        public Criteria andSlideTitleLessThan(String value) {
            addCriterion("slide_title <", value, "slideTitle");
            return (Criteria) this;
        }

        public Criteria andSlideTitleLessThanOrEqualTo(String value) {
            addCriterion("slide_title <=", value, "slideTitle");
            return (Criteria) this;
        }

        public Criteria andSlideTitleLike(String value) {
            addCriterion("slide_title like", value, "slideTitle");
            return (Criteria) this;
        }

        public Criteria andSlideTitleNotLike(String value) {
            addCriterion("slide_title not like", value, "slideTitle");
            return (Criteria) this;
        }

        public Criteria andSlideTitleIn(List<String> values) {
            addCriterion("slide_title in", values, "slideTitle");
            return (Criteria) this;
        }

        public Criteria andSlideTitleNotIn(List<String> values) {
            addCriterion("slide_title not in", values, "slideTitle");
            return (Criteria) this;
        }

        public Criteria andSlideTitleBetween(String value1, String value2) {
            addCriterion("slide_title between", value1, value2, "slideTitle");
            return (Criteria) this;
        }

        public Criteria andSlideTitleNotBetween(String value1, String value2) {
            addCriterion("slide_title not between", value1, value2, "slideTitle");
            return (Criteria) this;
        }

        public Criteria andSlideContentIsNull() {
            addCriterion("slide_content is null");
            return (Criteria) this;
        }

        public Criteria andSlideContentIsNotNull() {
            addCriterion("slide_content is not null");
            return (Criteria) this;
        }

        public Criteria andSlideContentEqualTo(String value) {
            addCriterion("slide_content =", value, "slideContent");
            return (Criteria) this;
        }

        public Criteria andSlideContentNotEqualTo(String value) {
            addCriterion("slide_content <>", value, "slideContent");
            return (Criteria) this;
        }

        public Criteria andSlideContentGreaterThan(String value) {
            addCriterion("slide_content >", value, "slideContent");
            return (Criteria) this;
        }

        public Criteria andSlideContentGreaterThanOrEqualTo(String value) {
            addCriterion("slide_content >=", value, "slideContent");
            return (Criteria) this;
        }

        public Criteria andSlideContentLessThan(String value) {
            addCriterion("slide_content <", value, "slideContent");
            return (Criteria) this;
        }

        public Criteria andSlideContentLessThanOrEqualTo(String value) {
            addCriterion("slide_content <=", value, "slideContent");
            return (Criteria) this;
        }

        public Criteria andSlideContentLike(String value) {
            addCriterion("slide_content like", value, "slideContent");
            return (Criteria) this;
        }

        public Criteria andSlideContentNotLike(String value) {
            addCriterion("slide_content not like", value, "slideContent");
            return (Criteria) this;
        }

        public Criteria andSlideContentIn(List<String> values) {
            addCriterion("slide_content in", values, "slideContent");
            return (Criteria) this;
        }

        public Criteria andSlideContentNotIn(List<String> values) {
            addCriterion("slide_content not in", values, "slideContent");
            return (Criteria) this;
        }

        public Criteria andSlideContentBetween(String value1, String value2) {
            addCriterion("slide_content between", value1, value2, "slideContent");
            return (Criteria) this;
        }

        public Criteria andSlideContentNotBetween(String value1, String value2) {
            addCriterion("slide_content not between", value1, value2, "slideContent");
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
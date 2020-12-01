package net.william.educenter.entity;

import java.util.ArrayList;
import java.util.List;

public class EventExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventExample() {
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

        public Criteria andEventIdIsNull() {
            addCriterion("event_id is null");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNotNull() {
            addCriterion("event_id is not null");
            return (Criteria) this;
        }

        public Criteria andEventIdEqualTo(Integer value) {
            addCriterion("event_id =", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotEqualTo(Integer value) {
            addCriterion("event_id <>", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThan(Integer value) {
            addCriterion("event_id >", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("event_id >=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThan(Integer value) {
            addCriterion("event_id <", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThanOrEqualTo(Integer value) {
            addCriterion("event_id <=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdIn(List<Integer> values) {
            addCriterion("event_id in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotIn(List<Integer> values) {
            addCriterion("event_id not in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdBetween(Integer value1, Integer value2) {
            addCriterion("event_id between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotBetween(Integer value1, Integer value2) {
            addCriterion("event_id not between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventFeeIsNull() {
            addCriterion("event_fee is null");
            return (Criteria) this;
        }

        public Criteria andEventFeeIsNotNull() {
            addCriterion("event_fee is not null");
            return (Criteria) this;
        }

        public Criteria andEventFeeEqualTo(Integer value) {
            addCriterion("event_fee =", value, "eventFee");
            return (Criteria) this;
        }

        public Criteria andEventFeeNotEqualTo(Integer value) {
            addCriterion("event_fee <>", value, "eventFee");
            return (Criteria) this;
        }

        public Criteria andEventFeeGreaterThan(Integer value) {
            addCriterion("event_fee >", value, "eventFee");
            return (Criteria) this;
        }

        public Criteria andEventFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("event_fee >=", value, "eventFee");
            return (Criteria) this;
        }

        public Criteria andEventFeeLessThan(Integer value) {
            addCriterion("event_fee <", value, "eventFee");
            return (Criteria) this;
        }

        public Criteria andEventFeeLessThanOrEqualTo(Integer value) {
            addCriterion("event_fee <=", value, "eventFee");
            return (Criteria) this;
        }

        public Criteria andEventFeeIn(List<Integer> values) {
            addCriterion("event_fee in", values, "eventFee");
            return (Criteria) this;
        }

        public Criteria andEventFeeNotIn(List<Integer> values) {
            addCriterion("event_fee not in", values, "eventFee");
            return (Criteria) this;
        }

        public Criteria andEventFeeBetween(Integer value1, Integer value2) {
            addCriterion("event_fee between", value1, value2, "eventFee");
            return (Criteria) this;
        }

        public Criteria andEventFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("event_fee not between", value1, value2, "eventFee");
            return (Criteria) this;
        }

        public Criteria andEventWriterIsNull() {
            addCriterion("event_writer is null");
            return (Criteria) this;
        }

        public Criteria andEventWriterIsNotNull() {
            addCriterion("event_writer is not null");
            return (Criteria) this;
        }

        public Criteria andEventWriterEqualTo(String value) {
            addCriterion("event_writer =", value, "eventWriter");
            return (Criteria) this;
        }

        public Criteria andEventWriterNotEqualTo(String value) {
            addCriterion("event_writer <>", value, "eventWriter");
            return (Criteria) this;
        }

        public Criteria andEventWriterGreaterThan(String value) {
            addCriterion("event_writer >", value, "eventWriter");
            return (Criteria) this;
        }

        public Criteria andEventWriterGreaterThanOrEqualTo(String value) {
            addCriterion("event_writer >=", value, "eventWriter");
            return (Criteria) this;
        }

        public Criteria andEventWriterLessThan(String value) {
            addCriterion("event_writer <", value, "eventWriter");
            return (Criteria) this;
        }

        public Criteria andEventWriterLessThanOrEqualTo(String value) {
            addCriterion("event_writer <=", value, "eventWriter");
            return (Criteria) this;
        }

        public Criteria andEventWriterLike(String value) {
            addCriterion("event_writer like", value, "eventWriter");
            return (Criteria) this;
        }

        public Criteria andEventWriterNotLike(String value) {
            addCriterion("event_writer not like", value, "eventWriter");
            return (Criteria) this;
        }

        public Criteria andEventWriterIn(List<String> values) {
            addCriterion("event_writer in", values, "eventWriter");
            return (Criteria) this;
        }

        public Criteria andEventWriterNotIn(List<String> values) {
            addCriterion("event_writer not in", values, "eventWriter");
            return (Criteria) this;
        }

        public Criteria andEventWriterBetween(String value1, String value2) {
            addCriterion("event_writer between", value1, value2, "eventWriter");
            return (Criteria) this;
        }

        public Criteria andEventWriterNotBetween(String value1, String value2) {
            addCriterion("event_writer not between", value1, value2, "eventWriter");
            return (Criteria) this;
        }

        public Criteria andEventDateIsNull() {
            addCriterion("event_date is null");
            return (Criteria) this;
        }

        public Criteria andEventDateIsNotNull() {
            addCriterion("event_date is not null");
            return (Criteria) this;
        }

        public Criteria andEventDateEqualTo(String value) {
            addCriterion("event_date =", value, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateNotEqualTo(String value) {
            addCriterion("event_date <>", value, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateGreaterThan(String value) {
            addCriterion("event_date >", value, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateGreaterThanOrEqualTo(String value) {
            addCriterion("event_date >=", value, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateLessThan(String value) {
            addCriterion("event_date <", value, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateLessThanOrEqualTo(String value) {
            addCriterion("event_date <=", value, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateLike(String value) {
            addCriterion("event_date like", value, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateNotLike(String value) {
            addCriterion("event_date not like", value, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateIn(List<String> values) {
            addCriterion("event_date in", values, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateNotIn(List<String> values) {
            addCriterion("event_date not in", values, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateBetween(String value1, String value2) {
            addCriterion("event_date between", value1, value2, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateNotBetween(String value1, String value2) {
            addCriterion("event_date not between", value1, value2, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventTimeIsNull() {
            addCriterion("event_time is null");
            return (Criteria) this;
        }

        public Criteria andEventTimeIsNotNull() {
            addCriterion("event_time is not null");
            return (Criteria) this;
        }

        public Criteria andEventTimeEqualTo(String value) {
            addCriterion("event_time =", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeNotEqualTo(String value) {
            addCriterion("event_time <>", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeGreaterThan(String value) {
            addCriterion("event_time >", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeGreaterThanOrEqualTo(String value) {
            addCriterion("event_time >=", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeLessThan(String value) {
            addCriterion("event_time <", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeLessThanOrEqualTo(String value) {
            addCriterion("event_time <=", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeLike(String value) {
            addCriterion("event_time like", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeNotLike(String value) {
            addCriterion("event_time not like", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeIn(List<String> values) {
            addCriterion("event_time in", values, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeNotIn(List<String> values) {
            addCriterion("event_time not in", values, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeBetween(String value1, String value2) {
            addCriterion("event_time between", value1, value2, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeNotBetween(String value1, String value2) {
            addCriterion("event_time not between", value1, value2, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventLocationIsNull() {
            addCriterion("event_location is null");
            return (Criteria) this;
        }

        public Criteria andEventLocationIsNotNull() {
            addCriterion("event_location is not null");
            return (Criteria) this;
        }

        public Criteria andEventLocationEqualTo(String value) {
            addCriterion("event_location =", value, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationNotEqualTo(String value) {
            addCriterion("event_location <>", value, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationGreaterThan(String value) {
            addCriterion("event_location >", value, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationGreaterThanOrEqualTo(String value) {
            addCriterion("event_location >=", value, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationLessThan(String value) {
            addCriterion("event_location <", value, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationLessThanOrEqualTo(String value) {
            addCriterion("event_location <=", value, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationLike(String value) {
            addCriterion("event_location like", value, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationNotLike(String value) {
            addCriterion("event_location not like", value, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationIn(List<String> values) {
            addCriterion("event_location in", values, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationNotIn(List<String> values) {
            addCriterion("event_location not in", values, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationBetween(String value1, String value2) {
            addCriterion("event_location between", value1, value2, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationNotBetween(String value1, String value2) {
            addCriterion("event_location not between", value1, value2, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventImgIsNull() {
            addCriterion("event_img is null");
            return (Criteria) this;
        }

        public Criteria andEventImgIsNotNull() {
            addCriterion("event_img is not null");
            return (Criteria) this;
        }

        public Criteria andEventImgEqualTo(String value) {
            addCriterion("event_img =", value, "eventImg");
            return (Criteria) this;
        }

        public Criteria andEventImgNotEqualTo(String value) {
            addCriterion("event_img <>", value, "eventImg");
            return (Criteria) this;
        }

        public Criteria andEventImgGreaterThan(String value) {
            addCriterion("event_img >", value, "eventImg");
            return (Criteria) this;
        }

        public Criteria andEventImgGreaterThanOrEqualTo(String value) {
            addCriterion("event_img >=", value, "eventImg");
            return (Criteria) this;
        }

        public Criteria andEventImgLessThan(String value) {
            addCriterion("event_img <", value, "eventImg");
            return (Criteria) this;
        }

        public Criteria andEventImgLessThanOrEqualTo(String value) {
            addCriterion("event_img <=", value, "eventImg");
            return (Criteria) this;
        }

        public Criteria andEventImgLike(String value) {
            addCriterion("event_img like", value, "eventImg");
            return (Criteria) this;
        }

        public Criteria andEventImgNotLike(String value) {
            addCriterion("event_img not like", value, "eventImg");
            return (Criteria) this;
        }

        public Criteria andEventImgIn(List<String> values) {
            addCriterion("event_img in", values, "eventImg");
            return (Criteria) this;
        }

        public Criteria andEventImgNotIn(List<String> values) {
            addCriterion("event_img not in", values, "eventImg");
            return (Criteria) this;
        }

        public Criteria andEventImgBetween(String value1, String value2) {
            addCriterion("event_img between", value1, value2, "eventImg");
            return (Criteria) this;
        }

        public Criteria andEventImgNotBetween(String value1, String value2) {
            addCriterion("event_img not between", value1, value2, "eventImg");
            return (Criteria) this;
        }

        public Criteria andEventTitleIsNull() {
            addCriterion("event_title is null");
            return (Criteria) this;
        }

        public Criteria andEventTitleIsNotNull() {
            addCriterion("event_title is not null");
            return (Criteria) this;
        }

        public Criteria andEventTitleEqualTo(String value) {
            addCriterion("event_title =", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleNotEqualTo(String value) {
            addCriterion("event_title <>", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleGreaterThan(String value) {
            addCriterion("event_title >", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleGreaterThanOrEqualTo(String value) {
            addCriterion("event_title >=", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleLessThan(String value) {
            addCriterion("event_title <", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleLessThanOrEqualTo(String value) {
            addCriterion("event_title <=", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleLike(String value) {
            addCriterion("event_title like", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleNotLike(String value) {
            addCriterion("event_title not like", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleIn(List<String> values) {
            addCriterion("event_title in", values, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleNotIn(List<String> values) {
            addCriterion("event_title not in", values, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleBetween(String value1, String value2) {
            addCriterion("event_title between", value1, value2, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleNotBetween(String value1, String value2) {
            addCriterion("event_title not between", value1, value2, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventContentIsNull() {
            addCriterion("event_content is null");
            return (Criteria) this;
        }

        public Criteria andEventContentIsNotNull() {
            addCriterion("event_content is not null");
            return (Criteria) this;
        }

        public Criteria andEventContentEqualTo(String value) {
            addCriterion("event_content =", value, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentNotEqualTo(String value) {
            addCriterion("event_content <>", value, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentGreaterThan(String value) {
            addCriterion("event_content >", value, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentGreaterThanOrEqualTo(String value) {
            addCriterion("event_content >=", value, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentLessThan(String value) {
            addCriterion("event_content <", value, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentLessThanOrEqualTo(String value) {
            addCriterion("event_content <=", value, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentLike(String value) {
            addCriterion("event_content like", value, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentNotLike(String value) {
            addCriterion("event_content not like", value, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentIn(List<String> values) {
            addCriterion("event_content in", values, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentNotIn(List<String> values) {
            addCriterion("event_content not in", values, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentBetween(String value1, String value2) {
            addCriterion("event_content between", value1, value2, "eventContent");
            return (Criteria) this;
        }

        public Criteria andEventContentNotBetween(String value1, String value2) {
            addCriterion("event_content not between", value1, value2, "eventContent");
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
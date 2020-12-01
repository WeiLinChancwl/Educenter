package net.william.educenter.entity;

import java.util.ArrayList;
import java.util.List;

public class NewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewExample() {
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

        public Criteria andNewIdIsNull() {
            addCriterion("new_id is null");
            return (Criteria) this;
        }

        public Criteria andNewIdIsNotNull() {
            addCriterion("new_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewIdEqualTo(Integer value) {
            addCriterion("new_id =", value, "newId");
            return (Criteria) this;
        }

        public Criteria andNewIdNotEqualTo(Integer value) {
            addCriterion("new_id <>", value, "newId");
            return (Criteria) this;
        }

        public Criteria andNewIdGreaterThan(Integer value) {
            addCriterion("new_id >", value, "newId");
            return (Criteria) this;
        }

        public Criteria andNewIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_id >=", value, "newId");
            return (Criteria) this;
        }

        public Criteria andNewIdLessThan(Integer value) {
            addCriterion("new_id <", value, "newId");
            return (Criteria) this;
        }

        public Criteria andNewIdLessThanOrEqualTo(Integer value) {
            addCriterion("new_id <=", value, "newId");
            return (Criteria) this;
        }

        public Criteria andNewIdIn(List<Integer> values) {
            addCriterion("new_id in", values, "newId");
            return (Criteria) this;
        }

        public Criteria andNewIdNotIn(List<Integer> values) {
            addCriterion("new_id not in", values, "newId");
            return (Criteria) this;
        }

        public Criteria andNewIdBetween(Integer value1, Integer value2) {
            addCriterion("new_id between", value1, value2, "newId");
            return (Criteria) this;
        }

        public Criteria andNewIdNotBetween(Integer value1, Integer value2) {
            addCriterion("new_id not between", value1, value2, "newId");
            return (Criteria) this;
        }

        public Criteria andNewTitleIsNull() {
            addCriterion("new_title is null");
            return (Criteria) this;
        }

        public Criteria andNewTitleIsNotNull() {
            addCriterion("new_title is not null");
            return (Criteria) this;
        }

        public Criteria andNewTitleEqualTo(String value) {
            addCriterion("new_title =", value, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleNotEqualTo(String value) {
            addCriterion("new_title <>", value, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleGreaterThan(String value) {
            addCriterion("new_title >", value, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleGreaterThanOrEqualTo(String value) {
            addCriterion("new_title >=", value, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleLessThan(String value) {
            addCriterion("new_title <", value, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleLessThanOrEqualTo(String value) {
            addCriterion("new_title <=", value, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleLike(String value) {
            addCriterion("new_title like", value, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleNotLike(String value) {
            addCriterion("new_title not like", value, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleIn(List<String> values) {
            addCriterion("new_title in", values, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleNotIn(List<String> values) {
            addCriterion("new_title not in", values, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleBetween(String value1, String value2) {
            addCriterion("new_title between", value1, value2, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleNotBetween(String value1, String value2) {
            addCriterion("new_title not between", value1, value2, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTimeIsNull() {
            addCriterion("new_time is null");
            return (Criteria) this;
        }

        public Criteria andNewTimeIsNotNull() {
            addCriterion("new_time is not null");
            return (Criteria) this;
        }

        public Criteria andNewTimeEqualTo(String value) {
            addCriterion("new_time =", value, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeNotEqualTo(String value) {
            addCriterion("new_time <>", value, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeGreaterThan(String value) {
            addCriterion("new_time >", value, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeGreaterThanOrEqualTo(String value) {
            addCriterion("new_time >=", value, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeLessThan(String value) {
            addCriterion("new_time <", value, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeLessThanOrEqualTo(String value) {
            addCriterion("new_time <=", value, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeLike(String value) {
            addCriterion("new_time like", value, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeNotLike(String value) {
            addCriterion("new_time not like", value, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeIn(List<String> values) {
            addCriterion("new_time in", values, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeNotIn(List<String> values) {
            addCriterion("new_time not in", values, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeBetween(String value1, String value2) {
            addCriterion("new_time between", value1, value2, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewTimeNotBetween(String value1, String value2) {
            addCriterion("new_time not between", value1, value2, "newTime");
            return (Criteria) this;
        }

        public Criteria andNewFromIsNull() {
            addCriterion("new_from is null");
            return (Criteria) this;
        }

        public Criteria andNewFromIsNotNull() {
            addCriterion("new_from is not null");
            return (Criteria) this;
        }

        public Criteria andNewFromEqualTo(String value) {
            addCriterion("new_from =", value, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromNotEqualTo(String value) {
            addCriterion("new_from <>", value, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromGreaterThan(String value) {
            addCriterion("new_from >", value, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromGreaterThanOrEqualTo(String value) {
            addCriterion("new_from >=", value, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromLessThan(String value) {
            addCriterion("new_from <", value, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromLessThanOrEqualTo(String value) {
            addCriterion("new_from <=", value, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromLike(String value) {
            addCriterion("new_from like", value, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromNotLike(String value) {
            addCriterion("new_from not like", value, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromIn(List<String> values) {
            addCriterion("new_from in", values, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromNotIn(List<String> values) {
            addCriterion("new_from not in", values, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromBetween(String value1, String value2) {
            addCriterion("new_from between", value1, value2, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromNotBetween(String value1, String value2) {
            addCriterion("new_from not between", value1, value2, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewWriterIsNull() {
            addCriterion("new_writer is null");
            return (Criteria) this;
        }

        public Criteria andNewWriterIsNotNull() {
            addCriterion("new_writer is not null");
            return (Criteria) this;
        }

        public Criteria andNewWriterEqualTo(String value) {
            addCriterion("new_writer =", value, "newWriter");
            return (Criteria) this;
        }

        public Criteria andNewWriterNotEqualTo(String value) {
            addCriterion("new_writer <>", value, "newWriter");
            return (Criteria) this;
        }

        public Criteria andNewWriterGreaterThan(String value) {
            addCriterion("new_writer >", value, "newWriter");
            return (Criteria) this;
        }

        public Criteria andNewWriterGreaterThanOrEqualTo(String value) {
            addCriterion("new_writer >=", value, "newWriter");
            return (Criteria) this;
        }

        public Criteria andNewWriterLessThan(String value) {
            addCriterion("new_writer <", value, "newWriter");
            return (Criteria) this;
        }

        public Criteria andNewWriterLessThanOrEqualTo(String value) {
            addCriterion("new_writer <=", value, "newWriter");
            return (Criteria) this;
        }

        public Criteria andNewWriterLike(String value) {
            addCriterion("new_writer like", value, "newWriter");
            return (Criteria) this;
        }

        public Criteria andNewWriterNotLike(String value) {
            addCriterion("new_writer not like", value, "newWriter");
            return (Criteria) this;
        }

        public Criteria andNewWriterIn(List<String> values) {
            addCriterion("new_writer in", values, "newWriter");
            return (Criteria) this;
        }

        public Criteria andNewWriterNotIn(List<String> values) {
            addCriterion("new_writer not in", values, "newWriter");
            return (Criteria) this;
        }

        public Criteria andNewWriterBetween(String value1, String value2) {
            addCriterion("new_writer between", value1, value2, "newWriter");
            return (Criteria) this;
        }

        public Criteria andNewWriterNotBetween(String value1, String value2) {
            addCriterion("new_writer not between", value1, value2, "newWriter");
            return (Criteria) this;
        }

        public Criteria andNewImgIsNull() {
            addCriterion("new_img is null");
            return (Criteria) this;
        }

        public Criteria andNewImgIsNotNull() {
            addCriterion("new_img is not null");
            return (Criteria) this;
        }

        public Criteria andNewImgEqualTo(String value) {
            addCriterion("new_img =", value, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgNotEqualTo(String value) {
            addCriterion("new_img <>", value, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgGreaterThan(String value) {
            addCriterion("new_img >", value, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgGreaterThanOrEqualTo(String value) {
            addCriterion("new_img >=", value, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgLessThan(String value) {
            addCriterion("new_img <", value, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgLessThanOrEqualTo(String value) {
            addCriterion("new_img <=", value, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgLike(String value) {
            addCriterion("new_img like", value, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgNotLike(String value) {
            addCriterion("new_img not like", value, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgIn(List<String> values) {
            addCriterion("new_img in", values, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgNotIn(List<String> values) {
            addCriterion("new_img not in", values, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgBetween(String value1, String value2) {
            addCriterion("new_img between", value1, value2, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgNotBetween(String value1, String value2) {
            addCriterion("new_img not between", value1, value2, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewTypeIsNull() {
            addCriterion("new_type is null");
            return (Criteria) this;
        }

        public Criteria andNewTypeIsNotNull() {
            addCriterion("new_type is not null");
            return (Criteria) this;
        }

        public Criteria andNewTypeEqualTo(String value) {
            addCriterion("new_type =", value, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeNotEqualTo(String value) {
            addCriterion("new_type <>", value, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeGreaterThan(String value) {
            addCriterion("new_type >", value, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeGreaterThanOrEqualTo(String value) {
            addCriterion("new_type >=", value, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeLessThan(String value) {
            addCriterion("new_type <", value, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeLessThanOrEqualTo(String value) {
            addCriterion("new_type <=", value, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeLike(String value) {
            addCriterion("new_type like", value, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeNotLike(String value) {
            addCriterion("new_type not like", value, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeIn(List<String> values) {
            addCriterion("new_type in", values, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeNotIn(List<String> values) {
            addCriterion("new_type not in", values, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeBetween(String value1, String value2) {
            addCriterion("new_type between", value1, value2, "newType");
            return (Criteria) this;
        }

        public Criteria andNewTypeNotBetween(String value1, String value2) {
            addCriterion("new_type not between", value1, value2, "newType");
            return (Criteria) this;
        }

        public Criteria andNewContentIsNull() {
            addCriterion("new_content is null");
            return (Criteria) this;
        }

        public Criteria andNewContentIsNotNull() {
            addCriterion("new_content is not null");
            return (Criteria) this;
        }

        public Criteria andNewContentEqualTo(String value) {
            addCriterion("new_content =", value, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentNotEqualTo(String value) {
            addCriterion("new_content <>", value, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentGreaterThan(String value) {
            addCriterion("new_content >", value, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentGreaterThanOrEqualTo(String value) {
            addCriterion("new_content >=", value, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentLessThan(String value) {
            addCriterion("new_content <", value, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentLessThanOrEqualTo(String value) {
            addCriterion("new_content <=", value, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentLike(String value) {
            addCriterion("new_content like", value, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentNotLike(String value) {
            addCriterion("new_content not like", value, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentIn(List<String> values) {
            addCriterion("new_content in", values, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentNotIn(List<String> values) {
            addCriterion("new_content not in", values, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentBetween(String value1, String value2) {
            addCriterion("new_content between", value1, value2, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentNotBetween(String value1, String value2) {
            addCriterion("new_content not between", value1, value2, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewCnIsNull() {
            addCriterion("new_cn is null");
            return (Criteria) this;
        }

        public Criteria andNewCnIsNotNull() {
            addCriterion("new_cn is not null");
            return (Criteria) this;
        }

        public Criteria andNewCnEqualTo(String value) {
            addCriterion("new_cn =", value, "newCn");
            return (Criteria) this;
        }

        public Criteria andNewCnNotEqualTo(String value) {
            addCriterion("new_cn <>", value, "newCn");
            return (Criteria) this;
        }

        public Criteria andNewCnGreaterThan(String value) {
            addCriterion("new_cn >", value, "newCn");
            return (Criteria) this;
        }

        public Criteria andNewCnGreaterThanOrEqualTo(String value) {
            addCriterion("new_cn >=", value, "newCn");
            return (Criteria) this;
        }

        public Criteria andNewCnLessThan(String value) {
            addCriterion("new_cn <", value, "newCn");
            return (Criteria) this;
        }

        public Criteria andNewCnLessThanOrEqualTo(String value) {
            addCriterion("new_cn <=", value, "newCn");
            return (Criteria) this;
        }

        public Criteria andNewCnLike(String value) {
            addCriterion("new_cn like", value, "newCn");
            return (Criteria) this;
        }

        public Criteria andNewCnNotLike(String value) {
            addCriterion("new_cn not like", value, "newCn");
            return (Criteria) this;
        }

        public Criteria andNewCnIn(List<String> values) {
            addCriterion("new_cn in", values, "newCn");
            return (Criteria) this;
        }

        public Criteria andNewCnNotIn(List<String> values) {
            addCriterion("new_cn not in", values, "newCn");
            return (Criteria) this;
        }

        public Criteria andNewCnBetween(String value1, String value2) {
            addCriterion("new_cn between", value1, value2, "newCn");
            return (Criteria) this;
        }

        public Criteria andNewCnNotBetween(String value1, String value2) {
            addCriterion("new_cn not between", value1, value2, "newCn");
            return (Criteria) this;
        }

        public Criteria andNewEnIsNull() {
            addCriterion("new_en is null");
            return (Criteria) this;
        }

        public Criteria andNewEnIsNotNull() {
            addCriterion("new_en is not null");
            return (Criteria) this;
        }

        public Criteria andNewEnEqualTo(String value) {
            addCriterion("new_en =", value, "newEn");
            return (Criteria) this;
        }

        public Criteria andNewEnNotEqualTo(String value) {
            addCriterion("new_en <>", value, "newEn");
            return (Criteria) this;
        }

        public Criteria andNewEnGreaterThan(String value) {
            addCriterion("new_en >", value, "newEn");
            return (Criteria) this;
        }

        public Criteria andNewEnGreaterThanOrEqualTo(String value) {
            addCriterion("new_en >=", value, "newEn");
            return (Criteria) this;
        }

        public Criteria andNewEnLessThan(String value) {
            addCriterion("new_en <", value, "newEn");
            return (Criteria) this;
        }

        public Criteria andNewEnLessThanOrEqualTo(String value) {
            addCriterion("new_en <=", value, "newEn");
            return (Criteria) this;
        }

        public Criteria andNewEnLike(String value) {
            addCriterion("new_en like", value, "newEn");
            return (Criteria) this;
        }

        public Criteria andNewEnNotLike(String value) {
            addCriterion("new_en not like", value, "newEn");
            return (Criteria) this;
        }

        public Criteria andNewEnIn(List<String> values) {
            addCriterion("new_en in", values, "newEn");
            return (Criteria) this;
        }

        public Criteria andNewEnNotIn(List<String> values) {
            addCriterion("new_en not in", values, "newEn");
            return (Criteria) this;
        }

        public Criteria andNewEnBetween(String value1, String value2) {
            addCriterion("new_en between", value1, value2, "newEn");
            return (Criteria) this;
        }

        public Criteria andNewEnNotBetween(String value1, String value2) {
            addCriterion("new_en not between", value1, value2, "newEn");
            return (Criteria) this;
        }

        public Criteria andNewTranslatorIsNull() {
            addCriterion("new_translator is null");
            return (Criteria) this;
        }

        public Criteria andNewTranslatorIsNotNull() {
            addCriterion("new_translator is not null");
            return (Criteria) this;
        }

        public Criteria andNewTranslatorEqualTo(String value) {
            addCriterion("new_translator =", value, "newTranslator");
            return (Criteria) this;
        }

        public Criteria andNewTranslatorNotEqualTo(String value) {
            addCriterion("new_translator <>", value, "newTranslator");
            return (Criteria) this;
        }

        public Criteria andNewTranslatorGreaterThan(String value) {
            addCriterion("new_translator >", value, "newTranslator");
            return (Criteria) this;
        }

        public Criteria andNewTranslatorGreaterThanOrEqualTo(String value) {
            addCriterion("new_translator >=", value, "newTranslator");
            return (Criteria) this;
        }

        public Criteria andNewTranslatorLessThan(String value) {
            addCriterion("new_translator <", value, "newTranslator");
            return (Criteria) this;
        }

        public Criteria andNewTranslatorLessThanOrEqualTo(String value) {
            addCriterion("new_translator <=", value, "newTranslator");
            return (Criteria) this;
        }

        public Criteria andNewTranslatorLike(String value) {
            addCriterion("new_translator like", value, "newTranslator");
            return (Criteria) this;
        }

        public Criteria andNewTranslatorNotLike(String value) {
            addCriterion("new_translator not like", value, "newTranslator");
            return (Criteria) this;
        }

        public Criteria andNewTranslatorIn(List<String> values) {
            addCriterion("new_translator in", values, "newTranslator");
            return (Criteria) this;
        }

        public Criteria andNewTranslatorNotIn(List<String> values) {
            addCriterion("new_translator not in", values, "newTranslator");
            return (Criteria) this;
        }

        public Criteria andNewTranslatorBetween(String value1, String value2) {
            addCriterion("new_translator between", value1, value2, "newTranslator");
            return (Criteria) this;
        }

        public Criteria andNewTranslatorNotBetween(String value1, String value2) {
            addCriterion("new_translator not between", value1, value2, "newTranslator");
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
package net.william.educenter.entity;

import java.util.ArrayList;
import java.util.List;

public class ProblemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProblemExample() {
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

        public Criteria andProblemIdIsNull() {
            addCriterion("problem_id is null");
            return (Criteria) this;
        }

        public Criteria andProblemIdIsNotNull() {
            addCriterion("problem_id is not null");
            return (Criteria) this;
        }

        public Criteria andProblemIdEqualTo(Integer value) {
            addCriterion("problem_id =", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotEqualTo(Integer value) {
            addCriterion("problem_id <>", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdGreaterThan(Integer value) {
            addCriterion("problem_id >", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("problem_id >=", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdLessThan(Integer value) {
            addCriterion("problem_id <", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdLessThanOrEqualTo(Integer value) {
            addCriterion("problem_id <=", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdIn(List<Integer> values) {
            addCriterion("problem_id in", values, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotIn(List<Integer> values) {
            addCriterion("problem_id not in", values, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdBetween(Integer value1, Integer value2) {
            addCriterion("problem_id between", value1, value2, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("problem_id not between", value1, value2, "problemId");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNull() {
            addCriterion("question is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNotNull() {
            addCriterion("question is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionEqualTo(String value) {
            addCriterion("question =", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotEqualTo(String value) {
            addCriterion("question <>", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThan(String value) {
            addCriterion("question >", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("question >=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThan(String value) {
            addCriterion("question <", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThanOrEqualTo(String value) {
            addCriterion("question <=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLike(String value) {
            addCriterion("question like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotLike(String value) {
            addCriterion("question not like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionIn(List<String> values) {
            addCriterion("question in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotIn(List<String> values) {
            addCriterion("question not in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionBetween(String value1, String value2) {
            addCriterion("question between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotBetween(String value1, String value2) {
            addCriterion("question not between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andAnsweraIsNull() {
            addCriterion("answerA is null");
            return (Criteria) this;
        }

        public Criteria andAnsweraIsNotNull() {
            addCriterion("answerA is not null");
            return (Criteria) this;
        }

        public Criteria andAnsweraEqualTo(String value) {
            addCriterion("answerA =", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraNotEqualTo(String value) {
            addCriterion("answerA <>", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraGreaterThan(String value) {
            addCriterion("answerA >", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraGreaterThanOrEqualTo(String value) {
            addCriterion("answerA >=", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraLessThan(String value) {
            addCriterion("answerA <", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraLessThanOrEqualTo(String value) {
            addCriterion("answerA <=", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraLike(String value) {
            addCriterion("answerA like", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraNotLike(String value) {
            addCriterion("answerA not like", value, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraIn(List<String> values) {
            addCriterion("answerA in", values, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraNotIn(List<String> values) {
            addCriterion("answerA not in", values, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraBetween(String value1, String value2) {
            addCriterion("answerA between", value1, value2, "answera");
            return (Criteria) this;
        }

        public Criteria andAnsweraNotBetween(String value1, String value2) {
            addCriterion("answerA not between", value1, value2, "answera");
            return (Criteria) this;
        }

        public Criteria andAnswerbIsNull() {
            addCriterion("answerB is null");
            return (Criteria) this;
        }

        public Criteria andAnswerbIsNotNull() {
            addCriterion("answerB is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerbEqualTo(String value) {
            addCriterion("answerB =", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbNotEqualTo(String value) {
            addCriterion("answerB <>", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbGreaterThan(String value) {
            addCriterion("answerB >", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbGreaterThanOrEqualTo(String value) {
            addCriterion("answerB >=", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbLessThan(String value) {
            addCriterion("answerB <", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbLessThanOrEqualTo(String value) {
            addCriterion("answerB <=", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbLike(String value) {
            addCriterion("answerB like", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbNotLike(String value) {
            addCriterion("answerB not like", value, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbIn(List<String> values) {
            addCriterion("answerB in", values, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbNotIn(List<String> values) {
            addCriterion("answerB not in", values, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbBetween(String value1, String value2) {
            addCriterion("answerB between", value1, value2, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswerbNotBetween(String value1, String value2) {
            addCriterion("answerB not between", value1, value2, "answerb");
            return (Criteria) this;
        }

        public Criteria andAnswercIsNull() {
            addCriterion("answerC is null");
            return (Criteria) this;
        }

        public Criteria andAnswercIsNotNull() {
            addCriterion("answerC is not null");
            return (Criteria) this;
        }

        public Criteria andAnswercEqualTo(String value) {
            addCriterion("answerC =", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercNotEqualTo(String value) {
            addCriterion("answerC <>", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercGreaterThan(String value) {
            addCriterion("answerC >", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercGreaterThanOrEqualTo(String value) {
            addCriterion("answerC >=", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercLessThan(String value) {
            addCriterion("answerC <", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercLessThanOrEqualTo(String value) {
            addCriterion("answerC <=", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercLike(String value) {
            addCriterion("answerC like", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercNotLike(String value) {
            addCriterion("answerC not like", value, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercIn(List<String> values) {
            addCriterion("answerC in", values, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercNotIn(List<String> values) {
            addCriterion("answerC not in", values, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercBetween(String value1, String value2) {
            addCriterion("answerC between", value1, value2, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswercNotBetween(String value1, String value2) {
            addCriterion("answerC not between", value1, value2, "answerc");
            return (Criteria) this;
        }

        public Criteria andAnswerdIsNull() {
            addCriterion("answerD is null");
            return (Criteria) this;
        }

        public Criteria andAnswerdIsNotNull() {
            addCriterion("answerD is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerdEqualTo(String value) {
            addCriterion("answerD =", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdNotEqualTo(String value) {
            addCriterion("answerD <>", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdGreaterThan(String value) {
            addCriterion("answerD >", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdGreaterThanOrEqualTo(String value) {
            addCriterion("answerD >=", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdLessThan(String value) {
            addCriterion("answerD <", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdLessThanOrEqualTo(String value) {
            addCriterion("answerD <=", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdLike(String value) {
            addCriterion("answerD like", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdNotLike(String value) {
            addCriterion("answerD not like", value, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdIn(List<String> values) {
            addCriterion("answerD in", values, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdNotIn(List<String> values) {
            addCriterion("answerD not in", values, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdBetween(String value1, String value2) {
            addCriterion("answerD between", value1, value2, "answerd");
            return (Criteria) this;
        }

        public Criteria andAnswerdNotBetween(String value1, String value2) {
            addCriterion("answerD not between", value1, value2, "answerd");
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
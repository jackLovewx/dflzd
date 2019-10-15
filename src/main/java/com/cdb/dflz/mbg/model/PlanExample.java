package com.cdb.dflz.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlanExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCyclenumIsNull() {
            addCriterion("cycleNum is null");
            return (Criteria) this;
        }

        public Criteria andCyclenumIsNotNull() {
            addCriterion("cycleNum is not null");
            return (Criteria) this;
        }

        public Criteria andCyclenumEqualTo(String value) {
            addCriterion("cycleNum =", value, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andCyclenumNotEqualTo(String value) {
            addCriterion("cycleNum <>", value, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andCyclenumGreaterThan(String value) {
            addCriterion("cycleNum >", value, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andCyclenumGreaterThanOrEqualTo(String value) {
            addCriterion("cycleNum >=", value, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andCyclenumLessThan(String value) {
            addCriterion("cycleNum <", value, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andCyclenumLessThanOrEqualTo(String value) {
            addCriterion("cycleNum <=", value, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andCyclenumLike(String value) {
            addCriterion("cycleNum like", value, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andCyclenumNotLike(String value) {
            addCriterion("cycleNum not like", value, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andCyclenumIn(List<String> values) {
            addCriterion("cycleNum in", values, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andCyclenumNotIn(List<String> values) {
            addCriterion("cycleNum not in", values, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andCyclenumBetween(String value1, String value2) {
            addCriterion("cycleNum between", value1, value2, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andCyclenumNotBetween(String value1, String value2) {
            addCriterion("cycleNum not between", value1, value2, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidsIsNull() {
            addCriterion("knowledgeIds is null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidsIsNotNull() {
            addCriterion("knowledgeIds is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidsEqualTo(String value) {
            addCriterion("knowledgeIds =", value, "knowledgeids");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidsNotEqualTo(String value) {
            addCriterion("knowledgeIds <>", value, "knowledgeids");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidsGreaterThan(String value) {
            addCriterion("knowledgeIds >", value, "knowledgeids");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidsGreaterThanOrEqualTo(String value) {
            addCriterion("knowledgeIds >=", value, "knowledgeids");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidsLessThan(String value) {
            addCriterion("knowledgeIds <", value, "knowledgeids");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidsLessThanOrEqualTo(String value) {
            addCriterion("knowledgeIds <=", value, "knowledgeids");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidsLike(String value) {
            addCriterion("knowledgeIds like", value, "knowledgeids");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidsNotLike(String value) {
            addCriterion("knowledgeIds not like", value, "knowledgeids");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidsIn(List<String> values) {
            addCriterion("knowledgeIds in", values, "knowledgeids");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidsNotIn(List<String> values) {
            addCriterion("knowledgeIds not in", values, "knowledgeids");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidsBetween(String value1, String value2) {
            addCriterion("knowledgeIds between", value1, value2, "knowledgeids");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidsNotBetween(String value1, String value2) {
            addCriterion("knowledgeIds not between", value1, value2, "knowledgeids");
            return (Criteria) this;
        }

        public Criteria andQuestionidsIsNull() {
            addCriterion("questionIds is null");
            return (Criteria) this;
        }

        public Criteria andQuestionidsIsNotNull() {
            addCriterion("questionIds is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionidsEqualTo(String value) {
            addCriterion("questionIds =", value, "questionids");
            return (Criteria) this;
        }

        public Criteria andQuestionidsNotEqualTo(String value) {
            addCriterion("questionIds <>", value, "questionids");
            return (Criteria) this;
        }

        public Criteria andQuestionidsGreaterThan(String value) {
            addCriterion("questionIds >", value, "questionids");
            return (Criteria) this;
        }

        public Criteria andQuestionidsGreaterThanOrEqualTo(String value) {
            addCriterion("questionIds >=", value, "questionids");
            return (Criteria) this;
        }

        public Criteria andQuestionidsLessThan(String value) {
            addCriterion("questionIds <", value, "questionids");
            return (Criteria) this;
        }

        public Criteria andQuestionidsLessThanOrEqualTo(String value) {
            addCriterion("questionIds <=", value, "questionids");
            return (Criteria) this;
        }

        public Criteria andQuestionidsLike(String value) {
            addCriterion("questionIds like", value, "questionids");
            return (Criteria) this;
        }

        public Criteria andQuestionidsNotLike(String value) {
            addCriterion("questionIds not like", value, "questionids");
            return (Criteria) this;
        }

        public Criteria andQuestionidsIn(List<String> values) {
            addCriterion("questionIds in", values, "questionids");
            return (Criteria) this;
        }

        public Criteria andQuestionidsNotIn(List<String> values) {
            addCriterion("questionIds not in", values, "questionids");
            return (Criteria) this;
        }

        public Criteria andQuestionidsBetween(String value1, String value2) {
            addCriterion("questionIds between", value1, value2, "questionids");
            return (Criteria) this;
        }

        public Criteria andQuestionidsNotBetween(String value1, String value2) {
            addCriterion("questionIds not between", value1, value2, "questionids");
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
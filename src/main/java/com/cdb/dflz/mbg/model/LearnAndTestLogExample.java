package com.cdb.dflz.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LearnAndTestLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LearnAndTestLogExample() {
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

        public Criteria andCyclenumIsNull() {
            addCriterion("cycleNum is null");
            return (Criteria) this;
        }

        public Criteria andCyclenumIsNotNull() {
            addCriterion("cycleNum is not null");
            return (Criteria) this;
        }

        public Criteria andCyclenumEqualTo(Integer value) {
            addCriterion("cycleNum =", value, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andCyclenumNotEqualTo(Integer value) {
            addCriterion("cycleNum <>", value, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andCyclenumGreaterThan(Integer value) {
            addCriterion("cycleNum >", value, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andCyclenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cycleNum >=", value, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andCyclenumLessThan(Integer value) {
            addCriterion("cycleNum <", value, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andCyclenumLessThanOrEqualTo(Integer value) {
            addCriterion("cycleNum <=", value, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andCyclenumIn(List<Integer> values) {
            addCriterion("cycleNum in", values, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andCyclenumNotIn(List<Integer> values) {
            addCriterion("cycleNum not in", values, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andCyclenumBetween(Integer value1, Integer value2) {
            addCriterion("cycleNum between", value1, value2, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andCyclenumNotBetween(Integer value1, Integer value2) {
            addCriterion("cycleNum not between", value1, value2, "cyclenum");
            return (Criteria) this;
        }

        public Criteria andMonlearnstatusIsNull() {
            addCriterion("monLearnStatus is null");
            return (Criteria) this;
        }

        public Criteria andMonlearnstatusIsNotNull() {
            addCriterion("monLearnStatus is not null");
            return (Criteria) this;
        }

        public Criteria andMonlearnstatusEqualTo(Integer value) {
            addCriterion("monLearnStatus =", value, "monlearnstatus");
            return (Criteria) this;
        }

        public Criteria andMonlearnstatusNotEqualTo(Integer value) {
            addCriterion("monLearnStatus <>", value, "monlearnstatus");
            return (Criteria) this;
        }

        public Criteria andMonlearnstatusGreaterThan(Integer value) {
            addCriterion("monLearnStatus >", value, "monlearnstatus");
            return (Criteria) this;
        }

        public Criteria andMonlearnstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("monLearnStatus >=", value, "monlearnstatus");
            return (Criteria) this;
        }

        public Criteria andMonlearnstatusLessThan(Integer value) {
            addCriterion("monLearnStatus <", value, "monlearnstatus");
            return (Criteria) this;
        }

        public Criteria andMonlearnstatusLessThanOrEqualTo(Integer value) {
            addCriterion("monLearnStatus <=", value, "monlearnstatus");
            return (Criteria) this;
        }

        public Criteria andMonlearnstatusIn(List<Integer> values) {
            addCriterion("monLearnStatus in", values, "monlearnstatus");
            return (Criteria) this;
        }

        public Criteria andMonlearnstatusNotIn(List<Integer> values) {
            addCriterion("monLearnStatus not in", values, "monlearnstatus");
            return (Criteria) this;
        }

        public Criteria andMonlearnstatusBetween(Integer value1, Integer value2) {
            addCriterion("monLearnStatus between", value1, value2, "monlearnstatus");
            return (Criteria) this;
        }

        public Criteria andMonlearnstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("monLearnStatus not between", value1, value2, "monlearnstatus");
            return (Criteria) this;
        }

        public Criteria andTueslearnstatusIsNull() {
            addCriterion("tuesLearnStatus is null");
            return (Criteria) this;
        }

        public Criteria andTueslearnstatusIsNotNull() {
            addCriterion("tuesLearnStatus is not null");
            return (Criteria) this;
        }

        public Criteria andTueslearnstatusEqualTo(Integer value) {
            addCriterion("tuesLearnStatus =", value, "tueslearnstatus");
            return (Criteria) this;
        }

        public Criteria andTueslearnstatusNotEqualTo(Integer value) {
            addCriterion("tuesLearnStatus <>", value, "tueslearnstatus");
            return (Criteria) this;
        }

        public Criteria andTueslearnstatusGreaterThan(Integer value) {
            addCriterion("tuesLearnStatus >", value, "tueslearnstatus");
            return (Criteria) this;
        }

        public Criteria andTueslearnstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("tuesLearnStatus >=", value, "tueslearnstatus");
            return (Criteria) this;
        }

        public Criteria andTueslearnstatusLessThan(Integer value) {
            addCriterion("tuesLearnStatus <", value, "tueslearnstatus");
            return (Criteria) this;
        }

        public Criteria andTueslearnstatusLessThanOrEqualTo(Integer value) {
            addCriterion("tuesLearnStatus <=", value, "tueslearnstatus");
            return (Criteria) this;
        }

        public Criteria andTueslearnstatusIn(List<Integer> values) {
            addCriterion("tuesLearnStatus in", values, "tueslearnstatus");
            return (Criteria) this;
        }

        public Criteria andTueslearnstatusNotIn(List<Integer> values) {
            addCriterion("tuesLearnStatus not in", values, "tueslearnstatus");
            return (Criteria) this;
        }

        public Criteria andTueslearnstatusBetween(Integer value1, Integer value2) {
            addCriterion("tuesLearnStatus between", value1, value2, "tueslearnstatus");
            return (Criteria) this;
        }

        public Criteria andTueslearnstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("tuesLearnStatus not between", value1, value2, "tueslearnstatus");
            return (Criteria) this;
        }

        public Criteria andWedlearnstatusIsNull() {
            addCriterion("wedLearnStatus is null");
            return (Criteria) this;
        }

        public Criteria andWedlearnstatusIsNotNull() {
            addCriterion("wedLearnStatus is not null");
            return (Criteria) this;
        }

        public Criteria andWedlearnstatusEqualTo(Integer value) {
            addCriterion("wedLearnStatus =", value, "wedlearnstatus");
            return (Criteria) this;
        }

        public Criteria andWedlearnstatusNotEqualTo(Integer value) {
            addCriterion("wedLearnStatus <>", value, "wedlearnstatus");
            return (Criteria) this;
        }

        public Criteria andWedlearnstatusGreaterThan(Integer value) {
            addCriterion("wedLearnStatus >", value, "wedlearnstatus");
            return (Criteria) this;
        }

        public Criteria andWedlearnstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("wedLearnStatus >=", value, "wedlearnstatus");
            return (Criteria) this;
        }

        public Criteria andWedlearnstatusLessThan(Integer value) {
            addCriterion("wedLearnStatus <", value, "wedlearnstatus");
            return (Criteria) this;
        }

        public Criteria andWedlearnstatusLessThanOrEqualTo(Integer value) {
            addCriterion("wedLearnStatus <=", value, "wedlearnstatus");
            return (Criteria) this;
        }

        public Criteria andWedlearnstatusIn(List<Integer> values) {
            addCriterion("wedLearnStatus in", values, "wedlearnstatus");
            return (Criteria) this;
        }

        public Criteria andWedlearnstatusNotIn(List<Integer> values) {
            addCriterion("wedLearnStatus not in", values, "wedlearnstatus");
            return (Criteria) this;
        }

        public Criteria andWedlearnstatusBetween(Integer value1, Integer value2) {
            addCriterion("wedLearnStatus between", value1, value2, "wedlearnstatus");
            return (Criteria) this;
        }

        public Criteria andWedlearnstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("wedLearnStatus not between", value1, value2, "wedlearnstatus");
            return (Criteria) this;
        }

        public Criteria andThurlearnstatusIsNull() {
            addCriterion("thurLearnStatus is null");
            return (Criteria) this;
        }

        public Criteria andThurlearnstatusIsNotNull() {
            addCriterion("thurLearnStatus is not null");
            return (Criteria) this;
        }

        public Criteria andThurlearnstatusEqualTo(Integer value) {
            addCriterion("thurLearnStatus =", value, "thurlearnstatus");
            return (Criteria) this;
        }

        public Criteria andThurlearnstatusNotEqualTo(Integer value) {
            addCriterion("thurLearnStatus <>", value, "thurlearnstatus");
            return (Criteria) this;
        }

        public Criteria andThurlearnstatusGreaterThan(Integer value) {
            addCriterion("thurLearnStatus >", value, "thurlearnstatus");
            return (Criteria) this;
        }

        public Criteria andThurlearnstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("thurLearnStatus >=", value, "thurlearnstatus");
            return (Criteria) this;
        }

        public Criteria andThurlearnstatusLessThan(Integer value) {
            addCriterion("thurLearnStatus <", value, "thurlearnstatus");
            return (Criteria) this;
        }

        public Criteria andThurlearnstatusLessThanOrEqualTo(Integer value) {
            addCriterion("thurLearnStatus <=", value, "thurlearnstatus");
            return (Criteria) this;
        }

        public Criteria andThurlearnstatusIn(List<Integer> values) {
            addCriterion("thurLearnStatus in", values, "thurlearnstatus");
            return (Criteria) this;
        }

        public Criteria andThurlearnstatusNotIn(List<Integer> values) {
            addCriterion("thurLearnStatus not in", values, "thurlearnstatus");
            return (Criteria) this;
        }

        public Criteria andThurlearnstatusBetween(Integer value1, Integer value2) {
            addCriterion("thurLearnStatus between", value1, value2, "thurlearnstatus");
            return (Criteria) this;
        }

        public Criteria andThurlearnstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("thurLearnStatus not between", value1, value2, "thurlearnstatus");
            return (Criteria) this;
        }

        public Criteria andFrilearnstatusIsNull() {
            addCriterion("friLearnStatus is null");
            return (Criteria) this;
        }

        public Criteria andFrilearnstatusIsNotNull() {
            addCriterion("friLearnStatus is not null");
            return (Criteria) this;
        }

        public Criteria andFrilearnstatusEqualTo(Integer value) {
            addCriterion("friLearnStatus =", value, "frilearnstatus");
            return (Criteria) this;
        }

        public Criteria andFrilearnstatusNotEqualTo(Integer value) {
            addCriterion("friLearnStatus <>", value, "frilearnstatus");
            return (Criteria) this;
        }

        public Criteria andFrilearnstatusGreaterThan(Integer value) {
            addCriterion("friLearnStatus >", value, "frilearnstatus");
            return (Criteria) this;
        }

        public Criteria andFrilearnstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("friLearnStatus >=", value, "frilearnstatus");
            return (Criteria) this;
        }

        public Criteria andFrilearnstatusLessThan(Integer value) {
            addCriterion("friLearnStatus <", value, "frilearnstatus");
            return (Criteria) this;
        }

        public Criteria andFrilearnstatusLessThanOrEqualTo(Integer value) {
            addCriterion("friLearnStatus <=", value, "frilearnstatus");
            return (Criteria) this;
        }

        public Criteria andFrilearnstatusIn(List<Integer> values) {
            addCriterion("friLearnStatus in", values, "frilearnstatus");
            return (Criteria) this;
        }

        public Criteria andFrilearnstatusNotIn(List<Integer> values) {
            addCriterion("friLearnStatus not in", values, "frilearnstatus");
            return (Criteria) this;
        }

        public Criteria andFrilearnstatusBetween(Integer value1, Integer value2) {
            addCriterion("friLearnStatus between", value1, value2, "frilearnstatus");
            return (Criteria) this;
        }

        public Criteria andFrilearnstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("friLearnStatus not between", value1, value2, "frilearnstatus");
            return (Criteria) this;
        }

        public Criteria andLearnrateIsNull() {
            addCriterion("learnRate is null");
            return (Criteria) this;
        }

        public Criteria andLearnrateIsNotNull() {
            addCriterion("learnRate is not null");
            return (Criteria) this;
        }

        public Criteria andLearnrateEqualTo(Float value) {
            addCriterion("learnRate =", value, "learnrate");
            return (Criteria) this;
        }

        public Criteria andLearnrateNotEqualTo(Float value) {
            addCriterion("learnRate <>", value, "learnrate");
            return (Criteria) this;
        }

        public Criteria andLearnrateGreaterThan(Float value) {
            addCriterion("learnRate >", value, "learnrate");
            return (Criteria) this;
        }

        public Criteria andLearnrateGreaterThanOrEqualTo(Float value) {
            addCriterion("learnRate >=", value, "learnrate");
            return (Criteria) this;
        }

        public Criteria andLearnrateLessThan(Float value) {
            addCriterion("learnRate <", value, "learnrate");
            return (Criteria) this;
        }

        public Criteria andLearnrateLessThanOrEqualTo(Float value) {
            addCriterion("learnRate <=", value, "learnrate");
            return (Criteria) this;
        }

        public Criteria andLearnrateIn(List<Float> values) {
            addCriterion("learnRate in", values, "learnrate");
            return (Criteria) this;
        }

        public Criteria andLearnrateNotIn(List<Float> values) {
            addCriterion("learnRate not in", values, "learnrate");
            return (Criteria) this;
        }

        public Criteria andLearnrateBetween(Float value1, Float value2) {
            addCriterion("learnRate between", value1, value2, "learnrate");
            return (Criteria) this;
        }

        public Criteria andLearnrateNotBetween(Float value1, Float value2) {
            addCriterion("learnRate not between", value1, value2, "learnrate");
            return (Criteria) this;
        }

        public Criteria andMonteststatusIsNull() {
            addCriterion("monTestStatus is null");
            return (Criteria) this;
        }

        public Criteria andMonteststatusIsNotNull() {
            addCriterion("monTestStatus is not null");
            return (Criteria) this;
        }

        public Criteria andMonteststatusEqualTo(Integer value) {
            addCriterion("monTestStatus =", value, "monteststatus");
            return (Criteria) this;
        }

        public Criteria andMonteststatusNotEqualTo(Integer value) {
            addCriterion("monTestStatus <>", value, "monteststatus");
            return (Criteria) this;
        }

        public Criteria andMonteststatusGreaterThan(Integer value) {
            addCriterion("monTestStatus >", value, "monteststatus");
            return (Criteria) this;
        }

        public Criteria andMonteststatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("monTestStatus >=", value, "monteststatus");
            return (Criteria) this;
        }

        public Criteria andMonteststatusLessThan(Integer value) {
            addCriterion("monTestStatus <", value, "monteststatus");
            return (Criteria) this;
        }

        public Criteria andMonteststatusLessThanOrEqualTo(Integer value) {
            addCriterion("monTestStatus <=", value, "monteststatus");
            return (Criteria) this;
        }

        public Criteria andMonteststatusIn(List<Integer> values) {
            addCriterion("monTestStatus in", values, "monteststatus");
            return (Criteria) this;
        }

        public Criteria andMonteststatusNotIn(List<Integer> values) {
            addCriterion("monTestStatus not in", values, "monteststatus");
            return (Criteria) this;
        }

        public Criteria andMonteststatusBetween(Integer value1, Integer value2) {
            addCriterion("monTestStatus between", value1, value2, "monteststatus");
            return (Criteria) this;
        }

        public Criteria andMonteststatusNotBetween(Integer value1, Integer value2) {
            addCriterion("monTestStatus not between", value1, value2, "monteststatus");
            return (Criteria) this;
        }

        public Criteria andTuesteststatusIsNull() {
            addCriterion("tuesTestStatus is null");
            return (Criteria) this;
        }

        public Criteria andTuesteststatusIsNotNull() {
            addCriterion("tuesTestStatus is not null");
            return (Criteria) this;
        }

        public Criteria andTuesteststatusEqualTo(Integer value) {
            addCriterion("tuesTestStatus =", value, "tuesteststatus");
            return (Criteria) this;
        }

        public Criteria andTuesteststatusNotEqualTo(Integer value) {
            addCriterion("tuesTestStatus <>", value, "tuesteststatus");
            return (Criteria) this;
        }

        public Criteria andTuesteststatusGreaterThan(Integer value) {
            addCriterion("tuesTestStatus >", value, "tuesteststatus");
            return (Criteria) this;
        }

        public Criteria andTuesteststatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("tuesTestStatus >=", value, "tuesteststatus");
            return (Criteria) this;
        }

        public Criteria andTuesteststatusLessThan(Integer value) {
            addCriterion("tuesTestStatus <", value, "tuesteststatus");
            return (Criteria) this;
        }

        public Criteria andTuesteststatusLessThanOrEqualTo(Integer value) {
            addCriterion("tuesTestStatus <=", value, "tuesteststatus");
            return (Criteria) this;
        }

        public Criteria andTuesteststatusIn(List<Integer> values) {
            addCriterion("tuesTestStatus in", values, "tuesteststatus");
            return (Criteria) this;
        }

        public Criteria andTuesteststatusNotIn(List<Integer> values) {
            addCriterion("tuesTestStatus not in", values, "tuesteststatus");
            return (Criteria) this;
        }

        public Criteria andTuesteststatusBetween(Integer value1, Integer value2) {
            addCriterion("tuesTestStatus between", value1, value2, "tuesteststatus");
            return (Criteria) this;
        }

        public Criteria andTuesteststatusNotBetween(Integer value1, Integer value2) {
            addCriterion("tuesTestStatus not between", value1, value2, "tuesteststatus");
            return (Criteria) this;
        }

        public Criteria andWedteststatusIsNull() {
            addCriterion("wedTestStatus is null");
            return (Criteria) this;
        }

        public Criteria andWedteststatusIsNotNull() {
            addCriterion("wedTestStatus is not null");
            return (Criteria) this;
        }

        public Criteria andWedteststatusEqualTo(Integer value) {
            addCriterion("wedTestStatus =", value, "wedteststatus");
            return (Criteria) this;
        }

        public Criteria andWedteststatusNotEqualTo(Integer value) {
            addCriterion("wedTestStatus <>", value, "wedteststatus");
            return (Criteria) this;
        }

        public Criteria andWedteststatusGreaterThan(Integer value) {
            addCriterion("wedTestStatus >", value, "wedteststatus");
            return (Criteria) this;
        }

        public Criteria andWedteststatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("wedTestStatus >=", value, "wedteststatus");
            return (Criteria) this;
        }

        public Criteria andWedteststatusLessThan(Integer value) {
            addCriterion("wedTestStatus <", value, "wedteststatus");
            return (Criteria) this;
        }

        public Criteria andWedteststatusLessThanOrEqualTo(Integer value) {
            addCriterion("wedTestStatus <=", value, "wedteststatus");
            return (Criteria) this;
        }

        public Criteria andWedteststatusIn(List<Integer> values) {
            addCriterion("wedTestStatus in", values, "wedteststatus");
            return (Criteria) this;
        }

        public Criteria andWedteststatusNotIn(List<Integer> values) {
            addCriterion("wedTestStatus not in", values, "wedteststatus");
            return (Criteria) this;
        }

        public Criteria andWedteststatusBetween(Integer value1, Integer value2) {
            addCriterion("wedTestStatus between", value1, value2, "wedteststatus");
            return (Criteria) this;
        }

        public Criteria andWedteststatusNotBetween(Integer value1, Integer value2) {
            addCriterion("wedTestStatus not between", value1, value2, "wedteststatus");
            return (Criteria) this;
        }

        public Criteria andThurteststatusIsNull() {
            addCriterion("thurTestStatus is null");
            return (Criteria) this;
        }

        public Criteria andThurteststatusIsNotNull() {
            addCriterion("thurTestStatus is not null");
            return (Criteria) this;
        }

        public Criteria andThurteststatusEqualTo(Integer value) {
            addCriterion("thurTestStatus =", value, "thurteststatus");
            return (Criteria) this;
        }

        public Criteria andThurteststatusNotEqualTo(Integer value) {
            addCriterion("thurTestStatus <>", value, "thurteststatus");
            return (Criteria) this;
        }

        public Criteria andThurteststatusGreaterThan(Integer value) {
            addCriterion("thurTestStatus >", value, "thurteststatus");
            return (Criteria) this;
        }

        public Criteria andThurteststatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("thurTestStatus >=", value, "thurteststatus");
            return (Criteria) this;
        }

        public Criteria andThurteststatusLessThan(Integer value) {
            addCriterion("thurTestStatus <", value, "thurteststatus");
            return (Criteria) this;
        }

        public Criteria andThurteststatusLessThanOrEqualTo(Integer value) {
            addCriterion("thurTestStatus <=", value, "thurteststatus");
            return (Criteria) this;
        }

        public Criteria andThurteststatusIn(List<Integer> values) {
            addCriterion("thurTestStatus in", values, "thurteststatus");
            return (Criteria) this;
        }

        public Criteria andThurteststatusNotIn(List<Integer> values) {
            addCriterion("thurTestStatus not in", values, "thurteststatus");
            return (Criteria) this;
        }

        public Criteria andThurteststatusBetween(Integer value1, Integer value2) {
            addCriterion("thurTestStatus between", value1, value2, "thurteststatus");
            return (Criteria) this;
        }

        public Criteria andThurteststatusNotBetween(Integer value1, Integer value2) {
            addCriterion("thurTestStatus not between", value1, value2, "thurteststatus");
            return (Criteria) this;
        }

        public Criteria andFriteststatusIsNull() {
            addCriterion("friTestStatus is null");
            return (Criteria) this;
        }

        public Criteria andFriteststatusIsNotNull() {
            addCriterion("friTestStatus is not null");
            return (Criteria) this;
        }

        public Criteria andFriteststatusEqualTo(Integer value) {
            addCriterion("friTestStatus =", value, "friteststatus");
            return (Criteria) this;
        }

        public Criteria andFriteststatusNotEqualTo(Integer value) {
            addCriterion("friTestStatus <>", value, "friteststatus");
            return (Criteria) this;
        }

        public Criteria andFriteststatusGreaterThan(Integer value) {
            addCriterion("friTestStatus >", value, "friteststatus");
            return (Criteria) this;
        }

        public Criteria andFriteststatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("friTestStatus >=", value, "friteststatus");
            return (Criteria) this;
        }

        public Criteria andFriteststatusLessThan(Integer value) {
            addCriterion("friTestStatus <", value, "friteststatus");
            return (Criteria) this;
        }

        public Criteria andFriteststatusLessThanOrEqualTo(Integer value) {
            addCriterion("friTestStatus <=", value, "friteststatus");
            return (Criteria) this;
        }

        public Criteria andFriteststatusIn(List<Integer> values) {
            addCriterion("friTestStatus in", values, "friteststatus");
            return (Criteria) this;
        }

        public Criteria andFriteststatusNotIn(List<Integer> values) {
            addCriterion("friTestStatus not in", values, "friteststatus");
            return (Criteria) this;
        }

        public Criteria andFriteststatusBetween(Integer value1, Integer value2) {
            addCriterion("friTestStatus between", value1, value2, "friteststatus");
            return (Criteria) this;
        }

        public Criteria andFriteststatusNotBetween(Integer value1, Integer value2) {
            addCriterion("friTestStatus not between", value1, value2, "friteststatus");
            return (Criteria) this;
        }

        public Criteria andTestrateIsNull() {
            addCriterion("testRate is null");
            return (Criteria) this;
        }

        public Criteria andTestrateIsNotNull() {
            addCriterion("testRate is not null");
            return (Criteria) this;
        }

        public Criteria andTestrateEqualTo(Float value) {
            addCriterion("testRate =", value, "testrate");
            return (Criteria) this;
        }

        public Criteria andTestrateNotEqualTo(Float value) {
            addCriterion("testRate <>", value, "testrate");
            return (Criteria) this;
        }

        public Criteria andTestrateGreaterThan(Float value) {
            addCriterion("testRate >", value, "testrate");
            return (Criteria) this;
        }

        public Criteria andTestrateGreaterThanOrEqualTo(Float value) {
            addCriterion("testRate >=", value, "testrate");
            return (Criteria) this;
        }

        public Criteria andTestrateLessThan(Float value) {
            addCriterion("testRate <", value, "testrate");
            return (Criteria) this;
        }

        public Criteria andTestrateLessThanOrEqualTo(Float value) {
            addCriterion("testRate <=", value, "testrate");
            return (Criteria) this;
        }

        public Criteria andTestrateIn(List<Float> values) {
            addCriterion("testRate in", values, "testrate");
            return (Criteria) this;
        }

        public Criteria andTestrateNotIn(List<Float> values) {
            addCriterion("testRate not in", values, "testrate");
            return (Criteria) this;
        }

        public Criteria andTestrateBetween(Float value1, Float value2) {
            addCriterion("testRate between", value1, value2, "testrate");
            return (Criteria) this;
        }

        public Criteria andTestrateNotBetween(Float value1, Float value2) {
            addCriterion("testRate not between", value1, value2, "testrate");
            return (Criteria) this;
        }

        public Criteria andTestcorrectrateIsNull() {
            addCriterion("testCorrectRate is null");
            return (Criteria) this;
        }

        public Criteria andTestcorrectrateIsNotNull() {
            addCriterion("testCorrectRate is not null");
            return (Criteria) this;
        }

        public Criteria andTestcorrectrateEqualTo(Float value) {
            addCriterion("testCorrectRate =", value, "testcorrectrate");
            return (Criteria) this;
        }

        public Criteria andTestcorrectrateNotEqualTo(Float value) {
            addCriterion("testCorrectRate <>", value, "testcorrectrate");
            return (Criteria) this;
        }

        public Criteria andTestcorrectrateGreaterThan(Float value) {
            addCriterion("testCorrectRate >", value, "testcorrectrate");
            return (Criteria) this;
        }

        public Criteria andTestcorrectrateGreaterThanOrEqualTo(Float value) {
            addCriterion("testCorrectRate >=", value, "testcorrectrate");
            return (Criteria) this;
        }

        public Criteria andTestcorrectrateLessThan(Float value) {
            addCriterion("testCorrectRate <", value, "testcorrectrate");
            return (Criteria) this;
        }

        public Criteria andTestcorrectrateLessThanOrEqualTo(Float value) {
            addCriterion("testCorrectRate <=", value, "testcorrectrate");
            return (Criteria) this;
        }

        public Criteria andTestcorrectrateIn(List<Float> values) {
            addCriterion("testCorrectRate in", values, "testcorrectrate");
            return (Criteria) this;
        }

        public Criteria andTestcorrectrateNotIn(List<Float> values) {
            addCriterion("testCorrectRate not in", values, "testcorrectrate");
            return (Criteria) this;
        }

        public Criteria andTestcorrectrateBetween(Float value1, Float value2) {
            addCriterion("testCorrectRate between", value1, value2, "testcorrectrate");
            return (Criteria) this;
        }

        public Criteria andTestcorrectrateNotBetween(Float value1, Float value2) {
            addCriterion("testCorrectRate not between", value1, value2, "testcorrectrate");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andOrgnumIsNull() {
            addCriterion("orgNum is null");
            return (Criteria) this;
        }

        public Criteria andOrgnumIsNotNull() {
            addCriterion("orgNum is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnumEqualTo(String value) {
            addCriterion("orgNum =", value, "orgnum");
            return (Criteria) this;
        }

        public Criteria andOrgnumNotEqualTo(String value) {
            addCriterion("orgNum <>", value, "orgnum");
            return (Criteria) this;
        }

        public Criteria andOrgnumGreaterThan(String value) {
            addCriterion("orgNum >", value, "orgnum");
            return (Criteria) this;
        }

        public Criteria andOrgnumGreaterThanOrEqualTo(String value) {
            addCriterion("orgNum >=", value, "orgnum");
            return (Criteria) this;
        }

        public Criteria andOrgnumLessThan(String value) {
            addCriterion("orgNum <", value, "orgnum");
            return (Criteria) this;
        }

        public Criteria andOrgnumLessThanOrEqualTo(String value) {
            addCriterion("orgNum <=", value, "orgnum");
            return (Criteria) this;
        }

        public Criteria andOrgnumLike(String value) {
            addCriterion("orgNum like", value, "orgnum");
            return (Criteria) this;
        }

        public Criteria andOrgnumNotLike(String value) {
            addCriterion("orgNum not like", value, "orgnum");
            return (Criteria) this;
        }

        public Criteria andOrgnumIn(List<String> values) {
            addCriterion("orgNum in", values, "orgnum");
            return (Criteria) this;
        }

        public Criteria andOrgnumNotIn(List<String> values) {
            addCriterion("orgNum not in", values, "orgnum");
            return (Criteria) this;
        }

        public Criteria andOrgnumBetween(String value1, String value2) {
            addCriterion("orgNum between", value1, value2, "orgnum");
            return (Criteria) this;
        }

        public Criteria andOrgnumNotBetween(String value1, String value2) {
            addCriterion("orgNum not between", value1, value2, "orgnum");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
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
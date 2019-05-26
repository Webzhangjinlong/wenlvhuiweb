package com.suguang.domin;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YmArtistExperienceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YmArtistExperienceExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andArtistIdIsNull() {
            addCriterion("artist_id is null");
            return (Criteria) this;
        }

        public Criteria andArtistIdIsNotNull() {
            addCriterion("artist_id is not null");
            return (Criteria) this;
        }

        public Criteria andArtistIdEqualTo(Integer value) {
            addCriterion("artist_id =", value, "artistId");
            return (Criteria) this;
        }

        public Criteria andArtistIdNotEqualTo(Integer value) {
            addCriterion("artist_id <>", value, "artistId");
            return (Criteria) this;
        }

        public Criteria andArtistIdGreaterThan(Integer value) {
            addCriterion("artist_id >", value, "artistId");
            return (Criteria) this;
        }

        public Criteria andArtistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("artist_id >=", value, "artistId");
            return (Criteria) this;
        }

        public Criteria andArtistIdLessThan(Integer value) {
            addCriterion("artist_id <", value, "artistId");
            return (Criteria) this;
        }

        public Criteria andArtistIdLessThanOrEqualTo(Integer value) {
            addCriterion("artist_id <=", value, "artistId");
            return (Criteria) this;
        }

        public Criteria andArtistIdIn(List<Integer> values) {
            addCriterion("artist_id in", values, "artistId");
            return (Criteria) this;
        }

        public Criteria andArtistIdNotIn(List<Integer> values) {
            addCriterion("artist_id not in", values, "artistId");
            return (Criteria) this;
        }

        public Criteria andArtistIdBetween(Integer value1, Integer value2) {
            addCriterion("artist_id between", value1, value2, "artistId");
            return (Criteria) this;
        }

        public Criteria andArtistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("artist_id not between", value1, value2, "artistId");
            return (Criteria) this;
        }

        public Criteria andExperienceDateIsNull() {
            addCriterion("experience_date is null");
            return (Criteria) this;
        }

        public Criteria andExperienceDateIsNotNull() {
            addCriterion("experience_date is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceDateEqualTo(Date value) {
            addCriterion("experience_date =", value, "experienceDate");
            return (Criteria) this;
        }

        public Criteria andExperienceDateNotEqualTo(Date value) {
            addCriterion("experience_date <>", value, "experienceDate");
            return (Criteria) this;
        }

        public Criteria andExperienceDateGreaterThan(Date value) {
            addCriterion("experience_date >", value, "experienceDate");
            return (Criteria) this;
        }

        public Criteria andExperienceDateGreaterThanOrEqualTo(Date value) {
            addCriterion("experience_date >=", value, "experienceDate");
            return (Criteria) this;
        }

        public Criteria andExperienceDateLessThan(Date value) {
            addCriterion("experience_date <", value, "experienceDate");
            return (Criteria) this;
        }

        public Criteria andExperienceDateLessThanOrEqualTo(Date value) {
            addCriterion("experience_date <=", value, "experienceDate");
            return (Criteria) this;
        }

        public Criteria andExperienceDateIn(List<Date> values) {
            addCriterion("experience_date in", values, "experienceDate");
            return (Criteria) this;
        }

        public Criteria andExperienceDateNotIn(List<Date> values) {
            addCriterion("experience_date not in", values, "experienceDate");
            return (Criteria) this;
        }

        public Criteria andExperienceDateBetween(Date value1, Date value2) {
            addCriterion("experience_date between", value1, value2, "experienceDate");
            return (Criteria) this;
        }

        public Criteria andExperienceDateNotBetween(Date value1, Date value2) {
            addCriterion("experience_date not between", value1, value2, "experienceDate");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNull() {
            addCriterion("experience is null");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNotNull() {
            addCriterion("experience is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceEqualTo(String value) {
            addCriterion("experience =", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotEqualTo(String value) {
            addCriterion("experience <>", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThan(String value) {
            addCriterion("experience >", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("experience >=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThan(String value) {
            addCriterion("experience <", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThanOrEqualTo(String value) {
            addCriterion("experience <=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLike(String value) {
            addCriterion("experience like", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotLike(String value) {
            addCriterion("experience not like", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceIn(List<String> values) {
            addCriterion("experience in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotIn(List<String> values) {
            addCriterion("experience not in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceBetween(String value1, String value2) {
            addCriterion("experience between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotBetween(String value1, String value2) {
            addCriterion("experience not between", value1, value2, "experience");
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
package com.suguang.domin;

import java.util.ArrayList;
import java.util.List;

public class YmArtistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YmArtistExample() {
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

        public Criteria andArtistTypeIsNull() {
            addCriterion("artist_type is null");
            return (Criteria) this;
        }

        public Criteria andArtistTypeIsNotNull() {
            addCriterion("artist_type is not null");
            return (Criteria) this;
        }

        public Criteria andArtistTypeEqualTo(Integer value) {
            addCriterion("artist_type =", value, "artistType");
            return (Criteria) this;
        }

        public Criteria andArtistTypeNotEqualTo(Integer value) {
            addCriterion("artist_type <>", value, "artistType");
            return (Criteria) this;
        }

        public Criteria andArtistTypeGreaterThan(Integer value) {
            addCriterion("artist_type >", value, "artistType");
            return (Criteria) this;
        }

        public Criteria andArtistTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("artist_type >=", value, "artistType");
            return (Criteria) this;
        }

        public Criteria andArtistTypeLessThan(Integer value) {
            addCriterion("artist_type <", value, "artistType");
            return (Criteria) this;
        }

        public Criteria andArtistTypeLessThanOrEqualTo(Integer value) {
            addCriterion("artist_type <=", value, "artistType");
            return (Criteria) this;
        }

        public Criteria andArtistTypeIn(List<Integer> values) {
            addCriterion("artist_type in", values, "artistType");
            return (Criteria) this;
        }

        public Criteria andArtistTypeNotIn(List<Integer> values) {
            addCriterion("artist_type not in", values, "artistType");
            return (Criteria) this;
        }

        public Criteria andArtistTypeBetween(Integer value1, Integer value2) {
            addCriterion("artist_type between", value1, value2, "artistType");
            return (Criteria) this;
        }

        public Criteria andArtistTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("artist_type not between", value1, value2, "artistType");
            return (Criteria) this;
        }

        public Criteria andArtistNameIsNull() {
            addCriterion("artist_name is null");
            return (Criteria) this;
        }

        public Criteria andArtistNameIsNotNull() {
            addCriterion("artist_name is not null");
            return (Criteria) this;
        }

        public Criteria andArtistNameEqualTo(String value) {
            addCriterion("artist_name =", value, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameNotEqualTo(String value) {
            addCriterion("artist_name <>", value, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameGreaterThan(String value) {
            addCriterion("artist_name >", value, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameGreaterThanOrEqualTo(String value) {
            addCriterion("artist_name >=", value, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameLessThan(String value) {
            addCriterion("artist_name <", value, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameLessThanOrEqualTo(String value) {
            addCriterion("artist_name <=", value, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameLike(String value) {
            addCriterion("artist_name like", value, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameNotLike(String value) {
            addCriterion("artist_name not like", value, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameIn(List<String> values) {
            addCriterion("artist_name in", values, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameNotIn(List<String> values) {
            addCriterion("artist_name not in", values, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameBetween(String value1, String value2) {
            addCriterion("artist_name between", value1, value2, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameNotBetween(String value1, String value2) {
            addCriterion("artist_name not between", value1, value2, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistLogourlIsNull() {
            addCriterion("artist_logourl is null");
            return (Criteria) this;
        }

        public Criteria andArtistLogourlIsNotNull() {
            addCriterion("artist_logourl is not null");
            return (Criteria) this;
        }

        public Criteria andArtistLogourlEqualTo(String value) {
            addCriterion("artist_logourl =", value, "artistLogourl");
            return (Criteria) this;
        }

        public Criteria andArtistLogourlNotEqualTo(String value) {
            addCriterion("artist_logourl <>", value, "artistLogourl");
            return (Criteria) this;
        }

        public Criteria andArtistLogourlGreaterThan(String value) {
            addCriterion("artist_logourl >", value, "artistLogourl");
            return (Criteria) this;
        }

        public Criteria andArtistLogourlGreaterThanOrEqualTo(String value) {
            addCriterion("artist_logourl >=", value, "artistLogourl");
            return (Criteria) this;
        }

        public Criteria andArtistLogourlLessThan(String value) {
            addCriterion("artist_logourl <", value, "artistLogourl");
            return (Criteria) this;
        }

        public Criteria andArtistLogourlLessThanOrEqualTo(String value) {
            addCriterion("artist_logourl <=", value, "artistLogourl");
            return (Criteria) this;
        }

        public Criteria andArtistLogourlLike(String value) {
            addCriterion("artist_logourl like", value, "artistLogourl");
            return (Criteria) this;
        }

        public Criteria andArtistLogourlNotLike(String value) {
            addCriterion("artist_logourl not like", value, "artistLogourl");
            return (Criteria) this;
        }

        public Criteria andArtistLogourlIn(List<String> values) {
            addCriterion("artist_logourl in", values, "artistLogourl");
            return (Criteria) this;
        }

        public Criteria andArtistLogourlNotIn(List<String> values) {
            addCriterion("artist_logourl not in", values, "artistLogourl");
            return (Criteria) this;
        }

        public Criteria andArtistLogourlBetween(String value1, String value2) {
            addCriterion("artist_logourl between", value1, value2, "artistLogourl");
            return (Criteria) this;
        }

        public Criteria andArtistLogourlNotBetween(String value1, String value2) {
            addCriterion("artist_logourl not between", value1, value2, "artistLogourl");
            return (Criteria) this;
        }

        public Criteria andArtistPhoneIsNull() {
            addCriterion("artist_phone is null");
            return (Criteria) this;
        }

        public Criteria andArtistPhoneIsNotNull() {
            addCriterion("artist_phone is not null");
            return (Criteria) this;
        }

        public Criteria andArtistPhoneEqualTo(String value) {
            addCriterion("artist_phone =", value, "artistPhone");
            return (Criteria) this;
        }

        public Criteria andArtistPhoneNotEqualTo(String value) {
            addCriterion("artist_phone <>", value, "artistPhone");
            return (Criteria) this;
        }

        public Criteria andArtistPhoneGreaterThan(String value) {
            addCriterion("artist_phone >", value, "artistPhone");
            return (Criteria) this;
        }

        public Criteria andArtistPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("artist_phone >=", value, "artistPhone");
            return (Criteria) this;
        }

        public Criteria andArtistPhoneLessThan(String value) {
            addCriterion("artist_phone <", value, "artistPhone");
            return (Criteria) this;
        }

        public Criteria andArtistPhoneLessThanOrEqualTo(String value) {
            addCriterion("artist_phone <=", value, "artistPhone");
            return (Criteria) this;
        }

        public Criteria andArtistPhoneLike(String value) {
            addCriterion("artist_phone like", value, "artistPhone");
            return (Criteria) this;
        }

        public Criteria andArtistPhoneNotLike(String value) {
            addCriterion("artist_phone not like", value, "artistPhone");
            return (Criteria) this;
        }

        public Criteria andArtistPhoneIn(List<String> values) {
            addCriterion("artist_phone in", values, "artistPhone");
            return (Criteria) this;
        }

        public Criteria andArtistPhoneNotIn(List<String> values) {
            addCriterion("artist_phone not in", values, "artistPhone");
            return (Criteria) this;
        }

        public Criteria andArtistPhoneBetween(String value1, String value2) {
            addCriterion("artist_phone between", value1, value2, "artistPhone");
            return (Criteria) this;
        }

        public Criteria andArtistPhoneNotBetween(String value1, String value2) {
            addCriterion("artist_phone not between", value1, value2, "artistPhone");
            return (Criteria) this;
        }

        public Criteria andArtistDetailsIsNull() {
            addCriterion("artist_details is null");
            return (Criteria) this;
        }

        public Criteria andArtistDetailsIsNotNull() {
            addCriterion("artist_details is not null");
            return (Criteria) this;
        }

        public Criteria andArtistDetailsEqualTo(String value) {
            addCriterion("artist_details =", value, "artistDetails");
            return (Criteria) this;
        }

        public Criteria andArtistDetailsNotEqualTo(String value) {
            addCriterion("artist_details <>", value, "artistDetails");
            return (Criteria) this;
        }

        public Criteria andArtistDetailsGreaterThan(String value) {
            addCriterion("artist_details >", value, "artistDetails");
            return (Criteria) this;
        }

        public Criteria andArtistDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("artist_details >=", value, "artistDetails");
            return (Criteria) this;
        }

        public Criteria andArtistDetailsLessThan(String value) {
            addCriterion("artist_details <", value, "artistDetails");
            return (Criteria) this;
        }

        public Criteria andArtistDetailsLessThanOrEqualTo(String value) {
            addCriterion("artist_details <=", value, "artistDetails");
            return (Criteria) this;
        }

        public Criteria andArtistDetailsLike(String value) {
            addCriterion("artist_details like", value, "artistDetails");
            return (Criteria) this;
        }

        public Criteria andArtistDetailsNotLike(String value) {
            addCriterion("artist_details not like", value, "artistDetails");
            return (Criteria) this;
        }

        public Criteria andArtistDetailsIn(List<String> values) {
            addCriterion("artist_details in", values, "artistDetails");
            return (Criteria) this;
        }

        public Criteria andArtistDetailsNotIn(List<String> values) {
            addCriterion("artist_details not in", values, "artistDetails");
            return (Criteria) this;
        }

        public Criteria andArtistDetailsBetween(String value1, String value2) {
            addCriterion("artist_details between", value1, value2, "artistDetails");
            return (Criteria) this;
        }

        public Criteria andArtistDetailsNotBetween(String value1, String value2) {
            addCriterion("artist_details not between", value1, value2, "artistDetails");
            return (Criteria) this;
        }

        public Criteria andArtistStatusIsNull() {
            addCriterion("artist_status is null");
            return (Criteria) this;
        }

        public Criteria andArtistStatusIsNotNull() {
            addCriterion("artist_status is not null");
            return (Criteria) this;
        }

        public Criteria andArtistStatusEqualTo(Integer value) {
            addCriterion("artist_status =", value, "artistStatus");
            return (Criteria) this;
        }

        public Criteria andArtistStatusNotEqualTo(Integer value) {
            addCriterion("artist_status <>", value, "artistStatus");
            return (Criteria) this;
        }

        public Criteria andArtistStatusGreaterThan(Integer value) {
            addCriterion("artist_status >", value, "artistStatus");
            return (Criteria) this;
        }

        public Criteria andArtistStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("artist_status >=", value, "artistStatus");
            return (Criteria) this;
        }

        public Criteria andArtistStatusLessThan(Integer value) {
            addCriterion("artist_status <", value, "artistStatus");
            return (Criteria) this;
        }

        public Criteria andArtistStatusLessThanOrEqualTo(Integer value) {
            addCriterion("artist_status <=", value, "artistStatus");
            return (Criteria) this;
        }

        public Criteria andArtistStatusIn(List<Integer> values) {
            addCriterion("artist_status in", values, "artistStatus");
            return (Criteria) this;
        }

        public Criteria andArtistStatusNotIn(List<Integer> values) {
            addCriterion("artist_status not in", values, "artistStatus");
            return (Criteria) this;
        }

        public Criteria andArtistStatusBetween(Integer value1, Integer value2) {
            addCriterion("artist_status between", value1, value2, "artistStatus");
            return (Criteria) this;
        }

        public Criteria andArtistStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("artist_status not between", value1, value2, "artistStatus");
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
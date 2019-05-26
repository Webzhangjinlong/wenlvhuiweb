package com.suguang.domin;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YmWenlvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YmWenlvExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andSubstanceIsNull() {
            addCriterion("substance is null");
            return (Criteria) this;
        }

        public Criteria andSubstanceIsNotNull() {
            addCriterion("substance is not null");
            return (Criteria) this;
        }

        public Criteria andSubstanceEqualTo(String value) {
            addCriterion("substance =", value, "substance");
            return (Criteria) this;
        }

        public Criteria andSubstanceNotEqualTo(String value) {
            addCriterion("substance <>", value, "substance");
            return (Criteria) this;
        }

        public Criteria andSubstanceGreaterThan(String value) {
            addCriterion("substance >", value, "substance");
            return (Criteria) this;
        }

        public Criteria andSubstanceGreaterThanOrEqualTo(String value) {
            addCriterion("substance >=", value, "substance");
            return (Criteria) this;
        }

        public Criteria andSubstanceLessThan(String value) {
            addCriterion("substance <", value, "substance");
            return (Criteria) this;
        }

        public Criteria andSubstanceLessThanOrEqualTo(String value) {
            addCriterion("substance <=", value, "substance");
            return (Criteria) this;
        }

        public Criteria andSubstanceLike(String value) {
            addCriterion("substance like", value, "substance");
            return (Criteria) this;
        }

        public Criteria andSubstanceNotLike(String value) {
            addCriterion("substance not like", value, "substance");
            return (Criteria) this;
        }

        public Criteria andSubstanceIn(List<String> values) {
            addCriterion("substance in", values, "substance");
            return (Criteria) this;
        }

        public Criteria andSubstanceNotIn(List<String> values) {
            addCriterion("substance not in", values, "substance");
            return (Criteria) this;
        }

        public Criteria andSubstanceBetween(String value1, String value2) {
            addCriterion("substance between", value1, value2, "substance");
            return (Criteria) this;
        }

        public Criteria andSubstanceNotBetween(String value1, String value2) {
            addCriterion("substance not between", value1, value2, "substance");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andRelayIsNull() {
            addCriterion("relay is null");
            return (Criteria) this;
        }

        public Criteria andRelayIsNotNull() {
            addCriterion("relay is not null");
            return (Criteria) this;
        }

        public Criteria andRelayEqualTo(Integer value) {
            addCriterion("relay =", value, "relay");
            return (Criteria) this;
        }

        public Criteria andRelayNotEqualTo(Integer value) {
            addCriterion("relay <>", value, "relay");
            return (Criteria) this;
        }

        public Criteria andRelayGreaterThan(Integer value) {
            addCriterion("relay >", value, "relay");
            return (Criteria) this;
        }

        public Criteria andRelayGreaterThanOrEqualTo(Integer value) {
            addCriterion("relay >=", value, "relay");
            return (Criteria) this;
        }

        public Criteria andRelayLessThan(Integer value) {
            addCriterion("relay <", value, "relay");
            return (Criteria) this;
        }

        public Criteria andRelayLessThanOrEqualTo(Integer value) {
            addCriterion("relay <=", value, "relay");
            return (Criteria) this;
        }

        public Criteria andRelayIn(List<Integer> values) {
            addCriterion("relay in", values, "relay");
            return (Criteria) this;
        }

        public Criteria andRelayNotIn(List<Integer> values) {
            addCriterion("relay not in", values, "relay");
            return (Criteria) this;
        }

        public Criteria andRelayBetween(Integer value1, Integer value2) {
            addCriterion("relay between", value1, value2, "relay");
            return (Criteria) this;
        }

        public Criteria andRelayNotBetween(Integer value1, Integer value2) {
            addCriterion("relay not between", value1, value2, "relay");
            return (Criteria) this;
        }

        public Criteria andBrowseIsNull() {
            addCriterion("browse is null");
            return (Criteria) this;
        }

        public Criteria andBrowseIsNotNull() {
            addCriterion("browse is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseEqualTo(Integer value) {
            addCriterion("browse =", value, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseNotEqualTo(Integer value) {
            addCriterion("browse <>", value, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseGreaterThan(Integer value) {
            addCriterion("browse >", value, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseGreaterThanOrEqualTo(Integer value) {
            addCriterion("browse >=", value, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseLessThan(Integer value) {
            addCriterion("browse <", value, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseLessThanOrEqualTo(Integer value) {
            addCriterion("browse <=", value, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseIn(List<Integer> values) {
            addCriterion("browse in", values, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseNotIn(List<Integer> values) {
            addCriterion("browse not in", values, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseBetween(Integer value1, Integer value2) {
            addCriterion("browse between", value1, value2, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseNotBetween(Integer value1, Integer value2) {
            addCriterion("browse not between", value1, value2, "browse");
            return (Criteria) this;
        }

        public Criteria andCotentIsNull() {
            addCriterion("cotent is null");
            return (Criteria) this;
        }

        public Criteria andCotentIsNotNull() {
            addCriterion("cotent is not null");
            return (Criteria) this;
        }

        public Criteria andCotentEqualTo(String value) {
            addCriterion("cotent =", value, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentNotEqualTo(String value) {
            addCriterion("cotent <>", value, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentGreaterThan(String value) {
            addCriterion("cotent >", value, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentGreaterThanOrEqualTo(String value) {
            addCriterion("cotent >=", value, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentLessThan(String value) {
            addCriterion("cotent <", value, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentLessThanOrEqualTo(String value) {
            addCriterion("cotent <=", value, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentLike(String value) {
            addCriterion("cotent like", value, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentNotLike(String value) {
            addCriterion("cotent not like", value, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentIn(List<String> values) {
            addCriterion("cotent in", values, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentNotIn(List<String> values) {
            addCriterion("cotent not in", values, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentBetween(String value1, String value2) {
            addCriterion("cotent between", value1, value2, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentNotBetween(String value1, String value2) {
            addCriterion("cotent not between", value1, value2, "cotent");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Integer value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Integer value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Integer value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Integer value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Integer value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Integer> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Integer> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Integer value1, Integer value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andTextTypeIsNull() {
            addCriterion("text_type is null");
            return (Criteria) this;
        }

        public Criteria andTextTypeIsNotNull() {
            addCriterion("text_type is not null");
            return (Criteria) this;
        }

        public Criteria andTextTypeEqualTo(Integer value) {
            addCriterion("text_type =", value, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeNotEqualTo(Integer value) {
            addCriterion("text_type <>", value, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeGreaterThan(Integer value) {
            addCriterion("text_type >", value, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("text_type >=", value, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeLessThan(Integer value) {
            addCriterion("text_type <", value, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeLessThanOrEqualTo(Integer value) {
            addCriterion("text_type <=", value, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeIn(List<Integer> values) {
            addCriterion("text_type in", values, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeNotIn(List<Integer> values) {
            addCriterion("text_type not in", values, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeBetween(Integer value1, Integer value2) {
            addCriterion("text_type between", value1, value2, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("text_type not between", value1, value2, "textType");
            return (Criteria) this;
        }

        public Criteria andBackupField1IsNull() {
            addCriterion("backup_field1 is null");
            return (Criteria) this;
        }

        public Criteria andBackupField1IsNotNull() {
            addCriterion("backup_field1 is not null");
            return (Criteria) this;
        }

        public Criteria andBackupField1EqualTo(Integer value) {
            addCriterion("backup_field1 =", value, "backupField1");
            return (Criteria) this;
        }

        public Criteria andBackupField1NotEqualTo(Integer value) {
            addCriterion("backup_field1 <>", value, "backupField1");
            return (Criteria) this;
        }

        public Criteria andBackupField1GreaterThan(Integer value) {
            addCriterion("backup_field1 >", value, "backupField1");
            return (Criteria) this;
        }

        public Criteria andBackupField1GreaterThanOrEqualTo(Integer value) {
            addCriterion("backup_field1 >=", value, "backupField1");
            return (Criteria) this;
        }

        public Criteria andBackupField1LessThan(Integer value) {
            addCriterion("backup_field1 <", value, "backupField1");
            return (Criteria) this;
        }

        public Criteria andBackupField1LessThanOrEqualTo(Integer value) {
            addCriterion("backup_field1 <=", value, "backupField1");
            return (Criteria) this;
        }

        public Criteria andBackupField1In(List<Integer> values) {
            addCriterion("backup_field1 in", values, "backupField1");
            return (Criteria) this;
        }

        public Criteria andBackupField1NotIn(List<Integer> values) {
            addCriterion("backup_field1 not in", values, "backupField1");
            return (Criteria) this;
        }

        public Criteria andBackupField1Between(Integer value1, Integer value2) {
            addCriterion("backup_field1 between", value1, value2, "backupField1");
            return (Criteria) this;
        }

        public Criteria andBackupField1NotBetween(Integer value1, Integer value2) {
            addCriterion("backup_field1 not between", value1, value2, "backupField1");
            return (Criteria) this;
        }

        public Criteria andBackupField2IsNull() {
            addCriterion("backup_field2 is null");
            return (Criteria) this;
        }

        public Criteria andBackupField2IsNotNull() {
            addCriterion("backup_field2 is not null");
            return (Criteria) this;
        }

        public Criteria andBackupField2EqualTo(String value) {
            addCriterion("backup_field2 =", value, "backupField2");
            return (Criteria) this;
        }

        public Criteria andBackupField2NotEqualTo(String value) {
            addCriterion("backup_field2 <>", value, "backupField2");
            return (Criteria) this;
        }

        public Criteria andBackupField2GreaterThan(String value) {
            addCriterion("backup_field2 >", value, "backupField2");
            return (Criteria) this;
        }

        public Criteria andBackupField2GreaterThanOrEqualTo(String value) {
            addCriterion("backup_field2 >=", value, "backupField2");
            return (Criteria) this;
        }

        public Criteria andBackupField2LessThan(String value) {
            addCriterion("backup_field2 <", value, "backupField2");
            return (Criteria) this;
        }

        public Criteria andBackupField2LessThanOrEqualTo(String value) {
            addCriterion("backup_field2 <=", value, "backupField2");
            return (Criteria) this;
        }

        public Criteria andBackupField2Like(String value) {
            addCriterion("backup_field2 like", value, "backupField2");
            return (Criteria) this;
        }

        public Criteria andBackupField2NotLike(String value) {
            addCriterion("backup_field2 not like", value, "backupField2");
            return (Criteria) this;
        }

        public Criteria andBackupField2In(List<String> values) {
            addCriterion("backup_field2 in", values, "backupField2");
            return (Criteria) this;
        }

        public Criteria andBackupField2NotIn(List<String> values) {
            addCriterion("backup_field2 not in", values, "backupField2");
            return (Criteria) this;
        }

        public Criteria andBackupField2Between(String value1, String value2) {
            addCriterion("backup_field2 between", value1, value2, "backupField2");
            return (Criteria) this;
        }

        public Criteria andBackupField2NotBetween(String value1, String value2) {
            addCriterion("backup_field2 not between", value1, value2, "backupField2");
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
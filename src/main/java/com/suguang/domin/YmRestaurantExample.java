package com.suguang.domin;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YmRestaurantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YmRestaurantExample() {
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

        public Criteria andRestaurantTypeIsNull() {
            addCriterion("restaurant_type is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantTypeIsNotNull() {
            addCriterion("restaurant_type is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantTypeEqualTo(Integer value) {
            addCriterion("restaurant_type =", value, "restaurantType");
            return (Criteria) this;
        }

        public Criteria andRestaurantTypeNotEqualTo(Integer value) {
            addCriterion("restaurant_type <>", value, "restaurantType");
            return (Criteria) this;
        }

        public Criteria andRestaurantTypeGreaterThan(Integer value) {
            addCriterion("restaurant_type >", value, "restaurantType");
            return (Criteria) this;
        }

        public Criteria andRestaurantTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("restaurant_type >=", value, "restaurantType");
            return (Criteria) this;
        }

        public Criteria andRestaurantTypeLessThan(Integer value) {
            addCriterion("restaurant_type <", value, "restaurantType");
            return (Criteria) this;
        }

        public Criteria andRestaurantTypeLessThanOrEqualTo(Integer value) {
            addCriterion("restaurant_type <=", value, "restaurantType");
            return (Criteria) this;
        }

        public Criteria andRestaurantTypeIn(List<Integer> values) {
            addCriterion("restaurant_type in", values, "restaurantType");
            return (Criteria) this;
        }

        public Criteria andRestaurantTypeNotIn(List<Integer> values) {
            addCriterion("restaurant_type not in", values, "restaurantType");
            return (Criteria) this;
        }

        public Criteria andRestaurantTypeBetween(Integer value1, Integer value2) {
            addCriterion("restaurant_type between", value1, value2, "restaurantType");
            return (Criteria) this;
        }

        public Criteria andRestaurantTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("restaurant_type not between", value1, value2, "restaurantType");
            return (Criteria) this;
        }

        public Criteria andRestaurantTagIsNull() {
            addCriterion("restaurant_tag is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantTagIsNotNull() {
            addCriterion("restaurant_tag is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantTagEqualTo(Integer value) {
            addCriterion("restaurant_tag =", value, "restaurantTag");
            return (Criteria) this;
        }

        public Criteria andRestaurantTagNotEqualTo(Integer value) {
            addCriterion("restaurant_tag <>", value, "restaurantTag");
            return (Criteria) this;
        }

        public Criteria andRestaurantTagGreaterThan(Integer value) {
            addCriterion("restaurant_tag >", value, "restaurantTag");
            return (Criteria) this;
        }

        public Criteria andRestaurantTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("restaurant_tag >=", value, "restaurantTag");
            return (Criteria) this;
        }

        public Criteria andRestaurantTagLessThan(Integer value) {
            addCriterion("restaurant_tag <", value, "restaurantTag");
            return (Criteria) this;
        }

        public Criteria andRestaurantTagLessThanOrEqualTo(Integer value) {
            addCriterion("restaurant_tag <=", value, "restaurantTag");
            return (Criteria) this;
        }

        public Criteria andRestaurantTagIn(List<Integer> values) {
            addCriterion("restaurant_tag in", values, "restaurantTag");
            return (Criteria) this;
        }

        public Criteria andRestaurantTagNotIn(List<Integer> values) {
            addCriterion("restaurant_tag not in", values, "restaurantTag");
            return (Criteria) this;
        }

        public Criteria andRestaurantTagBetween(Integer value1, Integer value2) {
            addCriterion("restaurant_tag between", value1, value2, "restaurantTag");
            return (Criteria) this;
        }

        public Criteria andRestaurantTagNotBetween(Integer value1, Integer value2) {
            addCriterion("restaurant_tag not between", value1, value2, "restaurantTag");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgIsNull() {
            addCriterion("restaurant_img is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgIsNotNull() {
            addCriterion("restaurant_img is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgEqualTo(String value) {
            addCriterion("restaurant_img =", value, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgNotEqualTo(String value) {
            addCriterion("restaurant_img <>", value, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgGreaterThan(String value) {
            addCriterion("restaurant_img >", value, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgGreaterThanOrEqualTo(String value) {
            addCriterion("restaurant_img >=", value, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgLessThan(String value) {
            addCriterion("restaurant_img <", value, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgLessThanOrEqualTo(String value) {
            addCriterion("restaurant_img <=", value, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgLike(String value) {
            addCriterion("restaurant_img like", value, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgNotLike(String value) {
            addCriterion("restaurant_img not like", value, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgIn(List<String> values) {
            addCriterion("restaurant_img in", values, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgNotIn(List<String> values) {
            addCriterion("restaurant_img not in", values, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgBetween(String value1, String value2) {
            addCriterion("restaurant_img between", value1, value2, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgNotBetween(String value1, String value2) {
            addCriterion("restaurant_img not between", value1, value2, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameIsNull() {
            addCriterion("restaurant_name is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameIsNotNull() {
            addCriterion("restaurant_name is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameEqualTo(String value) {
            addCriterion("restaurant_name =", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameNotEqualTo(String value) {
            addCriterion("restaurant_name <>", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameGreaterThan(String value) {
            addCriterion("restaurant_name >", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameGreaterThanOrEqualTo(String value) {
            addCriterion("restaurant_name >=", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameLessThan(String value) {
            addCriterion("restaurant_name <", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameLessThanOrEqualTo(String value) {
            addCriterion("restaurant_name <=", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameLike(String value) {
            addCriterion("restaurant_name like", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameNotLike(String value) {
            addCriterion("restaurant_name not like", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameIn(List<String> values) {
            addCriterion("restaurant_name in", values, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameNotIn(List<String> values) {
            addCriterion("restaurant_name not in", values, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameBetween(String value1, String value2) {
            addCriterion("restaurant_name between", value1, value2, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameNotBetween(String value1, String value2) {
            addCriterion("restaurant_name not between", value1, value2, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAddrDetailIsNull() {
            addCriterion("addr_detail is null");
            return (Criteria) this;
        }

        public Criteria andAddrDetailIsNotNull() {
            addCriterion("addr_detail is not null");
            return (Criteria) this;
        }

        public Criteria andAddrDetailEqualTo(String value) {
            addCriterion("addr_detail =", value, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailNotEqualTo(String value) {
            addCriterion("addr_detail <>", value, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailGreaterThan(String value) {
            addCriterion("addr_detail >", value, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailGreaterThanOrEqualTo(String value) {
            addCriterion("addr_detail >=", value, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailLessThan(String value) {
            addCriterion("addr_detail <", value, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailLessThanOrEqualTo(String value) {
            addCriterion("addr_detail <=", value, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailLike(String value) {
            addCriterion("addr_detail like", value, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailNotLike(String value) {
            addCriterion("addr_detail not like", value, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailIn(List<String> values) {
            addCriterion("addr_detail in", values, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailNotIn(List<String> values) {
            addCriterion("addr_detail not in", values, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailBetween(String value1, String value2) {
            addCriterion("addr_detail between", value1, value2, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andAddrDetailNotBetween(String value1, String value2) {
            addCriterion("addr_detail not between", value1, value2, "addrDetail");
            return (Criteria) this;
        }

        public Criteria andStarClassIsNull() {
            addCriterion("star_class is null");
            return (Criteria) this;
        }

        public Criteria andStarClassIsNotNull() {
            addCriterion("star_class is not null");
            return (Criteria) this;
        }

        public Criteria andStarClassEqualTo(Integer value) {
            addCriterion("star_class =", value, "starClass");
            return (Criteria) this;
        }

        public Criteria andStarClassNotEqualTo(Integer value) {
            addCriterion("star_class <>", value, "starClass");
            return (Criteria) this;
        }

        public Criteria andStarClassGreaterThan(Integer value) {
            addCriterion("star_class >", value, "starClass");
            return (Criteria) this;
        }

        public Criteria andStarClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("star_class >=", value, "starClass");
            return (Criteria) this;
        }

        public Criteria andStarClassLessThan(Integer value) {
            addCriterion("star_class <", value, "starClass");
            return (Criteria) this;
        }

        public Criteria andStarClassLessThanOrEqualTo(Integer value) {
            addCriterion("star_class <=", value, "starClass");
            return (Criteria) this;
        }

        public Criteria andStarClassIn(List<Integer> values) {
            addCriterion("star_class in", values, "starClass");
            return (Criteria) this;
        }

        public Criteria andStarClassNotIn(List<Integer> values) {
            addCriterion("star_class not in", values, "starClass");
            return (Criteria) this;
        }

        public Criteria andStarClassBetween(Integer value1, Integer value2) {
            addCriterion("star_class between", value1, value2, "starClass");
            return (Criteria) this;
        }

        public Criteria andStarClassNotBetween(Integer value1, Integer value2) {
            addCriterion("star_class not between", value1, value2, "starClass");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailIsNull() {
            addCriterion("restaurant_detail is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailIsNotNull() {
            addCriterion("restaurant_detail is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailEqualTo(String value) {
            addCriterion("restaurant_detail =", value, "restaurantDetail");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailNotEqualTo(String value) {
            addCriterion("restaurant_detail <>", value, "restaurantDetail");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailGreaterThan(String value) {
            addCriterion("restaurant_detail >", value, "restaurantDetail");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailGreaterThanOrEqualTo(String value) {
            addCriterion("restaurant_detail >=", value, "restaurantDetail");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailLessThan(String value) {
            addCriterion("restaurant_detail <", value, "restaurantDetail");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailLessThanOrEqualTo(String value) {
            addCriterion("restaurant_detail <=", value, "restaurantDetail");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailLike(String value) {
            addCriterion("restaurant_detail like", value, "restaurantDetail");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailNotLike(String value) {
            addCriterion("restaurant_detail not like", value, "restaurantDetail");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailIn(List<String> values) {
            addCriterion("restaurant_detail in", values, "restaurantDetail");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailNotIn(List<String> values) {
            addCriterion("restaurant_detail not in", values, "restaurantDetail");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailBetween(String value1, String value2) {
            addCriterion("restaurant_detail between", value1, value2, "restaurantDetail");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailNotBetween(String value1, String value2) {
            addCriterion("restaurant_detail not between", value1, value2, "restaurantDetail");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
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
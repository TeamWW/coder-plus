package com.lucifiere.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Example 查询参数
 *
 * @author XD.Wang
 * @date 2020-09-08
 */
public class PoiContainerAreaSourceExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> orCriteria;

    public PoiContainerAreaSourceExample() {
        orCriteria = new ArrayList<>();
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

    public List<Criteria> getOrCriteria() {
        return orCriteria;
    }

    public void or(Criteria criteria) {
        orCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        orCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (orCriteria.size() == 0) {
            orCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        return new Criteria();
    }

    public void clear() {
        orCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class BaseCriteria {

        protected List<Criterion> criteria;

        protected BaseCriteria() {
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

        public Criteria andWmPoiIdIsNull() {
            addCriterion("wm_poi_id is null");
            return (Criteria) this;
        }

        public Criteria andWmPoiIdIsNotNull() {
            addCriterion("wm_poi_id is not null");
            return (Criteria) this;
        }

        public Criteria andWmPoiIdEqualTo(Integer value) {
            addCriterion("wm_poi_id =", value, "wmPoiId");
            return (Criteria) this;
        }

        public Criteria andWmPoiIdNotEqualTo(Integer value) {
            addCriterion("wm_poi_id <>", value, "wmPoiId");
            return (Criteria) this;
        }

        public Criteria andWmPoiIdGreaterThan(Integer value) {
            addCriterion("wm_poi_id >", value, "wmPoiId");
            return (Criteria) this;
        }

        public Criteria andWmPoiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wm_poi_id >=", value, "wmPoiId");
            return (Criteria) this;
        }

        public Criteria andWmPoiIdLessThan(Integer value) {
            addCriterion("wm_poi_id <", value, "wmPoiId");
            return (Criteria) this;
        }

        public Criteria andWmPoiIdLessThanOrEqualTo(Integer value) {
            addCriterion("wm_poi_id <=", value, "wmPoiId");
            return (Criteria) this;
        }

        public Criteria andWmPoiIdIn(List<Integer> values) {
            addCriterion("wm_poi_id in", values, "wmPoiId");
            return (Criteria) this;
        }

        public Criteria andWmPoiIdNotIn(List<Integer> values) {
            addCriterion("wm_poi_id not in", values, "wmPoiId");
            return (Criteria) this;
        }

        public Criteria andWmPoiIdBetween(Integer value1, Integer value2) {
            addCriterion("wm_poi_id between", value1, value2, "wmPoiId");
            return (Criteria) this;
        }

        public Criteria andWmPoiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wm_poi_id not between", value1, value2, "wmPoiId");
            return (Criteria) this;
        }

        public Criteria andSourcePicUrlIsNull() {
            addCriterion("source_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andSourcePicUrlIsNotNull() {
            addCriterion("source_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andSourcePicUrlEqualTo(String value) {
            addCriterion("source_pic_url =", value, "sourcePicUrl");
            return (Criteria) this;
        }

        public Criteria andSourcePicUrlNotEqualTo(String value) {
            addCriterion("source_pic_url <>", value, "sourcePicUrl");
            return (Criteria) this;
        }

        public Criteria andSourcePicUrlGreaterThan(String value) {
            addCriterion("source_pic_url >", value, "sourcePicUrl");
            return (Criteria) this;
        }

        public Criteria andSourcePicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("source_pic_url >=", value, "sourcePicUrl");
            return (Criteria) this;
        }

        public Criteria andSourcePicUrlLessThan(String value) {
            addCriterion("source_pic_url <", value, "sourcePicUrl");
            return (Criteria) this;
        }

        public Criteria andSourcePicUrlLessThanOrEqualTo(String value) {
            addCriterion("source_pic_url <=", value, "sourcePicUrl");
            return (Criteria) this;
        }

        public Criteria andSourcePicUrlIn(List<String> values) {
            addCriterion("source_pic_url in", values, "sourcePicUrl");
            return (Criteria) this;
        }

        public Criteria andSourcePicUrlNotIn(List<String> values) {
            addCriterion("source_pic_url not in", values, "sourcePicUrl");
            return (Criteria) this;
        }

        public Criteria andSourcePicUrlBetween(String value1, String value2) {
            addCriterion("source_pic_url between", value1, value2, "sourcePicUrl");
            return (Criteria) this;
        }

        public Criteria andSourcePicUrlNotBetween(String value1, String value2) {
            addCriterion("source_pic_url not between", value1, value2, "sourcePicUrl");
            return (Criteria) this;
        }

        public Criteria andSourcePicTitleIsNull() {
            addCriterion("source_pic_title is null");
            return (Criteria) this;
        }

        public Criteria andSourcePicTitleIsNotNull() {
            addCriterion("source_pic_title is not null");
            return (Criteria) this;
        }

        public Criteria andSourcePicTitleEqualTo(String value) {
            addCriterion("source_pic_title =", value, "sourcePicTitle");
            return (Criteria) this;
        }

        public Criteria andSourcePicTitleNotEqualTo(String value) {
            addCriterion("source_pic_title <>", value, "sourcePicTitle");
            return (Criteria) this;
        }

        public Criteria andSourcePicTitleGreaterThan(String value) {
            addCriterion("source_pic_title >", value, "sourcePicTitle");
            return (Criteria) this;
        }

        public Criteria andSourcePicTitleGreaterThanOrEqualTo(String value) {
            addCriterion("source_pic_title >=", value, "sourcePicTitle");
            return (Criteria) this;
        }

        public Criteria andSourcePicTitleLessThan(String value) {
            addCriterion("source_pic_title <", value, "sourcePicTitle");
            return (Criteria) this;
        }

        public Criteria andSourcePicTitleLessThanOrEqualTo(String value) {
            addCriterion("source_pic_title <=", value, "sourcePicTitle");
            return (Criteria) this;
        }

        public Criteria andSourcePicTitleIn(List<String> values) {
            addCriterion("source_pic_title in", values, "sourcePicTitle");
            return (Criteria) this;
        }

        public Criteria andSourcePicTitleNotIn(List<String> values) {
            addCriterion("source_pic_title not in", values, "sourcePicTitle");
            return (Criteria) this;
        }

        public Criteria andSourcePicTitleBetween(String value1, String value2) {
            addCriterion("source_pic_title between", value1, value2, "sourcePicTitle");
            return (Criteria) this;
        }

        public Criteria andSourcePicTitleNotBetween(String value1, String value2) {
            addCriterion("source_pic_title not between", value1, value2, "sourcePicTitle");
            return (Criteria) this;
        }

        public Criteria andWmEPoiContainerAreaSourcecolIsNull() {
            addCriterion("wm_e_poi_container_area_sourcecol is null");
            return (Criteria) this;
        }

        public Criteria andWmEPoiContainerAreaSourcecolIsNotNull() {
            addCriterion("wm_e_poi_container_area_sourcecol is not null");
            return (Criteria) this;
        }

        public Criteria andWmEPoiContainerAreaSourcecolEqualTo(String value) {
            addCriterion("wm_e_poi_container_area_sourcecol =", value, "wmEPoiContainerAreaSourcecol");
            return (Criteria) this;
        }

        public Criteria andWmEPoiContainerAreaSourcecolNotEqualTo(String value) {
            addCriterion("wm_e_poi_container_area_sourcecol <>", value, "wmEPoiContainerAreaSourcecol");
            return (Criteria) this;
        }

        public Criteria andWmEPoiContainerAreaSourcecolGreaterThan(String value) {
            addCriterion("wm_e_poi_container_area_sourcecol >", value, "wmEPoiContainerAreaSourcecol");
            return (Criteria) this;
        }

        public Criteria andWmEPoiContainerAreaSourcecolGreaterThanOrEqualTo(String value) {
            addCriterion("wm_e_poi_container_area_sourcecol >=", value, "wmEPoiContainerAreaSourcecol");
            return (Criteria) this;
        }

        public Criteria andWmEPoiContainerAreaSourcecolLessThan(String value) {
            addCriterion("wm_e_poi_container_area_sourcecol <", value, "wmEPoiContainerAreaSourcecol");
            return (Criteria) this;
        }

        public Criteria andWmEPoiContainerAreaSourcecolLessThanOrEqualTo(String value) {
            addCriterion("wm_e_poi_container_area_sourcecol <=", value, "wmEPoiContainerAreaSourcecol");
            return (Criteria) this;
        }

        public Criteria andWmEPoiContainerAreaSourcecolIn(List<String> values) {
            addCriterion("wm_e_poi_container_area_sourcecol in", values, "wmEPoiContainerAreaSourcecol");
            return (Criteria) this;
        }

        public Criteria andWmEPoiContainerAreaSourcecolNotIn(List<String> values) {
            addCriterion("wm_e_poi_container_area_sourcecol not in", values, "wmEPoiContainerAreaSourcecol");
            return (Criteria) this;
        }

        public Criteria andWmEPoiContainerAreaSourcecolBetween(String value1, String value2) {
            addCriterion("wm_e_poi_container_area_sourcecol between", value1, value2, "wmEPoiContainerAreaSourcecol");
            return (Criteria) this;
        }

        public Criteria andWmEPoiContainerAreaSourcecolNotBetween(String value1, String value2) {
            addCriterion("wm_e_poi_container_area_sourcecol not between", value1, value2, "wmEPoiContainerAreaSourcecol");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdIsNull() {
            addCriterion("product_spu_id is null");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdIsNotNull() {
            addCriterion("product_spu_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdEqualTo(Integer value) {
            addCriterion("product_spu_id =", value, "productSpuId");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdNotEqualTo(Integer value) {
            addCriterion("product_spu_id <>", value, "productSpuId");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdGreaterThan(Integer value) {
            addCriterion("product_spu_id >", value, "productSpuId");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_spu_id >=", value, "productSpuId");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdLessThan(Integer value) {
            addCriterion("product_spu_id <", value, "productSpuId");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_spu_id <=", value, "productSpuId");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdIn(List<Integer> values) {
            addCriterion("product_spu_id in", values, "productSpuId");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdNotIn(List<Integer> values) {
            addCriterion("product_spu_id not in", values, "productSpuId");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdBetween(Integer value1, Integer value2) {
            addCriterion("product_spu_id between", value1, value2, "productSpuId");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_spu_id not between", value1, value2, "productSpuId");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdsIsNull() {
            addCriterion("product_spu_ids is null");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdsIsNotNull() {
            addCriterion("product_spu_ids is not null");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdsEqualTo(String value) {
            addCriterion("product_spu_ids =", value, "productSpuIds");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdsNotEqualTo(String value) {
            addCriterion("product_spu_ids <>", value, "productSpuIds");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdsGreaterThan(String value) {
            addCriterion("product_spu_ids >", value, "productSpuIds");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdsGreaterThanOrEqualTo(String value) {
            addCriterion("product_spu_ids >=", value, "productSpuIds");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdsLessThan(String value) {
            addCriterion("product_spu_ids <", value, "productSpuIds");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdsLessThanOrEqualTo(String value) {
            addCriterion("product_spu_ids <=", value, "productSpuIds");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdsIn(List<String> values) {
            addCriterion("product_spu_ids in", values, "productSpuIds");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdsNotIn(List<String> values) {
            addCriterion("product_spu_ids not in", values, "productSpuIds");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdsBetween(String value1, String value2) {
            addCriterion("product_spu_ids between", value1, value2, "productSpuIds");
            return (Criteria) this;
        }

        public Criteria andProductSpuIdsNotBetween(String value1, String value2) {
            addCriterion("product_spu_ids not between", value1, value2, "productSpuIds");
            return (Criteria) this;
        }

        public Criteria andClickUrlIsNull() {
            addCriterion("click_url is null");
            return (Criteria) this;
        }

        public Criteria andClickUrlIsNotNull() {
            addCriterion("click_url is not null");
            return (Criteria) this;
        }

        public Criteria andClickUrlEqualTo(String value) {
            addCriterion("click_url =", value, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andClickUrlNotEqualTo(String value) {
            addCriterion("click_url <>", value, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andClickUrlGreaterThan(String value) {
            addCriterion("click_url >", value, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andClickUrlGreaterThanOrEqualTo(String value) {
            addCriterion("click_url >=", value, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andClickUrlLessThan(String value) {
            addCriterion("click_url <", value, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andClickUrlLessThanOrEqualTo(String value) {
            addCriterion("click_url <=", value, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andClickUrlIn(List<String> values) {
            addCriterion("click_url in", values, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andClickUrlNotIn(List<String> values) {
            addCriterion("click_url not in", values, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andClickUrlBetween(String value1, String value2) {
            addCriterion("click_url between", value1, value2, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andClickUrlNotBetween(String value1, String value2) {
            addCriterion("click_url not between", value1, value2, "clickUrl");
            return (Criteria) this;
        }

        public Criteria andSourceContentIsNull() {
            addCriterion("source_content is null");
            return (Criteria) this;
        }

        public Criteria andSourceContentIsNotNull() {
            addCriterion("source_content is not null");
            return (Criteria) this;
        }

        public Criteria andSourceContentEqualTo(String value) {
            addCriterion("source_content =", value, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andSourceContentNotEqualTo(String value) {
            addCriterion("source_content <>", value, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andSourceContentGreaterThan(String value) {
            addCriterion("source_content >", value, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andSourceContentGreaterThanOrEqualTo(String value) {
            addCriterion("source_content >=", value, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andSourceContentLessThan(String value) {
            addCriterion("source_content <", value, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andSourceContentLessThanOrEqualTo(String value) {
            addCriterion("source_content <=", value, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andSourceContentIn(List<String> values) {
            addCriterion("source_content in", values, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andSourceContentNotIn(List<String> values) {
            addCriterion("source_content not in", values, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andSourceContentBetween(String value1, String value2) {
            addCriterion("source_content between", value1, value2, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andSourceContentNotBetween(String value1, String value2) {
            addCriterion("source_content not between", value1, value2, "sourceContent");
            return (Criteria) this;
        }

        public Criteria andExtendAttrIsNull() {
            addCriterion("extend_attr is null");
            return (Criteria) this;
        }

        public Criteria andExtendAttrIsNotNull() {
            addCriterion("extend_attr is not null");
            return (Criteria) this;
        }

        public Criteria andExtendAttrEqualTo(String value) {
            addCriterion("extend_attr =", value, "extendAttr");
            return (Criteria) this;
        }

        public Criteria andExtendAttrNotEqualTo(String value) {
            addCriterion("extend_attr <>", value, "extendAttr");
            return (Criteria) this;
        }

        public Criteria andExtendAttrGreaterThan(String value) {
            addCriterion("extend_attr >", value, "extendAttr");
            return (Criteria) this;
        }

        public Criteria andExtendAttrGreaterThanOrEqualTo(String value) {
            addCriterion("extend_attr >=", value, "extendAttr");
            return (Criteria) this;
        }

        public Criteria andExtendAttrLessThan(String value) {
            addCriterion("extend_attr <", value, "extendAttr");
            return (Criteria) this;
        }

        public Criteria andExtendAttrLessThanOrEqualTo(String value) {
            addCriterion("extend_attr <=", value, "extendAttr");
            return (Criteria) this;
        }

        public Criteria andExtendAttrIn(List<String> values) {
            addCriterion("extend_attr in", values, "extendAttr");
            return (Criteria) this;
        }

        public Criteria andExtendAttrNotIn(List<String> values) {
            addCriterion("extend_attr not in", values, "extendAttr");
            return (Criteria) this;
        }

        public Criteria andExtendAttrBetween(String value1, String value2) {
            addCriterion("extend_attr between", value1, value2, "extendAttr");
            return (Criteria) this;
        }

        public Criteria andExtendAttrNotBetween(String value1, String value2) {
            addCriterion("extend_attr not between", value1, value2, "extendAttr");
            return (Criteria) this;
        }

        public Criteria andContainerIdIsNull() {
            addCriterion("container_id is null");
            return (Criteria) this;
        }

        public Criteria andContainerIdIsNotNull() {
            addCriterion("container_id is not null");
            return (Criteria) this;
        }

        public Criteria andContainerIdEqualTo(Integer value) {
            addCriterion("container_id =", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdNotEqualTo(Integer value) {
            addCriterion("container_id <>", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdGreaterThan(Integer value) {
            addCriterion("container_id >", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("container_id >=", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdLessThan(Integer value) {
            addCriterion("container_id <", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdLessThanOrEqualTo(Integer value) {
            addCriterion("container_id <=", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdIn(List<Integer> values) {
            addCriterion("container_id in", values, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdNotIn(List<Integer> values) {
            addCriterion("container_id not in", values, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdBetween(Integer value1, Integer value2) {
            addCriterion("container_id between", value1, value2, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("container_id not between", value1, value2, "containerId");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNull() {
            addCriterion("sequence is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNotNull() {
            addCriterion("sequence is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceEqualTo(Integer value) {
            addCriterion("sequence =", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotEqualTo(Integer value) {
            addCriterion("sequence <>", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThan(Integer value) {
            addCriterion("sequence >", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("sequence >=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThan(Integer value) {
            addCriterion("sequence <", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("sequence <=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceIn(List<Integer> values) {
            addCriterion("sequence in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotIn(List<Integer> values) {
            addCriterion("sequence not in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceBetween(Integer value1, Integer value2) {
            addCriterion("sequence between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("sequence not between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andAreaNoIsNull() {
            addCriterion("area_no is null");
            return (Criteria) this;
        }

        public Criteria andAreaNoIsNotNull() {
            addCriterion("area_no is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNoEqualTo(String value) {
            addCriterion("area_no =", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoNotEqualTo(String value) {
            addCriterion("area_no <>", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoGreaterThan(String value) {
            addCriterion("area_no >", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoGreaterThanOrEqualTo(String value) {
            addCriterion("area_no >=", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoLessThan(String value) {
            addCriterion("area_no <", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoLessThanOrEqualTo(String value) {
            addCriterion("area_no <=", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoIn(List<String> values) {
            addCriterion("area_no in", values, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoNotIn(List<String> values) {
            addCriterion("area_no not in", values, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoBetween(String value1, String value2) {
            addCriterion("area_no between", value1, value2, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoNotBetween(String value1, String value2) {
            addCriterion("area_no not between", value1, value2, "areaNo");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("valid is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("valid is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Short value) {
            addCriterion("valid =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Short value) {
            addCriterion("valid <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Short value) {
            addCriterion("valid >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Short value) {
            addCriterion("valid >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Short value) {
            addCriterion("valid <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Short value) {
            addCriterion("valid <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Short> values) {
            addCriterion("valid in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Short> values) {
            addCriterion("valid not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Short value1, Short value2) {
            addCriterion("valid between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Short value1, Short value2) {
            addCriterion("valid not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Integer value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Integer value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Integer value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Integer value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Integer value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Integer> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Integer> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Integer value1, Integer value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNull() {
            addCriterion("utime is null");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNotNull() {
            addCriterion("utime is not null");
            return (Criteria) this;
        }

        public Criteria andUtimeEqualTo(Integer value) {
            addCriterion("utime =", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotEqualTo(Integer value) {
            addCriterion("utime <>", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThan(Integer value) {
            addCriterion("utime >", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("utime >=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThan(Integer value) {
            addCriterion("utime <", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThanOrEqualTo(Integer value) {
            addCriterion("utime <=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeIn(List<Integer> values) {
            addCriterion("utime in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotIn(List<Integer> values) {
            addCriterion("utime not in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeBetween(Integer value1, Integer value2) {
            addCriterion("utime between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("utime not between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIsNull() {
            addCriterion("verify_status is null");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIsNotNull() {
            addCriterion("verify_status is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusEqualTo(Integer value) {
            addCriterion("verify_status =", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotEqualTo(Integer value) {
            addCriterion("verify_status <>", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusGreaterThan(Integer value) {
            addCriterion("verify_status >", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("verify_status >=", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusLessThan(Integer value) {
            addCriterion("verify_status <", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("verify_status <=", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIn(List<Integer> values) {
            addCriterion("verify_status in", values, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotIn(List<Integer> values) {
            addCriterion("verify_status not in", values, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusBetween(Integer value1, Integer value2) {
            addCriterion("verify_status between", value1, value2, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("verify_status not between", value1, value2, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyIdIsNull() {
            addCriterion("verify_id is null");
            return (Criteria) this;
        }

        public Criteria andVerifyIdIsNotNull() {
            addCriterion("verify_id is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyIdEqualTo(String value) {
            addCriterion("verify_id =", value, "verifyId");
            return (Criteria) this;
        }

        public Criteria andVerifyIdNotEqualTo(String value) {
            addCriterion("verify_id <>", value, "verifyId");
            return (Criteria) this;
        }

        public Criteria andVerifyIdGreaterThan(String value) {
            addCriterion("verify_id >", value, "verifyId");
            return (Criteria) this;
        }

        public Criteria andVerifyIdGreaterThanOrEqualTo(String value) {
            addCriterion("verify_id >=", value, "verifyId");
            return (Criteria) this;
        }

        public Criteria andVerifyIdLessThan(String value) {
            addCriterion("verify_id <", value, "verifyId");
            return (Criteria) this;
        }

        public Criteria andVerifyIdLessThanOrEqualTo(String value) {
            addCriterion("verify_id <=", value, "verifyId");
            return (Criteria) this;
        }

        public Criteria andVerifyIdIn(List<String> values) {
            addCriterion("verify_id in", values, "verifyId");
            return (Criteria) this;
        }

        public Criteria andVerifyIdNotIn(List<String> values) {
            addCriterion("verify_id not in", values, "verifyId");
            return (Criteria) this;
        }

        public Criteria andVerifyIdBetween(String value1, String value2) {
            addCriterion("verify_id between", value1, value2, "verifyId");
            return (Criteria) this;
        }

        public Criteria andVerifyIdNotBetween(String value1, String value2) {
            addCriterion("verify_id not between", value1, value2, "verifyId");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIsNull() {
            addCriterion("status_code is null");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIsNotNull() {
            addCriterion("status_code is not null");
            return (Criteria) this;
        }

        public Criteria andStatusCodeEqualTo(Integer value) {
            addCriterion("status_code =", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotEqualTo(Integer value) {
            addCriterion("status_code <>", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeGreaterThan(Integer value) {
            addCriterion("status_code >", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("status_code >=", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLessThan(Integer value) {
            addCriterion("status_code <", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLessThanOrEqualTo(Integer value) {
            addCriterion("status_code <=", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIn(List<Integer> values) {
            addCriterion("status_code in", values, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotIn(List<Integer> values) {
            addCriterion("status_code not in", values, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeBetween(Integer value1, Integer value2) {
            addCriterion("status_code between", value1, value2, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("status_code not between", value1, value2, "statusCode");
            return (Criteria) this;
        }

        public Criteria andDisplayStartDayIsNull() {
            addCriterion("display_start_day is null");
            return (Criteria) this;
        }

        public Criteria andDisplayStartDayIsNotNull() {
            addCriterion("display_start_day is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayStartDayEqualTo(Integer value) {
            addCriterion("display_start_day =", value, "displayStartDay");
            return (Criteria) this;
        }

        public Criteria andDisplayStartDayNotEqualTo(Integer value) {
            addCriterion("display_start_day <>", value, "displayStartDay");
            return (Criteria) this;
        }

        public Criteria andDisplayStartDayGreaterThan(Integer value) {
            addCriterion("display_start_day >", value, "displayStartDay");
            return (Criteria) this;
        }

        public Criteria andDisplayStartDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("display_start_day >=", value, "displayStartDay");
            return (Criteria) this;
        }

        public Criteria andDisplayStartDayLessThan(Integer value) {
            addCriterion("display_start_day <", value, "displayStartDay");
            return (Criteria) this;
        }

        public Criteria andDisplayStartDayLessThanOrEqualTo(Integer value) {
            addCriterion("display_start_day <=", value, "displayStartDay");
            return (Criteria) this;
        }

        public Criteria andDisplayStartDayIn(List<Integer> values) {
            addCriterion("display_start_day in", values, "displayStartDay");
            return (Criteria) this;
        }

        public Criteria andDisplayStartDayNotIn(List<Integer> values) {
            addCriterion("display_start_day not in", values, "displayStartDay");
            return (Criteria) this;
        }

        public Criteria andDisplayStartDayBetween(Integer value1, Integer value2) {
            addCriterion("display_start_day between", value1, value2, "displayStartDay");
            return (Criteria) this;
        }

        public Criteria andDisplayStartDayNotBetween(Integer value1, Integer value2) {
            addCriterion("display_start_day not between", value1, value2, "displayStartDay");
            return (Criteria) this;
        }

        public Criteria andDisplayEndDayIsNull() {
            addCriterion("display_end_day is null");
            return (Criteria) this;
        }

        public Criteria andDisplayEndDayIsNotNull() {
            addCriterion("display_end_day is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayEndDayEqualTo(Integer value) {
            addCriterion("display_end_day =", value, "displayEndDay");
            return (Criteria) this;
        }

        public Criteria andDisplayEndDayNotEqualTo(Integer value) {
            addCriterion("display_end_day <>", value, "displayEndDay");
            return (Criteria) this;
        }

        public Criteria andDisplayEndDayGreaterThan(Integer value) {
            addCriterion("display_end_day >", value, "displayEndDay");
            return (Criteria) this;
        }

        public Criteria andDisplayEndDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("display_end_day >=", value, "displayEndDay");
            return (Criteria) this;
        }

        public Criteria andDisplayEndDayLessThan(Integer value) {
            addCriterion("display_end_day <", value, "displayEndDay");
            return (Criteria) this;
        }

        public Criteria andDisplayEndDayLessThanOrEqualTo(Integer value) {
            addCriterion("display_end_day <=", value, "displayEndDay");
            return (Criteria) this;
        }

        public Criteria andDisplayEndDayIn(List<Integer> values) {
            addCriterion("display_end_day in", values, "displayEndDay");
            return (Criteria) this;
        }

        public Criteria andDisplayEndDayNotIn(List<Integer> values) {
            addCriterion("display_end_day not in", values, "displayEndDay");
            return (Criteria) this;
        }

        public Criteria andDisplayEndDayBetween(Integer value1, Integer value2) {
            addCriterion("display_end_day between", value1, value2, "displayEndDay");
            return (Criteria) this;
        }

        public Criteria andDisplayEndDayNotBetween(Integer value1, Integer value2) {
            addCriterion("display_end_day not between", value1, value2, "displayEndDay");
            return (Criteria) this;
        }

        public Criteria andDisplayStimeIsNull() {
            addCriterion("display_stime is null");
            return (Criteria) this;
        }

        public Criteria andDisplayStimeIsNotNull() {
            addCriterion("display_stime is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayStimeEqualTo(Integer value) {
            addCriterion("display_stime =", value, "displayStime");
            return (Criteria) this;
        }

        public Criteria andDisplayStimeNotEqualTo(Integer value) {
            addCriterion("display_stime <>", value, "displayStime");
            return (Criteria) this;
        }

        public Criteria andDisplayStimeGreaterThan(Integer value) {
            addCriterion("display_stime >", value, "displayStime");
            return (Criteria) this;
        }

        public Criteria andDisplayStimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("display_stime >=", value, "displayStime");
            return (Criteria) this;
        }

        public Criteria andDisplayStimeLessThan(Integer value) {
            addCriterion("display_stime <", value, "displayStime");
            return (Criteria) this;
        }

        public Criteria andDisplayStimeLessThanOrEqualTo(Integer value) {
            addCriterion("display_stime <=", value, "displayStime");
            return (Criteria) this;
        }

        public Criteria andDisplayStimeIn(List<Integer> values) {
            addCriterion("display_stime in", values, "displayStime");
            return (Criteria) this;
        }

        public Criteria andDisplayStimeNotIn(List<Integer> values) {
            addCriterion("display_stime not in", values, "displayStime");
            return (Criteria) this;
        }

        public Criteria andDisplayStimeBetween(Integer value1, Integer value2) {
            addCriterion("display_stime between", value1, value2, "displayStime");
            return (Criteria) this;
        }

        public Criteria andDisplayStimeNotBetween(Integer value1, Integer value2) {
            addCriterion("display_stime not between", value1, value2, "displayStime");
            return (Criteria) this;
        }

        public Criteria andDisplayEtimeIsNull() {
            addCriterion("display_etime is null");
            return (Criteria) this;
        }

        public Criteria andDisplayEtimeIsNotNull() {
            addCriterion("display_etime is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayEtimeEqualTo(Integer value) {
            addCriterion("display_etime =", value, "displayEtime");
            return (Criteria) this;
        }

        public Criteria andDisplayEtimeNotEqualTo(Integer value) {
            addCriterion("display_etime <>", value, "displayEtime");
            return (Criteria) this;
        }

        public Criteria andDisplayEtimeGreaterThan(Integer value) {
            addCriterion("display_etime >", value, "displayEtime");
            return (Criteria) this;
        }

        public Criteria andDisplayEtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("display_etime >=", value, "displayEtime");
            return (Criteria) this;
        }

        public Criteria andDisplayEtimeLessThan(Integer value) {
            addCriterion("display_etime <", value, "displayEtime");
            return (Criteria) this;
        }

        public Criteria andDisplayEtimeLessThanOrEqualTo(Integer value) {
            addCriterion("display_etime <=", value, "displayEtime");
            return (Criteria) this;
        }

        public Criteria andDisplayEtimeIn(List<Integer> values) {
            addCriterion("display_etime in", values, "displayEtime");
            return (Criteria) this;
        }

        public Criteria andDisplayEtimeNotIn(List<Integer> values) {
            addCriterion("display_etime not in", values, "displayEtime");
            return (Criteria) this;
        }

        public Criteria andDisplayEtimeBetween(Integer value1, Integer value2) {
            addCriterion("display_etime between", value1, value2, "displayEtime");
            return (Criteria) this;
        }

        public Criteria andDisplayEtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("display_etime not between", value1, value2, "displayEtime");
            return (Criteria) this;
        }

        public Criteria andDisplayWeeksIsNull() {
            addCriterion("display_weeks is null");
            return (Criteria) this;
        }

        public Criteria andDisplayWeeksIsNotNull() {
            addCriterion("display_weeks is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayWeeksEqualTo(String value) {
            addCriterion("display_weeks =", value, "displayWeeks");
            return (Criteria) this;
        }

        public Criteria andDisplayWeeksNotEqualTo(String value) {
            addCriterion("display_weeks <>", value, "displayWeeks");
            return (Criteria) this;
        }

        public Criteria andDisplayWeeksGreaterThan(String value) {
            addCriterion("display_weeks >", value, "displayWeeks");
            return (Criteria) this;
        }

        public Criteria andDisplayWeeksGreaterThanOrEqualTo(String value) {
            addCriterion("display_weeks >=", value, "displayWeeks");
            return (Criteria) this;
        }

        public Criteria andDisplayWeeksLessThan(String value) {
            addCriterion("display_weeks <", value, "displayWeeks");
            return (Criteria) this;
        }

        public Criteria andDisplayWeeksLessThanOrEqualTo(String value) {
            addCriterion("display_weeks <=", value, "displayWeeks");
            return (Criteria) this;
        }

        public Criteria andDisplayWeeksIn(List<String> values) {
            addCriterion("display_weeks in", values, "displayWeeks");
            return (Criteria) this;
        }

        public Criteria andDisplayWeeksNotIn(List<String> values) {
            addCriterion("display_weeks not in", values, "displayWeeks");
            return (Criteria) this;
        }

        public Criteria andDisplayWeeksBetween(String value1, String value2) {
            addCriterion("display_weeks between", value1, value2, "displayWeeks");
            return (Criteria) this;
        }

        public Criteria andDisplayWeeksNotBetween(String value1, String value2) {
            addCriterion("display_weeks not between", value1, value2, "displayWeeks");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNull() {
            addCriterion("template_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(Integer value) {
            addCriterion("template_id =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(Integer value) {
            addCriterion("template_id <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(Integer value) {
            addCriterion("template_id >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("template_id >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(Integer value) {
            addCriterion("template_id <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("template_id <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<Integer> values) {
            addCriterion("template_id in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<Integer> values) {
            addCriterion("template_id not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("template_id between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("template_id not between", value1, value2, "templateId");
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

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andInputTextInfoIsNull() {
            addCriterion("input_text_info is null");
            return (Criteria) this;
        }

        public Criteria andInputTextInfoIsNotNull() {
            addCriterion("input_text_info is not null");
            return (Criteria) this;
        }

        public Criteria andInputTextInfoEqualTo(String value) {
            addCriterion("input_text_info =", value, "inputTextInfo");
            return (Criteria) this;
        }

        public Criteria andInputTextInfoNotEqualTo(String value) {
            addCriterion("input_text_info <>", value, "inputTextInfo");
            return (Criteria) this;
        }

        public Criteria andInputTextInfoGreaterThan(String value) {
            addCriterion("input_text_info >", value, "inputTextInfo");
            return (Criteria) this;
        }

        public Criteria andInputTextInfoGreaterThanOrEqualTo(String value) {
            addCriterion("input_text_info >=", value, "inputTextInfo");
            return (Criteria) this;
        }

        public Criteria andInputTextInfoLessThan(String value) {
            addCriterion("input_text_info <", value, "inputTextInfo");
            return (Criteria) this;
        }

        public Criteria andInputTextInfoLessThanOrEqualTo(String value) {
            addCriterion("input_text_info <=", value, "inputTextInfo");
            return (Criteria) this;
        }

        public Criteria andInputTextInfoIn(List<String> values) {
            addCriterion("input_text_info in", values, "inputTextInfo");
            return (Criteria) this;
        }

        public Criteria andInputTextInfoNotIn(List<String> values) {
            addCriterion("input_text_info not in", values, "inputTextInfo");
            return (Criteria) this;
        }

        public Criteria andInputTextInfoBetween(String value1, String value2) {
            addCriterion("input_text_info between", value1, value2, "inputTextInfo");
            return (Criteria) this;
        }

        public Criteria andInputTextInfoNotBetween(String value1, String value2) {
            addCriterion("input_text_info not between", value1, value2, "inputTextInfo");
            return (Criteria) this;
        }

        public Criteria andFormTypeIsNull() {
            addCriterion("form_type is null");
            return (Criteria) this;
        }

        public Criteria andFormTypeIsNotNull() {
            addCriterion("form_type is not null");
            return (Criteria) this;
        }

        public Criteria andFormTypeEqualTo(Integer value) {
            addCriterion("form_type =", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeNotEqualTo(Integer value) {
            addCriterion("form_type <>", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeGreaterThan(Integer value) {
            addCriterion("form_type >", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("form_type >=", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeLessThan(Integer value) {
            addCriterion("form_type <", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeLessThanOrEqualTo(Integer value) {
            addCriterion("form_type <=", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeIn(List<Integer> values) {
            addCriterion("form_type in", values, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeNotIn(List<Integer> values) {
            addCriterion("form_type not in", values, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeBetween(Integer value1, Integer value2) {
            addCriterion("form_type between", value1, value2, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("form_type not between", value1, value2, "formType");
            return (Criteria) this;
        }

    }

    public static class Criteria extends BaseCriteria {

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
        
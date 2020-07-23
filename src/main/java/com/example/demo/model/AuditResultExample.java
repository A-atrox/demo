package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuditResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuditResultExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("project_id like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("project_id not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andAuditCodeIsNull() {
            addCriterion("audit_code is null");
            return (Criteria) this;
        }

        public Criteria andAuditCodeIsNotNull() {
            addCriterion("audit_code is not null");
            return (Criteria) this;
        }

        public Criteria andAuditCodeEqualTo(String value) {
            addCriterion("audit_code =", value, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeNotEqualTo(String value) {
            addCriterion("audit_code <>", value, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeGreaterThan(String value) {
            addCriterion("audit_code >", value, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeGreaterThanOrEqualTo(String value) {
            addCriterion("audit_code >=", value, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeLessThan(String value) {
            addCriterion("audit_code <", value, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeLessThanOrEqualTo(String value) {
            addCriterion("audit_code <=", value, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeLike(String value) {
            addCriterion("audit_code like", value, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeNotLike(String value) {
            addCriterion("audit_code not like", value, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeIn(List<String> values) {
            addCriterion("audit_code in", values, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeNotIn(List<String> values) {
            addCriterion("audit_code not in", values, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeBetween(String value1, String value2) {
            addCriterion("audit_code between", value1, value2, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeNotBetween(String value1, String value2) {
            addCriterion("audit_code not between", value1, value2, "auditCode");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(String value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(String value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(String value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(String value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(String value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(String value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLike(String value) {
            addCriterion("model_id like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotLike(String value) {
            addCriterion("model_id not like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<String> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<String> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(String value1, String value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(String value1, String value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andComponentUidIsNull() {
            addCriterion("component_uid is null");
            return (Criteria) this;
        }

        public Criteria andComponentUidIsNotNull() {
            addCriterion("component_uid is not null");
            return (Criteria) this;
        }

        public Criteria andComponentUidEqualTo(String value) {
            addCriterion("component_uid =", value, "componentUid");
            return (Criteria) this;
        }

        public Criteria andComponentUidNotEqualTo(String value) {
            addCriterion("component_uid <>", value, "componentUid");
            return (Criteria) this;
        }

        public Criteria andComponentUidGreaterThan(String value) {
            addCriterion("component_uid >", value, "componentUid");
            return (Criteria) this;
        }

        public Criteria andComponentUidGreaterThanOrEqualTo(String value) {
            addCriterion("component_uid >=", value, "componentUid");
            return (Criteria) this;
        }

        public Criteria andComponentUidLessThan(String value) {
            addCriterion("component_uid <", value, "componentUid");
            return (Criteria) this;
        }

        public Criteria andComponentUidLessThanOrEqualTo(String value) {
            addCriterion("component_uid <=", value, "componentUid");
            return (Criteria) this;
        }

        public Criteria andComponentUidLike(String value) {
            addCriterion("component_uid like", value, "componentUid");
            return (Criteria) this;
        }

        public Criteria andComponentUidNotLike(String value) {
            addCriterion("component_uid not like", value, "componentUid");
            return (Criteria) this;
        }

        public Criteria andComponentUidIn(List<String> values) {
            addCriterion("component_uid in", values, "componentUid");
            return (Criteria) this;
        }

        public Criteria andComponentUidNotIn(List<String> values) {
            addCriterion("component_uid not in", values, "componentUid");
            return (Criteria) this;
        }

        public Criteria andComponentUidBetween(String value1, String value2) {
            addCriterion("component_uid between", value1, value2, "componentUid");
            return (Criteria) this;
        }

        public Criteria andComponentUidNotBetween(String value1, String value2) {
            addCriterion("component_uid not between", value1, value2, "componentUid");
            return (Criteria) this;
        }

        public Criteria andAuditItemCodeIsNull() {
            addCriterion("audit_item_code is null");
            return (Criteria) this;
        }

        public Criteria andAuditItemCodeIsNotNull() {
            addCriterion("audit_item_code is not null");
            return (Criteria) this;
        }

        public Criteria andAuditItemCodeEqualTo(String value) {
            addCriterion("audit_item_code =", value, "auditItemCode");
            return (Criteria) this;
        }

        public Criteria andAuditItemCodeNotEqualTo(String value) {
            addCriterion("audit_item_code <>", value, "auditItemCode");
            return (Criteria) this;
        }

        public Criteria andAuditItemCodeGreaterThan(String value) {
            addCriterion("audit_item_code >", value, "auditItemCode");
            return (Criteria) this;
        }

        public Criteria andAuditItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("audit_item_code >=", value, "auditItemCode");
            return (Criteria) this;
        }

        public Criteria andAuditItemCodeLessThan(String value) {
            addCriterion("audit_item_code <", value, "auditItemCode");
            return (Criteria) this;
        }

        public Criteria andAuditItemCodeLessThanOrEqualTo(String value) {
            addCriterion("audit_item_code <=", value, "auditItemCode");
            return (Criteria) this;
        }

        public Criteria andAuditItemCodeLike(String value) {
            addCriterion("audit_item_code like", value, "auditItemCode");
            return (Criteria) this;
        }

        public Criteria andAuditItemCodeNotLike(String value) {
            addCriterion("audit_item_code not like", value, "auditItemCode");
            return (Criteria) this;
        }

        public Criteria andAuditItemCodeIn(List<String> values) {
            addCriterion("audit_item_code in", values, "auditItemCode");
            return (Criteria) this;
        }

        public Criteria andAuditItemCodeNotIn(List<String> values) {
            addCriterion("audit_item_code not in", values, "auditItemCode");
            return (Criteria) this;
        }

        public Criteria andAuditItemCodeBetween(String value1, String value2) {
            addCriterion("audit_item_code between", value1, value2, "auditItemCode");
            return (Criteria) this;
        }

        public Criteria andAuditItemCodeNotBetween(String value1, String value2) {
            addCriterion("audit_item_code not between", value1, value2, "auditItemCode");
            return (Criteria) this;
        }

        public Criteria andAuditItemResultIsNull() {
            addCriterion("audit_item_result is null");
            return (Criteria) this;
        }

        public Criteria andAuditItemResultIsNotNull() {
            addCriterion("audit_item_result is not null");
            return (Criteria) this;
        }

        public Criteria andAuditItemResultEqualTo(String value) {
            addCriterion("audit_item_result =", value, "auditItemResult");
            return (Criteria) this;
        }

        public Criteria andAuditItemResultNotEqualTo(String value) {
            addCriterion("audit_item_result <>", value, "auditItemResult");
            return (Criteria) this;
        }

        public Criteria andAuditItemResultGreaterThan(String value) {
            addCriterion("audit_item_result >", value, "auditItemResult");
            return (Criteria) this;
        }

        public Criteria andAuditItemResultGreaterThanOrEqualTo(String value) {
            addCriterion("audit_item_result >=", value, "auditItemResult");
            return (Criteria) this;
        }

        public Criteria andAuditItemResultLessThan(String value) {
            addCriterion("audit_item_result <", value, "auditItemResult");
            return (Criteria) this;
        }

        public Criteria andAuditItemResultLessThanOrEqualTo(String value) {
            addCriterion("audit_item_result <=", value, "auditItemResult");
            return (Criteria) this;
        }

        public Criteria andAuditItemResultLike(String value) {
            addCriterion("audit_item_result like", value, "auditItemResult");
            return (Criteria) this;
        }

        public Criteria andAuditItemResultNotLike(String value) {
            addCriterion("audit_item_result not like", value, "auditItemResult");
            return (Criteria) this;
        }

        public Criteria andAuditItemResultIn(List<String> values) {
            addCriterion("audit_item_result in", values, "auditItemResult");
            return (Criteria) this;
        }

        public Criteria andAuditItemResultNotIn(List<String> values) {
            addCriterion("audit_item_result not in", values, "auditItemResult");
            return (Criteria) this;
        }

        public Criteria andAuditItemResultBetween(String value1, String value2) {
            addCriterion("audit_item_result between", value1, value2, "auditItemResult");
            return (Criteria) this;
        }

        public Criteria andAuditItemResultNotBetween(String value1, String value2) {
            addCriterion("audit_item_result not between", value1, value2, "auditItemResult");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
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
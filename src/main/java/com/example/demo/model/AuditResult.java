package com.example.demo.model;

import java.util.Date;

public class AuditResult {
    private Long id;

    private String projectId;

    private String auditCode;

    private String modelId;

    private String componentUid;

    private String auditItemCode;

    private String auditItemResult;

    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getAuditCode() {
        return auditCode;
    }

    public void setAuditCode(String auditCode) {
        this.auditCode = auditCode;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getComponentUid() {
        return componentUid;
    }

    public void setComponentUid(String componentUid) {
        this.componentUid = componentUid;
    }

    public String getAuditItemCode() {
        return auditItemCode;
    }

    public void setAuditItemCode(String auditItemCode) {
        this.auditItemCode = auditItemCode;
    }

    public String getAuditItemResult() {
        return auditItemResult;
    }

    public void setAuditItemResult(String auditItemResult) {
        this.auditItemResult = auditItemResult;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
package com.example.demo.mapper;

import com.example.demo.model.AuditResult;

public interface AuditResultMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AuditResult record);

    int insertSelective(AuditResult record);

    AuditResult selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuditResult record);

    int updateByPrimaryKey(AuditResult record);
}
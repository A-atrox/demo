package com.example.demo.mapper;

import com.example.demo.model.AuditResult;
import com.example.demo.model.AuditResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuditResultMapper {
    int countByExample(AuditResultExample example);

    int deleteByExample(AuditResultExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AuditResult record);

    int insertSelective(AuditResult record);

    List<AuditResult> selectByExample(AuditResultExample example);

    AuditResult selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AuditResult record, @Param("example") AuditResultExample example);

    int updateByExample(@Param("record") AuditResult record, @Param("example") AuditResultExample example);

    int updateByPrimaryKeySelective(AuditResult record);

    int updateByPrimaryKey(AuditResult record);
}
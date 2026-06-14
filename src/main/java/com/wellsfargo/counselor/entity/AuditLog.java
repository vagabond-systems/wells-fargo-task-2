package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.sql.Timestamp;

@Entity
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long auditId;

    private String entityName;
    private String entityId;
    private String actionType;
    private String performedBy;

    private Timestamp actionTimestamp;

    private String oldValue;
    private String newValue;

    public AuditLog() {
    }
}
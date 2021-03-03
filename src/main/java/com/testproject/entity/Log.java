package com.testproject.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "log")
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "parent_id", nullable = false)
    private int parentId;

    @Column(name = "service_name", columnDefinition = "varchar(50)", nullable = false)
    private String serviceName;

    @Column(name = "value", columnDefinition = "varchar(4000)", nullable = false)
    private String value;

    @Column(name = "insert_date", insertable = false, updatable = false,
            columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private LocalDateTime insertDate;

    public Log() {
    }

    public Log(int parentId, String serviceName, String value) {
        this.parentId = parentId;
        this.serviceName = serviceName;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LocalDateTime getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(LocalDateTime insertDate) {
        this.insertDate = insertDate;
    }
}

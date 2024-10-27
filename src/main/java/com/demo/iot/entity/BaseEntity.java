package com.demo.iot.entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.annotation.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -863164858986274318L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "createddate")
    @CreatedDate
    private Date createdDate;

    @Column(name = "createdby")
    @CreatedBy
    private String createdBy;

    @Column(name = "modifieddate")
    @LastModifiedDate
    private Date modifiedDate = null;

    @Column(name = "modifiedby")
    @LastModifiedBy
    private String modifiedBy = null;
}
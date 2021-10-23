package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "document")
public class DocumentStorageProperties {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "document_type")
    private String documentType;

    @Column(name = "document_format")
    private String documentFormat;

    @Column(name = "upload_dir")
    private String uploadDir;

}

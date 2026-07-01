package com.ruoyi.teach.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class TeachProjectInfo implements Serializable {

    @JsonProperty("Id")
    private Integer id;

    @JsonProperty("PrjName")
    private String prjName;

    @JsonProperty("PrjCode")
    private String prjCode;

    @JsonProperty("PrjType")
    private Long prjType;

    @JsonProperty("PrjStatus")
    private String prjStatus;

}
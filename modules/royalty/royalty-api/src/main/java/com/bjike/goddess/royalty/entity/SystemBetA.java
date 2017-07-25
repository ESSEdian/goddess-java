package com.bjike.goddess.royalty.entity;

import com.bjike.goddess.common.api.entity.BaseEntity;

import javax.persistence.*;
import java.util.Set;


/**
 * 体系间对赌表A
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-07-10 04:22 ]
 * @Description: [ 体系间对赌表A ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Entity
@Table(name = "royalty_systembeta")
public class SystemBetA extends BaseEntity {

    /**
     * 项目名称
     */
    @Column(name = "projectName", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '项目名称'")
    private String projectName;

    /**
     * 分值
     */
    @Column( nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '分值'")
    private Integer score;


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}
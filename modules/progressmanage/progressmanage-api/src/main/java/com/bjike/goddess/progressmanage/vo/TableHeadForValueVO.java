package com.bjike.goddess.progressmanage.vo;

import com.bjike.goddess.progressmanage.enums.HeadType;

/**
 * 进度表表头表现层对象
 *
 * @Author: [ Jason ]
 * @Date: [ 2017-06-09 05:08 ]
 * @Description: [ 进度表表头表现层对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class TableHeadForValueVO {

    /**
     * id
     */
    private String id;
    /**
     * 表头名
     */
    private String headName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }
}
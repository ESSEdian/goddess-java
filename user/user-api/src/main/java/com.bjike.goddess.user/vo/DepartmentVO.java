package com.bjike.goddess.user.vo;

import com.bjike.goddess.common.api.vo.BaseVO;

import java.time.LocalDateTime;

/**
 * @Author: [liguiqin]
 * @Date: [2017-03-02 15:53]
 * @Description: [ ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public class DepartmentVO extends BaseVO {

    /**
     * 部门名
     */
    private String name;

    /**
     * 描述
     */
    private String description;
    /**
     * 创建时间
     */
    private String createTime ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


}
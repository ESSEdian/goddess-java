package com.bjike.goddess.assemble.type;

/**
 * 选择状态
 *
 * @Author: [liguiqin]
 * @Date: [2017-03-03 10:20]
 * @Description: [ ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public enum CheckType {
    /**
     * 选中
     */
    CHECK(0),
    /**
     * 未选中
     */
    NONE(1),
    /**
     * 删除
     */
    DELETE(2);

    private int code;

    CheckType(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}

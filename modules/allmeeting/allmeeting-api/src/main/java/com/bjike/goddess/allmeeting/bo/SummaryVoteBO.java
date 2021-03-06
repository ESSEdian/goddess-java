package com.bjike.goddess.allmeeting.bo;

import com.bjike.goddess.common.api.bo.BaseBO;

/**
 * 纪要投票业务传输对象
 *
 * @Author: [ Jason ]
 * @Date: [ 2017-06-05 04:25 ]
 * @Description: [ 纪要投票业务传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class SummaryVoteBO extends BaseBO {

    /**
     *发言人
     */
    private String user;

    /**
     * 最终结论
     */
    private String finalDis;

    /**
     * 被投数量
     */
    private Integer voteSum;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getFinalDis() {
        return finalDis;
    }

    public void setFinalDis(String finalDis) {
        this.finalDis = finalDis;
    }

    public Integer getVoteSum() {
        return voteSum;
    }

    public void setVoteSum(Integer voteSum) {
        this.voteSum = voteSum;
    }
}
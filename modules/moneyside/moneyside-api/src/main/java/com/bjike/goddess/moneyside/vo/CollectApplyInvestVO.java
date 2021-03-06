package com.bjike.goddess.moneyside.vo;

/**
 * Created by ike on 17-6-10.
 */
public class CollectApplyInvestVO{
    /**
     * 投资人
     */
    private String investor;

    /**
     * 投资对象
     */
    private String investObject;
    /**
     * 投资形式
     */
    private String investForm;
    /**
     * 投资日期
     */
    private String investDate;
    /**
     * 本次投资额
     */
    private Double thisInvestMoney;

    /**
     * 提取风险控制保证金
     */
    private Double extractRiskControlMargin;

    public String getInvestor() {
        return investor;
    }

    public void setInvestor(String investor) {
        this.investor = investor;
    }

    public String getInvestObject() {
        return investObject;
    }

    public void setInvestObject(String investObject) {
        this.investObject = investObject;
    }

    public String getInvestForm() {
        return investForm;
    }

    public void setInvestForm(String investForm) {
        this.investForm = investForm;
    }

    public String getInvestDate() {
        return investDate;
    }

    public void setInvestDate(String investDate) {
        this.investDate = investDate;
    }

    public Double getThisInvestMoney() {
        return thisInvestMoney;
    }

    public void setThisInvestMoney(Double thisInvestMoney) {
        this.thisInvestMoney = thisInvestMoney;
    }

    public Double getExtractRiskControlMargin() {
        return extractRiskControlMargin;
    }

    public void setExtractRiskControlMargin(Double extractRiskControlMargin) {
        this.extractRiskControlMargin = extractRiskControlMargin;
    }
}

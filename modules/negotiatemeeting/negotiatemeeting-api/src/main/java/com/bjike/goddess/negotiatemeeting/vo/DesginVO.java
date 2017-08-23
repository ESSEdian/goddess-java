package com.bjike.goddess.negotiatemeeting.vo;

/**
 * 协商会议组织内容设计表现层对象
 *
 * @Author: [ chenjunhao ]
 * @Date: [ 2017-05-31 05:39 ]
 * @Description: [ 协商会议组织内容设计表现层对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class DesginVO {

    /**
     * id
     */
    private String id;
    /**
     * 会议层面
     */
    private String meetingLevel;

    /**
     * 议题包含内容
     */
    private String content;

    /**
     * 计划参会岗位
     */
    private String planJob;

    /**
     * 计划会议时间
     */
    private String planTime;

    /**
     * 会议议题
     */
    private String meetingTopic;

    public String getMeetingTopic() {
        return meetingTopic;
    }

    public void setMeetingTopic(String meetingTopic) {
        this.meetingTopic = meetingTopic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMeetingLevel() {
        return meetingLevel;
    }

    public void setMeetingLevel(String meetingLevel) {
        this.meetingLevel = meetingLevel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPlanJob() {
        return planJob;
    }

    public void setPlanJob(String planJob) {
        this.planJob = planJob;
    }

    public String getPlanTime() {
        return planTime;
    }

    public void setPlanTime(String planTime) {
        this.planTime = planTime;
    }
}
package com.bjike.goddess.materialsummary.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.materialsummary.bo.PersonalBuySummBO;
import com.bjike.goddess.materialsummary.bo.SendEmailBO;
import com.bjike.goddess.materialsummary.bo.TypeBuySummBO;
import com.bjike.goddess.materialsummary.dto.SendEmailDTO;
import com.bjike.goddess.materialsummary.entity.SendEmail;
import com.bjike.goddess.materialsummary.to.SendEmailTO;
import com.bjike.goddess.materialsummary.type.ModuleType;
import com.bjike.goddess.materialsummary.type.SummaryType;

import java.util.List;

/**
 * 物质购买发送邮件业务接口
 *
 * @Author: [ lijuntao ]
 * @Date: [ 2017-07-28 08:17 ]
 * @Description: [ 物质购买发送邮件业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface SendEmailSer extends Ser<SendEmail, SendEmailDTO> {
    /**
     * 总条数
     */
    default Long counts(SendEmailDTO SendEmailDTO) throws SerException {
        return null;
    }


    /**
     * 一个个邮件
     *
     * @return class BuySendEmailBO
     */
    default SendEmailBO getOne(String id) throws SerException {
        return null;
    }

    /**
     * 邮件汇总列表
     *
     * @return class SendEmailBO
     */
    default List<SendEmailBO> listCollectEmail(SendEmailDTO SendEmailDTO) throws SerException {
        return null;
    }

    /**
     * 添加
     *
     * @param SendEmailTO 邮件汇总信息
     * @return class BuySendEmailBO
     */
    default SendEmailBO addCollectEmail(SendEmailTO SendEmailTO) throws SerException {
        return null;
    }

    /**
     * 编辑
     *
     * @param SendEmailTO 邮件汇总信息
     * @return class BuySendEmailBO
     */
    default SendEmailBO editCollectEmail(SendEmailTO SendEmailTO) throws SerException {
        return null;
    }

    /**
     * 删除邮件汇总
     *
     * @param id id
     */
    default void deleteCollectEmail(String id) throws SerException {
        return;
    }


    /**
     * 冻结邮件汇总
     *
     * @param id id
     */
    default void congealCollectEmail(String id) throws SerException {
        return;
    }


    /**
     * 解冻邮件汇总
     *
     * @param id id
     */
    default void thawCollectEmail(String id) throws SerException {
        return;
    }

    /**
     * 根据模块名获取所有的汇总类型
     *
     * @param moduleType
     */
    default List<SummaryType> summaryType(ModuleType moduleType) throws SerException {
        return null;
    }

    /**
     * 针对各物资分类购买情况日汇总
     *
     * @param summTime
     */
    default List<TypeBuySummBO> typeBuySummDay(String summTime) throws SerException {
        return null;
    }
    /**
     * 针对各物资分类购买情况周汇总
     *
     * @param year
     * @param month
     * @param week
     */
    default List<TypeBuySummBO> typeBuySummWeek(Integer year,Integer month,Integer week) throws SerException {
        return null;
    }
    /**
     * 针对各物资分类购买情况月汇总
     *
     * @param year
     * @param month
     */
    default List<TypeBuySummBO> typeBuySummMonth(Integer year,Integer month) throws SerException {
        return null;
    }
    /**
     * 针对各物资分类购买情况年汇总
     *
     * @param year
     */
    default List<TypeBuySummBO> typeBuySummYear(Integer year) throws SerException {
        return null;
    }
    /**
     * 针对各部门地区物资购买情况日汇总
     *
     * @param summTime
     */
    default List<TypeBuySummBO> areaBuySummDay(String summTime) throws SerException {
        return null;
    }
    /**
     * 针对各部门地区物资购买情况周汇总
     *
     * @param year
     * @param month
     * @param week
     */
    default List<TypeBuySummBO> areaBuySummWeek(Integer year,Integer month,Integer week) throws SerException {
        return null;
    }
    /**
     * 针对各部门地区物资购买情况月汇总
     *
     * @param year
     * @param month
     */
    default List<TypeBuySummBO> areaBuySummMonth(Integer year,Integer month) throws SerException {
        return null;
    }
    /**
     * 针对各部门地区物资购买情况年汇总
     *
     * @param year
     */
    default List<TypeBuySummBO> areaBuySummYear(Integer year) throws SerException {
        return null;
    }

    /**
     * 个人物资购买情况日汇总
     *
     * @param summTime
     */
    default List<PersonalBuySummBO> personBuySummDay(String summTime) throws SerException {
        return null;
    }
    /**
     * 个人物资购买情况周汇总
     *
     * @param year
     * @param month
     * @param week
     */
    default List<PersonalBuySummBO> personBuySummWeek(Integer year,Integer month,Integer week) throws SerException {
        return null;
    }
    /**
     * 个人物资购买情况月汇总
     *
     * @param year
     * @param month
     */
    default List<PersonalBuySummBO> personBuySummMonth(Integer year,Integer month) throws SerException {
        return null;
    }
    /**
     * 个人物资购买情况年汇总
     *
     * @param year
     */
    default List<PersonalBuySummBO> personBuySummYear(Integer year) throws SerException {
        return null;
    }


}
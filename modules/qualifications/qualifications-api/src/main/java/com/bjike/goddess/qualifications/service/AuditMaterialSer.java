package com.bjike.goddess.qualifications.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.qualifications.bo.AuditMaterialBO;
import com.bjike.goddess.qualifications.dto.AuditMaterialDTO;
import com.bjike.goddess.qualifications.entity.AuditMaterial;
import com.bjike.goddess.qualifications.to.AuditMaterialTO;
import com.bjike.goddess.qualifications.to.GuidePermissionTO;

import java.util.List;

/**
 * 审核资料业务接口
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-03-31 06:44 ]
 * @Description: [ 审核资料业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface AuditMaterialSer extends Ser<AuditMaterial, AuditMaterialDTO> {

    /**
     * 保存
     *
     * @param to 审核资料传输对象
     * @return
     * @throws SerException
     */
    default AuditMaterialBO save(AuditMaterialTO to) throws SerException {
        return null;
    }

    /**
     * 修改
     *
     * @param to 审核资料传输对象
     * @return
     * @throws SerException
     */
    default AuditMaterialBO update(AuditMaterialTO to) throws SerException {
        return null;
    }

    /**
     * 删除
     *
     * @param id 审核资料ID
     * @return
     * @throws SerException
     */
    default AuditMaterialBO delete(String id) throws SerException {
        return null;
    }

    /**
     * 获取全部
     *
     * @return
     * @throws SerException
     */
    default List<AuditMaterialBO> all() throws SerException {
        return null;
    }

    /**
     * 列表
     *
     * @param dto 审核资料数据传输对象
     * @return
     * @throws SerException
     */
    default List<AuditMaterialBO> maps(AuditMaterialDTO dto) throws SerException {
        return null;
    }

    /**
     * 获取总条数
     *
     * @return
     * @throws SerException
     */
    default Integer getTotal() throws SerException {
        return null;
    }

    /**
     * 根据id获取数据
     *
     * @param id 数据id
     * @return
     * @throws SerException
     */
    default AuditMaterialBO getById(String id) throws SerException {
        return null;
    }

    /**
     * 下拉导航权限
     */
    default Boolean sonPermission() throws SerException {
        return null;
    }

    /**
     * 导航权限
     */
    default Boolean guidePermission(GuidePermissionTO guidePermissionTO) throws SerException {
        return null;
    }

}
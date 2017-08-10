package com.bjike.goddess.salarymanage.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.organize.bo.AreaBO;
import com.bjike.goddess.organize.bo.HierarchyBO;
import com.bjike.goddess.organize.bo.OpinionBO;
import com.bjike.goddess.organize.bo.PositionDetailBO;
import com.bjike.goddess.salarymanage.bo.SalaryBasicBO;
import com.bjike.goddess.salarymanage.dto.SalaryBasicDTO;
import com.bjike.goddess.salarymanage.to.ExportSalaryBasicTO;
import com.bjike.goddess.salarymanage.to.SalaryBasicTO;

import java.util.List;

/**
* 基本信息
* @Author:			[ jiangzaixuan ]
* @Date:			[  2017-07-31 09:50 ]
* @Description:	[ 薪资管理基本信息业务接口 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public interface SalaryBasicAPI  {
    /**
     * 查询所有地区
     * @throws SerException
     */
    default List<AreaBO> findArea() throws SerException {
        return null;
    }

    /**
     * 查询未冻结部门选项
     * @throws SerException
     */
    default List<OpinionBO> findThawOpinion() throws SerException {
        return null;
    }

    /**
     * 查询正常状态的体系
     * @throws SerException
     */
    default List<HierarchyBO> findStatus() throws SerException {
        return null;
    }

    /**
     * 查询正常状态的岗位详细
     * @throws SerException
     */
    default List<PositionDetailBO> findPosition() throws SerException {
        return null;
    }

    /**
     * 列表
     * @param dto
     * @throws SerException
     */
    default List<SalaryBasicBO> pageList(SalaryBasicDTO dto) throws SerException{
        return null;
    }

    /**
     * 查询所有薪资基本资料
     * @throws SerException
     */
    default List<SalaryBasicBO> findSalaryBasic() throws SerException{
        return null;
    }

    /**
     * 查询基本工资
     * @param dto
     * @return
     * @throws SerException
     */
    default SalaryBasicBO findSalary(SalaryBasicDTO dto) throws SerException{
        return null;
    }

    /**
     * 添加
     * @param to
     * @throws SerException
     */
    default SalaryBasicBO add(SalaryBasicTO to) throws SerException{
        return null;
    }

    /**
     * 修改
     * @param to
     * @throws SerException
     */
    default SalaryBasicBO edit(SalaryBasicTO to) throws SerException{
        return null;
    }

    /**
     * 根据id删除
     * @param id
     * @throws SerException
     */
    default void delete(String id) throws SerException{return;};

    /**
     * 导入
     * @param toList
     * @throws SerException
     */
    default void leadExcel(List<SalaryBasicTO> toList) throws SerException{
        return;
    };


//<<<<<<< HEAD
//     * @return
//     * @throws SerException
//     */
//    byte[] exportExcel(ExportSalaryBasicTO to) throws SerException;
//=======
    /**
     * 导出
     * @param to
     * @throws SerException
     */
    byte[] exportExcel(ExportSalaryBasicTO to) throws SerException;


    /**
     * 导出Excel模板
     * @throws SerException
     */
    byte[] templateExport() throws SerException;

//>>>>>>> upstream/develop
}
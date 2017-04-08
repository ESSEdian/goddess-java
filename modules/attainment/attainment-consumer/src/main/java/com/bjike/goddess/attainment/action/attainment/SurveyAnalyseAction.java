package com.bjike.goddess.attainment.action.attainment;

import com.bjike.goddess.attainment.api.SurveyAnalyseAPI;
import com.bjike.goddess.attainment.to.SurveyAnalyseTO;
import com.bjike.goddess.attainment.vo.SurveyAnalyseVO;
import com.bjike.goddess.common.api.entity.ADD;
import com.bjike.goddess.common.api.entity.EDIT;
import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.restful.Result;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 调研分析
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-04-06 11:50 ]
 * @Description: [ 调研分析 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@RestController
@RequestMapping("surveyanalyse")
public class SurveyAnalyseAction {

    @Autowired
    private SurveyAnalyseAPI analyseAPI;

    /**
     * 保存
     *
     * @param to 调研分析传输对象
     * @return class SurveyAnalyseVO
     * @version v1
     */
    @PostMapping("v1/save")
    public Result save(@Validated(ADD.class) SurveyAnalyseTO to) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(analyseAPI.save(to), SurveyAnalyseVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 更新
     *
     * @param to 调研分析传输对象
     * @return class SurveyAnalyseVO
     * @version v1
     */
    @PutMapping("v1/update/{id}")
    public Result update(@Validated(EDIT.class) SurveyAnalyseTO to) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(analyseAPI.update(to), SurveyAnalyseVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 删除
     *
     * @param id 调研分析数据id
     * @return class SurveyAnalyseVO
     * @version v1
     */
    @DeleteMapping("v1/delete/{id}")
    public Result delete(@PathVariable String id) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(analyseAPI.delete(id), SurveyAnalyseVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 根据调研计划查询调研分析
     *
     * @param plan_id 调研计划数据id
     * @return class SurveyAnalyseVO
     * @version v1
     */
    @GetMapping("v1/findByPlan/{plan_id}")
    public Result findByPlan(@PathVariable String plan_id) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(analyseAPI.findByPlan(plan_id), SurveyAnalyseVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

}
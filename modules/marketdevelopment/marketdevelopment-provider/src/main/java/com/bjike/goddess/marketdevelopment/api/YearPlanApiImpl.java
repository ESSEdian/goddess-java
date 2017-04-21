package com.bjike.goddess.marketdevelopment.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.marketdevelopment.bo.YearPlanBO;
import com.bjike.goddess.marketdevelopment.bo.YearPlanChoiceBO;
import com.bjike.goddess.marketdevelopment.dto.YearPlanDTO;
import com.bjike.goddess.marketdevelopment.entity.YearPlan;
import com.bjike.goddess.marketdevelopment.service.YearPlanSer;
import com.bjike.goddess.marketdevelopment.to.YearPlanTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 年计划业务接口实现
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-03-22 05:57 ]
 * @Description: [ 年计划业务接口实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Service("yearPlanApiImpl")
public class YearPlanApiImpl implements YearPlanAPI {

    @Autowired
    private YearPlanSer yearPlanSer;

    @Override
    public YearPlanBO save(YearPlanTO to) throws SerException {
        return yearPlanSer.save(to);
    }

    @Override
    public YearPlanBO update(YearPlanTO to) throws SerException {
        return yearPlanSer.update(to);
    }

    @Override
    public YearPlanBO delete(YearPlanTO to) throws SerException {
        return yearPlanSer.delete(to);
    }

    @Override
    public List<YearPlanBO> findThisYear() throws SerException {
        return yearPlanSer.findThisYear();
    }

    @Override
    public List<YearPlanBO> findByYear(Integer year) throws SerException {
        return yearPlanSer.findByYear(year);
    }

    @Override
    public YearPlanBO getById(String id) throws SerException {
        return BeanTransform.copyProperties(yearPlanSer.findById(id), YearPlanBO.class);
    }

    @Override
    public List<YearPlanBO> maps(YearPlanDTO dto) throws SerException {
        return BeanTransform.copyProperties(yearPlanSer.findByPage(dto).stream()
                .sorted(Comparator.comparing(YearPlan::getYear).reversed())
                .collect(Collectors.toList()), YearPlanBO.class);
    }

    @Override
    public Integer getTotal() throws SerException {
        return yearPlanSer.findAll().size();
    }

    @Override
    public List<YearPlanChoiceBO> getChoice() throws SerException {
        return yearPlanSer.getChoice();
    }
}
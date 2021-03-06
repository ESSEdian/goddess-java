package com.bjike.goddess.individualvision.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.individualvision.bo.CareerPlanningCustomBO;
import com.bjike.goddess.individualvision.dto.CareerPlanningCustomDTO;
import com.bjike.goddess.individualvision.entity.CareerPlanningCustom;
import com.bjike.goddess.individualvision.to.CareerPlanningCustomTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 职业规划定制业务实现
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-03-30 06:45 ]
 * @Description: [ 职业规划定制业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "individualvisionSerCache")
@Service
public class CareerPlanningCustomSerImpl extends ServiceImpl<CareerPlanningCustom, CareerPlanningCustomDTO> implements CareerPlanningCustomSer {
    @Override
    public Long countCareerPlanningCustom(CareerPlanningCustomDTO careerPlanningCustomDTO) throws SerException {
        Long count = super.count(careerPlanningCustomDTO);
        return count;
    }

    @Override
    public CareerPlanningCustomBO getOne(String id) throws SerException {
        if (StringUtils.isBlank(id)) {
            throw new SerException("id不能为空");
        }
        CareerPlanningCustom careerPlanningCustom = super.findById(id);
        return BeanTransform.copyProperties(careerPlanningCustom, CareerPlanningCustomBO.class);
    }

    @Override
    public List<CareerPlanningCustomBO> findListCareerPlanningCustom(CareerPlanningCustomDTO careerPlanningCustomDTO) throws SerException {
        List<CareerPlanningCustom> careerPlanningCustoms = super.findByCis(careerPlanningCustomDTO, true);
        return BeanTransform.copyProperties(careerPlanningCustoms, CareerPlanningCustomBO.class);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public CareerPlanningCustomBO insertCareerPlanningCustom(CareerPlanningCustomTO careerPlanningCustomTO) throws SerException {
        CareerPlanningCustom careerPlanningCustom = BeanTransform.copyProperties(careerPlanningCustomTO, CareerPlanningCustom.class,true);
        careerPlanningCustom.setCreateTime(LocalDateTime.now());
        super.save(careerPlanningCustom);
        return BeanTransform.copyProperties(careerPlanningCustom, CareerPlanningCustomBO.class);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public CareerPlanningCustomBO editCareerPlanningCustom(CareerPlanningCustomTO careerPlanningCustomTO) throws SerException {
        if (StringUtils.isBlank(careerPlanningCustomTO.getId())) {
            throw new SerException("id不能为空");
        }
        CareerPlanningCustom careerPlanningCustom = super.findById(careerPlanningCustomTO.getId());
        BeanTransform.copyProperties(careerPlanningCustomTO, careerPlanningCustom, true);
        careerPlanningCustom.setModifyTime(LocalDateTime.now());
        super.update(careerPlanningCustom);
        return BeanTransform.copyProperties(careerPlanningCustomTO, CareerPlanningCustomBO.class);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public void removeCareerPlanningCustom(String id) throws SerException {
        if (StringUtils.isBlank(id)) {
            throw new SerException("id不能为空");
        }
        super.remove(id);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public CareerPlanningCustomBO sendCareerPlanningCustom(CareerPlanningCustomTO careerPlanningCustomTO) throws SerException {
        CareerPlanningCustom careerPlanningCustom = super.findById(careerPlanningCustomTO.getId());
        //todo 2017-03-31 未做发送邮件
//        if (careerPlanningCustom.getPlanningDate().equals("15")) {
//            if (careerPlanningCustom.getPositive() != null) {
//                careerPlanningCustom.setNotUpStandard(careerPlanningCustomTO.getNotUpStandard());
//                careerPlanningCustom.setCompleteDegree(careerPlanningCustomTO.getCompleteDegree());
//                careerPlanningCustom.setStandard(careerPlanningCustomTO.getStandard());
//                careerPlanningCustom.setSurplusTime(careerPlanningCustomTO.getSurplusTime());
//            } else if (careerPlanningCustom.getManagement() != null) {
//                careerPlanningCustom.setNotUpStandard(careerPlanningCustomTO.getNotUpStandard());
//                careerPlanningCustom.setCompleteDegree(careerPlanningCustomTO.getCompleteDegree());
//                careerPlanningCustom.setStandard(careerPlanningCustomTO.getStandard());
//                careerPlanningCustom.setSurplusTime(careerPlanningCustomTO.getSurplusTime());
//            } else if (careerPlanningCustom.getSkills() != null) {
//                careerPlanningCustom.setNotUpStandard(careerPlanningCustomTO.getNotUpStandard());
//                careerPlanningCustom.setCompleteDegree(careerPlanningCustomTO.getCompleteDegree());
//                careerPlanningCustom.setStandard(careerPlanningCustomTO.getStandard());
//                careerPlanningCustom.setSurplusTime(careerPlanningCustomTO.getSurplusTime());
//            }
//
//        } else if (careerPlanningCustom.getPlanningDate().equals("planningDate")) {
//            if (careerPlanningCustom.getPositive() != null) {
//                careerPlanningCustom.setNotUpStandard(careerPlanningCustomTO.getNotUpStandard());
//                careerPlanningCustom.setCompleteDegree(careerPlanningCustomTO.getCompleteDegree());
//                careerPlanningCustom.setStandard(careerPlanningCustomTO.getStandard());
//            } else if (careerPlanningCustom.getManagement() != null) {
//                careerPlanningCustom.setNotUpStandard(careerPlanningCustomTO.getNotUpStandard());
//                careerPlanningCustom.setCompleteDegree(careerPlanningCustomTO.getCompleteDegree());
//                careerPlanningCustom.setStandard(careerPlanningCustomTO.getStandard());
//            } else if (careerPlanningCustom.getSkills() != null) {
//                careerPlanningCustom.setNotUpStandard(careerPlanningCustomTO.getNotUpStandard());
//                careerPlanningCustom.setCompleteDegree(careerPlanningCustomTO.getCompleteDegree());
//                careerPlanningCustom.setStandard(careerPlanningCustomTO.getStandard());
//            }
//        }
        return BeanTransform.copyProperties(careerPlanningCustom, CareerPlanningCustomBO.class);
    }
}
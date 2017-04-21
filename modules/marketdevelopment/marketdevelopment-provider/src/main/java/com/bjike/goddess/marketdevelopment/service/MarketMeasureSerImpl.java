package com.bjike.goddess.marketdevelopment.service;

import com.bjike.goddess.common.api.dto.Restrict;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.marketdevelopment.bo.MarketMeasureBO;
import com.bjike.goddess.marketdevelopment.dto.MarketMeasureDTO;
import com.bjike.goddess.marketdevelopment.entity.MarketMeasure;
import com.bjike.goddess.marketdevelopment.to.MarketMeasureTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 市场测算业务实现
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-03-22 07:19 ]
 * @Description: [ 市场测算业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "marketdevelopmentSerCache")
@Service
public class MarketMeasureSerImpl extends ServiceImpl<MarketMeasure, MarketMeasureDTO> implements MarketMeasureSer {


    @Transactional(rollbackFor = SerException.class)
    @Override
    public MarketMeasureBO save(MarketMeasureTO to) throws SerException {
        MarketMeasure entity = BeanTransform.copyProperties(to, MarketMeasure.class);
        super.save(entity);
        return BeanTransform.copyProperties(entity, MarketMeasureBO.class);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public MarketMeasureBO update(MarketMeasureTO to) throws SerException {
        if (StringUtils.isNotBlank(to.getId())) {
            try {
                MarketMeasure entity = super.findById(to.getId());
                BeanTransform.copyProperties(to, entity, true);
                entity.setModifyTime(LocalDateTime.now());
                super.update(entity);
                return BeanTransform.copyProperties(entity, MarketMeasureBO.class);
            } catch (SerException e) {
                throw new SerException("数据对象不能为空");
            }
        } else
            throw new SerException("数据ID不能为空");
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public MarketMeasureBO delete(MarketMeasureTO to) throws SerException {
        MarketMeasure entity = super.findById(to.getId());
        super.remove(entity);
        return BeanTransform.copyProperties(entity, MarketMeasureBO.class);
    }

    @Override
    public List<MarketMeasureBO> findByType(String type) throws SerException {
        MarketMeasureDTO dto = new MarketMeasureDTO();
        dto.getConditions().add(Restrict.eq("type", type));
        List<MarketMeasure> list = super.findByCis(dto);
        return BeanTransform.copyProperties(list, MarketMeasureBO.class);
    }

    @Override
    public List<MarketMeasureBO> findByCourse(String course) throws SerException {
        MarketMeasureDTO dto = new MarketMeasureDTO();
        dto.getConditions().add(Restrict.eq("course", course));
        List<MarketMeasure> list = super.findByCis(dto);
        return BeanTransform.copyProperties(list, MarketMeasureBO.class);
    }

    @Override
    public List<MarketMeasureBO> findByCourseType(String type, String course) throws SerException {
        MarketMeasureDTO dto = new MarketMeasureDTO();
        dto.getConditions().add(Restrict.eq("course", course));
        dto.getConditions().add(Restrict.eq("type", type));
        List<MarketMeasure> list = super.findByCis(dto);
        return BeanTransform.copyProperties(list, MarketMeasureBO.class);
    }
}
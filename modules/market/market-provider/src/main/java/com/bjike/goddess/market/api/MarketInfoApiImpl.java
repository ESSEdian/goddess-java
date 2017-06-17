package com.bjike.goddess.market.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.common.utils.date.DateUtil;
import com.bjike.goddess.market.bo.MarketInfoBO;
import com.bjike.goddess.market.dto.MarketInfoDTO;
import com.bjike.goddess.market.entity.MarketInfo;
import com.bjike.goddess.market.service.MarketInfoSer;
import com.bjike.goddess.market.to.MarketInfoTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

/**
 * 市场信息管理业务接口实现
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-03-21T11:00:01.566 ]
 * @Description: [ 市场信息管理业务接口实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Service("marketInfoApiImpl")
public class MarketInfoApiImpl implements MarketInfoAPI {
    @Autowired
    private MarketInfoSer marketInfoSer;
    @Override
    public Long countMarketInfo(MarketInfoDTO marketInfoDTO) throws SerException {
        return marketInfoSer.countMarketInfo(marketInfoDTO);
    }
    @Override
    public MarketInfoBO getOne(String id) throws SerException {
        return marketInfoSer.getOne(id);
    }
    @Override
    public List<MarketInfoBO> findListMarketInfo(MarketInfoDTO marketInfoDTO) throws SerException {
        return marketInfoSer.findListMarketInfo(marketInfoDTO);
    }

    @Override
    public MarketInfoBO insertMarketInfo(MarketInfoTO marketInfoTO) throws SerException {
        marketInfoTO.setInfoCollectionDate(DateUtil.dateToString(LocalDate.now()));
        marketInfoTO.setStartTime(DateUtil.dateToString(LocalDateTime.now()));
        marketInfoTO.setImportantPoint(DateUtil.dateToString(LocalDateTime.now()));
        marketInfoTO.setEndTime(DateUtil.dateToString(LocalDateTime.now()));
        return marketInfoSer.insertMarketInfo(marketInfoTO);
    }

    @Override
    public MarketInfoBO editMarketInfo(MarketInfoTO marketInfoTO) throws SerException {

        return marketInfoSer.editMarketInfo(marketInfoTO);
    }

    @Override
    public void removeMarketInfo(String id) throws SerException {
        marketInfoSer.remove(id);
    }

    @Override
    public String exportExcel(String customerName) throws SerException {
        return marketInfoSer.exportExcel(customerName);
    }

    @Override
    public List<MarketInfoBO> findByOriganizion(String origanizion) throws SerException {
        return marketInfoSer.findByOriganizion(origanizion);
    }
}
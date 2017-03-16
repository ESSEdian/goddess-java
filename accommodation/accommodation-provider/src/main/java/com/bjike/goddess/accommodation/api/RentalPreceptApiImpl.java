package com.bjike.goddess.accommodation.api;

import com.bjike.goddess.accommodation.bo.RentalPreceptBO;
import com.bjike.goddess.accommodation.dto.RentalPreceptDTO;
import com.bjike.goddess.accommodation.entity.RentalPrecept;
import com.bjike.goddess.accommodation.service.RentalPreceptSer;
import com.bjike.goddess.accommodation.to.RentalPreceptTO;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: [xiazhili]
 * @Date: [2017-3-11 10:16]
 * @Description: [租房方案接口]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
@Service("rentalPreceptApiImpl")
public class RentalPreceptApiImpl implements RentalPreceptAPI{
    @Autowired
    private RentalPreceptSer rentalPreceptSer;

    @Override
    public RentalPreceptBO insertPecept(RentalPreceptTO preceptTO) throws SerException {
        return rentalPreceptSer.insertPecept(preceptTO);
    }
    @Override
    public RentalPreceptBO editPecept(RentalPreceptTO rentalPreceptTO) throws SerException {
        return rentalPreceptSer.editPecept(rentalPreceptTO);
    }

    @Override
    public void removePecept(String id) throws SerException {
        rentalPreceptSer.removePecept(id);
    }

    @Override
    public List<RentalPreceptBO> listRentalPrecept(RentalPreceptDTO rentalPreceptDTO) throws SerException {
        List<RentalPrecept> rentalPrecepts = rentalPreceptSer.listRentalPrecept(rentalPreceptDTO);
        return BeanTransform.copyProperties(rentalPrecepts, RentalPreceptBO.class, true);
    }
    @Override
    public void audit(RentalPreceptTO preceptTO) throws  SerException {
        rentalPreceptSer.audit(preceptTO);
    }
    @Override
    public RentalPreceptBO mail(RentalPreceptTO preceptTO) throws SerException{
        return rentalPreceptSer.mail(preceptTO);
    }
}
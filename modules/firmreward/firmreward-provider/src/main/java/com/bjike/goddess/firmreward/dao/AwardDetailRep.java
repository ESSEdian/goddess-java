package com.bjike.goddess.firmreward.dao;

import com.bjike.goddess.common.jpa.dao.JpaRep;
import com.bjike.goddess.firmreward.dto.AwardDetailDTO;
import com.bjike.goddess.firmreward.entity.AwardDetail;

/**
 * 获奖明细持久化接口, 继承基类可使用ｊｐａ命名查询
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-04-12 06:02 ]
 * @Description: [ 获奖明细持久化接口, 继承基类可使用ｊｐａ命名查询 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface AwardDetailRep extends JpaRep<AwardDetail, AwardDetailDTO> {

}
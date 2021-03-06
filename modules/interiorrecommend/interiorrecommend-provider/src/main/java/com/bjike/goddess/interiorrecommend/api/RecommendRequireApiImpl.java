package com.bjike.goddess.interiorrecommend.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.interiorrecommend.bo.RecommendRequireBO;
import com.bjike.goddess.interiorrecommend.dto.RecommendRequireDTO;
import com.bjike.goddess.interiorrecommend.service.RecommendRequireSer;
import com.bjike.goddess.interiorrecommend.to.RecommendRequireTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 推荐要求业务接口实现
 *
 * @Author: [ Jason ]
 * @Date: [ 2017-04-09 03:29 ]
 * @Description: [ 推荐要求业务接口实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Service("recommendRequireApiImpl")
public class RecommendRequireApiImpl implements RecommendRequireAPI {

    @Autowired
    private RecommendRequireSer recommendRequireSer;

    @Override
    public RecommendRequireBO addModel(RecommendRequireTO to) throws SerException {
        return recommendRequireSer.insertModel(to);
    }

    @Override
    public RecommendRequireBO editModel(RecommendRequireTO to) throws SerException {
        return recommendRequireSer.updateModel(to);
    }

    @Override
    public void delete(String id) throws SerException {
        recommendRequireSer.delete(id);
    }

    @Override
    public List<RecommendRequireBO> pageList(RecommendRequireDTO dto) throws SerException {
        return recommendRequireSer.pageList(dto);
    }

    @Override
    public Long count(RecommendRequireDTO dto) throws SerException {
        return recommendRequireSer.count(dto);
    }

    @Override
    public RecommendRequireBO findById(String id) throws SerException {
        return BeanTransform.copyProperties(recommendRequireSer.findById(id), RecommendRequireBO.class);
    }


}
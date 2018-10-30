package com.bj1804.estudy.services;

import com.bj1804.estudy.entity.Business;

public interface BusinessService {

    /**
     * 通过企业ID获取企业实体对象
     *
     * @param businessId
     * @return
     */
    Business loadBusinessById(int businessId);

    /**
     *  根据传入的企业实体信息修改数据
     * @param business
     * @return
     */
    int updateBusiness(Business business);

}

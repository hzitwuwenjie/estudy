package com.bj1804.estudy.services;

import com.bj1804.estudy.dao.BusinessDAO;
import com.bj1804.estudy.entity.Business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private BusinessDAO businessDAO;

    @Override
    public Business loadBusinessById(int businessId) {
        return businessDAO.selectByPrimaryKey(businessId);
    }

    @Override
    public int updateBusiness(Business business) {
        return businessDAO.updateByPrimaryKeySelective(business);
    }
}

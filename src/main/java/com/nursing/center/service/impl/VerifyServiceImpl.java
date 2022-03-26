package com.nursing.center.service.impl;

import com.nursing.center.mapper.RetreatMapper;
import com.nursing.center.mapper.VerifyMapper;
import com.nursing.center.model.Retreat;
import com.nursing.center.model.Verify;
import com.nursing.center.service.VerifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class VerifyServiceImpl implements VerifyService {
    @Autowired
    private VerifyMapper verifyMapper;

    @Autowired
    private RetreatMapper retreatMapper;
    @Override
    public void add(Verify verify) {
        verify.setAddDate(new Date());
        verifyMapper.insert(verify);
        Retreat retreat = new Retreat();
        retreat.setAuditStatus(verify.getStatus());
        retreat.setId(verify.getConId());
        retreat.setRetreatTime(new Date());
        retreatMapper.updateStatus(retreat);
    }
}

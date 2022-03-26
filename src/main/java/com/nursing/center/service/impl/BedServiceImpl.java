package com.nursing.center.service.impl;

import com.nursing.center.mapper.BedMapper;
import com.nursing.center.model.Bed;
import com.nursing.center.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BedServiceImpl implements BedService {
    @Autowired
    private BedMapper bedMapper;
    @Override
    public List<Bed> selectAll() {
        return bedMapper.selectAll();
    }

    @Override
    public List<Bed> getIdleAll() {
        return bedMapper.setIdleAll();
    }

    @Override
    public void checkIn(Integer id) {
        bedMapper.checkIn(id);
    }

    @Override
    public void withdraw(Integer id) {
        bedMapper.withdraw(id);
    }
}

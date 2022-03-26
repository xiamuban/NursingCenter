package com.nursing.center.service;

import com.nursing.center.model.Bed;

import java.util.List;

public interface BedService {
    List<Bed> selectAll();

    List<Bed> getIdleAll();

    void checkIn(Integer id);

    void withdraw(Integer id);
}

package com.nursing.center.service;

import com.nursing.center.model.NursingContent;

import java.util.List;

public interface NursingContentService {
    void add(NursingContent content);

    List<NursingContent> selectAll();

    List<NursingContent> getAll(Integer id);

    void delById(Integer id);


}

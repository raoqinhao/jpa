package com.hh.jpa.service.impl;

import com.hh.jpa.mapper.Uuser1Mapper;
import com.hh.jpa.pojo.Uuser1;
import com.hh.jpa.service.UuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Uuser1Service implements UuserService {

    @Autowired
    private Uuser1Mapper uuser1Mapper;

    @Override
    public Uuser1 getUserByUUID() {
        List<Uuser1> all = uuser1Mapper.findAll();
        return all.stream().findFirst().get();
    }

    @Override
    public Uuser1 getUserByExample() {
        return null;
    }


}

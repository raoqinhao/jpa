package com.hh.jpa.service;

import com.hh.jpa.pojo.Uuser1;

public interface UuserService {
    Uuser1 getUserByUUID();

    Uuser1 getUserByExample();

    Uuser1 getUserByQuery(String showName);

    Uuser1 getUserByParam(String showName);
}

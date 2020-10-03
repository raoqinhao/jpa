package com.hh.jpa.mapper;

import com.hh.jpa.pojo.Uuser1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Uuser1Mapper extends JpaRepository<Uuser1, String> {
    Uuser1 findByShowNameEquals(String showName);

    @Query(value = "SELECT * FROM U_USER_1 WHERE SHOWNAME=:showName",nativeQuery = true)
    Uuser1 findUuser1ByQuery(@Param("showName") String showName);

    @Query(value = "SELECT * FROM U_USER_1 WHERE SHOWNAME=?1",nativeQuery = true)
    Uuser1 findUuser1ByQuery1(String showName);
}

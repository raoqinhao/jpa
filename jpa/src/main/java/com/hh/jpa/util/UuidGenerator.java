package com.hh.jpa.util;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author Simon
 * @version 0.1
 * @application 主键生成策略
 * @Copyright 上海危网信息科技有限公司版权所有
 * @company wwsoft
 * @time 2018年12月11日 下午5:10:52
 */
public class UuidGenerator implements IdentifierGenerator {

    public static String generatorUuid() {
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replace("-", "");
        String id = uuid + "-" + new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        return id.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(generatorUuid());
    }

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        return generatorUuid();
    }
}

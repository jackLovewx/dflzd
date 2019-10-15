package com.cdb.dflz;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 *
 */
@Configuration
@MapperScan("com.cdb.dflz.mbg.mapper")
public class MyBatisConfig {

}

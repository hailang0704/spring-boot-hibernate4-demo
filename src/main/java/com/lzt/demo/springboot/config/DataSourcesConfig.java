package com.lzt.demo.springboot.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourcesConfig {
    @Bean(name = "primaryDataSource")
    @Qualifier("primaryDataSource")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource primaryDataSource() {
        System.out.println("primary db built");
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "secondaryDataSource")
    @Qualifier("secondaryDataSource")
    @ConfigurationProperties(prefix="spring.read.datasource")
    public DataSource secondaryDataSource() {
        System.out.println("secondary db built");
        return DataSourceBuilder.create().build();
    }
}
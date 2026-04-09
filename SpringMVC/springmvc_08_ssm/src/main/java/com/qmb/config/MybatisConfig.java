package com.qmb.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScannerRegistrar;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
//@MapperScan("com.qmb.dao")
//如果你用了 @MapperScan，就不需要再手动定义底部的 mapperScannerConfigurer() 方法了。
public class MybatisConfig {
    /**
     * 配置 SqlSessionFactory
     * 这是 MyBatis 的核心，负责创建 SqlSession
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        // 1. 注入数据源（由 Spring JDBC 提供的基础支持）
        factoryBean.setDataSource(dataSource);

        // 2. 设置 MyBatis 核心配置（可选，也可写在 mybatis-config.xml 中）
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setMapUnderscoreToCamelCase(true); // 开启驼峰命名转换
        factoryBean.setConfiguration(configuration);

        // 3. 设置别名包扫描
        factoryBean.setTypeAliasesPackage("com.qmb.entity");

        return factoryBean.getObject();
    }

    // 接口扫描器
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer()
    {
        MapperScannerConfigurer mc = new MapperScannerConfigurer();
        mc.setBasePackage("com.qmb.dao");
        return mc;
    }
}

package com.xss.test.configs;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * 数据库SqlSessionFactory
 *
 * @author xss
 * @version 1.0
 * @date 2024/0225
 * @since 2024-02-25 16:36:39
 */
@Configuration
public class SqlSessionFactoryConfig {
    @Autowired
    DataSource dataSource;
    @Bean
    @Primary
    public SqlSessionFactory sqlSession() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setMapperLocations
                (
                        new PathMatchingResourcePatternResolver().getResources("classpath:com/xss/test/mapper/*.xml")
                );//设置对应的xml文件地址
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean.getObject();
    }

}

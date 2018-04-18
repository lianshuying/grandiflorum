package com.ulo.operation.center.configuration;


import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.util.Properties;


public class MyBatisConfig {

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean() {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        //  bean.setDataSource(dataSource());
        bean.setTypeAliasesPackage("com.ulo.operation.center.entity");// <!-- 自动扫描entity目录, 省掉Configuration.xml里的手工配置 -->

        //分页插件设置
//        PageHelper pageHelper = new PageHelper();
//        Properties properties = new Properties();
//        properties.setProperty("reasonable", "true");
//        properties.setProperty("supportMethodsArguments", "true");
//        properties.setProperty("returnPageInfo", "check");
//        properties.setProperty("params", "count=countSql");
//        pageHelper.setProperties(properties);
//
//        //添加分页插件
//        bean.setPlugins(new Interceptor[]{ pageHelper });

        //添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            //基于注解扫描Mapper，不需配置xml路径
            bean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    //配置mybatis的分页插件pageHelper
             @Bean
              public PageHelper pageHelper(){
                     PageHelper pageHelper = new PageHelper();
                     Properties properties = new Properties();
                     properties.setProperty("offsetAsPageNum","true");
                     properties.setProperty("rowBoundsWithCount","true");
                     properties.setProperty("reasonable","true");
                     properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
                     pageHelper.setProperties(properties);
                 return pageHelper;
             }


}

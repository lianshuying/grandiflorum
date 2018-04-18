# grandiflorum
token的生成器

配置Druid注意事项：

引入的jar包是：
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid-spring-boot-starter</artifactId>
            <version>1.1.9</version>
        </dependency>
        
同时，必须使用Log4j的日志，否则没有Sql监控

最后，要配置Bean来实例化DataSource：（DruidConfiguration）
    @Bean
   
    @ConfigurationProperties(prefix="spring.datasource")
    
    public DataSource druidDataSource() {
    
        return new DruidDataSource();
        
    }
    
}


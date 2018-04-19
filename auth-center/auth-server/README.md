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

Redis配置

@Cacheable
@Cacheable的属性的意义
cacheNames：指定缓存的名称
key：定义组成的key值，如果不定义，则使用全部的参数计算一个key值。可以使用spring El表达式
比如：
@Cacheable(cacheNames="book1", key="#id")
@Cacheable(cacheNames="book2", key="#id")
@Cacheable(cacheNames="book3",  keyGenerator="KeyGenerator")

sync：如果设置sync=true：a. 如果缓存中没有数据，
多个线程同时访问这个方法，则只有一个方法会执行到方法，
其它方法需要等待; b. 如果缓存中已经有数据，则多个线程可以同时从缓存中获取数据
 /***
     * 如果设置sync=true，
     *  如果缓存中没有数据，多个线程同时访问这个方法，则只有一个方法会执行到方法，其它方法需要等待
     *  如果缓存中已经有数据，则多个线程可以同时从缓存中获取数据
     * @param id
     * @return
     */
@Cacheable(cacheNames="book3", sync=true)

condition和unless 只满足特定条件才进行缓存： 
condition: 在执行方法前，condition的值为true，则缓存数据
unless ：在执行方法后，判断unless ，如果值为true，则不缓存数据
conditon和unless可以同时使用，则此时只缓存同时满足两者的记录

/**
     * 条件缓存：
     * 只有满足condition的请求才可以进行缓存，如果不满足条件，则跟方法没有@Cacheable注解的方法一样
     *  如下面只有id < 3才进行缓存
     * 
     */
    @Cacheable(cacheNames="book11", condition="T(java.lang.Integer).parseInt(#id) < 3 ")

    
 @CacheEvict
删除缓存

allEntries = true: 清空缓存book1里的所有值
allEntries = false: 默认值，此时只删除key对应的值


/**
     * allEntries = true: 清空book1里的所有缓存
     */
    @CacheEvict(cacheNames="book1", allEntries=true)
    public void clearBook1All(){
        logger.info("clearAll");
    }
    /**
     * 对符合key条件的记录从缓存中book1移除
     */
    @CacheEvict(cacheNames="book1", key="#id")
    public void updateBook(String id, String name){
        logger.info("updateBook");
        Book book = repositoryBook.get(id);
        if(book != null){
            book.setName(name);
            book.setUpdate(new Date());
        }
    }
    
    
    @CachePut
    每次执行都会执行方法，无论缓存里是否有值，同时使用新的返回值的替换缓存中的值
    。这里不同于@Cacheable：@Cacheable如果缓存没有值，从则执行方法并缓存数据，如果缓存有值，则从缓存中获取值
    
        @CachePut(cacheNames="book1", key="#id")
        public Book queryBookCachePut(String id){
            logger.info("queryBookCachePut,id={}",id);
            return repositoryBook.get(id);
        }
        
        
        @CacheConfig
        @CacheConfig: 类级别的注解：如果我们在此注解中定义cacheNames，
        则此类中的所有方法上 @Cacheable的cacheNames默认都是此值。当然@Cacheable也可以重定义cacheNames的值
        @Component
        @CacheConfig(cacheNames="booksAll") 
        public class BookService2 extends AbstractService {
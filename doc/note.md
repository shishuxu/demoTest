高并发方案：
分布式事务：
消息队列问题：
缓存
spring的事务机制
SpringBoot的原理


Ctrl+Y  还原撤销

单例模式-----spring容器中只存在一个实例，懒汉，恶汉
工厂方法模式：
1. 工厂方法模式分为三种：普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
2. 多个工厂方法模式，是对普通工厂方法模式的改进，多个工厂方法模式是提供多个工厂方法，分别创建对象。
3. 静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。

抽象工厂模式：创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码

装饰模式：装饰模式就是给一个对象增加一些新的功能，而且是动态的，   a b两个类实现同一个接口，a拥有被装饰对象的功能；
代理模式：中介， 对扩展开放，对修改关闭（aop动态代理）
如果已有的方法在使用的时候需要对原有的方法进行改进，采用一个代理类调用原有的方法，且对产生的结果进行控制

适配器模式

--------------------------------------------------------------------------


许石书

31岁 大专学历

7年经验，之前在深圳工作

项目经历主要有两家公司的
1、第一家公司是一家互联网物流公司，主营是线上的物流运输，
后来 倒闭了 ss datajpa,就去到了上一家公司
2、上一家公司是深圳的一家互联网餐饮公司，业务是面向香港，

公司的项目有gspos-线下点餐系统，ricepos线上接单系统，外卖系统，
饭团app，web管理后台，h3，公众号，小程序

项目经历大概就是这样，请提问
Spring、SpringMVC、Mybaties、springboot、spring-data-jpa、swagger、
hibernate，spring cloud（全家桶），
nacos及其配置中心 、Kafka 、xxl-job ，open-feign，阿里云oss对象存储等开源框架；
数据库：MySQL关系型数据库，redis，熟悉SQL语句的编写

索引失效的情况
最左，强制类型转换，函数，运算，or语句，模糊查询
--------------------------------------------------------------------------

mybatis的大数据插入的方式；
1、普通插入多条；
2、代码优化一次插入1000条
3、循环遍历插入
4、批处理，先将数据缓存起来，一次提交；
mybatis 执行流程
1.获取sqlSessionFactory对象
2.获取sqlSession对象
3.获取mapper接口的代理对象（MapperProxy）
4.执行增删改查方法

mybatis原理解析-------------
jdbc原理
加载驱动==》获取数据库连接==》sql执行器==》获取结果接

mybatis原理（先封装sql===》调用jdbc操作数据库===》数据库返回的结果封装成java对象）
mybatis原理
1、应用启动后会加载全局配置及xml映射文件保存到configuration对象中==》
2、configuration会和 SqlSessionFactory做绑定==》
3、当用户请求来时，会通过SqlSessionFactory获取SqlSession对象==》
4、在通过SqlSession的找到执行器
5、通过执行器经过ParameterHandler，StatementHandler，ResultSetHandler的处理请求进行响应

处理sql请求的过程；
SqlSessionFactory=》SqlSession=》Executor=》（ParameterHandler，StatementHandler，ResultSetHandler)=====>DB




--------------------------------------------------------------------------
事务：编程式事务，声明式事务
隔离级别：
1、读未提交-----会脏读
2、读提交-----不可重复读；
3、重复读--默认级别------幻读（一个事务范围内两个相同的查询却返回了不同数据。对应的是插入操作。）
4、序列化----级别最高，性能低下

事务注解Transactional 失效的原因（通过 动态代理实现）
1、方法必须是public修饰；
2、.在类内部没有添加@Transactional的方法，调用了@Transactional方法时
3、异常没有抛出，在内部被捕获了
4、有异步线程
5、数据库表不支持事务
--------------------------------------------------------------------------

aop原理   ------aspectj
创建代理对象---创建目标对象-----调用代理对象------调用目标对象------

动态代理通过cjlib实现，他会自动生成被代理类的子类，当调用目标对象时会首先调用代理对象，执行植入的横切面逻辑后在执行目标对象的方法
 
--------------------------------------------------------------------------
springboot底层原理

springmvc  开发应用 I
·添加依赖，考虑版本、
添加springmvc xml文件
部署到tomcat

以整合redis为例：
1.添加jar包依赖
2.在xml中添加配置(Bean的声明) 把对象注入到Spring loC容器中
3.application.properties配置redis的连接信息、连接池的信息

springBoot原理
以整合redis为例：
1.添加jar包依赖  
2.application.properties配置redis的连接信息、连接池的信息
相对于springmvc应用，减少了xml配置这一步，通过自动装配实现

自动装配原理
1、核心注解SpringBootApplication==》
2、EnableAutoConfiguration ，他内部会通过@Import 选择器 AutoConfigurationImportSelector==》
3、AutoConfigurationImportSelector 内部有一个方法叫做getCandidateConfigurations，
它会读取项目中所有依赖项目的meta-inf下的spring.factories文件，把对应的类加载到ioc容器内
为什么它会读取spring.factories文件呢？
4、因为springboot有个约定大于配置，在所有的springboot项目中，如果你想把对象注入到容器内，
你就需要把你需要注入的对象写入到spring.factories文件中，当springboot开启自动配置时通过读取这个文件发现你，进而注入到ioc容器中，从而实现了自动配置；


--------------------------------------------------------------------------
Linux安装mysql
rpm -qa|grep mysql
wget https://downloads.mysql.com/archives/get/p/23/file/mysql-5.7.36-1.el7.x86_64.rpm-bundle.tar
mkdir mysql5.7
tar -xvf mysql-5.7.36-1.el7.x86_64.rpm-bundle.tar -C /opt/mysql5.7/
rpm -ivh mysql-community-common-5.7.36-1.el7.x86_64.rpm mysql-community-libs-5.7.36-1.el7.x86_64.rpm mysql-community-client-5.7.36-1.el7.x86_64.rpm mysql-community-server-5.7.36-1.el7.x86_64.rpm
yum -y install perl
yum -y install libaio
rpm -ivh mysql-community-common-5.7.36-1.el7.x86_64.rpm mysql-community-libs-5.7.36-1.el7.x86_64.rpm mysql-community-client-5.7.36-1.el7.x86_64.rpm mysql-community-server-5.7.36-1.el7.x86_64.rpm
systemctl start mysqld
grep password /var/log/mysqld.log
mysql -uroot -p
set global validate_password_policy=LOW;
set global validate_password_length=6;
set password = password("123456");
GRANT ALL PRIVILEGES ON *.* TO 'root'@'%' IDENTIFIED BY '123456' WITH GRANT OPTION;
flush privileges;

--------------------------------------------------------------------------
--------------------------------------------------------
高并发方案
拦截器实现：应用场景==》登录、权限验证，日志记录
拦截器类实现接口HandlerInterceptor=》重写handle的三个接口=》新建配置类实现WebMvcConfigurerAdapter，重写配置类的方法=》通过配置类注册自定义拦截器到容器

秒杀示例：
准备阶段

前端
1、秒杀页面将前端资源压缩，放入第三方cdn服务器，缓解带宽压力，减少服务器压力（动静分离）；
2、商品详情页，缓存到NGINX（根据url地址缓存）（利用时间戳动态刷新）
3、点击秒杀按钮时，必须置灰，防止重复秒杀
4、使用复杂图片验证码，防止接口被刷
5、前端页面使用定时器去查询秒杀结果；

网关：
1、ratelimter、nginx、hystrix、redis 实现限流令牌桶+漏桶算法  服务保护
令牌桶限流算法：后台以一定的速率将令牌放入桶中，用户从桶中获取令牌，没有获取到则丢弃请求；
优势：可控制请求速率
漏桶算法：缺点强行限制了数据传输

2、用户黑名单，白名单拦截

接口层：
1、服务降级，隔离，熔断
2、redis获取秒杀令牌
3、异步使用mq处理秒杀订单
4、提供异步查询秒杀结果的订单

项目部署：NGINX+lvs实现集群部署




当出现多个商品秒杀的情况，则限制分时段秒杀


后端
1、提前初始化，加载库存到redis；有重置库存的接口
用户秒杀：
用户登录=》验证密码=》显示秒杀商品列表=》秒杀限时开启==》通过拦截器，自定义注解同一个用户限制接口每5s最大请求数
防止请求伪造：

下单 令牌桶+mq实现
查询是否有库存=》预减库存=》判断是否已经秒杀过=》获取令牌桶，如果拿到令牌桶则将下单信息放入mq（入队），返回排队中的状态给前端=》
消费者订阅消费（出队）=》再次判断库存、及已经秒杀过=》
数据库扣减库存，下单=》下单成功，将用户的秒杀信息放入缓存给前端通过 秒杀token查询；

单独部署秒杀服务，秒杀消费者与秒杀生产者都需要单独部署


问题点：
前端
1、带宽突然增加；
2、重复提交


后端
1、商品超卖=》mq，分布式锁，数据库乐观锁
===================================================================================================

kafka消息队列 ：流量缓冲，削峰填谷，解耦
消息丢失问题==》消息确认机制（对性能影响大） ==》集群方式部署MQ  （leader会复制消息到follower）使用isr机制确保消息不丢失

重复消费问题==》每条消息对应一个唯一消费标识保证幂等性

消息堆积问题=》增加消费者，增加分区数量，优化逻辑批量消费，增加副本数量，监控报警及时处理

broker=》消息代理，数据的存储，传输，协调

kafka快的原因：磁盘顺序写比随机写内存快，零拷贝技术，消息的批处理（通常用于离线数据，不需要要实时处理）

kafka的零拷贝：传统的文件读写或者网络传输，通常需要将数据从内核态转换为用户态，
需要经过4copy，经过优化后只需要2次copy，但相对于内核态来说是零拷贝
kafka的分区策略：轮询，自定义，随机，其它；

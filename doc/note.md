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

1、自动配置
例如redis
pom文件引入依赖---》配置类加入redis配置----》依赖注入使用
 
spring boot启动流程
SpringApplication.run——》创建ioc容器——》加载源配置类（main方法类）——》加载并处理所有的配置类（自动配置）——》实例化所有的bean——》启动web服务器

spring boot加载配置类 
 通过@Import注解 导入ImportSelector


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
8090
D:\java\apache-maven-3.9.4\conf\settings.xml

clean install -X -Dmaven.test.skip=true -Dmaven.repo.local=D:\java\repository


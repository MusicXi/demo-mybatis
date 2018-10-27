# pagehelper说明
- 官网:https://pagehelper.github.io/
### 支持类型

- Oracle
- Mysql
- MariaDB
- SQLite
- Hsqldb
- PostgreSQL
- DB2
- SqlServer(2005,2008)
- Informix
- H2
- SqlServer2012
- Derby
- Phoenix

### 添加支持
1. 导入依赖
```xml
        <!-- spring boot整合mybatis -->
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>${mybatis-spring-boot.version}</version>
        </dependency>
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter-test</artifactId>
            <version>${mybatis-spring-boot.version}</version>
            <scope>test</scope>
        </dependency>

        <!--pagehelper-->
        <dependency>
            <groupId>com.github.pagehelper</groupId>
            <artifactId>pagehelper-spring-boot-starter</artifactId>
            <version>${pagehelper-spring-boot.version}</version>
        </dependency>

```

2. 添加配置 application.properties
````
# -----------------pagahelper config------------------------
#pagehelper.helperDialect=mysql
pagehelper.helperDialect=H2
pagehelper.reasonable=true
pagehelper.supportMethodsArguments=true
pagehelper.params=count=countSql
````

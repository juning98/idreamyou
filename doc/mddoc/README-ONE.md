# 基于 Spring Cloud 的微服务架构

## 应用架构
该项目包含 目录
``` lua
├── c3-common -- 公共工具模块
├── c3-entity -- 公共实体类
├── c3-inf-client -- 前端返回与接收文件配置（DTO)
├── spring-demo -- demo实例测试
├── spring-generator -- 自动生成mybatis代码工具
├── spring-component-api -- 公共Api对内模块（2）
├    └── spring-api-school-exam -- 考试管理服务单元对内接口api
├    └── 、、、、、
├── spring-api-web -- 公共api对外接口模块（1）
├    └── spring-api-school-web -- 学校系统微服务对外接口ajax
├    └── 、、、、、
├── spring-cloud -- 微服务模块
├    └── config-repo -- 本地配置仓库
├    └── server-admin -- 服务进行监控
├    ├── server-config -- 分布式调度中心
├    ├── server-eureka -- 注册中心
├    ├── server-zipkin -- zipkin服务追踪信息
├    └── server-zuul -- zuul网关
├    └── server-security --  认证和授权
├    └── server-trace-feign -- 模拟服务feign方式调度者
├    └── server-trace-production -- 模拟服务生产者
├    └── server-trace-ribbon -- 模拟服务ribbon方式调度者
└── spring-schoolsystem  -- 学校系统微服务 
     ├── spring-school-user -- 用户组生产者服务单元
     ├── spring-school-Educational -- 教务管理生产者服务单元
     ├── spring-school-exam -- 考试管理生产者服务单元
     ├── spring-school-selection -- 在线选课生产者服务单元
     ├── spring-school-evaluate -- 课程教师评价生产者服务单元
     ├── spring-school-Schedule -- 课程表生产者服务单元
     ├── spring-school-class -- 班级管理生产者服务单元
     ├── spring-school-staff -- 教职工管理生产者服务单元
     ├── spring-school-news -- 学校新闻管理生产者服务单元
     ├── spring-school-other -- 其他组管理生产者服务单元
```


## 启动项目
 1.启动eraka注册中心--service-eureka
 2.启动分布式配置中心--config-service（可以不启动）
 3.启动快来游戏后台--c3-game-server


 ## 版本更新说明
* 1.版本一：具备分布式开发。spring cloud架构
* 2.版本二：添加swagger2组件
    后端测试访问：http://192.168.1.177:30000/swagger-ui.html#/
    
## 自动生成代码
启动后访问：http://localhost:8082/renren-generator/#generator.html

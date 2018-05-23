# 本工程为使用springboot获取数据的样例工程

使用了MyBatis作为持久层框架，使用MySQL数据库

## 使用步骤：

### 1.在MySQL本地新建boot数据库，导入user.sql（详见application.yml）;

### 2.启动Application主程序;

### 3.使用测试url进行验证

http://127.0.0.1:8080/user/getUsers
http://127.0.0.1:8080/user/findById?id=4
http://127.0.0.1:8080/user/findById/4

## 参考网址：

1.[springboot官网](http://projects.spring.io/spring-boot/)
2.[springboot github地址](https://github.com/spring-projects/spring-boot)
3.[获取springboot样例工程](https://start.spring.io/)
4.[参考工程](https://github.com/mengzhang6/girl)






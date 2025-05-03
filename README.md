# JAVA完整的Demo
## 开发流程
1. 先在pom.xml中导入相关依赖
2. 写pojo中的UserInfo对象
3. 创建UserInfoMapper接口，并利用MyBatis的@Mapper注解标记接口
4. 在resources/mapper文件夹下创建UserInfoMapper.xml，用以实现和数据库的交互
5. 在service文件夹下创建UserInfoService接口，并在service/impl文件夹中实现相关方法，提供服务
6. 在controller中创建UserServiceController类接收处理用户请求

## 遇到的问题
1. MyBatis和Spring版本不匹配导致出现
<font color="red">Error creating bean with name 'userInfoServiceImpl': Unsatisfied dependency expressed through field 'userInfoMapper': Error creating bean with name UserInfoMapper</font>
，并且在 Spring Boot 主类上添加 @WrapperScan 注解后报错<font color="red">Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required</font>
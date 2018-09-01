/**
 * @Description:demo7主要学习自动扫包
 * @author: 彭立
 * @date: 2018年9月1日 下午11:43:23
 * 
 */
package com.pl.demo7;



/**
 *
 *之前学过的“@Resource”和“@Autowired”注解主要的作用是进行依赖的注入，可是我们依然要在ApplicationContext.xml文件中配置bean（不需要配置依赖）来使得spring容器能够创建bean并管理bean
 *这里就会有一个缺陷就是：如果项目特别庞大的时候，我们需要在ApplicationContext.xml文件中配置大量的bean（不需要配置依赖）
 *
 *那么有没有一种方法可以进一步降低ApplicationContext.xml文件中的配置呢？是有的，就是俗称的“自动扫包”
 *所谓“自动扫包”就是我们就简单的在ApplicationContext.xml文件中开启自动扫包并配置具体要扫哪个包下的类
 *然后spring就会帮我们找到具体包下的和它的子包下的类（必须是带有@Controller、@Service、@Repository、@Component其中之一的注解标识）纳入到spring容器的管理
 *
 *如果光加@Controller、@Service、@Repository、@Component注解不配置其它的话，bean的id默认就是类名的首字母小写，如类DaoMysqlImpl的id就是daoMysqlImpl
 *如果要指定bean的id的话，则配置value属性，如@Repository(value="oracle")
 *
 *
 *“@Controller”：控制层的类
 *“@Service”：服务层的类
 *“@Repository”：数据层的类
 *“@Component”：不好分层的类
 *
 *
 *一定要注意：“@Resource”和“@Autowired”注解是用来进行依赖的注入的，而“自动扫包”是用来创建并在spring容器中管理bean的
 *
 *
 *
 *
 */
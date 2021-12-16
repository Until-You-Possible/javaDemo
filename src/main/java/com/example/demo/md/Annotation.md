### Spring Boot常见注解汇总

1： 启动注解  @SpringBootApplication

```java

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(excludeFilters = { @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
		@Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })
public @interface SpringBootApplication {
    // ... 此处省略源码
}
```
从代码看出，@SpringBootApplication是一个复合注解 包含了  @SpringBootConfiguration
@EnableAutoConfiguration   @ComponentScan这三个注解

- @SpringBootConfiguration注解，继承@Configuration注解，主要用于加载配置文件
@SpringbootConfiguration继承自 @Configuration， 二者功能是一直的，标注当前类是配置类，并会讲当前类内声明的一个或者是多个以@Bean注解标识
的方法的实例纳入到spring容器中，并且实例名就是方法名


- @EnableAutoConfiguration注解，开启自动配置功能
@EnableAutoConfiguration可以帮助SpringBoot应用将所有符合条件的@Configuration配置都加载到当前SpringBoot创建并使用的IoC容器。
借助于Spring框架原有的一个工具类：SpringFactoriesLoader的支持，@EnableAutoConfiguration可以智能的自动配置功效才得以大功告成

- @ComponentScan 注解，主要用于组件扫描和自动装配
@ComponentScan的功能其实就是自动扫描并加载符合条件的组件或bean定义，最终将这些bean定义加载到容器中。
我们可以通过basePackages等属性指定@ComponentScan自动扫描的范围，如果不指定，则默认Spring框架实现从声明@ComponentScan所在类的package进行扫描，
默认情况下是不指定的，所以SpringBoot的启动类最好放在root package下。


### Controller 相关
 @Controller
控制器 处理http请求
- RestController符合注解

```java
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Controller
@ResponseBody
public @interface RestController {

	/**
	 * The value may indicate a suggestion for a logical component name,
	 * to be turned into a Spring bean in case of an autodetected component.
	 * @return the suggested component name, if any (or empty String otherwise)
	 * @since 4.0.1
	 */
	@AliasFor(annotation = Controller.class)
	String value() default "";
}
```
从代码可以看出@RestController注解相当于 @ResponseBody + @Controller合在一起的作用 RestController使用的将方法返回的对象直接在浏览器上
展示成json格式

- RequestBody
通过HttpMessageConverter读取Request Body并反序列化为Object(泛指) 对象

- RequestMapping
@RequestMapping 是 Spring Web 应用程序中最常被用到的注解之一。这个注解会将 HTTP 请求映射到 MVC 和 REST 控制器的处理方法上
@GetMapping用于将HTTP get请求映射到特定处理程序的方法注解
注解简写：@RequestMapping(value = "/say",method = RequestMethod.GET)等价于：@GetMapping(value = "/say")

```java
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RequestMapping(method = RequestMethod.GET)
public @interface GetMapping {
//...
}
```

三、取请求参数值

- @PathVariable:获取url中的数据
```java
@Controller
@RequestMapping("/User")
public class HelloWorldController {

    @RequestMapping("/getUser/{uid}")
    public String getUser(@PathVariable("uid")Integer id, Model model) {
        System.out.println("id:"+id);
        return "user";
    }
}

```
- @RequestParam:获取请求参数的值
```java
@Controller
@RequestMapping("/User")
public class HelloWorldController {

    @RequestMapping("/getUser")
    public String getUser(@RequestParam("uid")Integer id, Model model) {
        System.out.println("id:"+id);
        return "user";
    }
}
```

- @RequestBody 获取一个post的请求体



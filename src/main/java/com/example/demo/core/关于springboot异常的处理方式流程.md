1: 最新的spring引入了额一个全局异常处理的注解 @ControllerAdvice

对于注解了@ControllerAdvice的类。spring会将其作为全局异常捕获类，当任意的controller发生异常，都会被
@ControllerAdvice的注解类捕获，然后根据内部的ExceptionHandler会指定想要的进行捕获异常，满足时，异常即被捕获

```java

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({ Exception.class})
    @ResponseBody
    public ResponseEntity handleException() {
        return ResponseEntity.status(500).<String>body("exception occured!!");
    }
}

```
注： @ControllerAdvice对应的 RESTful 风格的 api 为：@RestControllerAdvice


Spring Boot异常捕获机制

在springMVC的异常处理的标准配置是由 WebMvcConfigurationSupport提供的，该配置由@EnableWebMvc注解进行开启
WebMvcConfigurationSupport会向Spring容器中注入多个Bean实例，其中就包括异常处理的Bean实例
HandlerExceptionResolverComposite.

HandlerExceptionResolverComposite捕获到异常后，会依次委托给其内维护的一系列异常处理器，当其中一个异常处理器返回结果不为空的时候，
就说明异常被处理完成，处理结果作为最终响应

WebMvcConfigurationSupport是按照一下顺序注入异常处理器给到 HandlerExceptionResolverComposite:

1: ExceptionHandlerExceptionResolver捕获处理@Excepiton注解的异常
2：ResponseStatusExceptionResolver：捕获被ResponseStatusException和@ResponseStatus注解的异常
3：DefaultHandlerExceptionResolver：捕获 Spring 内置的异常

如果以上异常处理器都捕获失败，那么该异常就会传递到内置容器（比如：Tomcat）中。内置容器就会将该异常重定向到/error页面，
此时就由 Spring Boot 默认提供的BasicErrorController进行捕获处理



//package com.jiawa.wiki.config;
//
//import com.jiawa.wiki.inteceptor.LogInterceptor;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import javax.annotation.Resource;
//
///**
// * @Description TODO
// * @Author zengjinming
// * @Date 2021/9/18 17:41
// */
//@Configuration
//public class SpringMvcConfig implements WebMvcConfigurer {
//
//    @Resource
//    LogInterceptor loginInterceptor;
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(loginInterceptor)
//                // 添加拦截路由
//                .addPathPatterns("/**")
//                // 排除拦截路由，比如 登录、权限校验接口，防止死循环
//                .excludePathPatterns("/login");
//    }
//}

package com.example.scloud;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class Mvcconfig implements WebMvcConfigurer {

    //自动配置类，每次添加页面不用再去控制层添加一个新的类，第一个参数是路径，第二个是页面
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/tx").setViewName("user");
    }
    //消息转换器fastjson解析器的配置
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter fc=new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig=new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        fc.setFastJsonConfig(fastJsonConfig);
        converters.add(fc);
    }
    //拦截器的类配置
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TestInterceptor())
                .addPathPatterns("/**")//对所有的文件全部进行拦截
                .excludePathPatterns("/login");//这是不拦截的东西
    }
}

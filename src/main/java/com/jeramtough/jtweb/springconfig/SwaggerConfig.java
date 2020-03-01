package com.jeramtough.jtweb.springconfig;

import com.google.common.base.Predicate;
import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;

/**
 * Created on 2019/7/25 11:38
 * by @author WeiBoWen
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Bean
    public Docket petApi() {
        //指定规范，这里是SWAGGER_2
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                //设定Api文档头信息，这个信息会展示在文档UI的头部位置
                .apiInfo(swaggerDemoApiInfo())
                .select()
                //添加API过滤条件，比如注释过滤之类的
                .apis(getRequestHandlerPredicate())
                //添加路径过滤条件
                .paths(PathSelectors.any())
                //这里配合@ComponentScan一起使用，又再次细化了匹配规则(当然，我们也可以只选择@ComponentScan、paths()方法当中的一中)
                .build();


        //这里不过就是用“/”
        docket.pathMapping("/");
        //模型特定对象属性转成String类型
        docket.directModelSubstitute(LocalDate.class, String.class);
        return docket;


    }

    /**
     * 决定在xxx条件下，该接口才被swagger映射到在线接口文档
     */
    private Predicate<RequestHandler> getRequestHandlerPredicate() {
        Predicate<RequestHandler> selector = new Predicate<RequestHandler>() {
            @Override
            public boolean apply(RequestHandler input) {

                //标注着Api注释的接口才被映射
                if (input.findControllerAnnotation(Api.class).isPresent()) {
                    return true;
                }
                return false;
            }
        };
        return selector;
    }


    /**
     * 自定义API文档基本信息实体
     */
    private ApiInfo swaggerDemoApiInfo() {
        //构建联系实体，在UI界面会显示
        Contact contact = new Contact("JeramTough", "https://www.baidu.com",
                "weibw@hwagain.com");
        return new ApiInfoBuilder()
                .contact(contact)
                //文档标题
                .title("Swagger2构建RESTful API文档")
                //文档描述
                .description("SpringBoot集成Springbox开源项目，实现OAS，构建成RESTful API文档")
                //文档版本
                .version("1.0.0")
                .build();
    }


    @Bean
    UiConfiguration uiConfig() {
        return UiConfigurationBuilder.builder()
                                     .deepLinking(true)
                                     .displayOperationId(false)
                                     .defaultModelsExpandDepth(1)
                                     .defaultModelExpandDepth(1)
                                     .defaultModelRendering(ModelRendering.EXAMPLE)
                                     .displayRequestDuration(false)
                                     .docExpansion(DocExpansion.NONE)
                                     .filter(false)
                                     .maxDisplayedTags(null)
                                     .operationsSorter(OperationsSorter.ALPHA)
                                     .showExtensions(false)
                                     .tagsSorter(TagsSorter.ALPHA)
                                     .supportedSubmitMethods(
                                             UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS)
                                     .validatorUrl(null)
                                     .build();
    }


}

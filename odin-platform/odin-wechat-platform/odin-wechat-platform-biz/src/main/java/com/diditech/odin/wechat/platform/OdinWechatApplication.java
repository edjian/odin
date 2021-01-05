package com.diditech.odin.wechat.platform;

import com.diditech.odin.common.feign.annotation.EnableMallFeignClients;
import com.diditech.odin.common.security.annotation.EnableDiditechResourceServer;
import com.diditech.odin.common.swagger.annotation.EnableMallSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author diditech archetype
 * <p>
 * 项目启动类
 */
@EnableMallSwagger2
@SpringCloudApplication
@EnableMallFeignClients
@EnableDiditechResourceServer
public class OdinWechatApplication {
    public static void main(String[] args) {
        SpringApplication.run(OdinWechatApplication.class, args);
    }
}

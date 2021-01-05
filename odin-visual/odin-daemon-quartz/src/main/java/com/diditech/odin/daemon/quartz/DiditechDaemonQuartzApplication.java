package com.diditech.odin.daemon.quartz;

import com.diditech.odin.common.feign.annotation.EnableMallFeignClients;
import com.diditech.odin.common.security.annotation.EnableDiditechResourceServer;
import com.diditech.odin.common.swagger.annotation.EnableMallSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author frwcloud
 * @date 2019/01/23 定时任务模块
 */
@EnableMallSwagger2
@EnableMallFeignClients
@SpringCloudApplication
@EnableDiditechResourceServer
public class DiditechDaemonQuartzApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiditechDaemonQuartzApplication.class, args);
	}

}

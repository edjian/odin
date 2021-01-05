/*
 *
 *      Copyright (c) 2018-2025, diditech All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the pig4cloud.com developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: diditech
 *
 */

package com.diditech.odin.admin;

import com.diditech.odin.common.feign.annotation.EnableMallFeignClients;
import com.diditech.odin.common.security.annotation.EnableDiditechResourceServer;
import com.diditech.odin.common.swagger.annotation.EnableMallSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author diditech
 * @date 2018年06月21日
 * <p>
 * 用户统一管理系统
 */
@EnableMallSwagger2
@SpringCloudApplication
@EnableMallFeignClients
@EnableDiditechResourceServer
public class MallUpmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallUpmsApplication.class, args);
	}

}

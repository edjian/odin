/*
 *    Copyright (c) 2018-2025, diditech All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: diditech
 */

package com.diditech.odin.codegen.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 代码生成器
 *
 * @author diditech
 * @date 2018-07-30
 */
@Mapper
public interface GeneratorMapper {

	/**
	 * 分页查询表格
	 * @param page 分页信息
	 * @param tableName 表名称
	 * @return
	 */
	IPage<List<Map<String, Object>>> queryList(Page page, @Param("tableName") String tableName);

	/**
	 * 查询表信息
	 * @param tableName 表名称
	 * @param dsName 数据源名称
	 * @return
	 */
	@DS("#last")
	Map<String, String> queryTable(@Param("tableName") String tableName, String dsName);

}
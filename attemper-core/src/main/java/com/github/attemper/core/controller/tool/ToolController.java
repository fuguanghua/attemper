package com.github.attemper.core.controller.tool;

import com.github.attemper.common.constant.APIPath;
import com.github.attemper.common.result.CommonResult;
import com.github.attemper.core.service.tool.ToolService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ldang
 */
@Api("Tool")
@RestController
public class ToolController {

    @Autowired
    private ToolService service;

    @ApiOperation("Get time zones of all")
    @GetMapping(APIPath.ToolPath.GET_TIME_ZONE)
    public CommonResult<String[]> listTimeZone() {
        return CommonResult.putResult(service.listTimeZone());
    }

    @ApiOperation("Ping the Internet address")
    @GetMapping(APIPath.ToolPath.PING)
    public CommonResult<Boolean> ping(String uri, Integer type) {
        return CommonResult.putResult(service.ping(uri, type));
    }

}
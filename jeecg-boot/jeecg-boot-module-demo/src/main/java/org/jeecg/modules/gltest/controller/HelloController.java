package org.jeecg.modules.gltest.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.api.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Test-helloworld")
@Slf4j
@RestController
@RequestMapping("/test")
public class HelloController {

    /**
     * hhh
     * @return
     */
    @GetMapping(value = "/hello")
    @ApiOperation(value = "Test-hello", notes = "Test-hello")
    public Result<String> hello(){
        Result<String> result = new Result<String>();
        result.setResult("Hello World!");
        result.setSuccess(true);
        return result;
    }
}

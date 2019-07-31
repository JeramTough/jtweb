package com.jeramtough.test.action.controller;

import com.jeramtough.apiresponse.RestfulApiResponse;
import com.jeramtough.test.dto.Who;
import com.jeramtough.test.service.UserService;
import com.jeramtough.web.action.controller.BaseSwaggerController;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created on 2019/7/25 11:36
 * by @author WeiBoWen
 */
@RestController
@Api(tags = {"测试接口"})
public class TestController extends BaseSwaggerController {

    private final UserService userService;

    @Autowired
    public TestController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation(value = "获取资源", notes = "获取某些资源")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "param", value = "参数也", paramType = "query",
                    required = true, dataType = "String", defaultValue = "JeramTough")})
    @RequestMapping(value = "/getSomething", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String getSomething(String param) {
        return "test-" + param;
    }


    @ApiOperation(value = "获取个人信息", notes = "通过名字和日期获取某人信息")
    @RequestMapping(value = "/getUserInfo", method = RequestMethod.POST)
    @ApiResponses(value = {@ApiResponse(code = 999, message = "发生某些异常")})
    @ResponseBody
    public RestfulApiResponse getInfoByWho(
            @RequestBody Who who) {
        return getSuccessfulApiResponse(userService.getUserInfo(who));
    }

}

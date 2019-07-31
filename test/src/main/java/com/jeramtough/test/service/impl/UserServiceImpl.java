package com.jeramtough.test.service.impl;

import com.jeramtough.apiresponse.ApiResponseException;
import com.jeramtough.test.dto.Who;
import com.jeramtough.test.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created on 2019/7/26 14:34
 * by @author WeiBoWen
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUserInfo(Who who) {
        int random = (int) (Math.random() * 2);
        if (random == 0) {
            throw new ApiResponseException(999);
        }
        else if (random == 1) {
            throw new RuntimeException();
        }
        return who.toString();
    }

}
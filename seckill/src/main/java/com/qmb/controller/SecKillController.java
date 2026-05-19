package com.qmb.controller;

import com.qmb.service.SecKillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/seckill")
public class SecKillController {

    // 用ab压力测试工具：ab -n 1000 -c 200 -p postfile -T application/x-www-form-urlencoded http://192.168.137.1:80/seckill/1111
    @Autowired
    private SecKillService secKillService;

    @PostMapping("/{id}")
    public String secKill(@PathVariable String id)
    {
        String userId = new Random().nextInt(5000) + "";
        String prodId = id;
//        boolean isSuccess = secKillService.secKill(userId,prodId);
        boolean isSuccess = secKillService.secKillByScript(userId,prodId);
        return "" + isSuccess + id;
    }
}

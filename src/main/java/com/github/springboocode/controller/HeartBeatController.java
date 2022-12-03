package com.github.springboocode.controller;

import com.github.springboocode.entity.HeartBeat;
import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoubo
 */
@RestController
public class HeartBeatController {

    @GetMapping("/getHeartBeat")
    @ResponseBody
    public HeartBeat getHeartBeat(){
        HeartBeat heartBeat = new HeartBeat();
        heartBeat.setName("");
        heartBeat.setDate(new Date());
        return heartBeat;
    }

}

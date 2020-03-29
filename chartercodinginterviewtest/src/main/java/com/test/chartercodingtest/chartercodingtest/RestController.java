package com.test.chartercodingtest.chartercodingtest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class RestController {

    @Autowired
    RewardsService rewardsService;

    @GetMapping("/rewards")
    public int rewards(@RequestParam(value = "amount", defaultValue = "0") int amount){

        return rewardsService.getRewardsService(amount);
    }


}

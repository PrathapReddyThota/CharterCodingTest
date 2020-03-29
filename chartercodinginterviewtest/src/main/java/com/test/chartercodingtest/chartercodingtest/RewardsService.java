package com.test.chartercodingtest.chartercodingtest;

import org.springframework.stereotype.Service;

@Service
public class RewardsService {

    public  int getRewardsService(int amount){

        int rewards = 0;
        if(amount> 100) {
            rewards = (amount - 100) * 2 + 1 * 50;
        }
        else if ( amount > 50) {
            rewards = (amount-50) * 1;
        }
        return rewards;
    }

//For testing


public static void main (String... args){
    RewardsService rewardsService = new RewardsService();
    int rewards = rewardsService.getRewardsService(120);
    System.out.println(rewards);
    rewards = rewardsService.getRewardsService(150);
    System.out.println(rewards);
    rewards = rewardsService.getRewardsService(250);
    System.out.println(rewards);
    rewards = rewardsService.getRewardsService(60);
    System.out.println(rewards);
}}

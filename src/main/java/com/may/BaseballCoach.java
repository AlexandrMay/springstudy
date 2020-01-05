package com.may;

public class BaseballCoach implements Coach{

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout(){
        return "Some from baseball coach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}

package com.may;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach(){
        System.out.println("CricketCoach: Inside non-args constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: Inside setter method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Cricket coach workout";
    }

    @Override
    public String getDailyFortune() {
        return "Cricket " + fortuneService.getFortune();
    }
}

package com.may;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Some from TrackCoach";
    }

    @Override
    public String getDailyFortune() {
        return "TrackCoach " + fortuneService.getFortune();
    }

    public void doMyStartup(){
        System.out.println("TrackCoach: startup");
    }

    public void doMyCleanup(){
        System.out.println("TrackCoach: cleanup");
    }

}

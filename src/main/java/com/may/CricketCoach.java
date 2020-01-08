package com.may;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }
    public String getTeam() {
        return team;
    }
    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: Inside setter method for email address");
        this.emailAddress = emailAddress;
    }
    public void setTeam(String team) {
        System.out.println("CricketCoach: Inside setter for method team");
        this.team = team;
    }

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

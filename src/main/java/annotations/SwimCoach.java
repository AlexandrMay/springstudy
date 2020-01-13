package annotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    private TheFortuneService fortuneService;

    public SwimCoach(TheFortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Value("${email}")
    private String email;

    @Value("${team}")
    private String team;


    @Override
    public String getDailyWorkout() {
        return "Swim coach: daily workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}

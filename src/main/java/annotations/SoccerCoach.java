package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

    private TheFortuneService  fortuneService;

    public SoccerCoach(){

    }

    @Autowired
    @Qualifier("fortuneServiceImpl")
    public void doSmth(TheFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Soccer Coach daily workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

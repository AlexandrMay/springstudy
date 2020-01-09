package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

    @Autowired
    @Qualifier("DBFortuneService")
    private TheFortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Daily workout of Basketball Coach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

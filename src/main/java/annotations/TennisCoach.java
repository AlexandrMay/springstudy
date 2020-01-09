package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("thatCoach")
public class TennisCoach implements Coach {

    private TheFortuneService theFortuneService;

    @Autowired
    public TennisCoach(@Qualifier("restFortuneService") TheFortuneService theFortuneService){
        this.theFortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Tennis coach workout";
    }

    @Override
    public String getDailyFortune() {
        return theFortuneService.getFortune();
    }
}

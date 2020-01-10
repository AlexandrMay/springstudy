package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component("thatCoach")
//@Scope("prototype")
public class TennisCoach implements Coach {

    @PostConstruct
    public void initMethod(){
        System.out.println("Tennis Coach: inside init method");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("Tennis Coach: inside destroy method");
    }

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

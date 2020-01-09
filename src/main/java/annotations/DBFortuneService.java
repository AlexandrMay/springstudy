package annotations;

import org.springframework.stereotype.Component;

@Component
public class DBFortuneService implements TheFortuneService {
    @Override
    public String getFortune() {
        return " DBFortune service implementation";
    }
}

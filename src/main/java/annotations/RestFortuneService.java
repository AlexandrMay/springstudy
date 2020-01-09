package annotations;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements TheFortuneService {
    @Override
    public String getFortune() {
        return "RestFortuneService implementation";
    }
}

package annotations;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements TheFortuneService {
    @Override
    public String getFortune() {
        return "Random service implementation";
    }
}

package annotations;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements TheFortuneService {
    @Override
    public String getFortune() {
        return "Sad fortune service implementation";
    }
}

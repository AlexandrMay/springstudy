package annotations;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImpl implements TheFortuneService {
    @Override
    public String getFortune() {
        return "String from Fortune Service";
    }
}

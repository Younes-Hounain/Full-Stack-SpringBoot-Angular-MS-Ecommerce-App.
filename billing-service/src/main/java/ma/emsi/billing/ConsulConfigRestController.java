package ma.emsi.billing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ConsulConfigRestController {
    @Value("${token.accessTokenTimeout}")
    private Long accessTokenTimeout;
    @Value("${token.refreshTokenTimeout}")
    private Long refreshTokenTimeout;

    @GetMapping("/myConfig")
    public Map<String, Object> myConfig(){
        return Map.of(
                "accessTokenTimeout", accessTokenTimeout,
                "refreshTokenTimeout", refreshTokenTimeout
        );
    }
}

package org.orh.spring.cloud.ch108;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class MyConfig {

    @Bean
    public IRule myRule() {
        return new MyRule();
    }
}

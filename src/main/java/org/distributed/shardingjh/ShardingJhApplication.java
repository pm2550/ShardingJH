package org.distributed.shardingjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.PropertySource;

@ConfigurationPropertiesScan
@PropertySource("classpath:shard.properties")
@SpringBootApplication
public class ShardingJhApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJhApplication.class, args);
    }

}

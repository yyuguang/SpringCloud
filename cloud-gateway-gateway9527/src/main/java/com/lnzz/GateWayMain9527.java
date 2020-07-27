package cim.lnzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName：GateWayMain9527
 *
 * @Author 冷暖自知
 * @Date 2020/7/27 21:02
 * @Version 1.0
 * @Description
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain9527.class, args);
    }
}

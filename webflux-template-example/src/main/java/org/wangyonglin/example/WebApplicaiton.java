package org.wangyonglin.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class WebApplicaiton {

    public static void main(String[] args) {
        log.info("**************** 开始启动 ****************");
        SpringApplication.run(WebApplicaiton.class, args);
        log.info("**************** 启动成功 *****************");
    }

}

package cc.eslink;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {io.shardingsphere.shardingjdbc.spring.boot.SpringBootConfiguration.class})
@MapperScan("cc.eslink.mapper")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}

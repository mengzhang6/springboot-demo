package meng.study.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootDemoApplication {


	public static void main(String[] args) {

		//第一种启动方式 默认启动
//		SpringApplication.run(SpringbootDemoApplication.class, args);

		//第二种 创建对象
//		SpringApplication application = new SpringApplication(SpringbootDemoApplication.class);
//		application.setBannerMode(Banner.Mode.OFF);
//		application.run(args);

		//第三种 构造者模式(3种写法)
//        new SpringApplicationBuilder(SpringbootDemoApplication.class).bannerMode(Banner.Mode.CONSOLE).run();
//        new SpringApplicationBuilder().sources(SpringbootDemoApplication.class).bannerMode(Banner.Mode.OFF).run();
//        new SpringApplicationBuilder().sources(SpringbootDemoApplication.class).bannerMode(Banner.Mode.OFF).build(args).run();

        //
        new SpringApplicationBuilder(SpringbootDemoApplication.class).web(true).run(args);
	}



}

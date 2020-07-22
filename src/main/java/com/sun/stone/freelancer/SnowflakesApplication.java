package com.sun.stone.freelancer;

import java.net.MalformedURLException;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.ImageBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.core.io.UrlResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement // Mybatis中service实现类中加入@Transaction事务注解，需要此处添加该注解
@MapperScan("package com.sun.stone.freelancer.mapper") // 扫描*Mapper.xml中namespace所指向的包位置
public class SnowflakesApplication {

	private static final Logger logger = LoggerFactory.getLogger(SnowflakesApplication.class);

	public static void main(String[] args) throws MalformedURLException {
		logger.info("args" + args[0]);

		SpringApplication.run(SnowflakesApplication.class, args);//这里的args如果去掉，控制台日志的颜色就不显示了
		// 使用下面自定义costuming-startup的banner方式run
//		SpringApplication app = new SpringApplication(SnowflakesApplication.class);
//		UrlResource r = new UrlResource(
//				"https://developer.ibm.com/zsystems/wp-content/uploads/sites/75/2018/05/icon-spring-boot-1.jpg");
//		app.setBanner(new ImageBanner(r));
//		app.run(args);
	}
}

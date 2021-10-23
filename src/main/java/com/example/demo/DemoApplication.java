package com.example.demo;

import com.example.demo.common.FileStorageProperties;
import com.example.demo.service.FileStorageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import javax.annotation.Resource;

@SpringBootApplication
public class DemoApplication {
	@Resource
	FileStorageService storageService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Override
	public void run(String... arg) throws Exception {
		storageService.deleteAll();
		storageService.init();
	}
}

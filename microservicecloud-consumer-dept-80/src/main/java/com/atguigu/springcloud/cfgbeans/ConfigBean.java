package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate 提供了多种便捷访问远程Http服务的方法，
 * 是一种简单便捷的访问restful服务模板类，
 * 是Spring提供的用于访问Rest服务的客户端模板工具集
 * 
 * @author YanHongwei
 *
 */
@Configuration
public class ConfigBean {

	@LoadBalanced	//负载均衡  对ConfigBean进行新注解@LoadBalanced    获得Rest时加入Ribbon的配置
	@Bean
	public RestTemplate getRestTemplate() {

		return new RestTemplate();
	}
}

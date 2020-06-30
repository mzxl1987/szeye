/**
 * 
 */
package com.szeye.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author LuLu.Zhu
 *
 * 2020年6月30日 下午6:46:41
 */
@Configuration
public class BeanConfig {

	@Value("${spring.mvc.view.prefix}")
	private String prefix;
	
	@Value("${spring.mvc.view.suffix}")
	private String suffix;
	
	 @Bean
	 public InternalResourceViewResolver setupViewResolver(){
	    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	    resolver.setPrefix(prefix);
	    resolver.setSuffix(suffix);
	    return resolver;

	 }
	
}

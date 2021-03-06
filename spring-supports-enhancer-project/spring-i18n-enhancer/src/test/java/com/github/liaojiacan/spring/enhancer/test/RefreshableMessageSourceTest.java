package com.github.liaojiacan.spring.enhancer.test;

import com.github.liaojiacan.spring.enhancer.i18n.RefreshableMessageSource;
import com.github.liaojiacan.spring.enhancer.i18n.provider.JdbcMessageSourceProvider;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.Locale;

public class RefreshableMessageSourceTest extends AbstractTest {



	@Autowired
	private RefreshableMessageSource refreshableMessageSource;


	@Test
	public void testGetMessage(){
		String message = refreshableMessageSource.getMessage("i18n.test",null, Locale.SIMPLIFIED_CHINESE);
		System.out.println(message);
	}


	@Configuration
	@Import(BaseConfig.class)
	public static class RefreshableMessageSourceTestConfig{

		@Autowired
		private JdbcMessageSourceProvider jdbcMessageSourceProvider;

		@Bean
		public RefreshableMessageSource refreshableMessageSource(){
			return  new RefreshableMessageSource(jdbcMessageSourceProvider);
		}
	}
}

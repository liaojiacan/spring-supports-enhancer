package com.github.liaojiacan.spring.enhancer.i18n.sample.response;


import com.github.liaojiacan.spring.enhancer.i18n.annotation.Translate;

public class I18nSimpleResponse {

	private int id;
	@Translate(code = "i18n.simple.test")
	private String message;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

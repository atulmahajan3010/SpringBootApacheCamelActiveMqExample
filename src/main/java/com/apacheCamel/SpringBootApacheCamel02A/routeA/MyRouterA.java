package com.apacheCamel.SpringBootApacheCamel02A.routeA;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.apache.camel.builder.RouteBuilder;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;

@Component
public class MyRouterA extends RouteBuilder {

	@Autowired
	private GetCurrentTimeBean getCurrentTimeBean;
	
	@Autowired
	private SimpleLoggingProcessComponent simpleLoggingProcessComponent;
	
	@Override
	public void configure() throws Exception {
		// timer
		// transformation
		// log
		
		/*
		 * from("timer:first-timer") //.transform().constant("Time now is "+
		 * LocalDate.now()) //.bean(getCurrentTimeBean, "getCurrentTime ")
		 * 
		 * .log("${body}") .transform().constant("My constant Message") .log("${body}")
		 * .bean(getCurrentTimeBean) .log("${body}")
		 * .bean(simpleLoggingProcessComponent) .process(new SimpleLoggingProcessor())
		 * .to("log:first-timer");
		 */
		
		
	}

}

@Component
class GetCurrentTimeBean {
	public String getCurrentTime() {
		return "Time now is "+ LocalDateTime.now();
	}
}


@Component
class SimpleLoggingProcessComponent {
	
	private Logger logger = (Logger) LoggerFactory.getLogger(SimpleLoggingProcessComponent.class);
	public void process(String message) {
		logger.info("SimpleLoggingProcessComponent {}", message);
	}
}

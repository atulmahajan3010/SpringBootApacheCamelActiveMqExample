package com.apacheCamel.SpringBootApacheCamel02A.routeA;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqSenderRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		//Timer
		
		from("timer:active-mq-timer?period=1000")
		.transform().constant("My message for active MQ")
		.log("${body}")
		.to("activemq:my-activemq-queue");
		//Queue
		
		
		
	}

}

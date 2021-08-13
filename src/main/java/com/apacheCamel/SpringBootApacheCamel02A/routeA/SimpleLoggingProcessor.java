package com.apacheCamel.SpringBootApacheCamel02A.routeA;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class SimpleLoggingProcessor implements Processor {

	private Logger logger = (Logger) LoggerFactory.getLogger(SimpleLoggingProcessor.class);
		
	@Override
	public void process(Exchange exchange) throws Exception {
		logger.info("SimpleLoggingProcessor {}", exchange.getMessage().getBody());		
	}

}

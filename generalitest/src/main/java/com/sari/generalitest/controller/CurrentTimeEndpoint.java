package com.sari.generalitest.controller;

import javax.jws.WebMethod;
import javax.jws.WebService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import com.sari.generalitest.service.CurrentTimeService;


@Service("currentTimeEndpoint")
@WebService(serviceName="CurrentTimeService")
@Controller
public class CurrentTimeEndpoint {
	
	private final Logger logger = LogManager.getLogger(CurrentTimeEndpoint.class);

	@Autowired
	private CurrentTimeService currentTimeService;

	@WebMethod
	public String getCurrentTime() {
		String currentTime = currentTimeService.getCurrentTime();
		logger.info(currentTime);
		return currentTime;
	}
}

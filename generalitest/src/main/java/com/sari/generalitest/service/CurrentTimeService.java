package com.sari.generalitest.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service("currentTimeService")
public class CurrentTimeService {
	
	public String getCurrentTime() {
		return LocalTime.now().toString();
	}
}
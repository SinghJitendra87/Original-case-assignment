package com.afkl.cases.df.statistics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status-metric")
public class StatisticsController {
	
	@Autowired
	MetricService metricService;
	
	@RequestMapping(method = RequestMethod.GET)
	public StatisticsMetric getStatusMetric() {
	    return metricService.getStatusMetric();
	}

}

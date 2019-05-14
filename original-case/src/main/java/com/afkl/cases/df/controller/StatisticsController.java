package com.afkl.cases.df.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.afkl.cases.df.model.StatisticsMetric;
import com.afkl.cases.df.service.MetricService;

@RestController
@RequestMapping("/status-metric")
public class StatisticsController {

	private final MetricService metricService;

	@Autowired
	public StatisticsController(MetricService service) {
		this.metricService = service;
	}

	@RequestMapping(method = RequestMethod.GET)
	public StatisticsMetric getStatusMetric() {
		return metricService.getStatusMetric();
	}

}

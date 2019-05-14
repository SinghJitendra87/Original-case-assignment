package com.afkl.cases.df.serviceImpl;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.stereotype.Service;

import com.afkl.cases.df.model.StatisticsMetric;
import com.afkl.cases.df.service.MetricService;

@Service
public class MetricServiceImpl implements MetricService{

	public MetricServiceImpl() {
		super();
		statisticsMetric = new StatisticsMetric();
	}

	private StatisticsMetric statisticsMetric;

	@Override
	public void increaseCount(int status) {
		Integer reqProcessed = statisticsMetric.getReqProcessed();
		Integer statusCount;
		ConcurrentMap<Integer, Integer> statusMetricMap;

		if (reqProcessed == null) {
			statisticsMetric.setReqProcessed(1);
			statusMetricMap = new ConcurrentHashMap<Integer, Integer>();
			statusMetricMap.put(status, 1);
			statisticsMetric.setStatusMetric(statusMetricMap);
		} else {
			statisticsMetric.setReqProcessed(reqProcessed + 1);
			statusMetricMap = statisticsMetric.getStatusMetric();
			statusCount = statusMetricMap.get(status);
			if (statusCount == null) {
				statusMetricMap.put(status, 1);
			} else {
				statusMetricMap.put(status, statusCount + 1);
			}
		}
	}
	
	@Override
	public StatisticsMetric getStatusMetric() {
		return statisticsMetric;
	}

}

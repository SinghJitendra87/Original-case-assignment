package com.afkl.cases.df.statistics;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.stereotype.Service;

@Service
public class MetricService {

	public MetricService() {
		super();
		statisticsMetric = new StatisticsMetric();
	}

	private StatisticsMetric statisticsMetric;

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
	
	public StatisticsMetric getStatusMetric() {
		return statisticsMetric;
	}

}

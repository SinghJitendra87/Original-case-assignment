package com.afkl.cases.df.service;

import com.afkl.cases.df.model.StatisticsMetric;

public interface MetricService {
	public void increaseCount(int status);
	public StatisticsMetric getStatusMetric();
}

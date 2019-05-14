package com.afkl.cases.df.service;

import com.afkl.cases.df.model.StatisticsMetric;

public interface MetricService {
	public void increaseCount(final int status, final long responseTime);
	public StatisticsMetric getStatusMetric();
}

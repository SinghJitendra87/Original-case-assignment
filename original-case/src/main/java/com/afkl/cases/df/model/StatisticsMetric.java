package com.afkl.cases.df.model;

import java.util.concurrent.ConcurrentMap;

public class StatisticsMetric {

	private Integer reqProcessed;
	private long avgResponseTime;
	private long minResponseTime;
	private long maxResponseTime;
	private long totalResponseTime;	
	private ConcurrentMap<Integer, Integer> statusMetricMap;
	

	public long getTotalResponseTime() {
		return totalResponseTime;
	}

	public void setTotalResponseTime(final long totalResponseTime) {
		this.totalResponseTime = totalResponseTime;
	}

	public final Integer getReqProcessed() {
		return reqProcessed;
	}

	public final void setReqProcessed(final Integer reqProcessed) {
		this.reqProcessed = reqProcessed;
	}

	public final long getAvgResponseTime() {
		return avgResponseTime;
	}

	public final void setAvgResponseTime(final long avgResponseTime) {
		this.avgResponseTime = avgResponseTime;
	}

	public final long getMinResponseTime() {
		return minResponseTime;
	}

	public final void setMinResponseTime(final long minResponseTime) {
		this.minResponseTime = minResponseTime;
	}

	public final long getMaxResponseTime() {
		return maxResponseTime;
	}

	public final void setMaxResponseTime(final long maxResponseTime) {
		this.maxResponseTime = maxResponseTime;
	}

	public final ConcurrentMap<Integer, Integer> getStatusMetric() {
		return statusMetricMap;
	}

	public final void setStatusMetric(final ConcurrentMap<Integer, Integer> statusMetricMap) {
		this.statusMetricMap = statusMetricMap;
	}

}

package com.afkl.cases.df.statistics;

import java.util.concurrent.ConcurrentMap;

public class StatisticsMetric {

	private Integer reqProcessed;
	private Double avgResponseTime;
	private Double minRResponseTime;
	private Double maxResponseTime;
	private ConcurrentMap<Integer, Integer> statusMetricMap;
	
	public final Integer getReqProcessed() {
		return reqProcessed;
	}
	public final void setReqProcessed(Integer reqProcessed) {
		this.reqProcessed = reqProcessed;
	}
	public final Double getAvgResponseTime() {
		return avgResponseTime;
	}
	public final void setAvgResponseTime(Double avgResponseTime) {
		this.avgResponseTime = avgResponseTime;
	}
	public final Double getMinRResponseTime() {
		return minRResponseTime;
	}
	public final void setMinRResponseTime(Double minRResponseTime) {
		this.minRResponseTime = minRResponseTime;
	}
	public final Double getMaxResponseTime() {
		return maxResponseTime;
	}
	public final void setMaxResponseTime(Double maxResponseTime) {
		this.maxResponseTime = maxResponseTime;
	}
	public final ConcurrentMap<Integer, Integer> getStatusMetric() {
		return statusMetricMap;
	}
	public final void setStatusMetric(ConcurrentMap<Integer, Integer> statusMetricMap) {
		this.statusMetricMap = statusMetricMap;
	}
	
	
}

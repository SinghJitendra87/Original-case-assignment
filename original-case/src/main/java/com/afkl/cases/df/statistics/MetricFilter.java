package com.afkl.cases.df.statistics;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.afkl.cases.df.serviceImpl.MetricServiceImpl;

@Component
public class MetricFilter implements Filter {

	@Autowired
	private MetricServiceImpl metricService;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws java.io.IOException, ServletException {
		long startTime = System.currentTimeMillis();
		chain.doFilter(request, response);
		int status = ((HttpServletResponse) response).getStatus();
		long responseTime = (System.currentTimeMillis() - startTime);
		metricService.increaseCount(status,responseTime);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

		// TODO Auto-generated method stub

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}
}
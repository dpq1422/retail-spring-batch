package com.retail.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.retail.CountryData;

@Component("itemProcessor")
@Scope(value = "step")
public class DataProcessor implements ItemProcessor<CountryData, CountryData> {
	private String threadName;
	
	@Override
	public CountryData process(CountryData item) throws Exception {
		System.out.println("threadName:"+threadName+"-  , item:"+item);
		return item;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}
	
}

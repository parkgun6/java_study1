package org.d8.service;

import java.util.Arrays;

import org.d8.domain.Weather;

public class WeatherService {

	Weather[] arr;

	public WeatherService(Weather[] arr) {
		super();
		this.arr = arr;
	}
	
	

	//가장 높은 온도의 날짜
	public Weather getHighestWeather() {
		Weather result = null;
		
		Arrays.sort(this.arr,(d1,d2)-> d1.max - d2.max >0 ?-1:1);
		
		result = arr[0];
		
		return result;
	}
	
	
	//가장 일교차가 큰 날짜
	
	public Weather getHighestDailyCross() {
		Weather result = null;
		
		Arrays.sort(this.arr,(d1,d2)-> d1.getDailyCross() - d2.getDailyCross() >0 ?-1:1);
		
		result = arr[0];
		
		return result;
	}
	
	//특정한 날짜의 강수량
	public Weather getDateWeather(int date) {
		Weather result = null;
		
		Arrays.sort(this.arr,(d1,d2)-> d1.date - d2.date);
		result = arr[date-1];
		return result;
		}
	
	
}

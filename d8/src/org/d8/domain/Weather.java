package org.d8.domain;

public class Weather {
	
	
	public int date;
	public double max;
	public double min;
	public int rainAmount;
	
	public Weather(int date, double max, double min) {
		this(date,max,min,0);//다른생성자함수를 불러올떄
		
	}
	public Weather(int date, double max, double min, int rainAmount) {
		super();
		this.date = date;
		this.max = max;
		this.min = min;
		this.rainAmount = rainAmount;
	}
	
	public int getDailyCross() {
		return (int)(this.max-this.min);
	}
	@Override
	public String toString() {
		return "Weather [date=" + date + ", max=" + max + ", min=" + min + ", rainAmount=" + rainAmount + "]";
	}

}

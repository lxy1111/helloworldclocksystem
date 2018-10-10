package com.mymaven.MyHotelWorldClock;

public class CityClock extends Clock{
	private int utcZeroTime;
	public CityClock(int utcOffset) {
		super.utcOffset=utcOffset;
	}
	public int getTime() {
		return (super.utcOffset+this.utcZeroTime+24)%24;
	}
	public void setUtcZeroTime(int utcZeroTime) {
		this.utcZeroTime=utcZeroTime;
	}
}

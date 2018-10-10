package com.mymaven.MyHotelWorldClock;

public class PhoneClock extends Clock{
	private int time;
	private HotelWorldClockSystem hwcSystem;
	public PhoneClock(int utcOffset) {
		super.utcOffset=utcOffset;
	}
	public void setTime(int time) {
		this.time=time;
		if (this.hwcSystem == null) return;
		for (CityClock cityClock:this.hwcSystem.getClocks()) {
            cityClock.setUtcZeroTime(time-super.utcOffset);
        }
	}
	public int getTime() {
		return this.time;
	}
	public void setHotelWorldClockSystem(HotelWorldClockSystem hwcs) {
		this.hwcSystem=hwcs;
	}
}

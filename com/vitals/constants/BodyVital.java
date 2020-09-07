package com.vitals.constants;

import java.util.HashMap;
import java.util.Map;

public class BodyVital {
	public String vitalName;
	public int low;
	public int high;
	public BodyVital(String vitalName, int low, int high) {
		super();
		this.vitalName = vitalName;
		this.low = low;
		this.high = high;
	}
	public static Map<String,BodyVital> bodyVitalMap = new HashMap<>();
}

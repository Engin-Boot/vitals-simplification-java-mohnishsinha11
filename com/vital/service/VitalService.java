package com.vital.service;
import com.vitals.constants.BodyVital;

public class VitalService {
	public static boolean checkVital( int bpmValue,int spo2Value,int respRateValue)
	{	
		boolean vitalValidity=true;
		vitalValidity&=isVitalValid(BodyVital.bodyVitalMap.get("bpm"),bpmValue);
		vitalValidity&=isVitalValid(BodyVital.bodyVitalMap.get("spo2"),spo2Value);
		vitalValidity&=isVitalValid(BodyVital.bodyVitalMap.get("respRate"),respRateValue);
		return vitalValidity;
	}

	public static boolean isVitalValid(BodyVital bodyVital, int vitalValue)
	{
		//System.out.println("inside isVitalValid");
		if(isVitalLow(bodyVital,vitalValue) && isVitalHigh(bodyVital,vitalValue))
			return true;
		return false;
	}
	public static boolean isVitalLow(BodyVital bodyVital, int vitalValue) {
		if(vitalValue<bodyVital.low) {
			//System.out.println(bodyVital.vitalName + " is low");
			IReporter alertObject=new SmsReport();
			alertObject.alert(bodyVital.vitalName + " " + vitalValue, "is low");
			return false;
		}
		return true;
	}
	public static boolean isVitalHigh(BodyVital bodyVital, int vitalValue)
	{
		if(vitalValue>bodyVital.high) {
			//System.out.println(bodyVital.vitalName + " is high");
			IReporter alertObject=new SmsReport();
			alertObject.alert(bodyVital.vitalName + " " + vitalValue, "is high");
			return false;
		}
		return true;
	}
}

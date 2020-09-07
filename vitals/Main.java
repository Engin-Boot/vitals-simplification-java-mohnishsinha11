package vitals;

import com.vital.service.VitalService;
import com.vitals.constants.BodyVital;

public class Main {
    public static void main(String[] args) {
    	BodyVital.bodyVitalMap.put("bpm",new BodyVital("bpm",70,150));
    	BodyVital.bodyVitalMap.put("spo2",new BodyVital("spo2",90,100));
    	BodyVital.bodyVitalMap.put("respRate",new BodyVital("respRate",30,95));
    	
    	Test.Testing();
        //System.out.println("Some more tests needed");
    }
}

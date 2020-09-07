package vitals;

import com.vital.service.VitalService;

public class Test {
	public static void Testing()
	{
		assert(VitalService.checkVital(80, 97, 40) == true); //all okay
        assert(VitalService.checkVital(60, 98, 40) == false); //bpm low
        assert(VitalService.checkVital(155, 98, 40) == false); //bpm high
        
        assert(VitalService.checkVital(85, 85, 40) == false); //spo2 low
        
        assert(VitalService.checkVital(85, 97, 28) == false); //respRate low
        assert(VitalService.checkVital(80, 98, 105) == false); //respRate high
        
        assert(VitalService.checkVital(110, 96, 60) == true); // all okay
        assert(VitalService.checkVital(60, 86, 28) == false); //all low
        
        
	}
}

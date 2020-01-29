package JunitTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import SingleLane.Main;

public class Tests {
	
	Main  obtest = new Main();


	@Test
	public void VehicleQueueStartSuccess() {

	int value =  obtest.checkVehicleQueue();
	
	assertTrue(value== 1);

	}

	
	

	@Test
	public void checkVehiclePrioritySuccess() {

		int value =  obtest.checkVehiclePriority();

		assertTrue(value== 1);

			
	}
	
	@Test
	public void SuccesfulCarWait() {

		int value =  obtest.carExitWait();

		assertTrue(value== 1);

			
	}
	
	@Test
	public void VehicleQueueSwitchSuccess() {

	int value =  obtest.checkVehicleQueue();
	
	assertTrue(value== 0);

	}

	
	

	@Test
	public void checkVehiclePrioritySwitchSuccess() {

		int value =  obtest.checkVehiclePriority();

		assertTrue(value== 1);

			
	}
	
}

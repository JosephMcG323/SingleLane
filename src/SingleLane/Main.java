package SingleLane;

public class Main {
	
static int VehicleNorth = 3;
static int VehicleSouth = 4;

static int priority = 0;
static int lastCarDirection = 0;

	public static void main(String args[])
	{
		
				
		Thread t1 = new Thread(new Runnable() {
		    public void run()
		    {
		    	 try  //try catch block
	             {    //performs a Thread sleep for a given time
					 Thread.sleep(3000);       
					 
					 VehicleNorth++;
					 VehicleSouth++;
					 
					 System.out.println("3 seconds done. One car added to each direction");
					 }
	             catch(InterruptedException iex)
	             {  //prints the stack trace of the Exception to System.err.  Helps diagnose Exception.
	                 iex.printStackTrace();
	             }
		    }});  
		
		
		
		
		    t1.start();
		    
		    
		  
		    
		    
		while(VehicleNorth != 0  || VehicleSouth != 0)
		{
			
			checkVehicleQueue();  
			checkVehiclePriority();   
			carExitWait();
			
			
			
			
			
		}
		
		//here is priority after rule eval

		
	}
	
	
	
	public static int checkVehicleQueue() {
		
		
		if (VehicleNorth > VehicleSouth ) // if north side queue is greater 
		{
			System.out.println("northbound > southbound: Priority is northbound");
			
			
			priority = 0; //north priority
			return priority;
		}
		
		
		else if (VehicleSouth > VehicleNorth) // if south side queue is greater
		{
			
			System.out.println("southbound > northbound: Priority is southbound");

			
			priority = 1; //South priority
			
			return priority;
		}
		
		//if they equal
		
		
		else    //check 
			
		{
			
			
			
			if (priority == 0)
				
			{
				
				System.out.println("northbound = southbound : Priority is northbound");
				priority = 1;
				return priority;
			}
			
			else 
			{
				System.out.println("southbound = northbound : Priority is southbound");

				priority = 0;
				return priority;
			}
			
			
			

			
		}
		
		
		
	}
	
	public static int checkVehiclePriority(){
		
		if (priority == 0) //northbound
		{
			
			VehicleNorth--;
			
			System.out.println(VehicleNorth +" Northbound cars remain, "+ VehicleSouth + " Southbound cars remain");
			
			return priority;
		}
		
		else 
			
		{	
			VehicleSouth--;
			
			System.out.println(VehicleSouth +" Southbound cars remain, "+ VehicleNorth + " Northbound cars remain");

			return priority;
		}
		
		
	}
	
	public static int carExitWait(){
	 try  //try catch block
     {    //performs a Thread sleep for a given time
		 Thread.sleep(1000);         
		 return 1;
		 }
     catch(InterruptedException iex)
     {  //prints the stack trace of the Exception to System.err.  Helps diagnose Exception.
         iex.printStackTrace();
         
         return 0;
     }
	
	
}
	
}
	


# SingleLane


Problem Statement
Develop a Java implementation of a one-lane bridge. Cars coming from the north and the south arrive at a one-lane bridge and only one car in the same direction can pass through. 
	Start with Southbound: 4 cars 
	Start with Northbound: 3 cars 
Rules

	Cars >= 3 or the direction with higher number of cars lined up has priority to cross the bridge
	If car numbers are equal on both directions, the priority switches to opposite side 
	Each side will have a car added every 3 seconds
  After entering the bridge, a simulated car should leave it after 1 second.
 Program can break if queue on either side becomes zero.
 
 
Output
Please provide log output such that you can observe what happens on the one-lane bridge. This output could for instance look as follows:
	    southbound > northbound : Priority is southbound 
	    3 southbound cars remain, 3 northbound cars
	    northbound = southbound: Priority is northbound
	    2 northbound cars remain, 3 southbound cars
	    3 seconds done. One car added to each direction.
	    Total southbound: 4 Total northbound 3
	    southbound > northbound. Priority changes to southbound
	    3 southbound cars remain, 3 northbound cars
	    northbound = southbound: Priority is northbound
	    2 northbound cars remain, 3 southbound cars
	    ...
	    ... 


Recommended IDE InteliJ

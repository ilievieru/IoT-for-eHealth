

public template <Class A> class Composite{
	ArrayList<A> components = new ArrayList<A>();
	
	void addComponent(A object){
		components.add(object);
	}
	
	
	void removeComponent(A object){
		components.remove(object);
	}
	
	
	void sendMessage(String message){ }
	
	
	ArrayList<A> getComponents(){
		return components;
	}
}


public class BuildingPlan extends Composite<BuidingFloorPlan>{
	String buildingName;
	
	public BuidingFloorPlan getFloor(String roomId){
		for(Room tmpRoom : components){
			if(tmpRoom.roomId.equals(roomId)){
				return tmpRoom;
			}
		}
		
		return null;
	}
	
}

public class BuidingFloorPlan extends Composite<Room>{
	String floorId;
	String floorName;
	BuildingFloorPlan nextFloor,previousFloor;
	
	public Room getRoom(String roomId){
		for(Room tmpRoom : components){
			if(tmpRoom.roomId.equals(roomId)){
				return tmpRoom;
			}
		}
		
		return null;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null)
			return false;
			
		BuidingFloorPlan plan = (BuidingFloorPlan)obj;
		
		if(plan.floorId.equals(this.floorId)){
			return true;
		}
		
		return false;
	}
	
}

public class Room{
	String roomId;
	String roomName;
	Image planImage;
	ArrayList<Room> neighbours = new ArrayList<Room>();
	
	public void addNeighbour(Room neighbour){
		neighbours.add(neighbour);
	}
	
	public void removeNeighbour(Room neighbour){
		neighbours.romove(neighbour);
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null)
			return false;
			
		Room room = (Room)obj;
		
		if(room.roomId.equals(this.roomId)){
			return true;
		}
		
		return false;
	}
	
}
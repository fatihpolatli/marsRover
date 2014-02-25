
public class Rover{
	
	private rover[] roverArr = new rover[];
	
	public Rover(int upperX, int upperY){
	
		this.upperX = upperX;
		this.upperY = upperY;
		
	}
	
	public void init(int moveX, int moveY, String dir){
	
		positionX = moveX;
		positionY = moveY;
		
		direction = dir;
	}	
	
	public void sendCommand(String commandStr){
	
		String[] commandArr = commandStr.split();
		
		int commandLength	= commandStr.length;
		String command;
		
		for(int i = 0; i < commandLength; i++){
			
			command = commandArr[i];
			
			if(command.equals(LEFT)){
			
				switch(direction){
					
					case NORTH	: direction = EAST; 	break;
					case EAST	: direction = SOUTH; 	break;
					case SOUTH	: direction = WEST;		break;
					case WEST	: direction = NORTH; 	break;
					
				}
				
			}else if(command.equals(RIGHT)){
			
				switch(direction){
					
					case NORTH	: direction = WEST; 	break;
					case WEST	: direction = SOUTH; 	break;
					case SOUTH	: direction = EAST;		break;
					case EAST	: direction = NORTH; 	break;
					
				}
			
			}else if(command.equals(MOVE)){
			
				switch(direction){
					
					case NORTH	: positionY++; 	break;
					case WEST	: positionX++;	break;
					case SOUTH	: positionY--;	break;
					case EAST	: positionX--; 	break;
					
				}
				
				checkForLimits();
			}
			
			
		}
	
	}
	
	private void checkForLimits(){
	
		if(positionX < 0){
					
			positionX = 0;
		}else if(positionX > upperX){
			
			positionX = upperX;
		}
		
		if(positionY < 0){
			
			positionY = 0;
		}else if(positionY > upperY){
			
			positionY = upperY;
		}
}
	
	public String getPosition(){
		
		return positionX + " " + positionY + " " + direction;
	}
	

}


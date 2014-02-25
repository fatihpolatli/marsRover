
public class MarsRover{


	private List<Rover> roverList = new ArrayList<Rover>();
	
	public static void main(String[] args){
		
		new MarsRover();
	}
	
	public MarsRover(){	
	
		addRover(5, 5, 1, 2, 'N', 'LMLMLMLMM');
		addRover(5, 5, 3, 3, 'E', 'MMRMMRMRRM');
	}	
	
	
	public void addRover(int upX, int upY, int initX, int initY, String initDir, String command){
		
		
		Rover rover = new Rover(upX,upY);
		
		rover.init(initX,initY,dir);

·       rover.sendCommand(command);

		roverList.add(rover);
	
	}
	
	public String getFinalPositions(){
		
		int roverSize = roverList.size();
		
		Rover rover;
		String commandStr = "";
		
		for(int i = 0; i < roverSize; i++){
		
			rover = roverList.get(i);
			
			commandStr += rover.getPosition() + "/n";
			
		}
		
		System.out.println(commandStr);
		return commandStr;
	}
	

}


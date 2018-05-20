package ma.oth.designpatterns.behavioral.interpreter;

import java.util.Arrays;
import java.util.List;

public class Context {

	private final String UP = "\u21E7";
	private final String RIGHT = "\u21E8";
	private final String DOWN = "\u21E9";
	private final String LEFT = "\u21E6";
	
	private String currentDirection=UP;

	private List<String> directions = Arrays.asList(new String[] { UP, LEFT, DOWN, RIGHT });
	
	public String getDirection(int index) {
		return directions.get(index%4);
		
	}
	
	public int getIndex(String direction) {
		return directions.indexOf(direction);
	}
	
	public String getCurrentDirection() {
		return this.currentDirection;
	}
	
	public int getCurrentDirectionIndex() {
		return this.getIndex(this.currentDirection);
	}

	public void setCurrentDirection(String currentDirection) {
		this.currentDirection = currentDirection;
	}
	

}

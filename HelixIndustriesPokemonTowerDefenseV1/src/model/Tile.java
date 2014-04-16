package model;

public class Tile {
	
	int height;
	int width;
	private boolean isOnPath;
	private boolean hasTower;
	private boolean isEmpty;
	private boolean hasMob;
	private boolean isWater;
	private boolean isLand;
	private int direction;
	private int row;
	private int col;
	Object myObject = null;
	
	public Tile(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void setLocation(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	public void setObject(Object obj) {
		this.myObject = obj;
	}
	
	public Object getObject() {
		return this.myObject;
	}
	
	public boolean isOnPath() {
		return isOnPath;
	}

	public void setOnPath(boolean isOnPath) {
		this.isOnPath = isOnPath;
	}
	
	public boolean hasTower() {
		return hasTower;
	}
	
	public void setHasTower(boolean hasTower) {
		this.hasTower = hasTower;
	}
	
	public boolean isEmpty() {
		return isEmpty;
	}
	
	public void setIsEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	
	public boolean hasMob() {
		return hasMob;
	}
	
	public void setHasMob(boolean hasMob) {
		this.hasMob = hasMob;
	}
	
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	// Currently set so that a tower can be placed on either land or water *
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	public boolean canPlaceTower() {
		return (isLand || isWater) && (isOnPath() == false);
	}
	
	public boolean isWater() {
		return isWater;
	}
	
	public void setIsWater(boolean isWater) {
		this.isWater = isWater;
	}
	
	public boolean isLand() {
		return isLand;
	}
	
	public void setIsLand(boolean isLand) {
		this.isLand = isLand;
	}
	
	// Sets direction to 0,1,2,3:
	// 0 := up
	// 1 := right
	// 2 := down
	// 3 := left
	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	public int getDirection() {
		return direction;
	}

}

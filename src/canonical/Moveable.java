package canonical;

import intfscan.IMoveable;

public class Moveable implements IMoveable {

	  public int position;
	  public int rotation;
	  public int velocity;
	  public int angularVelocity;

	@Override
	public void move(int time) {
	    position += velocity * time;
	    rotation += angularVelocity * time;
	}

}

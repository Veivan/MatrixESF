package canonical;

import intfscan.IMoveable;

public class Moveable implements IMoveable {

	public PositionComponent position;

	public int velocity;
	public int angularVelocity;

	@Override
	public void move(int time) {
		position.x += velocity * time;
		position.rotation += angularVelocity * time;
	}

}

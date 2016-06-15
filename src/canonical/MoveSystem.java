package canonical;

import intfscan.ISystem;

import java.util.ArrayList;
import java.util.List;

public class MoveSystem implements ISystem {

	protected List<MoveNode> targets = new ArrayList<MoveNode>();

	@Override
	public boolean start() {
		return true;
	}

	@Override
	public void update(int time) {
		for (MoveNode target : targets) {
			target.position.x += target.velo.velocity * time;
			target.position.rotation += target.velo.angularVelocity * time;
		}
		System.out.println("MoveSystem updated");
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub

	}

}

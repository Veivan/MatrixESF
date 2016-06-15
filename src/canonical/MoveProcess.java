package canonical;

import intfscan.IProcess;

import java.util.List;

public class MoveProcess implements IProcess {

	protected List<MoveData> targets; 

	@Override
	public boolean start() {
		return true;
	}

	@Override
	public void update(int time) {
		for(MoveData target : targets) { 
			target.position.x += target.velocity * time;
			target.position.rotation += target.angularVelocity * time;
}		
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
		
	}

}

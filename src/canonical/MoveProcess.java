package canonical;

import intfscan.IMoveable;
import intfscan.IProcess;

import java.util.List;

public class MoveProcess implements IProcess {

	protected List<IMoveable> targets; 

	@Override
	public boolean start() {
		return true;
	}

	@Override
	public void update(int time) {
		for(IMoveable target : targets) target.move(time);		
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
		
	}

}

package canonical;

import intfscan.IProcess;
import java.util.List;

public class RenderProcess implements IProcess {

	protected List<RenderData> targets; 
	
	@Override
	public boolean start() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void update(int Number) {
		for(RenderData target : targets) {
			target.view.x = target.position.x;
			target.view.y = target.position.y;
			target.view.rotation = target.position.rotation;
}
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub		
	}

}

package canonical;

import intfscan.IProcess;
import intfscan.IRenderable;

import java.util.List;

public class RenderProcess implements IProcess {

	protected List<IRenderable> targets; 
	
	@Override
	public boolean start() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void update(int Number) {
		for(IRenderable target : targets) target.render();
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub		
	}

}

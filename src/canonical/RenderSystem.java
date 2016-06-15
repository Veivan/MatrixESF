package canonical;

import intfscan.ISystem;

import java.util.ArrayList;
import java.util.List;

public class RenderSystem implements ISystem {

	protected List<RenderNode> targets = new ArrayList<RenderNode>();

	@Override
	public boolean start() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void update(int Number) {
		for (RenderNode target : targets) {
			target.view.x = target.position.x;
			target.view.y = target.position.y;
			target.view.rotation = target.position.rotation;
		}
		System.out.println("RenderSystem updated");
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
	}

}

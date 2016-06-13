package canonical;

import intfscan.IRenderable;

public class Renderable implements IRenderable {

	public DispView view;
	public int position;
	public int rotation;

@Override
	public void render() {
		view.x = position;
		view.rotation = rotation;
	}

}

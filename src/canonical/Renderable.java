package canonical;

import intfscan.IRenderable;

public class Renderable implements IRenderable {

	public DispView view;
	public PositionComponent position;

@Override
	public void render() {
	    view.x = position.x;
	    view.y = position.y;
	    view.rotation = position.rotation;
}

}

package canonical;

public class Spaceship {

	public RenderData renderData;
	public MoveData moveData;

	public Spaceship() {
		moveData = new MoveData();
		renderData = new RenderData();
	    moveData.position = new PositionComponent();
	    renderData.position = moveData.position;
	    renderData.view = new DispView();
	}
}

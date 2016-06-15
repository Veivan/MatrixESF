package canonical;

public class Spaceship {

	public Renderable renderData;
	public Moveable moveData;

	public Spaceship() {
		moveData = new Moveable();
		renderData = new Renderable();
	    moveData.position = new PositionComponent();
	    renderData.position = moveData.position;
	    renderData.view = new DispView();
	}
}

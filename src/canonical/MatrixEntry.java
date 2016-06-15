package canonical;

import java.util.Date;

public class MatrixEntry {

	public static void main(String[] args) {

		Engine engine = new Engine();
		Entity Spaceship1 = createSpaceship();
		Entity Spaceship2 = createSpaceship();
		engine.addEntity(Spaceship1);
		engine.addEntity(Spaceship2);

		MoveSystem moveSystem = new MoveSystem();
		RenderSystem renderSystem = new RenderSystem();
		engine.addSystem(moveSystem, 1);
		engine.addSystem(renderSystem, 2);

		try {
			while (true) {
				Date ndate = new Date();
				System.out.println(ndate);
				int time = 2;
				engine.update(time);
				Thread.sleep(5 * 1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static Entity createSpaceship() {
		Entity spaceship = new Entity();
		PositionComponent position = new PositionComponent();
		position.x = 10;
		position.y = 10;
		position.rotation = 0;
		spaceship.add(position);
		DisplayComponent display = new DisplayComponent();
		spaceship.add(display);
		return spaceship;
	}
}

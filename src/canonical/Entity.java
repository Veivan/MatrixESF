package canonical;

import intfscan.IComponent;

import java.util.HashMap;
import java.util.Map;

public class Entity {
	// It's container of components

	private Map<String, IComponent> components = new HashMap<String, IComponent>();

	public void add(IComponent component) {
		components.put(component.getClass().getName(), component);
	}

	public void remove(String componentClass) {
		if (components.containsKey(componentClass))
			components.remove(componentClass);
	}

	public IComponent get(String componentClass) {
		return components.get(componentClass);
	}

	public DisplayComponent view;
	public PositionComponent position;
	public VelocityComponent velocity;

	public Entity() {
		view = new DisplayComponent();
		position = new PositionComponent();
		velocity = new VelocityComponent();
	}
}

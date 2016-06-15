package canonical;

import intfscan.IComponent;
import intfscan.INode;
import intfscan.ISystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Engine {

	private List<Entity> entities = new ArrayList<Entity>();
	private List<ISystem> systems = new ArrayList<ISystem>();
	private Map<String, INode> nodeLists = new HashMap<String, INode>();

	public void addEntity(Entity entity) {
		entities.add(entity);
		// создание узлов из компонентов сущностей и добавление их в список
		// узлов
		// наблюдение за последующим добавлением и удалением компонентов к
		// сущности и соответствующие изменения в зависимых узлах
	}

	public void removeEntity(Entity entity) {
		// удаление узлов, содержащих компоненты сущности
		// и их извлечение из списка узлов
		entities.remove(entity);
	}

	public void addSystem(ISystem system, int priority) {
		systems.add(system);
		system.start();
	}

	public void removeSystem(ISystem system) {
		system.end();
		systems.remove(system);
	}
	
    // create the nodes from the current set of entities
    // and populate the node list
/*	  public Map<String, INode> getNodeList( nodeClass:Class ):
	  {
	    var nodes:NodeList = new NodeList();
	    nodeLists[ nodeClass ] = nodes;
	    return nodes;
	  } */

	  public void update(int time )
	  {
		  for(ISystem system : systems)
	    {
	      system.update( time );
	    }
	  }
}

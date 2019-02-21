package fr.openent.todolist;

import fr.openent.todolist.controllers.TodoListController;
import org.entcore.common.http.BaseServer;

public class Todolist extends BaseServer {

	@Override
	public void start() throws Exception {
		super.start();

		addController(new TodoListController());
	}

}

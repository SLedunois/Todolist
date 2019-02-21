package fr.openent.todolist.controllers;

import fr.wseduc.rs.ApiDoc;
import fr.wseduc.rs.Get;
import fr.wseduc.security.ActionType;
import fr.wseduc.security.SecuredAction;
import io.vertx.core.http.HttpServerRequest;
import org.entcore.common.controller.ControllerHelper;

public class TodoListController extends ControllerHelper {

    public TodoListController() {
        super();
    }

    @Get("")
    @ApiDoc("Render view")
    @SecuredAction(value = "todolist.view", type = ActionType.WORKFLOW)
    public void render(HttpServerRequest request) {
        renderView(request);
    }
}

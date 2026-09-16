package org.watchman.command.commandHandlers;

import org.watchman.command.CommandContext;
import org.watchman.command.CommandHandler;

public class AddCommandHandler implements CommandHandler {
    @Override
    public String name() {
        return "add";
    }

    @Override
    public String description() {
        return "this command adds changed files into staging area to track changes";
    }

    @Override
    public void handle(CommandContext commandContext, String[] args) throws Exception {

    }
}

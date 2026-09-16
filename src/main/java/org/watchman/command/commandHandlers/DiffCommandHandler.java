package org.watchman.command.commandHandlers;

import org.watchman.command.CommandContext;
import org.watchman.command.CommandHandler;

public class DiffCommandHandler implements CommandHandler {
    @Override
    public String name() {
        return "diff";
    }

    @Override
    public String description() {
        return "";
    }

    @Override
    public void handle(CommandContext commandContext, String[] args) throws Exception {

    }
}

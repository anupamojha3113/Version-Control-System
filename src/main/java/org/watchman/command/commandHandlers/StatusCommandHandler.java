package org.watchman.command.commandHandlers;

import org.watchman.command.CommandContext;
import org.watchman.command.CommandHandler;

public class StatusCommandHandler implements CommandHandler {
    @Override
    public String name() {
        return "status";
    }

    @Override
    public String description() {
        return "";
    }

    @Override
    public void handle(CommandContext commandContext, String[] args) throws Exception {

    }
}

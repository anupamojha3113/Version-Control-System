package org.watchman.command.commandHandlers;

import org.watchman.command.CommandContext;
import org.watchman.command.CommandHandler;

public class CommitCommandHandler implements CommandHandler {
    @Override
    public String name() {
        return "commit";
    }

    @Override
    public String description() {
        return "";
    }

    @Override
    public void handle(CommandContext commandContext, String[] args) throws Exception {

    }
}

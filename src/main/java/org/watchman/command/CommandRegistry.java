package org.watchman.command;

import java.io.PrintStream;
import java.util.LinkedHashMap;
import java.util.Map;

public class CommandRegistry {
    private final PrintStream out;
    private final Map<String, CommandHandler> handlers;

    public CommandRegistry(PrintStream out) {
        this.out = out;
        this.handlers = new LinkedHashMap<>();
    }

    public CommandRegistry registerHandler(CommandHandler commandHandler) {
        handlers.put(commandHandler.name(), commandHandler);
        return this;
    }

    public void execute(CommandContext commandContext, String[] args) {
    }
}

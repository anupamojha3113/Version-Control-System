package org.watchman.command;

public interface CommandHandler {
    String name();
    String description();
    void handle(CommandContext commandContext, String[] args) throws Exception;
}

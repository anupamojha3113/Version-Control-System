package org.watchman;

import org.watchman.command.CommandContext;
import org.watchman.command.CommandRegistry;
import org.watchman.command.commandHandlers.*;

import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WatchmanApplication {
    private final PrintStream out;
    private final CommandRegistry commandRegistry;

    public WatchmanApplication() {
        this(System.out);
    }

    public WatchmanApplication(PrintStream out) {
        this.out = out;
        commandRegistry = buildCommandRegistry();
    }

    public void run(String[] args) {

    }

    private CommandRegistry buildCommandRegistry() {
        return new CommandRegistry(out)
                .registerHandler(new CloneCommandHandler())
                .registerHandler(new InitCommandHandler())
                .registerHandler(new AddCommandHandler())
                .registerHandler(new StatusCommandHandler())
                .registerHandler(new DiffCommandHandler())
                .registerHandler(new CommitCommandHandler());
    }
}

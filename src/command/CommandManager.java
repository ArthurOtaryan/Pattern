package command;

import java.util.ArrayDeque;
import java.util.Deque;

public class CommandManager {
    private final Deque<Command> undoStack = new ArrayDeque<>();
    private final Deque<Command> redoStack = new ArrayDeque<>();

    public void execute(Command command) {
        command.execute();
        undoStack.push(command);
        redoStack.clear();
        System.out.println("  executed: " + command);
    }

    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("  nothing to undo");
            return;
        }
        Command command = undoStack.pop();
        command.undo();
        redoStack.push(command);
        System.out.println("  undone: " + command);
    }

    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("  nothing to redo");
            return;
        }
        Command command = redoStack.pop();
        command.execute();
        undoStack.push(command);
        System.out.println("  redone: " + command);
    }
}

package command;

import java.util.ArrayDeque;
import java.util.Deque;

/** Инициатор (Invoker): выполняет команды и хранит историю для undo/redo. */
public class CommandManager {
    private final Deque<Command> undoStack = new ArrayDeque<>();
    private final Deque<Command> redoStack = new ArrayDeque<>();

    public void execute(Command command) {
        command.execute();
        undoStack.push(command);
        redoStack.clear();
        System.out.println("  выполнено: " + command);
    }

    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("  нечего отменять");
            return;
        }
        Command command = undoStack.pop();
        command.undo();
        redoStack.push(command);
        System.out.println("  отменено: " + command);
    }

    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("  нечего повторять");
            return;
        }
        Command command = redoStack.pop();
        command.execute();
        undoStack.push(command);
        System.out.println("  повторено: " + command);
    }
}

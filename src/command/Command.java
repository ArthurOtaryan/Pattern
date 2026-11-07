package command;

/** Команда: инкапсулирует запрос как объект и умеет его отменять. */
public interface Command {
    void execute();
    void undo();
}

class InsertCommand implements Command {
    private final TextEditor editor;
    private final String value;

    InsertCommand(TextEditor editor, String value) {
        this.editor = editor;
        this.value = value;
    }

    @Override
    public void execute() { editor.insert(value); }

    @Override
    public void undo() { editor.delete(value.length()); }

    @Override
    public String toString() { return "Вставить \"" + value + "\""; }
}

class DeleteCommand implements Command {
    private final TextEditor editor;
    private final int count;
    private String deleted = "";

    DeleteCommand(TextEditor editor, int count) {
        this.editor = editor;
        this.count = count;
    }

    @Override
    public void execute() {
        String text = editor.getText();
        deleted = text.substring(Math.max(0, text.length() - count)); // запоминаем для undo
        editor.delete(count);
    }

    @Override
    public void undo() { editor.insert(deleted); }

    @Override
    public String toString() { return "Удалить " + count + " симв."; }
}

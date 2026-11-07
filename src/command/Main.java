package command;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Command ===");

        TextEditor editor = new TextEditor();
        CommandManager manager = new CommandManager();

        manager.execute(new InsertCommand(editor, "Hello"));
        manager.execute(new InsertCommand(editor, ", world!"));
        show(editor);

        manager.execute(new DeleteCommand(editor, 7));
        show(editor);

        manager.undo();
        show(editor);

        manager.undo();
        show(editor);

        manager.redo();
        show(editor);
    }

    private static void show(TextEditor editor) {
        System.out.println("    text: \"" + editor.getText() + "\"");
    }
}

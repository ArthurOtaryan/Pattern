package command;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Command ===");

        TextEditor editor = new TextEditor();
        CommandManager manager = new CommandManager();

        manager.execute(new InsertCommand(editor, "Привет"));
        manager.execute(new InsertCommand(editor, ", мир!"));
        show(editor);

        manager.execute(new DeleteCommand(editor, 5));
        show(editor);

        manager.undo();
        show(editor);

        manager.undo();
        show(editor);

        manager.redo();
        show(editor);
    }

    private static void show(TextEditor editor) {
        System.out.println("    текст: \"" + editor.getText() + "\"");
    }
}

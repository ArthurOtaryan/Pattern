package command;

public class TextEditor {
    private final StringBuilder text = new StringBuilder();

    public void insert(String value) {
        text.append(value);
    }

    public void delete(int count) {
        int start = Math.max(0, text.length() - count);
        text.delete(start, text.length());
    }

    public String getText() {
        return text.toString();
    }
}

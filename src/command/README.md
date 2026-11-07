# 12. Command

**Type:** behavioral pattern

## Idea
Turns a **request into a stand-alone object**. This lets you pass actions as parameters, queue them, log them, and **undo/redo** them.

## When to use
- You need undo and redo (text editors, graphics programs)
- You want to queue operations or schedule them
- Menu items and hotkeys that trigger the same action
- Java examples: `Runnable`, `Callable`

## Structure
```
CommandManager (Invoker)
 ├─ undoStack / redoStack
 ├─ execute(Command)
 ├─ undo()
 └─ redo()

Command (interface): execute(), undo()
 ├─ InsertCommand ──► TextEditor (Receiver)
 └─ DeleteCommand ──► TextEditor
```

## Implementation
| File | Role |
|------|------|
| `TextEditor.java` | Receiver — performs the actual text operations |
| `Command.java` | Command interface plus `InsertCommand` and `DeleteCommand` |
| `CommandManager.java` | Invoker with undo/redo history |
| `Main.java` | Demo |

## Sample output
```
text: "Hello, world!"
executed: Delete 7 chars
text: "Hello,"
undone: Delete 7 chars
text: "Hello, world!"
```

## Pros and cons
✅ Decouples the invoker from the receiver, supports undo/redo, queues, and macro commands
❌ Many extra classes

## Run
```bash
javac -d out src/command/*.java
java -cp out command.Main
```

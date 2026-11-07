# 6. Adapter

**Type:** structural pattern

## Idea
Allows objects with **incompatible interfaces to work together**. The adapter wraps one object and exposes an interface the client understands.

## Analogy
A travel plug adapter: the plug (client) stays the same, the socket (service) is different, and the adapter sits between them.

## When to use
- You want to use a third-party class, but its interface does not fit
- Integrating with legacy code
- You cannot change the library's source code

## Structure
```
Client ──► MediaPlayer (interface)
              ├─ Mp3Player
              └─ VlcAdapter ──► VlcLibrary (third-party API)
                   play()  →  openFile() + startPlayback()
```

## Implementation
| File | Role |
|------|------|
| `MediaPlayer.java` | Target interface plus the native implementation `Mp3Player` |
| `VlcLibrary.java` | Adaptee (third-party library) |
| `VlcAdapter.java` | Adapter |
| `Main.java` | Client plays different formats through one interface |

## Pros and cons
✅ Separates interface conversion from business logic, no need to change existing code
❌ An extra layer of classes adds complexity

## Run
```bash
javac -d out src/adapter/*.java
java -cp out adapter.Main
```

# 8. Facade

**Type:** structural pattern

## Idea
Provides a **simple interface to a complex system** of classes, a library, or a framework.

## Analogy
Ordering by phone: the operator (facade) takes your order, while the warehouse, payment, and delivery work behind the scenes.

## When to use
- You need simple access to a complex subsystem
- You want to split a system into layers
- You want to reduce the client's dependency on many classes

## Structure
```
Client ──► HomeTheaterFacade
              ├─ watchMovie()
              └─ endMovie()
                   │
       ┌───────────┼───────────┬──────────────┐
   Projector   SoundSystem   Lights   StreamingPlayer
```

## Implementation
| File | Role |
|------|------|
| `Subsystems.java` | Subsystem classes: `Projector`, `SoundSystem`, `Lights`, `StreamingPlayer` |
| `HomeTheaterFacade.java` | Facade |
| `Main.java` | Client calls 2 methods instead of 15 |

## Example
```java
HomeTheaterFacade theater = new HomeTheaterFacade();
theater.watchMovie("Interstellar");
theater.endMovie();
```

## Pros and cons
✅ Isolates the client from subsystem complexity
❌ A facade can become a "god object" coupled to every class

## Run
```bash
javac -d out src/facade/*.java
java -cp out facade.Main
```

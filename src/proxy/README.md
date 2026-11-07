# 9. Proxy

**Type:** structural pattern

## Idea
Provides a **substitute object** in place of the real one. The proxy intercepts calls and can do something before or after passing them to the original object.

## Kinds of proxy
- **Virtual** — lazy loading of a heavy object
- **Protection** — access control checks
- **Caching** — stores results
- **Remote** — represents an object in another process or on a server
- **Logging** — records calls

## Structure
```
Client ──► Image (interface)
              ├─ RealImage    ← heavy real object
              └─ ImageProxy   ← holds RealImage, creates it lazily,
                                checks the user's role
```

## Implementation
| File | Role |
|------|------|
| `Image.java` | Shared interface plus the real object `RealImage` |
| `ImageProxy.java` | Proxy: lazy loading and access control |
| `Main.java` | Demo |

## Difference from Decorator
The structure is similar, but a Decorator **adds behavior** and is composed by the client, while a Proxy **controls access** and manages the object's lifecycle itself.

## Pros and cons
✅ Controls the object transparently for the client, lazy initialization
❌ May add latency, makes the code more complex

## Run
```bash
javac -d out src/proxy/*.java
java -cp out proxy.Main
```

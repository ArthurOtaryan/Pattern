# 1. Singleton

**Type:** creational pattern

## Idea
Ensures that a class has **only one instance** and provides a global access point to it.

## When to use
- Application configuration
- Logger
- Database connection pool
- Cache

## Structure
```
AppConfig
 ├─ private static volatile AppConfig instance
 ├─ private AppConfig()          ← constructor is hidden
 └─ public static getInstance()  ← the only way to get the object
```

## Implementation
| File | Description |
|------|-------------|
| `AppConfig.java` | Classic thread-safe Singleton (double-checked locking) |
| `Logger.java` | Singleton via `enum`, the recommended approach in Java |
| `Main.java` | Demo: two references point to the same object |

## Example
```java
AppConfig a = AppConfig.getInstance();
AppConfig b = AppConfig.getInstance();
System.out.println(a == b);
```
Output: `true`

## Pros and cons
✅ Single instance, lazy initialization, global access
❌ Hidden dependencies, harder to test, violates the Single Responsibility Principle

## Run
```bash
javac -d out src/singleton/*.java
java -cp out singleton.Main
```

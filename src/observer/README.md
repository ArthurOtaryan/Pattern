# 10. Observer

**Type:** behavioral pattern

## Idea
Defines a **subscription mechanism**: one object (the publisher) notifies many other objects (subscribers) about changes in its state.

## When to use
- A change in one object requires changing others, and you don't know in advance which ones
- Event systems, GUIs (button listeners), notifications
- Java examples: `PropertyChangeListener`, Swing listeners

## Structure
```
NewsAgency (Subject)
 ├─ subscribe(Subscriber)
 ├─ unsubscribe(Subscriber)
 └─ publish(news) ──► for each: subscriber.update(news)

Subscriber (interface)
 ├─ EmailSubscriber
 └─ TelegramSubscriber
```

## Implementation
| File | Role |
|------|------|
| `NewsAgency.java` | Publisher |
| `Subscriber.java` | Observer interface plus `EmailSubscriber` and `TelegramSubscriber` |
| `Main.java` | Subscribe, publish, unsubscribe |

## Pros and cons
✅ The publisher doesn't depend on concrete subscriber classes, subscriptions change at runtime
❌ Notification order is not guaranteed, forgotten unsubscriptions can leak memory

## Run
```bash
javac -d out src/observer/*.java
java -cp out observer.Main
```

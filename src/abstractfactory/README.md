# 3. Abstract Factory

**Type:** creational pattern

## Idea
Lets you create **families of related objects** without depending on their concrete classes.

## When to use
- The system must work with different product families (Windows / macOS UI, different databases)
- Products from one family must be used together

## Structure
```
GUIFactory (interface)
 ├─ createButton()
 └─ createCheckbox()
      ▲
      ├─ WindowsFactory → WindowsButton, WindowsCheckbox
      └─ MacFactory     → MacButton,     MacCheckbox

Application(GUIFactory) — the client, knows only the interfaces
```

## Implementation
| File | Role |
|------|------|
| `Button.java`, `Checkbox.java` | Abstract products and their Windows/Mac implementations |
| `GUIFactory.java` | Abstract factory and concrete factories `WindowsFactory`, `MacFactory` |
| `Application.java` | Client |
| `Main.java` | Picks a factory based on the current OS |

## Difference from Factory Method
Factory Method creates **one** product through inheritance; Abstract Factory creates a **family** of products through composition.

## Pros and cons
✅ Guarantees product compatibility, isolates concrete classes
❌ Adding a new product type is hard — every factory must change

## Run
```bash
javac -d out src/abstractfactory/*.java
java -cp out abstractfactory.Main
```

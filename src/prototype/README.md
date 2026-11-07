# 5. Prototype

**Type:** creational pattern

## Idea
Lets you **copy existing objects** without depending on their classes. The object itself knows how to create a copy of itself.

## When to use
- Creating an object is expensive (loading from a database, heavy computation)
- You need many similar objects with small differences
- Your code should not depend on the concrete classes of the objects being copied

## Structure
```
Shape (abstract)
 ├─ copy()                      ← cloning method
 ├─ Circle     → new Circle(this)
 └─ Rectangle  → new Rectangle(this)   (deep copy of the tags list)

ShapeRegistry — stores ready-made prototypes and hands out copies
```

## Implementation
| File | Role |
|------|------|
| `Shape.java` | Base prototype with a copy constructor, plus `Circle` and `Rectangle` |
| `ShapeRegistry.java` | Prototype registry |
| `Main.java` | Cloning demo |

## Shallow vs deep copy
In `Rectangle`, the `tags` list is copied with `new ArrayList<>(...)`. Otherwise the original and the clone would share the same list.

## Pros and cons
✅ Fast object creation, less repeated initialization code
❌ Cloning objects with circular references is tricky

## Run
```bash
javac -d out src/prototype/*.java
java -cp out prototype.Main
```

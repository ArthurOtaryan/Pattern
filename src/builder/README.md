# 4. Builder

**Type:** creational pattern

## Idea
Lets you **construct complex objects step by step**. The same construction process can produce different representations of an object.

## When to use
- A constructor has too many parameters ("telescoping constructor")
- Many parameters are optional
- You need immutable objects with validation

## Structure
```
Pizza
 ├─ private Pizza(Builder)
 └─ static class Builder
      ├─ dough(...)       ← each method returns this (fluent API)
      ├─ extraCheese()
      ├─ topping(...)
      └─ build()          ← validates and creates the Pizza

PizzaDirector — ready-made recipes (margherita, pepperoni)
```

## Implementation
| File | Role |
|------|------|
| `Pizza.java` | Product with a nested static `Builder` |
| `PizzaDirector.java` | Director with predefined build steps |
| `Main.java` | Demo of the fluent API and validation |

## Example
```java
Pizza pizza = Pizza.builder("XL")
        .dough("whole grain")
        .extraCheese()
        .topping("mushrooms")
        .build();
```

## Pros and cons
✅ Readable code, immutable objects, validation in one place
❌ More code — an extra Builder class is needed

## Run
```bash
javac -d out src/builder/*.java
java -cp out builder.Main
```

# 7. Decorator

**Type:** structural pattern

## Idea
Lets you **attach new behavior to objects dynamically** by placing them inside wrapper objects. An alternative to subclassing.

## When to use
- You need to add responsibilities to objects at runtime
- Extending through inheritance would cause an explosion of subclasses
- JDK example: `new BufferedReader(new InputStreamReader(System.in))`

## Structure
```
Coffee (interface)
 ├─ Espresso                         ← base object
 └─ CoffeeDecorator (abstract)       ← holds Coffee wrapped
      ├─ Milk
      ├─ Syrup
      └─ Cinnamon

new Cinnamon(new Syrup(new Milk(new Espresso()), "caramel"))
```

## Implementation
| File | Role |
|------|------|
| `Coffee.java` | Component plus the base implementation `Espresso` |
| `CoffeeDecorator.java` | Base decorator plus `Milk`, `Syrup`, `Cinnamon` |
| `Main.java` | Builds different drinks and calculates the price |

## Sample output
```
Espresso = $2.00
Espresso + milk = $2.50
Espresso + milk + milk + caramel syrup + cinnamon = $4.00
```

## Pros and cons
✅ More flexible than inheritance, wrappers can be combined in any order
❌ Many small classes, deep nesting is hard to debug

## Run
```bash
javac -d out src/decorator/*.java
java -cp out decorator.Main
```

# 2. Factory Method

**Type:** creational pattern

## Idea
Defines a common interface for creating objects in a superclass, while letting **subclasses decide which class to instantiate**.

## When to use
- The exact types of objects your code works with are not known in advance
- You want to let others extend the system with new types
- You want to remove `new ConcreteClass()` from business logic

## Structure
```
Logistics (abstract)            Transport (interface)
 ├─ createTransport()  ───────►  ├─ Truck
 └─ planDelivery()               ├─ Ship
     ▲                           └─ Plane
     ├─ RoadLogistics → new Truck()
     ├─ SeaLogistics  → new Ship()
     └─ AirLogistics  → new Plane()
```

## Implementation
| File | Role |
|------|------|
| `Transport.java` | Product interface and concrete products `Truck`, `Ship`, `Plane` |
| `Logistics.java` | Creator with the factory method and concrete creators |
| `Main.java` | Demo |

## Example
```java
Logistics logistics = new SeaLogistics();
logistics.planDelivery("10 tons of apples");
```
Output: `[Ship] delivering by sea: 10 tons of apples`

## Pros and cons
✅ No coupling to concrete classes, new products are easy to add (Open/Closed)
❌ Can lead to many parallel class hierarchies

## Run
```bash
javac -d out src/factorymethod/*.java
java -cp out factorymethod.Main
```

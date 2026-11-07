# Pattern — Design Patterns in Java

A collection of **12 mini-projects**, each demonstrating one classic (GoF) design pattern.
Every project has its own folder in `src/`, its own runnable `Main`, and its own `README.md` with an explanation.

## Contents

### Creational
| # | Pattern | Example | Folder |
|---|---------|---------|--------|
| 1 | Singleton | App configuration, logger | [src/singleton](src/singleton) |
| 2 | Factory Method | Logistics: truck / ship / plane | [src/factorymethod](src/factorymethod) |
| 3 | Abstract Factory | UI widgets for Windows and macOS | [src/abstractfactory](src/abstractfactory) |
| 4 | Builder | Building a pizza | [src/builder](src/builder) |
| 5 | Prototype | Cloning shapes | [src/prototype](src/prototype) |

### Structural
| # | Pattern | Example | Folder |
|---|---------|---------|--------|
| 6 | Adapter | Media player and a third-party VLC library | [src/adapter](src/adapter) |
| 7 | Decorator | Coffee with add-ons | [src/decorator](src/decorator) |
| 8 | Facade | Home theater | [src/facade](src/facade) |
| 9 | Proxy | Lazy image loading and access control | [src/proxy](src/proxy) |

### Behavioral
| # | Pattern | Example | Folder |
|---|---------|---------|--------|
| 10 | Observer | News subscription | [src/observer](src/observer) |
| 11 | Strategy | Payment methods in a shopping cart | [src/strategy](src/strategy) |
| 12 | Command | Text editor with undo/redo | [src/command](src/command) |

## Requirements
- JDK 17+ (tested on JDK 22)
- IntelliJ IDEA (optional)

## Running

### In IntelliJ IDEA
Open the project and run `src/Main.java` (all patterns in a row) or the `Main` class inside any package.

### From the command line
Compile everything:
```bash
javac -d out $(find src -name "*.java")
```

Run all demos:
```bash
java -cp out Main
```

Run a single pattern:
```bash
java -cp out observer.Main
```

## Project structure
```
Pattern/
├── README.md
└── src/
    ├── Main.java            ← runs all demos
    ├── singleton/           ← each folder has its own README.md and Main.java
    ├── factorymethod/
    ├── abstractfactory/
    ├── builder/
    ├── prototype/
    ├── adapter/
    ├── decorator/
    ├── facade/
    ├── proxy/
    ├── observer/
    ├── strategy/
    └── command/
```

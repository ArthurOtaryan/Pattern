# Pattern — паттерны проектирования на Java

Коллекция из **12 мини-проектов**, каждый из которых демонстрирует один классический паттерн проектирования (GoF).
У каждого проекта своя папка в `src/`, свой `Main` для запуска и свой `README.md` с объяснением.

## Содержание

### Порождающие (Creational)
| № | Паттерн | Пример | Папка |
|---|---------|--------|-------|
| 1 | Singleton — Одиночка | Конфигурация приложения, логгер | [src/singleton](src/singleton) |
| 2 | Factory Method — Фабричный метод | Логистика: грузовик / корабль / самолёт | [src/factorymethod](src/factorymethod) |
| 3 | Abstract Factory — Абстрактная фабрика | UI-элементы для Windows и macOS | [src/abstractfactory](src/abstractfactory) |
| 4 | Builder — Строитель | Сборка пиццы | [src/builder](src/builder) |
| 5 | Prototype — Прототип | Клонирование фигур | [src/prototype](src/prototype) |

### Структурные (Structural)
| № | Паттерн | Пример | Папка |
|---|---------|--------|-------|
| 6 | Adapter — Адаптер | Медиаплеер и сторонняя библиотека VLC | [src/adapter](src/adapter) |
| 7 | Decorator — Декоратор | Кофе с добавками | [src/decorator](src/decorator) |
| 8 | Facade — Фасад | Домашний кинотеатр | [src/facade](src/facade) |
| 9 | Proxy — Заместитель | Ленивая загрузка изображений и контроль доступа | [src/proxy](src/proxy) |

### Поведенческие (Behavioral)
| № | Паттерн | Пример | Папка |
|---|---------|--------|-------|
| 10 | Observer — Наблюдатель | Новостная рассылка | [src/observer](src/observer) |
| 11 | Strategy — Стратегия | Способы оплаты в корзине | [src/strategy](src/strategy) |
| 12 | Command — Команда | Текстовый редактор с undo/redo | [src/command](src/command) |

## Требования
- JDK 17+ (проверено на JDK 22)
- IntelliJ IDEA (по желанию)

## Запуск

### В IntelliJ IDEA
Открыть проект → запустить `src/Main.java` (все паттерны подряд) или `Main` внутри нужного пакета.

### Из консоли
```bash
# скомпилировать всё
javac -d out $(find src -name "*.java")

# запустить все демо
java -cp out Main

# запустить один паттерн
java -cp out observer.Main
```

## Структура проекта
```
Pattern/
├── README.md
└── src/
    ├── Main.java            ← запускает все демо
    ├── singleton/           ← у каждой папки свой README.md и Main.java
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

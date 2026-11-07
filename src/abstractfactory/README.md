# 3. Abstract Factory (Абстрактная фабрика)

**Тип:** порождающий паттерн

## Идея
Позволяет создавать **семейства связанных объектов**, не привязываясь к их конкретным классам.

## Когда использовать
- Система должна работать с разными семействами продуктов (Windows / macOS UI, разные БД)
- Нужно гарантировать, что продукты одного семейства используются вместе

## Структура
```
GUIFactory (interface)
 ├─ createButton()
 └─ createCheckbox()
      ▲
      ├─ WindowsFactory → WindowsButton, WindowsCheckbox
      └─ MacFactory     → MacButton,     MacCheckbox

Application(GUIFactory) — клиент, знает только интерфейсы
```

## Реализация в проекте
| Файл | Роль |
|------|------|
| `Button.java`, `Checkbox.java` | Абстрактные продукты и их Windows/Mac реализации |
| `GUIFactory.java` | Абстрактная фабрика и конкретные фабрики `WindowsFactory`, `MacFactory` |
| `Application.java` | Клиент |
| `Main.java` | Выбор фабрики по текущей ОС |

## Отличие от Factory Method
Factory Method создаёт **один** продукт через наследование, Abstract Factory — **семейство** продуктов через композицию.

## Плюсы и минусы
✅ Гарантирует совместимость продуктов, изолирует конкретные классы
❌ Добавить новый тип продукта сложно — нужно менять все фабрики

## Запуск
```bash
javac -d out src/abstractfactory/*.java
java -cp out abstractfactory.Main
```

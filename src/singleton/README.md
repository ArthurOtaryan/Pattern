# 1. Singleton (Одиночка)

**Тип:** порождающий паттерн

## Идея
Гарантирует, что у класса есть **только один экземпляр**, и даёт к нему глобальную точку доступа.

## Когда использовать
- Конфигурация приложения
- Логгер
- Пул соединений к базе данных
- Кэш

## Структура
```
AppConfig
 ├─ private static volatile AppConfig instance
 ├─ private AppConfig()          ← конструктор закрыт
 └─ public static getInstance()  ← единственный способ получить объект
```

## Реализация в проекте
| Файл | Описание |
|------|----------|
| `AppConfig.java` | Классический потокобезопасный Singleton (double-checked locking) |
| `Logger.java` | Singleton через `enum` — рекомендуемый способ в Java |
| `Main.java` | Демонстрация: две ссылки указывают на один объект |

## Пример
```java
AppConfig a = AppConfig.getInstance();
AppConfig b = AppConfig.getInstance();
System.out.println(a == b); // true
```

## Плюсы и минусы
✅ Один экземпляр, ленивая инициализация, глобальный доступ
❌ Скрытые зависимости, сложнее тестировать, нарушает принцип единственной ответственности

## Запуск
```bash
javac -d out src/singleton/*.java
java -cp out singleton.Main
```

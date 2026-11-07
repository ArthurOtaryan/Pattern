# 10. Observer (Наблюдатель)

**Тип:** поведенческий паттерн

## Идея
Создаёт **механизм подписки**: один объект (издатель) оповещает множество других объектов (подписчиков) об изменениях своего состояния.

## Когда использовать
- Изменение одного объекта требует изменения других, и заранее неизвестно каких
- Событийные системы, GUI (слушатели кнопок), уведомления
- Пример из Java: `PropertyChangeListener`, слушатели в Swing

## Структура
```
NewsAgency (Subject)
 ├─ subscribe(Subscriber)
 ├─ unsubscribe(Subscriber)
 └─ publish(news) ──► для каждого: subscriber.update(news)

Subscriber (interface)
 ├─ EmailSubscriber
 └─ TelegramSubscriber
```

## Реализация в проекте
| Файл | Роль |
|------|------|
| `NewsAgency.java` | Издатель |
| `Subscriber.java` | Интерфейс наблюдателя + `EmailSubscriber`, `TelegramSubscriber` |
| `Main.java` | Подписка, рассылка, отписка |

## Плюсы и минусы
✅ Издатель не зависит от конкретных классов подписчиков, подписка во время выполнения
❌ Подписчики оповещаются в случайном порядке, риск утечек памяти при забытой отписке

## Запуск
```bash
javac -d out src/observer/*.java
java -cp out observer.Main
```

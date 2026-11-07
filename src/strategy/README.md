# 11. Strategy (Стратегия)

**Тип:** поведенческий паттерн

## Идея
Определяет **семейство схожих алгоритмов**, помещает каждый в отдельный класс и позволяет **подменять их во время выполнения**.

## Когда использовать
- Есть несколько вариантов одного алгоритма (оплата, сортировка, расчёт скидки, маршрут)
- Нужно избавиться от больших `if/else` или `switch`
- Пример из Java: `Comparator` в `Collections.sort(list, comparator)`

## Структура
```
ShoppingCart (Context)
 ├─ setPaymentStrategy(PaymentStrategy)
 └─ checkout() ──► paymentStrategy.pay(total)

PaymentStrategy (interface)
 ├─ CardPayment
 ├─ PayPalPayment
 ├─ CryptoPayment
 └─ лямбда amount -> ...
```

## Реализация в проекте
| Файл | Роль |
|------|------|
| `PaymentStrategy.java` | Интерфейс стратегии + `CardPayment`, `PayPalPayment`, `CryptoPayment` |
| `ShoppingCart.java` | Контекст |
| `Main.java` | Смена стратегии оплаты «на лету», включая лямбду |

## Плюсы и минусы
✅ Замена алгоритма на лету, изоляция кода алгоритмов, соблюдение Open/Closed
❌ Клиент должен знать разницу между стратегиями

## Запуск
```bash
javac -d out src/strategy/*.java
java -cp out strategy.Main
```

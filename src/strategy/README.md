# 11. Strategy

**Type:** behavioral pattern

## Idea
Defines a **family of similar algorithms**, puts each of them into a separate class, and lets you **swap them at runtime**.

## When to use
- There are several variants of one algorithm (payment, sorting, discount calculation, routing)
- You want to get rid of large `if/else` or `switch` blocks
- Java example: `Comparator` in `Collections.sort(list, comparator)`

## Structure
```
ShoppingCart (Context)
 ├─ setPaymentStrategy(PaymentStrategy)
 └─ checkout() ──► paymentStrategy.pay(total)

PaymentStrategy (interface)
 ├─ CardPayment
 ├─ PayPalPayment
 ├─ CryptoPayment
 └─ lambda amount -> ...
```

## Implementation
| File | Role |
|------|------|
| `PaymentStrategy.java` | Strategy interface plus `CardPayment`, `PayPalPayment`, `CryptoPayment` |
| `ShoppingCart.java` | Context |
| `Main.java` | Switches the payment strategy at runtime, including a lambda |

## Pros and cons
✅ Swap algorithms at runtime, isolate algorithm code, follows Open/Closed
❌ The client must know the difference between strategies

## Run
```bash
javac -d out src/strategy/*.java
java -cp out strategy.Main
```

![Java](https://img.shields.io/badge/Java-25.0.2-blue)
# Tire Service Booking System 🚗

A Java-based OOP project simulating a real-world tire service booking system with dynamic pricing and flexible booking strategies.
Designed to demonstrate clean code principles, extensibility, and real-world use of OOP patterns.

---

## ✨ Key Features

* Tire change services (Winter & Summer)
* Dynamic price calculation with extras
* Member vs Non-member booking logic
* Clear and structured console output

---

## 📘 Exercise Instructions

👉 [View Exercise instructions](OOP2_Exercises.md)

---

## 🧠 OOP Concepts

* **Inheritance**
  Abstract `Service` class with concrete implementations:

  * `WinterTireChange`
  * `SummerTireChange`

* **Polymorphism**
  Services handled via:

  ```java
  List<Service>
  ```

  with overridden `calculatePrice()` methods.

* **Abstraction**
  Interface-based booking system:

  * `BookingProcessor`
  * `MemberBookingProcessor`
  * `NonMemberBookingProcessor`

---

## 🏗️ Tech Stack

* Java 25
* IntelliJ IDEA

---

## 📌 Example Output

```
=========================== Exercise 3 ==================================
S-00006 - Winter Tire Change
Winter Tire Change - Base price: 650 SEK
Extra work (tires not on rim): +500 SEK
Storage: +600 SEK

Member discount: -100 SEK
Final price: 1650 SEK

-----------------------------------------

S-00007 - Summer Tire Change
Summer Tire Change - Base price: 500 SEK
Summer discount: -50 SEK
Subtotal before discount: 500 SEK

Final price: 450 SEK
```

---

## 🚀 Getting Started

```md
Run `Main.java` to start the application.
```

---

## 💡 Highlights

* Clean separation of concerns
* Extensible design (easy to add new services or pricing rules)
* Focus on real-world OOP structure


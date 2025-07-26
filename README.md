# Customer & CreditCard – NOVI Backend Java Assignment

## About the Project

This repository contains my solution to the **Customer & CreditCard** assignment for the Backend Java module at [Novi University](https://www.novi.nl).

In this project, I practice working with **Java classes, constructors, object instantiation, inheritance, encapsulation, and method overriding**. The assignment builds up in complexity, starting with simple class structures and progressing to subclass behavior and polymorphism using overridden methods.

---

## Table of Contents

- [Tech Stack](#tech-stack)
- [Key Features](#key-features)
- [How to Run](#how-to-run)
- [Credits](#credits)
- [License](#license)

---

## Tech Stack

- **Java 17+**
- **IntelliJ IDEA**
- **Maven** for build and execution

---

## Key Features

- `Customer` class with an association with the `CreditCard` class
- Abstract `CreditCard` superclass with:
    - Encapsulated `debt` field
    - `pay(int amount)` method for accumulating debt
- `VisaCard` and `MasterCard` subclasses:
    - Inherit from `CreditCard`
    - `VisaCard` overrides `pay()` to apply a 10% discount
  
---

## How to Run

1. Open the project in **IntelliJ IDEA**
2. Locate the `Main` class in `src/inheritance/java`
3. Run the `Main()` method using the green play button or use the terminal:
```bash
./mvnw clean compile exec:java
```

## Credits
> "This assignment was developed as part of the Backend Java module in the NOVI Software Development program. All instructions, logic, and structure are part of the official coursework."

## License
> "This repository is intended for educational purposes only. You are welcome to use the code for learning, but not for commercial use."
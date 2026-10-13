# ☕ Low Level Design in Java

A collection of **Low Level Design (LLD)** problems implemented in **Java**, focused on clean object-oriented design, SOLID principles, and real-world design patterns.

Each problem includes requirements, a class diagram, and a working implementation you can run and extend.

---

## 📌 Why this repo?

- Practice turning vague requirements into clean, extensible class designs
- Learn where and *why* each design pattern fits
- Prepare for **LLD / machine coding rounds** in software engineering interviews
- Keep a reference of reusable design approaches

---

## 📂 Repository Structure

```
low-level-design-java/
├── principles/              # OOP & SOLID examples
│   ├── oop/
│   └── solid/
├── design-patterns/         # Pattern implementations
│   ├── creational/
│   ├── structural/
│   └── behavioral/
├── problems/                # LLD problems
│   ├── parking-lot/
│   │   ├── README.md        # Requirements, diagram, design decisions
│   │   └── src/
│   ├── elevator-system/
│   └── ...
└── README.md
```

Each problem folder follows the same layout:

| File / Folder | Contents |
|---|---|
| `README.md` | Requirements, assumptions, class diagram, patterns used |
| `src/` | Java source code |
| `Main.java` | Driver / demo showing the system in action |

---

## 🧱 Fundamentals

### OOP Concepts
- Encapsulation, Abstraction, Inheritance, Polymorphism
- Composition vs Inheritance
- Interfaces vs Abstract Classes

### SOLID Principles
| Principle | Description |
|---|---|
| **S** – Single Responsibility | A class should have only one reason to change |
| **O** – Open/Closed | Open for extension, closed for modification |
| **L** – Liskov Substitution | Subtypes must be substitutable for their base types |
| **I** – Interface Segregation | Prefer small, specific interfaces over large ones |
| **D** – Dependency Inversion | Depend on abstractions, not concrete classes |

Other principles: **DRY**, **KISS**, **YAGNI**

---

## 🎨 Design Patterns

### Creational
- [ ] Singleton
- [ ] Factory Method
- [ ] Abstract Factory
- [ ] Builder
- [ ] Prototype

### Structural
- [ ] Adapter
- [ ] Decorator
- [ ] Facade
- [ ] Proxy
- [ ] Composite
- [ ] Bridge
- [ ] Flyweight

### Behavioral
- [ ] Strategy
- [ ] Observer
- [ ] State
- [ ] Command
- [ ] Chain of Responsibility
- [ ] Template Method
- [ ] Iterator
- [ ] Mediator
- [ ] Visitor
- [ ] Memento

---

## 🧩 LLD Problems

| # | Problem | Key Patterns | Status |
|---|---|---|---|
| 1 | Parking Lot | Strategy, Factory, Singleton | ⏳ |
| 2 | Elevator System | State, Strategy, Observer | ⏳ |
| 3 | Tic-Tac-Toe | Factory, Strategy | ⏳ |
| 4 | Snake and Ladder | Factory | ⏳ |
| 5 | Vending Machine | State | ⏳ |
| 6 | ATM | State, Chain of Responsibility | ⏳ |
| 7 | Splitwise | Strategy, Observer | ⏳ |
| 8 | BookMyShow (Movie Ticket Booking) | Strategy, Observer, Concurrency | ⏳ |
| 9 | Library Management System | Observer, Factory | ⏳ |
| 10 | Logger Framework | Chain of Responsibility, Singleton | ⏳ |
| 11 | Rate Limiter | Strategy | ⏳ |
| 12 | LRU Cache | — (HashMap + Doubly Linked List) | ⏳ |
| 13 | Notification Service | Observer, Strategy, Decorator | ⏳ |
| 14 | Hotel Management System | Strategy, Observer | ⏳ |
| 15 | Ride Sharing (Uber / Ola) | Strategy, Observer, State | ⏳ |
| 16 | Food Delivery (Swiggy / Zomato) | Strategy, Observer, State | ⏳ |
| 17 | Chess | Factory, Strategy | ⏳ |
| 18 | Inventory Management | Observer, Factory | ⏳ |
| 19 | Pub-Sub / Message Queue | Observer | ⏳ |
| 20 | Online Stock Brokerage | Observer, Strategy | ⏳ |

**Legend:** ✅ Done · 🚧 In Progress · ⏳ Planned

---

## 🛠️ Tech Stack

- **Language:** Java 17+
- **Build Tool:** Maven / Gradle *(optional)*
- **Diagrams:** UML class diagrams (draw.io / PlantUML / Mermaid)

---

## 🚀 Getting Started

### Prerequisites
- JDK 17 or higher
- Any IDE (IntelliJ IDEA, Eclipse, VS Code)

### Clone the repository
```bash
git clone https://github.com/<your-username>/low-level-design-java.git
cd low-level-design-java
```

### Run a problem
```bash
cd problems/parking-lot/src
javac -d out $(find . -name "*.java")
java -cp out Main
```

Or simply open the project in your IDE and run `Main.java` inside any problem folder.

---

## 🧠 How I Approach an LLD Problem

1. **Clarify requirements** — functional and non-functional
2. **Identify core entities** — nouns become classes
3. **Define relationships** — association, aggregation, composition, inheritance
4. **Identify behaviors** — verbs become methods / interfaces
5. **Apply design patterns** where they solve a real problem
6. **Handle edge cases & concurrency** (thread safety, locking)
7. **Write a driver** to demonstrate the flow
8. **Review against SOLID** and refactor

---

## 📚 Resources

- *Head First Design Patterns* — Eric Freeman & Elisabeth Robson
- *Design Patterns: Elements of Reusable Object-Oriented Software* — Gang of Four
- *Clean Code* — Robert C. Martin
- [Refactoring.Guru – Design Patterns](https://refactoring.guru/design-patterns)

---

## 🤝 Contributing

Contributions, suggestions, and improvements are welcome!

1. Fork the repository
2. Create a branch: `git checkout -b feature/problem-name`
3. Commit your changes: `git commit -m "Add <problem-name> LLD"`
4. Push the branch: `git push origin feature/problem-name`
5. Open a Pull Request

---

## ⭐ Support

If you find this repository helpful, consider giving it a **star** ⭐ — it helps others find it too!

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

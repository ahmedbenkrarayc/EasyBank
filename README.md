# EasyBank

## 📌 Project Description
**EasyBank** is a **Java 8** console application for managing bank accounts and their operations.  
It was developed to automate a bank’s processes, including:

- Creating accounts (checking or savings)  
- Deposits and withdrawals  
- Transfers between accounts  
- Balance inquiry  
- Transaction history  

The project follows a layered architecture (presentation, business, utility, persistence) and applies **SOLID principles**.

---

## 🛠️ Technologies Used
- **Language:** Java 8  
- **IDE:** Eclipse  
- **Collections API:** `ArrayList`, `HashMap`  
- **Date Management:** `java.time` API  
- **Unique Identifiers:** `UUID`  
- **Error Handling:** Custom exceptions and validations  
- **Build Tools:** `javac` / `java`  
- **Version Control:** Git & GitHub  

---

## 📂 Project Structure
```
EasyBank/
│── src/
│   └── main/
│       ├── EasyBank.java                # Entry point (UI/Menu)
│       │
│       ├── entities/                    # Business layer (domain)
│       │   ├── Compte.java              # Abstract Account class
│       │   ├── CompteCourant.java       # Checking account
│       │   ├── CompteEpargne.java       # Savings account
│       │   ├── Operation.java           # Abstract Operation class
│       │   ├── Retrait.java             # Withdrawal
│       │   └── Versement.java           # Deposit
│       │
│       ├── repositories/                # Persistence layer
│       │   └── AccountRepository.java
│       │
│       ├── services/                    # Service layer
│       │   ├── AccountService.java
│       │   └── OperationsService.java
│       │
│       ├── utils/                       # Utility classes & Helpers
│       │   ├── AccountNumberGenerator.java
│       │   ├── DateUtils.java
│       │   ├── FeaturesHelper.java
│       │   ├── Globals.java
│       │   ├── InputHelper.java
│       │   └── ValidationUtils.java
│       │
│       └── tests/                       # (Optional) Unit tests
│           └── ...
│
└── README.md
```

---
## 📄 Class Diagram

<img width="851" height="431" alt="EasyBank drawio" src="https://github.com/user-attachments/assets/a9eb6adf-8ff6-4fb7-8a55-563f5e42f056" />


---

## ✅ Main Features
- [x] Create bank accounts (checking / savings)  
- [x] Make a deposit  
- [x] Make a withdrawal  
- [x] Transfer between accounts  
- [x] Check account balance  
- [x] Display transaction history  

---

## 📦 Prerequisites
- **Java 8 (JDK 1.8)** required  
- **Eclipse IDE** or any Java-compatible editor  
- Git (to clone the repository)

---

## ▶️ Installation & Execution
1. Clone the repository:
   ```bash
   git clone https://github.com/username/EasyBank.git
   cd EasyBank
   ```
2. Compile the files:
   ```bash
   javac -d bin src/main/**/*.java src/main/*.java
   ```
3. Run the program:
   ```bash
   java -cp bin main.EasyBank
   ```

---

## 📸 Screenshots

<img width="1439" height="817" alt="image" src="https://github.com/user-attachments/assets/490a1587-9f75-497a-bf98-f0428d9c0cac" />


---

## 🏆 Performance Criteria
- Application developed with **Java 8**  
- Layered architecture respected  
- Clean, readable, and well-documented code  
- Clear Git history with regular commits  
- Functional and user-friendly console interface  

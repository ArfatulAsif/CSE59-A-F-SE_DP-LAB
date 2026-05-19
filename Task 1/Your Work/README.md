# Software Requirements Specification (SRS)

## Project Title

**Digital Wallet System**

---

# 1. Introduction

## 1.1 Purpose

The purpose of this project is to develop a desktop-based Digital Wallet System using Java Swing that allows users to create accounts, log in securely, transfer money, receive money requests, send remittance, send salami, perform bank transfers, add money, and view transaction history.

---

## 1.2 Scope

The system provides a secure financial transaction platform for users through a graphical user interface (GUI). Users can:

* Register new accounts
* Login/logout
* Transfer money
* Request money
* Add money
* Send remittance
* Send salami
* Transfer money to bank accounts
* View transaction history

The system is designed as a standalone desktop application.

---

## 1.3 Objectives

* Provide secure user authentication
* Simplify digital transactions
* Maintain transaction history
* Offer user-friendly GUI
* Simulate mobile banking features

---

# 2. Overall Description

## 2.1 Product Perspective

The Digital Wallet System is a Java desktop application developed using:

* Java Swing
* AWT
* Java Collections
* JTable for transaction history

The application stores account data temporarily in memory using ArrayList.

---

## 2.2 Product Features

Main features include:

* User Registration
* User Login
* Dashboard Interface
* Send Money
* Request Money
* Send Remittance
* Send Salami
* Bank Transfer
* Add Money
* Transaction History
* Logout

---

## 2.3 User Classes

| User Type       | Description                            |
| --------------- | -------------------------------------- |
| Registered User | Can access wallet features after login |
| Guest User      | Can create account and login           |

---

## 2.4 Operating Environment

| Component            | Requirement                        |
| -------------------- | ---------------------------------- |
| Operating System     | Windows/Linux/macOS                |
| Programming Language | Java                               |
| IDE                  | NetBeans / IntelliJ IDEA / Eclipse |
| GUI Framework        | Java Swing                         |
| JDK Version          | JDK 8 or above                     |

---

# 3. Functional Requirements

# FR-1: User Registration

## Description

The system shall allow users to create a new account.

## Input

* Name
* Phone Number
* Password

## Process

* Validate fields
* Check duplicate phone number
* Create new account

## Output

* Success/Error message

---

# FR-2: User Login

## Description

The system shall authenticate users.

## Input

* Phone Number
* Password

## Process

* Match credentials with stored accounts

## Output

* Dashboard access
* Error message for invalid login

---

# FR-3: Dashboard

## Description

The system shall display user information after login.

## Features

* Welcome message
* Current balance
* Transaction options

---

# FR-4: Send Money

## Description

Users can transfer money to another user.

## Input

* Recipient phone number
* Amount
* Password confirmation

## Validation

* Recipient exists
* Balance sufficient
* Amount > 0

## Output

* Successful transaction message
* Updated balance

---

# FR-5: Request Money

## Description

Users can request money from another user.

## Input

* Sender phone number
* Amount

## Output

* Request notification stored in history

---

# FR-6: Send Remittance

## Description

Users can send remittance with ZIP code.

## Input

* Recipient phone
* ZIP code
* Amount

## Validation

* Sufficient balance
* Valid recipient

---

# FR-7: Send Salami

## Description

Users can send salami money to another user.

## Input

* Recipient phone
* Amount
* Password confirmation

---

# FR-8: Bank Transfer

## Description

Users can transfer money to bank accounts.

## Input

* Recipient phone
* Bank account number
* Amount

## Validation

* Sufficient balance
* Valid recipient

---

# FR-9: Add Money

## Description

Users can add money from merchants.

## Input

* Merchant name
* Amount

## Output

* Updated balance

---

# FR-10: Transaction History

## Description

The system shall maintain transaction records.

## Stored Information

* Date
* Transaction Type
* Amount

---

# FR-11: Logout

## Description

The system shall allow users to logout securely.

---

# 4. Non-Functional Requirements

# 4.1 Performance Requirements

* System response time should be less than 2 seconds.
* Transactions should process instantly.

---

# 4.2 Security Requirements

* Password verification required for sensitive transactions.
* Unauthorized access must be restricted.

---

# 4.3 Usability Requirements

* Simple GUI interface
* Easy navigation
* User-friendly buttons

---

# 4.4 Reliability Requirements

* System should prevent invalid transactions.
* Input validation should reduce errors.

---

# 4.5 Maintainability Requirements

* Modular method structure
* Easy feature enhancement

---

# 5. User Interface Requirements

## Login Screen

Features:

* Phone input
* Password input
* Login button
* Sign-up navigation link

---

## Sign-Up Screen

Features:

* Name field
* Phone field
* Password field
* Registration button

---

## Dashboard Screen

Features:

* Welcome label
* Balance display
* Action buttons
* Logout button

---

# 6. Database Requirements

## Current Storage

The application currently uses:

* ArrayList<Account>

## Account Information

| Field    | Type   |
| -------- | ------ |
| Name     | String |
| Phone    | String |
| Password | String |
| Balance  | Double |

---

## Transaction History

| Field       | Type   |
| ----------- | ------ |
| Date        | String |
| Transaction | String |
| Amount      | Double |

---

# 7. System Design

## Main Classes

| Class               | Purpose                  |
| ------------------- | ------------------------ |
| DigitalWalletSystem | Main application         |
| Account             | Stores user account data |

---

## GUI Components Used

| Component   | Purpose             |
| ----------- | ------------------- |
| JFrame      | Main window         |
| JPanel      | Layout management   |
| JButton     | User actions        |
| JTable      | Transaction history |
| JTextField  | Input               |
| JOptionPane | Dialog messages     |

---

# 8. Security Design

## Authentication

* Login required
* Password confirmation for transactions

## Validation

* Duplicate phone prevention
* Balance checking
* Amount validation

---

# 9. Limitations

* Data is not permanently stored
* No real database integration
* No encryption implemented
* Single-device standalone application
* No online payment gateway

---

# 10. Future Enhancements

* MySQL database integration
* OTP verification
* Mobile app version
* Fingerprint authentication
* Online banking API
* QR code payments
* Transaction notifications
* Admin panel
* Data encryption

---

# 11. Conclusion

The Digital Wallet System is a Java Swing-based desktop application designed to simulate digital financial transactions securely and efficiently. The system provides essential wallet functionalities including authentication, money transfer, remittance, bank transfer, and transaction history management through a user-friendly graphical interface.



# Software Requirements Specification (SRS)

## Project Name

**Digital Wallet System**

----------

# 1. Introduction

## Purpose

The purpose of this project is to create a digital wallet system where users can:

-   Create account
    
-   Login
    
-   Send money
    
-   Receive/request money
    
-   Add money
    
-   View transaction history
    

The system is developed using Java Swing.

----------

# 2. System Overview

The Digital Wallet System is a desktop application that allows users to perform digital transactions through a graphical user interface (GUI).

----------

# 3. Main Features

-   User Registration
    
-   User Login
    
-   Send Money
    
-   Request Money
    
-   Send Remittance
    
-   Send Salami
    
-   Bank Transfer
    
-   Add Money
    
-   Transaction History
    
-   Logout
    

----------

# 4. Functional Requirements

## FR-1: Sign Up

Users can create a new account using:

-   Name
    
-   Phone Number
    
-   Password
    

The system checks if the phone number already exists.

----------

## FR-2: Login

Users can log in using:

-   Phone Number
    
-   Password
    

If information is correct, the dashboard opens.

----------

## FR-3: Dashboard

After login, users can:

-   See welcome message
    
-   View current balance
    
-   Access all wallet features
    

----------

## FR-4: Send Money

Users can send money to another account.

Conditions:

-   Recipient account must exist
    
-   Balance must be sufficient
    
-   Password confirmation required
    

----------

## FR-5: Request Money

Users can request money from another user.

----------

## FR-6: Send Remittance

Users can send remittance using:

-   Recipient phone number
    
-   ZIP code
    
-   Amount
    

----------

## FR-7: Send Salami

Users can send salami money to another user.

----------

## FR-8: Bank Transfer

Users can transfer money to a bank account.

----------

## FR-9: Add Money

Users can add money from a merchant.

----------

## FR-10: Transaction History

The system stores transaction records including:

-   Date
    
-   Transaction type
    
-   Amount
    

----------

## FR-11: Logout

Users can logout from the system.

----------

# 5. Non-Functional Requirements

-   Easy to use interface
    
-   Fast response time
    
-   Secure login system
    
-   Error handling for invalid inputs
    

----------

# 6. Software Requirements

Component

Requirement

Language

Java

GUI Framework

Java Swing

IDE

NetBeans / IntelliJ

JDK

Java 8 or above

----------

# 7. User Interface

## Login Page

-   Phone field
    
-   Password field
    
-   Login button
    

## Sign Up Page

-   Name field
    
-   Phone field
    
-   Password field
    

## Dashboard

-   Balance display
    
-   Transaction buttons
    
-   Logout button
    

----------

# 8. Data Storage

The system stores:

-   User information
    
-   Account balance
    
-   Transaction history
    

Currently data is stored temporarily using ArrayList.

# 9. System Model
> * **CONTEXT DIAGRAM**
<img src="images/a.png">
 

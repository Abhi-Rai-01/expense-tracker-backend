# Project Architecture

## Layered Architecture

Client
↓
Controller
↓
Service
↓
Repository
↓
MySQL Database

---

## Domain Model

### User

- id
- name
- email
- password
- createdAt
- expenses

### Expense

- id
- amount
- category
- description
- expenseDate
- user

### ExpenseCategory

- FOOD
- GROCERY
- TRAVEL
- HEALTH
- EDUCATION
- ENTERTAINMENT
- BILLS
- MISCELLANEOUS

---

## Entity Relationship

One User can have many Expenses.

Each Expense belongs to one User.

User
    |
    | One-to-Many
    |
    v
Expense

The relationship is bidirectional.

### Owning Side

`Expense`

The `expenses` table contains the `user_id` foreign key.

### Inverse Side

`User`

The User entity uses `mappedBy = "user"`.

---

## Database Relationship

users
- id (Primary Key)

expenses
- id (Primary Key)
- user_id (Foreign Key -> users.id)

---

## Current Package Structure

controller

service

repository

model

dto

exception

security

config
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

## Current Entities

### User

* id
* name
* email
* password
* createdAt

### Expense (Design Phase)

* id
* amount
* category (Enum)
* description
* expenseDate
* user

---

## Relationship

One User
↓
Many Expenses

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
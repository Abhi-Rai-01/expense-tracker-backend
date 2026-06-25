# Project Architecture

## Overview

Client
↓
REST Controller
↓
Service Layer
↓
Repository Layer
↓
MySQL Database

---

## Entities

### User

- id
- name
- email
- password
- createdAt

### Expense (Planned)

- id
- amount
- category
- description
- expenseDate
- createdAt

---

## Relationship

One User
↓
Many Expenses

---

## Package Structure

controller

service

repository

model

dto

exception

security

config
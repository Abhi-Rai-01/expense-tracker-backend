# Design Decisions

## 24 June 2026

### Decision

Use BigDecimal for expense amount.

Reason

Financial calculations require exact decimal precision.

---

### Decision

Store emails in lowercase.

Reason

Emails should be treated case-insensitively.

---

### Decision

Use @CreationTimestamp for createdAt.

Reason

Creation time should be generated automatically by Hibernate.

---

### Decision

Backend first, frontend later.

Reason

The goal of this project is to build strong backend engineering fundamentals before learning full-stack development.
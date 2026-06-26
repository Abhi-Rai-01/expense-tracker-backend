# Development Log

## 24 June 2026

### Completed

- Created Spring Boot project.
- Configured MySQL connection.
- Configured Hibernate.
- Created User entity.
- Added nullable constraints.
- Added unique constraint on email.
- Added @CreationTimestamp.
- Connected project to Git.

---

### Learned

- Hibernate generates database tables from entities.
- ddl-auto=update does not always modify existing constraints.
- @CreationTimestamp automatically sets creation time.
- GenerationType.IDENTITY uses AUTO_INCREMENT in MySQL.

---

### Problems Faced

- Database constraints were not updated automatically.

---

### Solution

Dropped the table and allowed Hibernate to recreate it.

# Development Log

## 26 June 2026

### Completed

* Reviewed User entity.
* Finalized User entity design.
* Designed Expense entity.
* Decided to use Enum for category.
* Decided to use BigDecimal for amount.
* Decided to store User reference instead of userId.
* Removed createdAt from Expense entity after evaluating business requirements.

---

### Problems Faced

* Unsure whether Expense required createdAt.
* Unsure whether category should be String or Enum.

---

### Decisions Made

* Enum provides better domain modelling.
* Expense createdAt is unnecessary for MVP.
* User object should represent relationships instead of primitive foreign keys.

---

### Today's Learning

Good backend design starts with business requirements rather than framework annotations.
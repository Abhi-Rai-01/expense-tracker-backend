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
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

# Development Log

## 14 July 2026

### Progress Since Previous Development Session

Before continuing implementation, I independently studied and revised:

- Java enums and enum constants.
- Parameterized constructors in enums.
- The difference between constant metadata and instance-specific data.
- JPA association concepts.
- One-to-One relationships.
- One-to-Many relationships.
- Many-to-One relationships.
- Many-to-Many relationships.
- Bidirectional entity relationships.
- Owning side and inverse side in JPA.
- Collection mapping using Java collections.

This study helped clarify the User-Expense relationship before implementing it.

### Completed

- Created `ExpenseCategory` enum.
- Designed and implemented the `Expense` entity.
- Added a bidirectional relationship between `User` and `Expense`.
- Added `@ManyToOne` mapping in `Expense`.
- Added `@OneToMany` collection mapping in `User`.
- Configured `user_id` as a non-null foreign key.
- Verified the generated database schema using Hibernate logs.

### Decisions Made

- Used `EnumType.STRING` instead of `EnumType.ORDINAL`.
- Used `List<Expense>` for the user's expense collection.
- Defined `Expense` as the owning side of the JPA relationship.
- Defined `User` as the inverse side using `mappedBy = "user"`.
- Kept `description` nullable.
- Did not add `createdAt` to `Expense` because it is not currently required by the MVP.

### Concepts Learned

- Enum values should represent fixed constants.
- Instance-specific data such as an expense amount belongs to the `Expense` entity, not `ExpenseCategory`.
- `EnumType.ORDINAL` depends on enum constant positions and can cause incorrect mappings if constants are reordered.
- `EnumType.STRING` stores enum names and is safer for the current domain model.
- Domain ownership and JPA relationship ownership are different concepts.
- The owning side manages the foreign key relationship.
- The side containing the foreign key is generally the owning side in a Many-to-One / One-to-Many mapping.
- `mappedBy` refers to the Java field name on the owning side.
- Bidirectional associations allow navigation from both related entities.
- Hibernate can map entity collections such as `List<Expense>`.

### Current Project Stage

Domain model completed and database schema verified.

Next stage: Repository Layer.
# Questions

## Pending

- [x] Why does JPA require a no-args constructor?
- [ ] How does Reflection instantiate objects?
- [ ] How does Spring create Beans?
- [ ] How does @Transactional work?
- [ ] How does BCrypt work?
- [ ] How does JWT work internally?

---

## Answered

### Why BigDecimal?

Because float and double lose precision during financial calculations.
BigDecimal performs exact decimal arithmetic.

# Questions

## Pending

* [x] How does @ManyToOne work internally?
* [x] How does @OneToMany work internally?
* [x] EnumType.STRING vs EnumType.ORDINAL
* [x] How does Hibernate convert Java object references into foreign keys?
- [x] What is the owning side of a JPA relationship?
---

## Answered

### Why does JPA require a no-argument constructor?

Hibernate creates entity objects using reflection.

---

### Why use BigDecimal?

Money requires exact decimal precision.

---

### Why use User instead of userId?

Java models relationships using object references while Hibernate maps them to foreign keys.

### Why use EnumType.STRING instead of EnumType.ORDINAL?

ORDINAL stores the position of an enum constant. Reordering or inserting enum constants can cause existing database values to represent the wrong category.

STRING stores the enum constant name and is safer for evolving the enum.

---

### What is the owning side of a JPA relationship?

The owning side is the entity whose relationship mapping manages the foreign key.

In this project, `Expense` is the owning side because the `expenses` table contains `user_id`.

---

### What is the inverse side?

The inverse side represents the other side of a bidirectional relationship but does not manage the foreign key.

`User` is the inverse side and uses:

`mappedBy = "user"`

---

### What does mappedBy refer to?

`mappedBy` refers to the Java field name on the owning entity.

The owning field is `Expense.user`, therefore the User mapping uses `mappedBy = "user"`.

---

### Why use User instead of userId in Expense?

Using a `User` reference models the relationship using Java objects.

Hibernate maps the object relationship to the `user_id` foreign key in the database.

# Questions

## Pending

- [ ] What is FetchType?
- [ ] What is CascadeType?
- [ ] How does JpaRepository work?
- [ ] How does Spring generate repository implementations?
- [ ] What are derived query methods?
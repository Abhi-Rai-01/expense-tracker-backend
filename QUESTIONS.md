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

* [ ] How does @ManyToOne work internally?
* [ ] How does @OneToMany work internally?
* [ ] EnumType.STRING vs EnumType.ORDINAL
* [ ] How does Hibernate convert Java object references into foreign keys?
* [ ] What is CascadeType?
* [ ] What is FetchType?

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

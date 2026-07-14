package in.expense.tracker.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import in.expense.tracker.enums.ExpenseCategory;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "expenses")
public class Expense {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private BigDecimal amount;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private ExpenseCategory category;
	
	private String description;
	
	@Column(nullable = false)
	private LocalDateTime expenseDate;
	
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
	public Expense() {
		
	}
}

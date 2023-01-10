package com.project.booking.dto.order;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class PaymentForBooking {
	
	private long paymentId;
	private String txnId;
	private String paymentType;
	private String bookingId;
	private String auditoriumId;
	private Double amount;
	private Double tax;
	private LocalDateTime invoiceDate;
	private boolean paymentStatus;

}

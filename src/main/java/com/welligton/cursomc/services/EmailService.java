package com.welligton.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.welligton.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}

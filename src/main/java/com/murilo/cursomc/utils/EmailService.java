package com.murilo.cursomc.utils;

import com.murilo.cursomc.model.pedido.entity.Pedido;
import org.springframework.mail.SimpleMailMessage;

public interface EmailService {
    void sendEmail(SimpleMailMessage msg);

    void sendOrderConfirmationEmail(Pedido obj);
}

package com.emailsender.email_sender.service;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.emailsender.email_sender.dto.EmailRequest;
@Service
public class EmailService {
    private JavaMailSender javamailsender;
    public  EmailService(JavaMailSender javamailsender){
        this.javamailsender=javamailsender;
    }
    public  void sendEmail(EmailRequest emailRequest){
        SimpleMailMessage send = new SimpleMailMessage();
        send.setTo(emailRequest.getRecipient());
        send.setSubject(emailRequest.getSubject());
        send.setText(emailRequest.getBody());
        javamailsender.send(send);
    }
}


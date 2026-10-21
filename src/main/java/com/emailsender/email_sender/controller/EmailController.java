package com.emailsender.email_sender.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emailsender.email_sender.dto.EmailRequest;
import com.emailsender.email_sender.dto.EmailResponse;
import com.emailsender.email_sender.service.EmailService;

import jakarta.validation.Valid;

@RestController
@RequestMapping ("/api/emails")
//receives the request and initiates it 
public class EmailController {

    private EmailService emailservice;
    public EmailController(EmailService emailservice){
        this.emailservice=emailservice;
    }

    //validates,read the json data and send a response
    @PostMapping("/send")
    public EmailResponse sendmail(@Valid @RequestBody EmailRequest emailRequest){
        emailservice.sendEmail(emailRequest);
        return EmailResponse.success("Request received successfully");
    }
}

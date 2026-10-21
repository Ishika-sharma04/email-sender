package com.emailsender.email_sender.dto;
//defines the information user provides to send an email
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class EmailRequest {
     // Declare the recipient's email address
    // This field is mandatory.
    @Email
    @NotBlank
    private String recipient;
    
    // Declare the email subject-optional
    private String subject;

    //Declare the email body
    // This field is optional.;
    private String body;

    // Create a getter for the recipient field
    // Purpose: Allow other classes to retrieve the recipient.
    public String getRecipient() {
        return recipient;
    }

    // Create a setter for the recipient field
    // Purpose: Allow the recipient value to be assigned or changed.
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    // Create a getter and setter for the subject
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    //Create a getter and setter for the body
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    // Consider whether you need a constructor.
    // For a simple request DTO, a no-argument constructor
    // and getters/setters are a common starting point.
    

}

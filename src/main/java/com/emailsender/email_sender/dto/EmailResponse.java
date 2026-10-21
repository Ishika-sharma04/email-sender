package com.emailsender.email_sender.dto;

public class EmailResponse {
    //defines response sent back to the client-successful,queue,unsuccessful
    private String status;
    private String message;
    //constructor
    public EmailResponse(String status,String message){
        this.status=status;
        this.message=message;
    }
    //success message
    public static EmailResponse success(String message){
        return new EmailResponse("SUCCESS",message);
    }
    //queue message
    public static EmailResponse queue(String message){
        return new EmailResponse("QUEUE",message);
    }
    //failed message
    public static EmailResponse failed(String message){
        return new EmailResponse("FAILED",message);
    }
    public  String getStatus(){
        return status;
    }
    public String  getMessage(){
        return message;
    }
    public void setStatus( String status){
        this.status=status;
    }
    public void setMessage(String message){
        this.message=message;
    }
}

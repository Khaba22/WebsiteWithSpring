package com.Devs.Projects.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.stereotype.Controller;

@Data

 public class Contact {

    @NotBlank(message="Name must not be blank")
    @Size(min=3, message="Name must be at least 3 characters long")
    public String name;

   @NotBlank(message="Mobile number must not be blank")
   @Pattern(regexp ="(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    public String mobileNum;

   @NotBlank(message ="Email must not be blank")
   @Email(message ="Provide a valid email")
    public String email;

   @NotBlank(message ="Subject must not be blank")
   @Size(min=5, message="Subject must be at least 5 characters long")
    public String  subject;

   @NotBlank(message ="Message must not be blank")
   @Size(min=10, message="message must be at least 10 characters long")
    public String message;


}

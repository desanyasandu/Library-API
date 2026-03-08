package com.ead2.library_api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @NotBlank(message = "Name is Required")
   private String name;

   @Email(message = "Email is Required")
   @Column(unique = true)
   private String email;

   @NotBlank(message = "Phone num is required")
   private String phone;

   private boolean active = true;
}
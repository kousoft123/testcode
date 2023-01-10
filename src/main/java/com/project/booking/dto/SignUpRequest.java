package com.project.booking.dto;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonDeserialize
public class SignUpRequest {
    private String phone;

    private String countryCode;

    private String email;



}
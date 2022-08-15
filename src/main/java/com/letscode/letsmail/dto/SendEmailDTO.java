package com.letscode.letsmail.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class SendEmailDTO {

    private String to;
    private String title;
    private String message;

}
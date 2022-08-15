package com.letscode.letsmail.Service.impl;

import com.letscode.letsmail.Service.SendEmailService;
import com.letscode.letsmail.dto.SendEmailDTO;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SendEmailServiceImpl implements SendEmailService {

    final JavaMailSender javaMailSender;

    public SendEmailServiceImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    @Transactional(readOnly = true)
    @Async
    public void send(final SendEmailDTO sendEmailDto) {

        final SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(sendEmailDto.getTo());
        simpleMailMessage.setSubject(sendEmailDto.getTitle());
        simpleMailMessage.setText(sendEmailDto.getMessage());
        javaMailSender.send(simpleMailMessage);

    }

}

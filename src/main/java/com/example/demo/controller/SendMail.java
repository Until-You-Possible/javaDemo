package com.example.demo.controller;

import com.example.demo.service.MailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SendMail {

    private final MailService mailService;

    public SendMail(MailService mailService) {
        this.mailService = mailService;
    }

    @GetMapping("/sendMailTest")
    public String sendmailToWg() {
        // String to, String subject, String content
        String to = "arthurwanggang@yeah.net";
        String content = "this is mail test text";
        String subject = "this is subject title";

        mailService.sendSimpleTextMail(to, subject, content);
        return "邮件已发送";
    }

}

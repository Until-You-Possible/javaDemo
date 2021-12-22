package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@RestController
@RequestMapping
public class SendMail {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private JavaMailSender javaMailSender;


    @GetMapping("/sendMailTest")
    public void sendmailToWg() {
        this.sendSimpleTextMail();
    }
    /**
     * 发送简单文本邮件
     *
     * @param to
     * @param subject
     * @param content
     */
    public void sendSimpleTextMail() {
        //简单邮件
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("admin@163.com");
        simpleMailMessage.setTo("arthurwanggang@outlook.com");
        simpleMailMessage.setSubject("Happy New Year");
        simpleMailMessage.setText("新年快乐！");
        javaMailSender.send(simpleMailMessage);
    }

}

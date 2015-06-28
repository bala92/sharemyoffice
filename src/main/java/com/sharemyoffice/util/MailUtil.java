package com.sharemyoffice.util;


import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

@Service
public class MailUtil {
	
	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	VelocityEngine velocityEngine;
	
	public void SendMail(final String toAddress, final String edmContent, final String mailSubject)
	{
		final String fromEmailAddress = "info@sharemyoffice.in";
		MimeMessagePreparator preparator = new MimeMessagePreparator() {

			public void prepare(MimeMessage mimeMessage) throws Exception {
				MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true);
				message.setTo(toAddress);
				message.setFrom(new InternetAddress(fromEmailAddress));
				message.setSubject(mailSubject);
				message.setText(edmContent, true);
			}
		}; 
		this.mailSender.send(preparator);
	}

}


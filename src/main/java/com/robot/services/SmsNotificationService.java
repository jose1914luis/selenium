package main.java.com.robot.services;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SmsNotificationService {
    private final AnmPropertiesService anmPropertiesService;
    @Autowired
    public SmsNotificationService(AnmPropertiesService anmPropertiesService) {

        this.anmPropertiesService = anmPropertiesService;
    }

    public void sendSms(String toPhoneNumber, String messageBody) {
        Twilio.init(anmPropertiesService.getProperty("twilio.account.sid"), anmPropertiesService.getProperty("twilio.auth.token"));
        Message message = Message.creator(
                new PhoneNumber(toPhoneNumber),
                new PhoneNumber(anmPropertiesService.getProperty("twilio.phone.number")),
                messageBody
        ).create();

        System.out.println("SMS enviado con SID: " + message.getSid());
    }
}

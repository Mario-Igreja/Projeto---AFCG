
package pt.iade.fitme.webserver.controllers;

        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.MediaType;
        import org.springframework.web.bind.annotation.*;
        import pt.iade.fitme.webserver.models.mails.MailDetail;
        import pt.iade.fitme.webserver.results.ConfirmKeyResponse;
        import pt.iade.fitme.webserver.services.MailService;

        import java.util.Random;

@RestController
@RequestMapping(path = "/api/mails")
public class emalicontroller {
    private final Logger logger = LoggerFactory.getLogger(pt.iade.fitme.webserver.controllers.emalicontroller.class);

    @Autowired
    private emailservice mailService;

    @GetMapping(path = "/key", produces = MediaType.APPLICATION_JSON_VALUE)
    public ConfirmKeyResponse getConfirmationKey(@RequestParam String email) {

        MailDetail mailDetail = new MailDetail();
        mailDetail.setTo(email);
        logger.info("Mail-> Sending email to "+mailDetail.getTo());
        return mailService.sendMail(mailDetail);
    }

}
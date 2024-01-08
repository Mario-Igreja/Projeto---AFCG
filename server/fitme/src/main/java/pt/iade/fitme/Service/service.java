
 package pt.iade.fitme.webserver.services;


import pt.iade.fitme.webserver.models.mails.MailDetail;
import pt.iade.fitme.webserver.results.ConfirmKeyResponse;

    public interface service {
        public ConfirmKeyResponse sendMail(MailDetail mailDetail);
    }




}

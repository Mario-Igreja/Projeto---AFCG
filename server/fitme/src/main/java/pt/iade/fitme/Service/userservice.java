package pt.iade.fitme.Service;

import com.sun.jdi.connect.Transport;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import jakarta.websocket.Session;
import org.apache.logging.log4j.message.Message;
import pt.iade.fitme.enums.gender;
import pt.iade.fitme.models.Usuario;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class UserService {

    // Dummy database for demonstration
    private static List<Usuario> usersDatabase = new ArrayList<>();

    public boolean registerUser(String name, String email, String password, gender gender, double height, double weight, String birthDate) {
        // Check if the user already exists
        for (Usuario user : usersDatabase) {
            if (user.getEmail().equals(email)) {
                return false; // User already exists
            }
        }

        // If the user doesn't exist, create and add to the database
        Usuario newUser = new Usuario(name, email, password, gender, height, weight, birthDate);
        usersDatabase.add(newUser);
        return true; // Registration successful
    }

    public boolean loginUser(String email, String password) {
        // Check if the user exists and the password is correct
        for (Usuario user : usersDatabase) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return true; // Login successful
            }
        }
        return false; // Login failed
    }

    public boolean sendVerificationCode(String email) {
        // Enviar e-mail com o código de verificação
        String code = getUserByEmail(email).getVerificationCode();

        // Configurações para o envio de e-mail (exemplo para Gmail)
        String host = "smtp.gmail.com";
        String port = "587";
        String username = "seu_email@gmail.com";
        String password = "sua_senha";

        // Configurações do servidor SMTP
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);

        // Sessão do e-mail
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Criar a mensagem
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
            message.setSubject("Código de Verificação");
            message.setText("Seu código de verificação é: " + code);

            // Enviar e-mail
            Transport.send(message);

            return true;
        } catch (MessagingException e) {
            e.printStackTrace();
            return false;
        }
    }

    private Usuario getUserByEmail(String email) {
        for (Usuario user : usersDatabase) {
            if (user.getEmail().equals(email)) {
                return user; // Retorna o usuário correspondente
            }
        }
        return null; // Retorna null se não encontrado
    }
}








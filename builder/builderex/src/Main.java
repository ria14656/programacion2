public class Main {
    public static void main(String[] args) {
        Email email = new Email.EmailBuilder()
                .addRecipient("o1julio@gmail.com")
                .addRecipient("o2alexa@gmail.com")
                .setSubject("Asunto del Correo")
                .setBody("Este es el cuerpo del correo.")
                .addAttachment("archivo1.txt")
                .addAttachment("archivo2.jpg")
                .build();

        System.out.println("Destinatarios: " + email.getRecipients());
        System.out.println("Asunto: " + email.getSubject());
        System.out.println("Cuerpo: " + email.getBody());
        System.out.println("Adjuntos: " + email.getAttachments());
    }
}
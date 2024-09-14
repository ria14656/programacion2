import java.util.ArrayList;
import java.util.List;

public class Email {
    private final List<String> recipients;
    private final String subject;
    private final String body;
    private final List<String> attachments;

    // Constructor privado
    private Email(EmailBuilder builder) {
        this.recipients = builder.recipients;
        this.subject = builder.subject;
        this.body = builder.body;
        this.attachments = builder.attachments;
    }

    public List<String> getRecipients() {
        return recipients;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    // Clase estática para Builder
    public static class EmailBuilder {
        private final List<String> recipients = new ArrayList<>();
        private String subject;
        private String body;
        private final List<String> attachments = new ArrayList<>();

        public EmailBuilder addRecipient(String recipient) {
            this.recipients.add(recipient);
            return this;
        }

        public EmailBuilder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public EmailBuilder setBody(String body) {
            this.body = body;
            return this;
        }

        public EmailBuilder addAttachment(String attachment) {
            this.attachments.add(attachment);
            return this;
        }

        public Email build() {
            if (recipients.isEmpty()) {
                throw new IllegalArgumentException("se solicita al menos un destinatario");
            }
            return new Email(this);
        }
    }
}
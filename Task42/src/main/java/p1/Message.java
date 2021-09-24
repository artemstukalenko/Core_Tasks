package p1;

import java.time.LocalDate;

public class Message {
    private String to;
    private String from;
    private String messageText;
    private LocalDate sendingDate;

    public Message(String to, String from, String messageText, LocalDate sendingDate) {
        this.to = to;
        this.from = from;
        this.messageText = messageText;
        this.sendingDate = sendingDate;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public LocalDate getSendingDate() {
        return sendingDate;
    }

    public void setSendingDate(LocalDate sendingDate) {
        this.sendingDate = sendingDate;
    }

    @Override
    public String toString() {
        return "Message{" +
                "to='" + to + '\'' +
                ", from='" + from + '\'' +
                ", messageText='" + messageText + '\'' +
                ", sendingDate=" + sendingDate +
                '}';
    }
}

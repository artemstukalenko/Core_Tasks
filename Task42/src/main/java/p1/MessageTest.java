package p1;

import java.time.LocalDate;

public class MessageTest {
    public static void main(String[] args) {
        Message messageToWrite = new Message("Vanya", "Vasya",
                "Privet!", LocalDate.now());

        MessageParsingService parsingService = new MessageParsingService();

        parsingService.writeMessageToFile(messageToWrite);

        Message readMessage = parsingService.getMessageFromFile();

        System.out.println(readMessage);
    }
}

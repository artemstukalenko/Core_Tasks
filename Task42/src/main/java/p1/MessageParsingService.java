package p1;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class MessageParsingService {

    public Message getMessageFromFile() {

        try (FileReader reader =
                     new FileReader("C:\\Users\\Professional\\IdeaProjects\\Core_Tasks\\Task42\\src\\main\\resources\\messages.json")) {

            JsonElement fileElement = JsonParser.parseReader(reader);
            JsonObject fileObject = fileElement.getAsJsonObject();

            String to = fileObject.get("to").getAsString();
            String from = fileObject.get("from").getAsString();
            String messageText = fileObject.get("messageText").getAsString();

            int year = fileObject.get("sendingDate").getAsJsonObject().get("year").getAsInt();
            int month = fileObject.get("sendingDate").getAsJsonObject().get("month").getAsInt();
            int day = fileObject.get("sendingDate").getAsJsonObject().get("day").getAsInt();

            Message readMessage = new Message(to, from, messageText, LocalDate.of(year, month, day));

            return readMessage;
        } catch (IOException e) {
            e.printStackTrace();
        }


        throw new RuntimeException("Object not found");
    }

    public void writeMessageToFile(Message messageToWrite) {
        Gson converter = new Gson();

        String jsonValueOfMessage = converter.toJson(messageToWrite);

        try (FileWriter writer = new FileWriter("C:\\Users\\Professional\\IdeaProjects\\Core_Tasks\\Task42\\src\\main\\resources\\messages.json")) {

            writer.write(jsonValueOfMessage);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

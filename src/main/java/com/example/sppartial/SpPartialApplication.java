package com.example.sppartial;

import com.example.sppartial.models.Message;
import com.example.sppartial.models.MessageReader;
import com.example.sppartial.models.MessiMessageDecoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class SpPartialApplication {

    public static void main(String[] args) throws IOException {
        MessageReader messageReader = new MessageReader();
        List<Message> messages = messageReader.readMessagesFromFile();

        MessiMessageDecoder messageDecoder = new MessiMessageDecoder();
        for (Message message : messages) {
            String decodedMessage = messageDecoder.decode(message.getMessage(), message.getHouse());
            System.out.println("Date: " + message.getDate() + ", Decoded Message: " + decodedMessage);
        }
    }

}

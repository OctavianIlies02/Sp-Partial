package com.example.sppartial.models;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class MessageReader {

    public List<Message> readMessagesFromFile() throws IOException {
        return new ObjectMapper().readValue(new URL("file:src/messages.json"), new TypeReference<List<Message>>(){});
    }
}

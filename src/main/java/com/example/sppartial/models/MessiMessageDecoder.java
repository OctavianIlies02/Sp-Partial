package com.example.sppartial.models;

public class MessiMessageDecoder implements MessageDecoder{
    @Override
    public String decode(String encodedMessage, String house) {
        StringBuilder decodedMessage = new StringBuilder();
        if ("atreides".equalsIgnoreCase(house)) {
            decodedMessage.append(decodeAtreidesMessage(encodedMessage));
        } else if ("harkonnen".equalsIgnoreCase(house)) {
            decodedMessage.append(decodeHarkonnenMessage(encodedMessage));
        }
        return decodedMessage.toString();
    }

    private String decodeAtreidesMessage(String encodedMessage) {
        return null;
    }

    private String decodeHarkonnenMessage(String encodedMessage) {
        return null;
    }
}

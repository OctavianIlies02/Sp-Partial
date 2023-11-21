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
        return decodeAsciiShift(encodedMessage, 3);
    }

    private String decodeHarkonnenMessage(String encodedMessage) {
        return decodeAsciiShift(encodedMessage, -2);
    }

    private String decodeAsciiShift(String encodedMessage, int shift) {
        StringBuilder decodedMessage = new StringBuilder();
        for (char character : encodedMessage.toCharArray()) {
            if (Character.isLetter(character)) {
                char shiftedChar = (char) (character + shift);
                if ((Character.isLowerCase(character) && shiftedChar < 'a') ||
                        (Character.isUpperCase(character) && shiftedChar < 'A')) {
                    shiftedChar += 26;
                } else if ((Character.isLowerCase(character) && shiftedChar > 'z') ||
                        (Character.isUpperCase(character) && shiftedChar > 'Z')) {
                    shiftedChar -= 26;
                }
                decodedMessage.append(shiftedChar);
            } else {
                decodedMessage.append(character);
            }
        }
        return decodedMessage.toString();
    }
}

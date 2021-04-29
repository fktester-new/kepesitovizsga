package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {


    public void exportPhonebook(Map<String, String> contacts, String output){
        if (contacts == null || output == null || "".equals(output)){
            throw new IllegalArgumentException("The phonebook is empty");
        }
        StringBuilder temp = new StringBuilder();
        for (Map.Entry<String, String> entries : contacts.entrySet()) {
            temp.append(entries.getKey()).append(": ").append(entries.getValue()).append("\n");
        }
        String data = temp.toString();
        Path file = Path.of("src", "main", "phonebookOutput", output);
        writeDataToFile(file, data);
    }

    private void writeDataToFile(Path file, String data) {
        try{
            Files.writeString(file, data);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }
}

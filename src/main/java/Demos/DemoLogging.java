package Demos;

import CustomLogging.CustomLogger;
import JsonPractice.Person;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class DemoLogging {
    public static void main(String[] args) throws IOException {
        CustomLogger logger = CustomLogger.getInstance();
        logger.info("Started...");

        byte[] bytes = Files.readAllBytes(Paths.get("D:\\Downloads\\Browser\\MOCK_DATA.json"));
        String contents = new String(bytes, StandardCharsets.UTF_8);

        Gson gson = new Gson();
        Person[] people = gson.fromJson(contents, Person[].class);
        Stream<Person> peopleStream = Arrays.stream(people);

        logger.info("Ending...");
    }
}

package itis;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import itis.entities.Board;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class DataGen {

    private final static String baseFile = "items.json";

    public static void main(String[] args) throws IOException {

        FakeValuesService fakeValuesService = new FakeValuesService(
                new Locale("en-GB"), new RandomService());

        ObjectMapper mapper = new ObjectMapper();
        ArrayList<Board> boards = new ArrayList<>();
        for (int i = 0; i <= 5; i++){
            String randomText = fakeValuesService.bothify("?????????");
            boards.add(new Board(randomText));
        }
        mapper.writeValue(new File(baseFile), boards);
        System.out.println("json created!");
    }
}

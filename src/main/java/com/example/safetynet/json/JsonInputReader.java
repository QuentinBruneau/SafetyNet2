package com.example.safetynet.json;

import com.example.safetynet.business.services.PersonService;
import com.example.safetynet.json.data.DataJsonExample;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Slf4j
@Component  /*bean*/
public class JsonInputReader {

    private static final String JSON_INPUT_DATA = "data.json";

    @Autowired
    private PersonService personService;

    public void loadJsonFile() throws JsonProcessingException {
        try {
            String donneesBrutes = loadFiles();
            DataJsonExample data = exctractData(donneesBrutes);

            saveData(data);
        } catch (IOException e) {
            log.error(e.getMessage());
        }
    }

    private List<String> saveData(DataJsonExample data) throws JsonProcessingException {
        // envoyer les bonnes données aux bons services
        personService.savePersons(data.getPersons());
        personService.saveMedicalRecords(data.getMedicalrecords());
        personService.saveFireStation(data.getFirestations());
        return null;
    }


    public DataJsonExample exctractData(String donneesBrutes) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        DataJsonExample data = objectMapper.readValue(donneesBrutes, DataJsonExample.class);
        return data;
    }

   private String loadFiles() throws IOException {
        InputStream is = getClass().getClassLoader().getResourceAsStream(JSON_INPUT_DATA);
        if (is == null) {
            throw new IOException("Impossible de lire le fichier " + JSON_INPUT_DATA);
        }
        String result = new String(is.readAllBytes());
        return result;
    }

}
package com.example.safetynet.business.services;

import com.example.safetynet.business.data.FireStation;
import com.example.safetynet.business.data.MedicalRecord;
import com.example.safetynet.business.data.Person;
import com.example.safetynet.json.JsonInputReader;
import com.example.safetynet.json.data.DataJsonExample;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {


    public void savePersons(List<Person> persons) {


    }



public void saveMedicalRecords(List<MedicalRecord> medicalrecords)throws JsonProcessingException{

}


public void saveFireStation(List<FireStation> firestations)throws JsonProcessingException{

}
}
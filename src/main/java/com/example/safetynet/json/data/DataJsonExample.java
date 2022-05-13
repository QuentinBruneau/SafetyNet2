package com.example.safetynet.json.data;

import com.example.safetynet.business.data.FireStation;
import com.example.safetynet.business.data.MedicalRecord;
import com.example.safetynet.business.data.Person;
import lombok.Data;

import java.util.List;

@Data
public class DataJsonExample {
    private List<Person> persons;
    private List<FireStation> firestations;
    private List<MedicalRecord> medicalrecords;
}

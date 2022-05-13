package com.example.safetynet.business.data;

import com.example.safetynet.business.data.MedicalRecord;
import lombok.Data;

// { "firstName":"John", "lastName":"Boyd", "address":"1509 Culver St", "city":"Culver", "zip":"97451", "phone":"841-874-6512", "email":"jaboyd@email.com" },
@Data
public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String zip;
    private String phone;
    private String email;
    private MedicalRecord medicalRecord;
}

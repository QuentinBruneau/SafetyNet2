package com.example.safetynet.web.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class DataTest {
    private Date date;
    private String string;
    private String string2;
    private List<Integer> liste;
}

package com.example.testProject.dto.purveyor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PurveyorResponse {
    private Long id;
    private String name;
    private String address;
    private String phone_number;
}

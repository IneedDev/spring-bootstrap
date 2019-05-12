package com.bootstrapwithspringboot.webapp.model;


import lombok.Data;

import javax.validation.constraints.Min;

@Data
public class CalcResult {
    @Min(50)
    private double weight;
    private double height;
}

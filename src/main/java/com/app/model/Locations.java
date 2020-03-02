package com.app.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: saurabh vaish
 * @version: 1.0
 * @since : 01-Mar-20
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Locations {

    private String country;

    private long latest;

    private String province;

    private Coordinates coordinates;

    private Map<String,String> history = new HashMap<>();

}

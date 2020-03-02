package com.app.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: saurabh vaish
 * @version: 1.0
 * @since : 01-Mar-20
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CoronaTracker {

    private Long latest;

    private List<Locations> locations = new ArrayList<>();

}

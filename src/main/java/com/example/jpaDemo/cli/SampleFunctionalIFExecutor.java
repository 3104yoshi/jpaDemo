
package com.example.jpaDemo.cli;

import org.springframework.stereotype.Component;

@Component
public class SampleFunctionalIFExecutor {

    public String executeSampleFunction(SampleFunctionalIF sampleFunctionalIF) {
        return sampleFunctionalIF.execute();
    }
}
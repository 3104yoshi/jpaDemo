
package com.example.jpaDemo.cli;

import org.springframework.stereotype.Component;

@Component
public class AnotherClass {

    public void executeSampleFunction(SampleFunctionalIF sampleFunctionalIF) {
        sampleFunctionalIF.execute();
    }
}
package com.example.jpaDemo.cli;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.ApplicationArguments;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
class SampleApplicationRunnerTest {

    @Mock
    private SampleFunctionalIFExecutor sampleFunctionalIfExecutor;

    @InjectMocks
    private SampleApplicationRunner runner;

    @Test
    void testTestMethod() {
        runner.test("Hello World");

        verify(sampleFunctionalIfExecutor, times(1)).executeSampleFunction(any(SampleFunctionalIF.class));
    }

    @Test
    void testTestMethod2() {
        when(sampleFunctionalIfExecutor.executeSampleFunction(any(SampleFunctionalIF.class))).thenAnswer(invocation -> {
            SampleFunctionalIF sampleFunctionalIF = invocation.getArgument(0);
            assertEquals("Hello World", sampleFunctionalIF.execute());
            return "Hello World";
        });
        runner.test("Hello World");
    }

    @Test
    void testRunMethod() throws Exception {
        ApplicationArguments mockArgs = mock(ApplicationArguments.class);

        runner.run(mockArgs);

        // No exception means the test passed
    }
}
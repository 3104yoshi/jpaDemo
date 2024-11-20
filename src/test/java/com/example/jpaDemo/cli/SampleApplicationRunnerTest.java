package com.example.jpaDemo.cli;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.ApplicationArguments;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
class SampleApplicationRunnerTest {

    @Mock
    private AnotherClass anotherClass;

    @InjectMocks
    private SampleApplicationRunner runner;

    @Test
    void testTestMethod() {
        runner.test();

        verify(anotherClass, times(1)).executeSampleFunction(any(SampleFunctionalIF.class));
    }

    @Test
    void testRunMethod() throws Exception {
        ApplicationArguments mockArgs = mock(ApplicationArguments.class);

        runner.run(mockArgs);

        // No exception means the test passed
    }
}
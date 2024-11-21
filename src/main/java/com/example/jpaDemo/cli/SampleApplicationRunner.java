package com.example.jpaDemo.cli;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleApplicationRunner implements ApplicationRunner {

    private final SampleFunctionalIFExecutor sampleFunctionalIFExecutor;

    public SampleApplicationRunner(SampleFunctionalIFExecutor sampleFunctionalIFExecutor) {
        this.sampleFunctionalIFExecutor = sampleFunctionalIFExecutor;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // コマンドライン引数から特定のキーの値を取得
        test("key");
    }

    public String test(String key) {
        SampleFunctionalIF sampleFunctionalIF = () -> key;
        return sampleFunctionalIFExecutor.executeSampleFunction(sampleFunctionalIF);
    }

}
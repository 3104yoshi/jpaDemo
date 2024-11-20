package com.example.jpaDemo.cli;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleApplicationRunner implements ApplicationRunner {

    private final AnotherClass anotherClass;

    public SampleApplicationRunner(AnotherClass anotherClass) {
        this.anotherClass = anotherClass;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // コマンドライン引数から特定のキーの値を取得
        test();
    }

    public void test() {
        SampleFunctionalIF sampleFunctionalIF = () -> System.out.println("Hello World");
        anotherClass.executeSampleFunction(sampleFunctionalIF);
    }

}
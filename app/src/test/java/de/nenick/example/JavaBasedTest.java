package de.nenick.example;

import org.junit.Test;

public class JavaBasedTest {

    @Test
    public void androidAnnotations(){
        MainActivity_ activity = new MainActivity_();
        activity.setContentView(null);
        // inside java class we see generated class in stacktrace
    }

    @Test
    public void androidAnnotationsCompile(){
        MainActivity_ activity = new MainActivity_();
        activity.onViewChanged(null);
        // inside java class it does compile
    }


}

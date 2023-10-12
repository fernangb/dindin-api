package com.dindin.infrastructure;

import com.dindin.application.UseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testMain(){
        Assertions.assertNotNull(new Main());
        Main.main(new String[]{});
    }
}

package com.morax;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ToDoListApplicationTests {

    @Test
    void contextLoads() {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            // 输出"- "
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("- ");
            }

            // 输出 "+ "
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("+ ");
            }

            // 输出"- "
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("- ");
            }

            System.out.println();
        }

    }

}

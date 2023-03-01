package dev.jlkeesh.springframeworkcore.beans;

import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

@Component
public class MyBean {
    public void timeIs() {
        try {
            while (true) {
                System.out.print("\r" + DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalTime.now()));
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (Exception ignored) {
        }
    }
}

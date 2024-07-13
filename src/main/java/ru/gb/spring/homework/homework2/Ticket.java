package ru.gb.spring.homework.homework2;

import java.time.LocalDateTime;

public class Ticket {
    private final String number;
    private final LocalDateTime createdAt;
    private final int queue; // людей в очереди

    public Ticket(String number, int queue){
        createdAt = LocalDateTime.now();
        this.number = number;
        this.queue = queue;
    }

    @Override
    public String toString() {
        return "Билет: " +
                "номер = '" + number + '\'' +
                "| время получения = " + createdAt +
                "| клиентов перед Вами = " + queue;
    }
}

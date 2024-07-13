package ru.gb.spring.homework.homework2;

import org.springframework.stereotype.Component;

@Component
public class Display {
    private final TicketNumberGenerator generator;
    private int queue = 0;

    public Display(TicketNumberGenerator generator){
        this.generator = generator;
    }

    public Ticket newTicket(){
        return new Ticket(generator.createNewNumber(), queue++);
    }
}

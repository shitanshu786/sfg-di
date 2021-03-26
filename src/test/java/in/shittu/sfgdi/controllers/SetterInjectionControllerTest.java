package in.shittu.sfgdi.controllers;

import in.shittu.sfgdi.services.GreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectionControllerTest {

    SetterInjectionController controller;

    @BeforeEach
    void setup(){
        controller = new SetterInjectionController();
        controller.setGreetingsService(new GreetingsServiceImpl());
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}
package in.shittu.sfgdi.controllers;

import in.shittu.sfgdi.services.GreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectorControllerTest {

    PropertyInjectorController controller;

    @BeforeEach
    void setup(){
        controller = new PropertyInjectorController();
        controller.greetingsService = new GreetingsServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}
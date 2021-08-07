package com.javis.UserService.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class StringDemoTest {
    @Mock
    StringDemo stringDemo;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        stringDemo = new StringDemo();
    }

    @Test
    void concat() {
        assertEquals("CoffeeBread",stringDemo.concat("Coffee","Bread"));
        assertEquals("cdefg",stringDemo.subString("abcdefg",2));
        assertEquals("cd",stringDemo.subString("abcdefg",2,4));
    }
    @Test
    void compare(){
        assertEquals(0,stringDemo.compareTo("Coffee","Coffee"));
        assertEquals(0,stringDemo.compareToIgnoreCase("coffee","Coffee"));
    }
    @Test
    void removeTest(){
        assertEquals("9503101234567",stringDemo.removeHyphenInIdNum("950310-1234567"));
    }
}
package com.javis.UserService.inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MyFriendsTest {
@Mock
MyFriends myfriends;
    @BeforeEach
    void setUp() {
        myfriends = new MyFriends();
    }

    @Test
    public void test_showInfo(){
        Friend[] returnFriends = myfriends.getFriends();
        for(Friend f : returnFriends){
            System.out.println(f.toString());
        }
        assertEquals("YOON", returnFriends[2].getName());

    }
}
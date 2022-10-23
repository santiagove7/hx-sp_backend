package com.demo.service;

import com.demo.repository.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertTrue;



class PersonServiceImpTest {

    @Mock
    private PersonRepository repo;

    @InjectMocks
    private PersonServiceImp service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void leap() {
        Integer year = 1996; //Leap year = 1996
        assertTrue(service.leap(year));
    }
}
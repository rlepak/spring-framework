package com.mockmvc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

class UnitTestImplTest {

    @Mock
    DataRepository dataRepository;

    @InjectMocks
    UnitTestImpl unitTest;



    @Test
    void calculateSum() {
//        UnitTestImpl unitTest = new UnitTestImpl();
//        int actual = unitTest.calculateSum(new int[]{1,2,3});
//        assertEquals(6,actual);
    }

    @Test
    void calculateSumUsingDataService(){
        DataRepositoryImpl dataRepository = new DataRepositoryImpl();
        UnitTestImpl unitTest = new UnitTestImpl();
        int actual = unitTest.calculateSumUsingDataService();
        assertEquals(5,actual);
    }

    @Test
    void calculateSumUsingDataServiceMock(){
        when(dataRepository.findAll()).thenReturn(new int[]{1,2,3}).thenReturn(new int[]{5,5,5});
        int actual = unitTest.calculateSumUsingDataService();
        int actual2 = unitTest.calculateSumUsingDataService();
        assertEquals(6,actual);
        assertEquals(15,actual2);
    }

    @Test
    void calculateSumUsingDataService_withParameter(){
        when(dataRepository.findById(anyInt())).thenReturn(new int []{1,2,3});
        int actual = unitTest.calculateSumUsingDataService_withParameter();
        assertEquals(6,actual);
    }
}

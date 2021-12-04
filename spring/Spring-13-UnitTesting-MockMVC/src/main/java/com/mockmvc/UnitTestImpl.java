package com.mockmvc;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class UnitTestImpl {

    @Autowired
    private DataRepository dataRepository;

//    public int calculateSum(){
//        return Arrays.stream(data).sum();
//    }

    public int calculateSumUsingDataService(){
        return Arrays.stream(dataRepository.findAll()).sum();
    }

    public int calculateSumUsingDataService_withParameter(){
        return Arrays.stream(dataRepository.findById(2)).sum();
    }
}

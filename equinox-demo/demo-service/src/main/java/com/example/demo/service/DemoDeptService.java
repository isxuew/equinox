package com.example.demo.service;

import com.example.demo.common.converter.DemoDeptConverter;
import com.example.demo.data.dao.DemoDeptDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DemoDeptService {

    private final DemoDeptDAO demoDeptDAO;
    private final DemoDeptConverter demoDeptConverter;

}

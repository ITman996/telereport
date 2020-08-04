package com.example.demo.service;

import com.example.demo.entity.RpCityCodeT;
import com.example.demo.mapper.RpCityCodeTMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RpCityCodeTService {
    @Autowired
    private RpCityCodeTMapper rpCityCodeTMapper;

    public List<RpCityCodeT> selectAllCity() {
        return rpCityCodeTMapper.selectAll();
    }
}

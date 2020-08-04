package com.example.demo.service;

import com.example.demo.entity.RpCityCodeT;
import com.example.demo.entity.RpProductCodeT;
import com.example.demo.mapper.RpProductCodeTMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RpProductCodeTService {
    @Autowired
    private RpProductCodeTMapper rpProductCodeTMapper;
    public List<RpProductCodeT> selectAllProduct() {
        return rpProductCodeTMapper.selectAll();
    }
}

package com.example.demo.service;

import com.example.demo.entity.RpProductCodeT;
import com.example.demo.entity.RpWriteOffTypeCodeT;
import com.example.demo.mapper.RpProductCodeTMapper;
import com.example.demo.mapper.RpWriteOffTypeCodeTMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RpWriteOffTypeCodeTService {

    @Autowired
    private RpWriteOffTypeCodeTMapper rpWriteOffTypeCodeTMapper;
    public List<RpWriteOffTypeCodeT> selectAllWrite() {
        return rpWriteOffTypeCodeTMapper.selectAll();
    }
}

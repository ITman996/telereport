package com.example.demo.service;

import com.example.demo.entity.RpAccountTypeCodeT;
import com.example.demo.entity.RpProductCodeT;
import com.example.demo.mapper.RpAccountTypeCodeTMapper;
import com.example.demo.mapper.RpProductCodeTMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//出账收入类型
@Service
public class RpAccountTypeCodeTService {
    @Autowired
    private RpAccountTypeCodeTMapper rpAccountTypeCodeTMapper;
    public List<RpAccountTypeCodeT> selectAllAccount() {
        return rpAccountTypeCodeTMapper.selectAll();
    }
}

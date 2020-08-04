package com.example.demo.service;

import com.example.demo.entity.RpAccountTypeCodeT;
import com.example.demo.entity.RpBalanceTypeCodeT;
import com.example.demo.mapper.RpBalanceTypeCodeTMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RpBalanceTypeCodeTService {
    @Autowired
    private RpBalanceTypeCodeTMapper rpBalanceTypeCodeTMapper;
    public List<RpBalanceTypeCodeT> selectAllType() {
        return rpBalanceTypeCodeTMapper.selectAll();
    }
}

package com.example.demo.service;

import com.example.demo.entity.RpBalanceTypeCodeT;
import com.example.demo.entity.RpBusinessFeeTypeCodeT;
import com.example.demo.mapper.RpBalanceTypeCodeTMapper;
import com.example.demo.mapper.RpBusinessFeeTypeCodeTMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RpBusinessFeeTypeCodeTService {
    @Autowired
    private RpBusinessFeeTypeCodeTMapper rpBusinessFeeTypeCodeTMapper;
    public List<RpBusinessFeeTypeCodeT> selectAllFee() {
        return rpBusinessFeeTypeCodeTMapper.selectAll();
    }
}

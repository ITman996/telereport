package com.example.demo.service;

import com.example.demo.entity.RpBalanceSpCodeT;
import com.example.demo.entity.RpBalanceTypeCodeT;
import com.example.demo.mapper.RpBalanceSpCodeTMapper;
import com.example.demo.mapper.RpBalanceTypeCodeTMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RpBalanceSpCodeTService {
    @Autowired
    private RpBalanceSpCodeTMapper rpBalanceSpCodeTMapper;
    public List<RpBalanceSpCodeT> selectAllSp() {
        return rpBalanceSpCodeTMapper.selectAll();
    }
}

package com.example.demo.mapper;

import com.example.demo.entity.RpBalanceTypeCodeT;
import com.example.demo.entity.RpBusinessFeeTypeCodeT;

import java.util.List;

//通知单收入类型
public interface RpBusinessFeeTypeCodeTMapper {
    public List<RpBusinessFeeTypeCodeT> selectAll();
}

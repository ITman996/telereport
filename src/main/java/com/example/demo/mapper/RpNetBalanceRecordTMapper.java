package com.example.demo.mapper;

import com.example.demo.entity.RpBusinessFeeRecordT;
import com.example.demo.entity.RpNetBalanceRecordT;

import java.util.List;
//网间结算
public interface RpNetBalanceRecordTMapper {
    public List<RpNetBalanceRecordT> selectByInfo(RpNetBalanceRecordT rpNetBalanceRecordT);
}

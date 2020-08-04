package com.example.demo.mapper;

import com.example.demo.entity.RpCardSaleRecordT;
import com.example.demo.entity.RpPreFeeRecordT;

import java.util.List;

public interface RpPreFeeRecordTMapper {
    public List<RpPreFeeRecordT> selectByInfo(RpPreFeeRecordT rpPreFeeRecordT);
}

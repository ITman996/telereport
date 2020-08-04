package com.example.demo.mapper;

import com.example.demo.entity.RpBusinessFeeRecordT;
import com.example.demo.entity.RpPreFeeRecordT;

import java.util.List;
//通知单录入
public interface RpBusinessFeeRecordTMapper {
    public List<RpBusinessFeeRecordT> selectByInfo(RpBusinessFeeRecordT rpBusinessFeeRecordT);
}

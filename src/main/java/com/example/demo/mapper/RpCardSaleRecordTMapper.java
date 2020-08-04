package com.example.demo.mapper;

import com.example.demo.entity.RpAccountFeeRecordT;
import com.example.demo.entity.RpCardSaleRecordT;

import java.util.List;

public interface RpCardSaleRecordTMapper {
    public List<RpCardSaleRecordT> selectByInfo(RpCardSaleRecordT rpCardSaleRecordT);
}

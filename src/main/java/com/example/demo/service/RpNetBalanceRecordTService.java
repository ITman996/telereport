package com.example.demo.service;

import com.example.demo.entity.RpNetBalanceRecordT;
import com.example.demo.entity.RpPreFeeRecordT;
import com.example.demo.form.RpNetBalanceRecordTForm;
import com.example.demo.form.RpPreFeeRecordTForm;
import com.example.demo.mapper.RpNetBalanceRecordTMapper;
import com.example.demo.mapper.RpPreFeeRecordTMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RpNetBalanceRecordTService {
    @Autowired
    private RpNetBalanceRecordTMapper rpNetBalanceRecordTMapper;
    /**
     * 根据条件查询出满足条件的网间结算收入信息。
     * @return	查询结果
     */
    public List<RpNetBalanceRecordT> selectByInfo(RpNetBalanceRecordTForm  rpNetBalanceRecordTForm) {
        RpNetBalanceRecordT rpNetBalanceRecordT=new RpNetBalanceRecordT();
        //复制时要求源和目标中的数据域名、类型保持一致。
        BeanUtils.copyProperties(rpNetBalanceRecordTForm, rpNetBalanceRecordT);
        return rpNetBalanceRecordTMapper.selectByInfo(rpNetBalanceRecordT);
    }
}

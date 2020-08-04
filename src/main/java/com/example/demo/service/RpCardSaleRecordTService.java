package com.example.demo.service;

import com.example.demo.entity.RpAccountFeeRecordT;
import com.example.demo.entity.RpCardSaleRecordT;
import com.example.demo.form.RpAccountFeeRecordTForm;
import com.example.demo.form.RpCardSaleRecordTForm;
import com.example.demo.mapper.RpAccountFeeRecordTMapper;
import com.example.demo.mapper.RpCardSaleRecordTMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RpCardSaleRecordTService {
    @Autowired
    private RpCardSaleRecordTMapper rpCardSaleRecordTMapper;
    /**
     * 根据条件查询出满足条件的出账收入信息。
     * @return	查询结果
     */
    public List<RpCardSaleRecordT> selectByInfo(RpCardSaleRecordTForm rpCardSaleRecordTForm) {
        RpCardSaleRecordT rpCardSaleRecordT=new RpCardSaleRecordT();
        //复制时要求源和目标中的数据域名、类型保持一致。
        BeanUtils.copyProperties(rpCardSaleRecordTForm, rpCardSaleRecordT);
        return rpCardSaleRecordTMapper.selectByInfo(rpCardSaleRecordT);
    }
}

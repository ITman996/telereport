package com.example.demo.mapper;


import com.example.demo.entity.RpAccountFeeRecordT;

import java.util.List;

public interface RpAccountFeeRecordTMapper {
	//持久化层中不允许使用展现层和业务逻辑层中的类。
	public List<RpAccountFeeRecordT> selectByInfo(RpAccountFeeRecordT rpAccountFeeRecordT);
}

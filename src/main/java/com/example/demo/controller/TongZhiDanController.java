package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.form.RpBusinessFeeRecordTForm;
import com.example.demo.form.RpPreFeeRecordTForm;
import com.example.demo.service.RpBusinessFeeRecordTService;
import com.example.demo.service.RpBusinessFeeTypeCodeTService;
import com.example.demo.service.RpCityCodeTService;
import com.example.demo.service.RpProductCodeTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/tongzhidan")//通知单模块请求路径
public class TongZhiDanController {
    @Autowired//相当于private RpCityCodeTService rpCityCodeTService = new RpCityCodeTService();
    private RpCityCodeTService rpCityCodeTService;
    @Autowired
    private RpProductCodeTService rpProductCodeTService;
    @Autowired
    private RpBusinessFeeTypeCodeTService rpBusinessFeeTypeCodeTService;
    @Autowired
    private RpBusinessFeeRecordTService rpBusinessFeeRecordTService;

    /**
     * 该方法用于从菜单跳转到通知单收入查询页面
     *
     * @return 逻辑视图
     */
    @RequestMapping("/list")
    public String list(Model model) {
        List<RpCityCodeT> list = rpCityCodeTService.selectAllCity();
        model.addAttribute("cityList", list);//城市编码
        List<RpProductCodeT> list1 = rpProductCodeTService.selectAllProduct();
        model.addAttribute("productList", list1);//产品编码
        List<RpBusinessFeeTypeCodeT> list2 = rpBusinessFeeTypeCodeTService.selectAllFee();
        model.addAttribute("feeList", list2);//通知单编码
        return "/tongzhidan/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String show(RpBusinessFeeRecordTForm rpBusinessFeeRecordTForm,
                       Model model) {
        //调用Service层中的方法根据查询条件完成查询操作
        List<RpBusinessFeeRecordT> rpBusinessFeeRecordList = rpBusinessFeeRecordTService.selectByInfo(rpBusinessFeeRecordTForm);
        model.addAttribute("rpBusinessFeeRecordList", rpBusinessFeeRecordList);
        //System.out.println("rpCardSaleRecordList");
        //调用Service层中的方法完成查询所有城市的操作。
        List<RpCityCodeT> list = rpCityCodeTService.selectAllCity();
        model.addAttribute("cityList", list);//城市编码
        List<RpProductCodeT> list1 = rpProductCodeTService.selectAllProduct();
        model.addAttribute("productList", list1);//产品编码
        List<RpBusinessFeeTypeCodeT> list2 = rpBusinessFeeTypeCodeTService.selectAllFee();
        model.addAttribute("feeList", list2);//通知单编码
        return "/tongzhidan/list";
    }
}
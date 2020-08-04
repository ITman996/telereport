package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.form.RpBusinessFeeRecordTForm;
import com.example.demo.form.RpNetBalanceRecordTForm;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/wangjianjiesuan")//网间结算模块请求路径
public class WangJianJieSuanController {
    @Autowired//相当于private RpCityCodeTService rpCityCodeTService = new RpCityCodeTService();
    private RpCityCodeTService rpCityCodeTService;
    @Autowired
    private RpProductCodeTService rpProductCodeTService;
    @Autowired
    private RpBalanceTypeCodeTService rpBalanceTypeCodeTService;
    @Autowired
    private RpBalanceSpCodeTService rpBalanceSpCodeTService;
    @Autowired
    private RpNetBalanceRecordTService rpNetBalanceRecordTService;
    /**
     * 该方法用于从菜单跳转到网间结算查询页面
     * @return 逻辑视图
     */
    @RequestMapping("/list")
    public String list(Model model) {
        List<RpCityCodeT> list =  rpCityCodeTService.selectAllCity();
        model.addAttribute("cityList", list);//城市编码
        List<RpProductCodeT> list1 = rpProductCodeTService.selectAllProduct();
        model.addAttribute("productList",list1);//产品编码
        List<RpBalanceTypeCodeT> list3 = rpBalanceTypeCodeTService.selectAllType();
        model.addAttribute("typeCodeList",list3);//结算类型编码
        List<RpBalanceSpCodeT> list4 = rpBalanceSpCodeTService.selectAllSp();
        model.addAttribute("spCodeList",list4);//结算类型编码
        return "/wangjianjiesuan/list";
    }
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String show(RpNetBalanceRecordTForm rpNetBalanceRecordTForm,
                       Model model) {
        //调用Service层中的方法根据查询条件完成查询操作
        List<RpNetBalanceRecordT> rpNetBalanceRecordList = rpNetBalanceRecordTService.selectByInfo(rpNetBalanceRecordTForm);
        model.addAttribute("rpNetBalanceRecordList", rpNetBalanceRecordList);
        //System.out.println("rpCardSaleRecordList");
        //调用Service层中的方法完成查询所有城市的操作。
        List<RpCityCodeT> list =  rpCityCodeTService.selectAllCity();
        model.addAttribute("cityList", list);//城市编码
        List<RpProductCodeT> list1 = rpProductCodeTService.selectAllProduct();
        model.addAttribute("productList",list1);//产品编码
        List<RpBalanceTypeCodeT> list3 = rpBalanceTypeCodeTService.selectAllType();
        model.addAttribute("typeCodeList",list3);//结算类型编码
        List<RpBalanceSpCodeT> list4 = rpBalanceSpCodeTService.selectAllSp();
        model.addAttribute("spCodeList",list4);//结算类型编码
        return "/wangjianjiesuan/list";

    }
}
package com.example.demo.controller;

import com.example.demo.entity.RpAccountFeeRecordT;
import com.example.demo.entity.RpCardSaleRecordT;
import com.example.demo.entity.RpCityCodeT;
import com.example.demo.entity.RpProductCodeT;
import com.example.demo.form.RpAccountFeeRecordTForm;
import com.example.demo.form.RpCardSaleRecordTForm;
import com.example.demo.service.RpCardSaleRecordTService;
import com.example.demo.service.RpCityCodeTService;
import com.example.demo.service.RpProductCodeTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/kaxiaoshoushouru")//卡销售模块请求路径
public class KaXiaoShouController {
    @Autowired//相当于private RpCityCodeTService rpCityCodeTService = new RpCityCodeTService();
    private RpCityCodeTService rpCityCodeTService;
    @Autowired
    private RpProductCodeTService rpProductCodeTService;
    @Autowired
    private RpCardSaleRecordTService rpCardSaleRecordTService;
    /**
     * 该方法用于从菜单跳转到卡销售收入查询页面
     * @return 逻辑视图
     */
    @RequestMapping("/list")
    public String list(Model model) {
        List<RpCityCodeT> list =  rpCityCodeTService.selectAllCity();
        model.addAttribute("cityList", list);//城市编码
        List<RpProductCodeT> list1 = rpProductCodeTService.selectAllProduct();
        model.addAttribute("productList",list1);//产品编码
        return "/kaxiaoshoushouru/list";
    }
    /**
     * 该方法用于单击查询按钮完成卡销售收入的查询操作
     * @return逻辑视图
     */
    @RequestMapping(value="/list", method= RequestMethod.POST)
    public String show(RpCardSaleRecordTForm rpCardSaleRecordTForm,
                       Model model) {
        //调用Service层中的方法根据查询条件完成查询操作
        List<RpCardSaleRecordT> rpCardSaleRecordList = rpCardSaleRecordTService.selectByInfo(rpCardSaleRecordTForm);
        model.addAttribute("rpCardSaleRecordList", rpCardSaleRecordList);
        //System.out.println("rpCardSaleRecordList");
        //调用Service层中的方法完成查询所有城市的操作。
        List<RpCityCodeT> list =  rpCityCodeTService.selectAllCity();
        model.addAttribute("cityList", list);//城市编码
        List<RpProductCodeT> list1 = rpProductCodeTService.selectAllProduct();
        model.addAttribute("productList",list1);//产品编码
        return "/kaxiaoshoushouru/list";

    }
}

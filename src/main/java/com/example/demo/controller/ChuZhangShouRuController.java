package com.example.demo.controller;
import com.example.demo.entity.RpAccountFeeRecordT;
import com.example.demo.entity.RpAccountTypeCodeT;
import com.example.demo.entity.RpCityCodeT;
import com.example.demo.entity.RpProductCodeT;
import com.example.demo.form.RpAccountFeeRecordTForm;
import com.example.demo.mapper.RpAccountFeeRecordTMapper;
import com.example.demo.service.RpAccountFeeRecordTSerivce;
import com.example.demo.service.RpAccountTypeCodeTService;
import com.example.demo.service.RpCityCodeTService;
import com.example.demo.service.RpProductCodeTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/chuzhangshouru")//模块请求路径
public class ChuZhangShouRuController {
    @Autowired//相当于private RpCityCodeTService rpCityCodeTService = new RpCityCodeTService();
    private RpCityCodeTService rpCityCodeTService;
    @Autowired
    private RpProductCodeTService rpProductCodeTService;
    @Autowired
    private RpAccountFeeRecordTSerivce rpAccountFeeRecordTSerivce;
    @Autowired
    private RpAccountTypeCodeTService rpAccountTypeCodeTService;
    /**
     * 该方法用于从菜单跳转到出账收入查询页面
     * @return 逻辑视图
     */
    @RequestMapping("/list")
    public String list(Model model) {//使用Model的目的是用于把数据传递给页面。
        //调用Service层中的方法完成查询所有城市的操作。
        List<RpCityCodeT> list =  rpCityCodeTService.selectAllCity();
        model.addAttribute("cityList", list);//属性名随意起
        List<RpProductCodeT> list1 = rpProductCodeTService.selectAllProduct();
        model.addAttribute("productList",list1);
        List<RpAccountTypeCodeT> list2 = rpAccountTypeCodeTService.selectAllAccount();
        model.addAttribute("accountList",list2);
        return "/chuzhangshouru/list";

    }
    /**
     * 该方法用于单击查询按钮完成出账收入的查询操作
     * @return逻辑视图
     */
    @RequestMapping(value="/list", method= RequestMethod.POST)
    public String show(RpAccountFeeRecordTForm rpAccountFeeRecordTForm,
                       Model model) {
        //调用Service层中的方法根据查询条件完成查询操作
        List<RpAccountFeeRecordT> accountFeeRecordList = rpAccountFeeRecordTSerivce.selectByInfo(rpAccountFeeRecordTForm);
        model.addAttribute("accountFeeRecordList", accountFeeRecordList);
        //System.out.println("accountFeeRecordList");
        //调用Service层中的方法完成查询所有城市的操作。
        List<RpCityCodeT> list =  rpCityCodeTService.selectAllCity();
        model.addAttribute("cityList", list);//属性名随意起

        return "/chuzhangshouru/list";
    }


}

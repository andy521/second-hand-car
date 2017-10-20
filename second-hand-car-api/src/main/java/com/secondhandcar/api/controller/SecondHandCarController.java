package com.secondhandcar.api.controller;

import com.secondhandcar.api.dto.SecondHandCarResponseDTO;
import com.secondhandcar.api.model.SecondHandCar;
import com.secondhandcar.api.service.SecondHandCarService;
import com.secondhandcar.core.controller.BaseController;
import com.secondhandcar.core.utils.ResultBuilderUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 二手车控制类
 * Created by xiet on 2017/10/16.
 */
@Controller
@RequestMapping(value="/secondHandCar")
public class SecondHandCarController extends BaseController{

    @Resource
    private SecondHandCarService secondHandCarService;

    /**
     * 获取二手车列表
     * @return
     */
    @RequestMapping(value = "/findSecondHandCar")
    @ResponseBody
    public Object findSecondHandCars(String condition){
        List<SecondHandCarResponseDTO> response = secondHandCarService.findSecondHandCars();
        return ResultBuilderUtil.success(response);
    }

    /**
     * 获取二手车详情信息
     * @param secondHandCar
     * @return
     */
    @RequestMapping(value="/detail")
    @ResponseBody
    public Object findSecondHandCarDetail(SecondHandCar secondHandCar){
        return null;
    }

    /**
     * 获取二手车配置信息
     * @param carId
     * @return
     */
    @RequestMapping(value="/config")
    @ResponseBody
    public Object findSecondHandCarConfig(String carId){
        return null;
    }

}

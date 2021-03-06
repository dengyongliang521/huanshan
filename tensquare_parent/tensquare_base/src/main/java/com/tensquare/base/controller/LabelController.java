package com.tensquare.base.controller;

import com.tensquare.base.pojo.Label;
import com.tensquare.base.service.LabelService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: dengYongLiang
 * @Date: 2020/04/15 18:59
 * @Description:
 * @Version 1.0
 */
@RestController
@CrossOrigin
@RequestMapping("/label")
public class LabelController {
    @Autowired
    private LabelService labelService;


    @RequestMapping(method = RequestMethod.POST)
    public Result save(@RequestBody Label label ){
        labelService.save(label);
        return  new Result(true, StatusCode.OK, "添加成功！");
    }
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll(){
        return  new Result(true, StatusCode.OK, "查询成功！",labelService.findAll());
    }
    @RequestMapping(value ="/{labelId}", method = RequestMethod.GET)
    public Result findById(@PathVariable  String labelId){
        return  new Result(true, StatusCode.OK, "查询成功！",labelService.findById(labelId));
    }
    @RequestMapping(value ="/{labelId}", method = RequestMethod.PUT)
    public Result update(@PathVariable  String labelId,@RequestBody Label label ){
        label.setId(labelId);
        labelService.update(label);
        return  new Result(true, StatusCode.OK, "修改成功！");
    }
    @RequestMapping(value ="/{labelId}", method = RequestMethod.DELETE)
    public Result delete(@PathVariable  String labelId ){
        labelService.delete(labelId);
        return  new Result(true, StatusCode.OK, "删除成功！");
    }

}

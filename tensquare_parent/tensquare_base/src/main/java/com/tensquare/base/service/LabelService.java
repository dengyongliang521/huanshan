package com.tensquare.base.service;

import com.tensquare.base.dao.LabelDao;
import com.tensquare.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.IdWorker;

import java.util.List;

/**
 * @Auther: dengYongLiang
 * @Date: 2020/04/15 19:45
 * @Description:
 * @Version 1.0
 */
@Service
public class LabelService {
    @Autowired
    private LabelDao labelDao;
    @Autowired
    private IdWorker idWorker;

    public List<Label> findAll() {
        return labelDao.findAll();
    }

    public Label findById(String id) {
        return labelDao.findById(id).get();
    }
    public void update(Label label){
        labelDao.save(label);
    }
    public void  save(Label label){
        label.setId(idWorker.nextId()+"");
        labelDao.save(label);
    }
    public void  delete(String labelId){
      labelDao.deleteById(labelId);
    }
}

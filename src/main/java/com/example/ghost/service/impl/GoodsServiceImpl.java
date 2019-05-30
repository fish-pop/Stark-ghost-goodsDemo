package com.example.ghost.service.impl;

import com.example.ghost.dao.GoodsDao;
import com.example.ghost.model.PO.Goods;
import com.example.ghost.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;

@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    private GoodsDao goodsDao;

    public String addGoods(Goods goods){
        Date date = new Date();
        goods.setCreateTime(date);
        goods.setUpdateTime(date);
        goods.setDeleteFlag(0);

        goodsDao.addGoods(goods);
        System.out.println("goods = [" + goods + "]");
        return "{\"status\":\"ok\"}";
    }


}

package com.example.ghost.controller;


import com.example.ghost.dao.GoodsDao;
import com.example.ghost.model.PO.Goods;
import com.example.ghost.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class GoodsController {

    @Autowired
    private GoodsDao goodsDao;
    @Autowired
    private IGoodsService goodsService;


    @PostMapping("/register")
    public String registerGoods(Goods goods) {
    /*    Date date = new Date();
        goods.setCreateTime(date);
        goods.setUpdateTime(date);
        goods.setDeleteFlag(0);

        goodsDao.addGoods(goods);
        System.out.println("goods = [" + goods + "]");
        return "{\"status\":\"ok\"}";*/
     return goodsService.addGoods(goods);
    }


    @GetMapping("/select")
    public Goods selectGoods(String goodsName) {
        if (goodsName == null) {
            return null;
        } else {
            Goods goodsByName = goodsDao.getGoodsByName(goodsName);
            return goodsByName;
        }

    }

    @DeleteMapping("/delete")
    public String deleteGoodsByName(String goodsName){
        if(goodsName==null){
              return null;
        }else{
           int number = goodsDao.deleteGoodsByName(goodsName);
           return "{\"status\":\" "+number+" \"}";
        }
    }

    @PostMapping("/update")
    public String updateGoodsByName(Goods goods){
        goods.setUpdateTime(new Date());
        goodsDao.updateByName(goods);
        System.out.println("goods = [" + goods + "]");
        return "{\"status\":\"ok\"}";
    }
}



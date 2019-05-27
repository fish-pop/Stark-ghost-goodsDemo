package com.example.ghost.model.PO;

import com.example.ghost.model.PO.base.BaseEntity;
import liquibase.change.DatabaseChange;
import lombok.Data;

@Data
public class Goods extends BaseEntity {

    private String goodsName;
    private int price;

    public Goods(){}

    public Goods(String goodsName, int price) {
        this.goodsName = goodsName;
        this.price = price;
    }

    public static void main(String[] args) {
        Goods goods = new Goods();
        goods.getGoodsName();
    }
}

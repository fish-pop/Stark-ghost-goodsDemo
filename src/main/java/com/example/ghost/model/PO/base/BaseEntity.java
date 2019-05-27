package com.example.ghost.model.PO.base;


import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {

    private int id;
    private Date createTime;
    private int createGoodsId;
    private Date updateTime;
    private int updateGoodsId;
    private int deleteFlag;
}

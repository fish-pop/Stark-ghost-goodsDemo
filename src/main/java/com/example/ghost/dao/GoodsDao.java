package com.example.ghost.dao;

import com.example.ghost.model.PO.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface GoodsDao {

    @Insert("insert into goods (goodsName,price,createTime,CreateGoodsId,updateTime,updateGoodsId,deleteFlag) values(#{goodsName}, #{price},#{createTime},#{createGoodsId},#{updateTime},#{updateGoodsId},#{deleteFlag})")
    void addGoods (Goods goods);

    @Select("select * from goods where goodsName=#{goodsName}")
    Goods getGoodsByName(String goodsName);

    @Delete("delete from goods where goodsName=#{goodsName}")
    int deleteGoodsByName(String goodsName);

    @Update("update goods set price=#{price} where goodsName =#{goodsName}")
    void updateByName(Goods goods);
}

package com.usian.controller;

import com.usian.fegin.ItemServiceFeign;
import com.usian.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/backend/item")
public class ItemWebController {
    @Autowired
    private ItemServiceFeign itemServiceFeign;

    /**查询商品信息
     * 根据商品id
     * @param itemId
     * @return
     */
    @RequestMapping("/selectItemInfo")
    public TbItem selectItemInfo(Long itemId){
        return this.itemServiceFeign.selectItemInfo(itemId);
    }

}
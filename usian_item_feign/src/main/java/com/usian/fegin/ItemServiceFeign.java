
package com.usian.fegin;
import com.usian.pojo.TbItem;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "usian-item-service")
public interface ItemServiceFeign {

    @RequestMapping("/service/item/selec" +
            "tItemInfo")
    TbItem selectItemInfo(@RequestParam("itemId") Long itemId);
}
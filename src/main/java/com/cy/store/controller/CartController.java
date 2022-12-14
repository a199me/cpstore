package com.cy.store.controller;

import com.cy.store.service.ICartService;
import com.cy.store.util.JsonResult;
import com.cy.store.vo.CartVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("carts")
public class CartController extends BaseController {
    @Autowired
   private ICartService cartService;
    @RequestMapping("add_to_cart")
    public JsonResult<Void> addCart(Integer pid, Integer amount,
                                    HttpSession session){
        cartService.addTOCart(getuidFromSession(session),pid,amount,getUsernameFromSession(session));
        return new JsonResult<>(OK);

    }
    @RequestMapping({"", "/"})
    public JsonResult<List<CartVo>> getVOByUid(HttpSession session) {
        List<CartVo> data = cartService.getVOByUid(getuidFromSession(session));
        return new JsonResult<List<CartVo>>(OK, data);
    }
    @RequestMapping("{cid}/num/add")
    public JsonResult<Integer> addNum(@PathVariable("cid") Integer cid, HttpSession session) {
        Integer data = cartService.addNum(
                cid,
                getuidFromSession(session),
                getUsernameFromSession(session));
        return new JsonResult<Integer>(OK, data);
    }
    @RequestMapping("list")
    public JsonResult<List<CartVo>> getVOByCid(Integer[] cids,HttpSession session) {
        List<CartVo> data = cartService.getVOByCid(getuidFromSession(session),cids);
        return new JsonResult<>(OK, data);
    }

}

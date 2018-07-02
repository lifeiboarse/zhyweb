package com.binzhou.zhy.controller;

import com.binzhou.zhy.entity.ShoppingCart;
import com.binzhou.zhy.model.dto.page.ShoppingCartPageDTO;
import com.binzhou.zhy.model.result.Result;
import com.binzhou.zhy.service.IShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lifeifei
 * @create 2018-06-21 13:14
 **/

@RestController
@RequestMapping("/cart")
public class ShoppingCartController {

    @Autowired
    private IShoppingCartService cartService;

    @RequestMapping(value = "/query", method = {RequestMethod.GET})
    @ResponseBody
    public Result<ShoppingCart> queryCartById(@RequestParam("id") Long id) {
        Result<ShoppingCart> result = new Result<ShoppingCart>();
        try {
            ShoppingCart cart = cartService.selectByPrimaryKey(id);
            if (null == cart) {
                //资源不存在，响应404
                result.setStatus(HttpStatus.NOT_FOUND);
                result.setData(null);
                return result;
            }
            //200
            result.setStatus(HttpStatus.OK);
            result.setData(cart);
            return result;
        } catch (Exception e) {
            result.setStatus(HttpStatus.EXPECTATION_FAILED);
        }
        result.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        return result;
    }

    @RequestMapping("/list")
    public Result<List<ShoppingCartPageDTO>> selectListByOption(ShoppingCart shoppingCart) {
        Result<List<ShoppingCartPageDTO>> shoppingCarts = cartService.selectListByOption(shoppingCart);
        return shoppingCarts;
    }

    @RequestMapping(value = "/save", method = {RequestMethod.POST})
    @ResponseBody
    public Result save(@RequestBody ShoppingCart record) {
        System.out.println("cart entity:" + record);
        Result result = new Result();
        try {
            int insert = cartService.insert(record);
            result.setData(insert);
            result.setStatus(HttpStatus.CREATED);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //500
        result.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        return result;
    }

    @RequestMapping(value = "/saveSelective", method = {RequestMethod.POST})
    @ResponseBody
    public Result saveSelective(@RequestBody ShoppingCart record) {
        System.out.println("cart entity:" + record);
        Result result = new Result();
        try {
            int insert = cartService.insertSelective(record);
            result.setData(insert);
            result.setStatus(HttpStatus.CREATED);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //500
        result.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        return result;
    }

    @RequestMapping(value = "/updateCartStatus", method = {RequestMethod.POST})
    @ResponseBody
    public Result updateCartStatus() {
        Result result = new Result();
        return result;
    }

    @RequestMapping(value = "/updateCartNumber", method = {RequestMethod.POST})
    @ResponseBody
    public Result updateCartNumber(@RequestBody ShoppingCart record) {
        Result result = new Result();
        try {
            /*if (record.getId().intValue() == 0) {
                //请求参数有误
                result.setStatus(HttpStatus.BAD_REQUEST);
                return result;
            }*/

            int update = this.cartService.updateNumber(record);
           /* if (record.getId().intValue() == 0) {
                result.setData(update);
                result.setStatus(HttpStatus.NO_CONTENT);
                return result;
            }*/
            result.setData(update);
            result.setStatus(HttpStatus.OK);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //500
        result.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        return result;
    }

    @RequestMapping(value = "/update", method = {RequestMethod.POST})
    @ResponseBody
    public Result update(@RequestBody ShoppingCart record) {
        Result result = new Result();
        this.cartService.update(record);
        return result;
    }

    @RequestMapping(value = "/updateSelective", method = {RequestMethod.POST})
    @ResponseBody
    public Result updateSelective(@RequestBody ShoppingCart record) {
        Result result = new Result();
        this.cartService.updateSelective(record);
        return result;
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Result delete(@RequestParam(value = "id", defaultValue = "0") Long id) {
        Result result = new Result();
        try {
            if (id.intValue() == 0) {
                //请求参数有误
                result.setStatus(HttpStatus.BAD_REQUEST);
                return result;
            }
            int delete = this.cartService.delete(id);
            if (id.intValue() == 0) {
                result.setData(delete);
                result.setStatus(HttpStatus.NO_CONTENT);
                return result;
            }
            result.setData(delete);
            result.setStatus(HttpStatus.OK);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //500
        result.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        return result;
    }
}

package com.binzhou.pay.utils.weixin.config;


public class WxPayConfig {
    //小程序appid
    public static final String appid = "wx64db6c2b70842ec1";
    //微信支付的商户id
    public static final String mch_id = "1504167501";
    //微信支付的商户密钥
    public static final String key = "lifeifeiandjiangxiaoshan20101218";
    //支付成功后的服务器回调url
    public static final String notify_url = "https://www.binzhoushi.xyz/zhy/weixin/wxNotify";
    //签名方式
    public static final String SIGNTYPE = "MD5";
    //交易类型
    public static final String TRADETYPE = "JSAPI";
    //微信统一下单接口地址
    public static final String pay_url = "https://api.mch.weixin.qq.com/pay/unifiedorder";
}

package com.atguigu.gmall.sms.service;


import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.gmall.sms.entity.SkuBoundsEntity;
import com.atguigu.gmall.sms.vo.SaleVO;
import com.baomidou.mybatisplus.extension.service.IService;


/**
 * 商品sku积分设置
 *
 * @author heyingzhao
 * @email lxf@atguigu.com
 * @date 2020-01-07 09:43:34
 */
public interface SkuBoundsService extends IService<SkuBoundsEntity> {

    PageVo queryPage(QueryCondition params);

    void saveSales(SaleVO saleVO);


}


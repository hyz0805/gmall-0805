package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.vo.SpuInfoVO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.SpuInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;

import java.io.FileNotFoundException;


/**
 * spu信息
 *
 * @author duxuemei
 * @email lxf@atguigu.com
 * @date 2020-01-01 21:13:19
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageVo queryPage(QueryCondition params);

    PageVo querySpuByCidOrKey(QueryCondition condition, Long catId);

    void bigSave(SpuInfoVO spuInfoVO) throws FileNotFoundException;


}


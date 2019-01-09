package com.dt.user.service.BasePublicService;

import com.dt.user.model.BasePublicModel.BasicPublicSite;

import java.util.List;

public interface BasicPublicSiteService {


    /**
     * 查询所有站点信息
     *
     * @return
     */
    List<BasicPublicSite> findBySiteList();


    /**
     * 通过店铺id查询站点信息
     */
    List<BasicPublicSite> getShopIdTakeSiteList(Long sId);



    /**
     * 洲 业务
     * 通过url 去查询site ID
     */
    Long getSiteId(String url);
}

package com.dt.user.toos;

public interface Constants {
    /**
     * 分页页数
     */
    int PAGE_SIEZ = 10;
    /**
     * 文件上传存放地址
     */
    String SAVE_FILE_PATH = "D:/csv/";

    /**
     * 文件写入存放地址
     */
    String WRITE_SAVE_FILE_PATH = "D:/skuNo/";
    /**
     * 响应请求成功
     */
    String HTTP_RES_CODE_200_VALUE = "success";
    /**
     * 响应请求成功code
     */
    Integer HTTP_RES_CODE_200 = 200;
    /**
     * 系统错误
     */
    Integer HTTP_RES_CODE = -1;
    /**
     * 美国时间解析
     */
    String USA_TIME = "MMM d, yyyy HH:mm:ss a";
    /**
     * 加拿大时间解析
     */
    String CANADA_TIME = "yyyy-MM-dd HH:mm:ss a";
    /**
     * 澳大利亚时间转换
     */
    String AUSTRALIA_TIME = "dd/MM/yyyy HH:mm:ss a";

    /**
     * 英国时间转换
     */
    String UNITED_KINGDOM_TIME = "d MMM yyyy HH:mm:ss";

    /**
     * 德国日期转换
     */
    String GERMAN_TIME ="dd.MM.yyyy HH:mm:ss";
    /**
     * 法国日期转换
     */
    String FRANCE_TIME="dd MM. yyyy HH:mm:ss";

    /**
     * 意大利日期转换
     */
    String ITALY_TIME ="d/MM/yyyy HH.mm.ss";

    /**
     * 西班牙转换日期
     */
    String SPAIN_TIME = "dd/MM/yyyy HH:mm:ss";

    /**
     * 日本日期转换
     */
    String JAPAN_TIME ="yyyy/MM/dd HH:mm:ss";

    /**
     * 墨西哥日期转换
     */
    String MEXICO_TIME= "dd/MM/yyyy HH:mm:ss";
}

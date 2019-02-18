package com.dt.user.model.BasePublicModel;


public class BasicSalesAmazonCsvTxtXslHeader {
    /**
     * 站点ID
     */
    private Long siteId;
    /**
     * 对应表头字段
     */
    private String importTemplet;
    private Long createDate;
    private Long createIdUser;
    private Long modifyDate;
    private Long modifyIdUser;
    private Long auditDate;
    private Long auditIdUser;
    /**
     * 位置标识
     */
    private Integer position;
    /**
     * 标识ID
     */
    private Long id;

    private Integer isImport;
    /**
     * 哪儿数据类型上传标识  1代表财务
     */
    private Integer tbId;
    /**
     * 开或者关
     */
    private Boolean openClose;

    public Boolean getOpenClose() {
        return openClose;
    }

    public void setOpenClose(Boolean openClose) {
        this.openClose = openClose;
    }

    public Integer getTbId() {
        return tbId;
    }

    public void setTbId(Integer tbId) {
        this.tbId = tbId;
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public String getImportTemplet() {
        return importTemplet;
    }

    public void setImportTemplet(String importTemplet) {
        this.importTemplet = importTemplet;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public Long getCreateIdUser() {
        return createIdUser;
    }

    public void setCreateIdUser(Long createIdUser) {
        this.createIdUser = createIdUser;
    }

    public Long getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Long modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Long getModifyIdUser() {
        return modifyIdUser;
    }

    public void setModifyIdUser(Long modifyIdUser) {
        this.modifyIdUser = modifyIdUser;
    }

    public Long getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Long auditDate) {
        this.auditDate = auditDate;
    }

    public Long getAuditIdUser() {
        return auditIdUser;
    }

    public void setAuditIdUser(Long auditIdUser) {
        this.auditIdUser = auditIdUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getIsImport() {
        return isImport;
    }

    public void setIsImport(Integer isImport) {
        this.isImport = isImport;
    }
}

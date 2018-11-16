package com.dt.user.model;

import java.io.Serializable;

public class TableHead implements Serializable {

  private long id;
  private String headName;
  private String menuId;

  private String topType;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getHeadName() {
    return headName;
  }

  public void setHeadName(String headName) {
    this.headName = headName;
  }


  public String getMenuId() {
    return menuId;
  }

  public void setMenuId(String menuId) {
    this.menuId = menuId;
  }

  public String getTopType() {
    return topType;
  }

  public void setTopType(String topType) {
    this.topType = topType;
  }
}

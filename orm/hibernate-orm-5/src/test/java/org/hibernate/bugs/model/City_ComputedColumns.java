package org.hibernate.bugs.model;

public class City_ComputedColumns {
  private String id;
  private String nameZIPCode;
  
  public City_ComputedColumns(){}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNameZIPCode(){
    return nameZIPCode;
  };
  
  public void setNameZIPCode(String nameZIPCode){
    this.nameZIPCode = nameZIPCode;
  }
}

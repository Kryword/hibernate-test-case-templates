package org.hibernate.bugs.model;

public class City {
  private Integer id;

  private String name;

  private String ZIP;

  private City_ComputedColumns _computedColumns;

  public City() {
  }

  public City(String name) {
    super();
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getZIP() {
    return ZIP;
  }

  public void setZIP(String zip) {
    this.ZIP = zip;
  }

  public City_ComputedColumns get_computedColumns() {
    return _computedColumns;
  }

  public void set_computedColumns(City_ComputedColumns _computedColumns) {
    this._computedColumns = _computedColumns;
  }

  @Override
  public String toString() {
    return name;
  }

}

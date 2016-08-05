package com.fasttracktit.curs8ui4.viewmodel;

/**
 * @author mihai.mecea
 */
public class MovieItemViewModel {

  public String name;
  public String description;
  public int imgResId;

  public MovieItemViewModel(String name, String description, int imgResId) {
    this.name = name;
    this.description = description;
    this.imgResId = imgResId;
  }

}

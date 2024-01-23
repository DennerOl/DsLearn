package com.example.dsLearn.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "tb_course")
public class Course {
 
  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String imgUri;
  private String imgGrayUri;
  
  public Course() {
  }

  public Course(Long id, String name, String imgUri, String imgGrauUri) {
    this.id = id;
    this.name = name;
    this.imgUri = imgUri;
    this.imgGrayUri = imgGrauUri;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImgUri() {
    return imgUri;
  }

  public void setImgUri(String imgUri) {
    this.imgUri = imgUri;
  }

  public String getImgGrauUri() {
    return imgGrayUri;
  }

  public void setImgGrauUri(String imgGrauUri) {
    this.imgGrayUri = imgGrauUri;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Course other = (Course) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }


  
  
}
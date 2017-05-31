package com.bjike.goddess.managementpromotion.bo;

import com.bjike.goddess.common.api.bo.BaseBO;

import javax.persistence.Column;
/**
* 管理分类等级设计业务传输对象
* @Author:			[ chenjunhao ]
* @Date:			[  2017-05-22 01:59 ]
* @Description:	[ 管理分类等级设计业务传输对象 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public class LevelDesignBO extends BaseBO { 

/**
* 分类
*/
 private String  classification; 

/**
* 管理方向
*/
 private String  direction; 

/**
* 技能等级
*/
 private String  skillLevel; 

/**
* 档次
*/
 private String  grade; 



 public String getClassification () { 
 return classification;
 } 
 public void setClassification (String classification ) { 
 this.classification = classification ; 
 } 
 public String getDirection () { 
 return direction;
 } 
 public void setDirection (String direction ) { 
 this.direction = direction ; 
 } 
 public String getSkillLevel () { 
 return skillLevel;
 } 
 public void setSkillLevel (String skillLevel ) { 
 this.skillLevel = skillLevel ; 
 } 
 public String getGrade () { 
 return grade;
 } 
 public void setGrade (String grade ) { 
 this.grade = grade ; 
 } 
 }
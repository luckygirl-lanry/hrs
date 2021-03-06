package com.zjy.dao;

import java.util.List;

import com.zjy.entity.Medicine;

public interface MedicineMapper {
    int deleteByPrimaryKey(String id);

    int insert(Medicine record);

    int insertSelective(Medicine record);

    Medicine selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Medicine record);

    int updateByPrimaryKey(Medicine record);

    List<Medicine> selectByMedicineName(String medicineName, int a, int b);

    int count(String medicineName);
}
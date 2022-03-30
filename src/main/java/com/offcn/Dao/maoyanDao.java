package com.offcn.Dao;

import com.offcn.Bean.maoyan;

import java.util.List;

public interface maoyanDao {
    maoyan queryById(int id);

    int add(maoyan m);

    int delete(int id);

    int update(maoyan m);
}

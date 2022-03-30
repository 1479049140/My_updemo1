package com.offcn.Service;

import com.offcn.Bean.maoyan;

public interface maoyanService {
    maoyan queryByid(int id);

    int add(maoyan m);

    int delete(int id);

    int update(maoyan m);
}

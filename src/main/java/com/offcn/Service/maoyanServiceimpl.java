package com.offcn.Service;

import com.offcn.Bean.maoyan;
import com.offcn.Dao.maoyanDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Transactional:用于添加事务
@Transactional
public class maoyanServiceimpl implements maoyanService{
    @Autowired
    private maoyanDao md;
    @Override
    public maoyan queryByid(int id) {
        return md.queryById(id);
    }

    @Override
    public int add(maoyan m) {
        return md.add(m);
    }

    @Override
    public int delete(int id) {
        return md.delete(id);
    }

    @Override
    public int update(maoyan m) {
        return md.update(m);
    }
}

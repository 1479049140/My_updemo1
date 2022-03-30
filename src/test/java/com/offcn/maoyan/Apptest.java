package com.offcn.maoyan;

import com.offcn.Bean.maoyan;
import com.offcn.Service.maoyanService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:Spring.xml"})
public class Apptest {
    @Autowired
    private maoyanService ms;
    @Test
    public void method(){
        maoyan maoyan = ms.queryByid(2);
        System.out.println(maoyan);
    }
}

package com.offcn.Controller;

import com.offcn.Bean.Result;
import com.offcn.Bean.maoyan;
import com.offcn.Dao.maoyanDao;
import com.offcn.Service.maoyanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;

@RestController
public class maoyanController {
    @Autowired
    private maoyanService ms;

    //测试
    @RequestMapping("/test")
    public String test(){
        return "success";
    }
    //通过Id查找
    @RequestMapping("/find/{id}")
    public maoyan queryByid(@PathVariable("id") int id){
        return ms.queryByid(id);
    }
    //添加（浏览器JSON传递）
    @PostMapping("/add")
    public Result add(@RequestBody maoyan m){
        return ms.add(m)>=1?Result.Success("添加成功"):Result.Fail("添加失败");
    }
    //通过Id删除
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable("id") int id){
        return ms.delete(id)>=1?Result.Success("删除成功"):Result.Fail("删除失败");
    }
    //通过Id修改（浏览器JSON传递）
    @PutMapping("/update")
    public Result update(@RequestBody maoyan m){
        return ms.update(m)>=1?Result.Success("修改成功"):Result.Fail("修改失败");
    }
}

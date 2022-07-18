package com.bootlearn.boot.treeData.two;

import com.bootlearn.boot.treeData.DataDao;
import com.bootlearn.boot.treeData.Department;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther d
 * @Date 2022/7/7 11:08
 * @Describe 测试返回树形结构数据
 **/
@Controller
@RequestMapping("/tree")
public class BuidDeptTreeController2 {

    @RequestMapping("/buildTree2")
    @ResponseBody
    public List<DepartmentVo> buildDeptTree(){
        List<DepartmentVo> departmenTree = this.listByAccountId(null);
        return departmenTree;
    }


    /**
     * 获取账号的资源树
     */
    public List<DepartmentVo> listByAccountId(Long accountId) {
        //return TreeUtils.generateTrees(BeanUtils.copyProperties(mapper.selectByAccountId(userId), ResourceListVO.class));
        //从数据库获取树形结构的数据
        List<DepartmentVo> departmentData2 = DataDao.getDepartmentData2();
        List<DepartmentVo> departmentTree = TreeUtils.generateTrees(departmentData2);
        return departmentTree;
    }


}

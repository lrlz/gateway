//package com.timevale.gateway.controller;
//import java.util.Map;
//import java.util.Date;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import com.github.pig.common.constant.CommonConstant;
//import com.baomidou.mybatisplus.mapper.EntityWrapper;
//import com.baomidou.mybatisplus.plugins.Page;
//import com.github.pig.common.util.Query;
//import com.github.pig.common.util.R;
//import com.timevale.gateway.entity.Auth_info;
//import com.timevale.gateway.service.Auth_infoService;
//
///**
// * <p>
// *  前端控制器
// * </p>
// *
// * @author tianxing
// * @since 2018-08-28
// */
//@RestController
//@RequestMapping("/auth_info")
//public class Auth_infoController extends  {
//    @Autowired private Auth_infoService auth_infoService;
//
//    /**
//    * 通过ID查询
//    *
//    * @param id ID
//    * @return Auth_info
//    */
//    @GetMapping("/{id}")
//    public R<Auth_info> get(@PathVariable Integer id) {
//        return new R<>(auth_infoService.selectById(id));
//    }
//
//
//    /**
//    * 分页查询信息
//    *
//    * @param params 分页对象
//    * @return 分页对象
//    */
//    @RequestMapping("/page")
//    public Page page(@RequestParam Map<String, Object> params) {
//        params.put(CommonConstant.DEL_FLAG, CommonConstant.STATUS_NORMAL);
//        return auth_infoService.selectPage(new Query<>(params), new EntityWrapper<>());
//    }
//
//    /**
//     * 添加
//     * @param  auth_info  实体
//     * @return success/false
//     */
//    @PostMapping
//    public R<Boolean> add(@RequestBody Auth_info auth_info) {
//        return new R<>(auth_infoService.insert(auth_info));
//    }
//
//    /**
//     * 删除
//     * @param id ID
//     * @return success/false
//     */
//    @DeleteMapping("/{id}")
//    public R<Boolean> delete(@PathVariable Integer id) {
//        Auth_info auth_info = new Auth_info();
//        auth_info.setId(id);
//        auth_info.setUpdateTime(new Date());
//        auth_info.setDelFlag(CommonConstant.STATUS_DEL);
//        return new R<>(auth_infoService.updateById(auth_info));
//    }
//
//    /**
//     * 编辑
//     * @param  auth_info  实体
//     * @return success/false
//     */
//    @PutMapping
//    public R<Boolean> edit(@RequestBody Auth_info auth_info) {
//        auth_info.setUpdateTime(new Date());
//        return new R<>(auth_infoService.updateById(auth_info));
//    }
//}

package org.yangxin.es.es.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yangxin.es.es.entity.mysql.SysUser;
import org.yangxin.es.es.repository.mysql.SysUserRepository;

import java.util.List;

/**
 * @author yangxin
 * 2020/03/28 22:53
 */
@Controller
@Slf4j
public class IndexController {

    private final SysUserRepository sysUserRepository;

    @Autowired
    public IndexController(SysUserRepository sysUserRepository) {
        this.sysUserRepository = sysUserRepository;
    }

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        List<SysUser> sysUserList = sysUserRepository.findAll();
        log.info("sysUserList.size: [{}]", sysUserList.size());
        return "hello world";
    }
}

package org.kode.web.admin.system;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("adminSysUserController")
@RequestMapping("/api/admin/system/user")
@Tag(name = "系统管理-用户控制器")
@Slf4j
public class SysUserController {

    @GetMapping("/hello")
    @Operation(summary = "Hello")
    public String hello() {
        log.info("=============> hello");
        return "Hello, Admin!";
    }
}

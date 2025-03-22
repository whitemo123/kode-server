package org.kode.web.app.home;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("appHomeController")
@RequestMapping("/api/app/home")
@Tag(name = "首页控制器")
public class HomeController {

    @GetMapping("/hello")
    @Operation(summary = "Hello")
    public String hello() {
        return "Hello, App!";
    }
}

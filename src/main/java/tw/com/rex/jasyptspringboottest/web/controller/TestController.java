package tw.com.rex.jasyptspringboottest.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tw.com.rex.jasyptspringboottest.entity.UserInfo;
import tw.com.rex.jasyptspringboottest.service.TestService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/test")
public class TestController {

    private final TestService service;

    @PostMapping("/insert")
    public String insert(@RequestBody UserInfo userInfo) {
        return service.insert(userInfo);
    }

    @GetMapping("/{id}")
    public UserInfo findById(@PathVariable String id) {
        return service.findById(id);
    }

    @GetMapping("/all")
    public List<UserInfo> findAll() {
        return service.findAll();
    }

}

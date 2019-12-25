package com.carrx.multimodule.api.controller;

import com.carrx.multimodule.core.apple.entity.Apple;
import com.carrx.multimodule.core.apple.service.AppleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apple")
public class AppleController {

    @Autowired
    private AppleService appleService;

    @GetMapping("/{id}")
    public Apple get(@PathVariable String id) {
        Apple apple = appleService.get(id);
        return apple;
    }
}

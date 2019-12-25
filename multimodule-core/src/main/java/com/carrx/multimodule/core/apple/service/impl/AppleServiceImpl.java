package com.carrx.multimodule.core.apple.service.impl;

import com.carrx.multimodule.core.apple.entity.Apple;
import com.carrx.multimodule.core.apple.service.AppleService;
import org.springframework.stereotype.Service;

@Service
public class AppleServiceImpl implements AppleService {

    @Override
    public Apple get(String id) {
        Apple apple = new Apple();
        apple.setId(id);
        return apple;
    }

}

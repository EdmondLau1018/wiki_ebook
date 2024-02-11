package com.edmond.wiki.controller;

import com.edmond.wiki.domain.Test;
import com.edmond.wiki.mapper.TestMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    private final TestMapper testMapper;

    public DemoController(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String getDemo() {
        return "demo fucking world ";
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Test> selectAll() {
        return testMapper.selectAll();
    }
}

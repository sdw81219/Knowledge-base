package com.henry.knowledgebase.service;

import com.henry.knowledgebase.domain.Test;
import com.henry.knowledgebase.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }
}

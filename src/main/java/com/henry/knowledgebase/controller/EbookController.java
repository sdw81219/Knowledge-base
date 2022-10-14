package com.henry.knowledgebase.controller;

import com.henry.knowledgebase.domain.Ebook;
import com.henry.knowledgebase.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public List<Ebook> list() {
        return ebookService.list();
    }
}
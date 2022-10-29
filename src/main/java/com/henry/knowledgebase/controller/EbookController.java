package com.henry.knowledgebase.controller;

import com.henry.knowledgebase.req.EbookQueryReq;
import com.henry.knowledgebase.req.EbookSaveReq;
import com.henry.knowledgebase.resp.CommonResp;
import com.henry.knowledgebase.resp.EbookQueryResp;
import com.henry.knowledgebase.resp.PageResp;
import com.henry.knowledgebase.service.EbookService;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EbookQueryReq req) {
        CommonResp<PageResp<EbookQueryResp>> resp = new CommonResp<>();
        PageResp<EbookQueryResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }

    @PostMapping("/save")
    public CommonResp save(@RequestBody EbookSaveReq req) {
        CommonResp resp = new CommonResp<>();
        ebookService.save(req);
        return resp;
    }
}

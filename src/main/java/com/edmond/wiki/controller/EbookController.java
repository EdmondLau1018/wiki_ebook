package com.edmond.wiki.controller;

import com.edmond.wiki.domain.Ebook;
import com.edmond.wiki.resp.CommonResp;
import com.edmond.wiki.service.EbookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    private final EbookService ebookService;

    public EbookController(EbookService ebookService) {
        this.ebookService = ebookService;
    }

    @RequestMapping(value = "/bookList",method = RequestMethod.GET)
    public CommonResp<List<Ebook>> queryBookList(Ebook ebook){
        CommonResp commonResp = new CommonResp();
        List<Ebook> ebooks = ebookService.queryAll(ebook);
        commonResp.setContent(ebooks);
        return commonResp;
    }

}

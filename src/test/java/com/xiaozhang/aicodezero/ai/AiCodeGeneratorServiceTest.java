package com.xiaozhang.aicodezero.ai;

import com.xiaozhang.aicodezero.ai.model.HtmlCodeResult;
import com.xiaozhang.aicodezero.ai.model.MultiFileCodeResult;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiCodeGeneratorServiceTest {

    @Resource
    private AiCodeGeneratorService aiCodeGeneratorService;

    @Test
    void generateHtmlCode() {
        HtmlCodeResult htmlCodeResult = aiCodeGeneratorService.generateHtmlCode("做个程序员张良的博客，不超过50行");
        Assertions.assertNotNull(htmlCodeResult);
    }

    @Test
    void generateMultiFileCode() {
        MultiFileCodeResult htmlCodeResult = aiCodeGeneratorService.generateMultiFileCode("做个程序员张良的博客，不超过50行");
        Assertions.assertNotNull(htmlCodeResult);
    }
}
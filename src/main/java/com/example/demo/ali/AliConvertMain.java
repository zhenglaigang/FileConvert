package com.example.demo.ali;

public class AliConvertMain {
    /*public void convertOfficeFormat(String srcKeyName, String tgtSavePath) {
        ThirdPartProperties immProperties = ThirdPartProperties;

        srcKeyName = srcKeyName.startsWith("/") ? srcKeyName : "/" + srcKeyName;
        tgtSavePath = tgtSavePath.startsWith("/") ? tgtSavePath : "/" + tgtSavePath;

        ConvertOfficeFormatRequest convertOfficeFormatRequest = new ConvertOfficeFormatRequest()
                .setProject(immProperties.getProject())
                .setSrcUri("oss://" + immProperties.getOssBucket() + srcKeyName)
                .setTgtUri("oss://" + immProperties.getOssBucket() + tgtSavePath)
                .setTgtType("pdf");

        RuntimeOptions runtime = new RuntimeOptions();
        try {
            // 复制代码运行请自行打印 API 的返回值
            ConvertOfficeFormatResponse convertOfficeFormatResponse = immClient.convertOfficeFormatWithOptions(convertOfficeFormatRequest, runtime);
            log.info("ConvertOfficeFormatResponse：{}", JacksonUtil.toJson(convertOfficeFormatResponse));
        } catch (TeaException error) {
            // 如有需要，请打印 error
            log.error("ConvertOfficeFormatResponse Error: ", error);
        } catch (Exception _error) {
            log.error("ConvertOfficeFormatResponse Error: ", _error);
        }
    }*/
}

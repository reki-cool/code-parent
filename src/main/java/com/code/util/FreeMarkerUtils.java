package com.code.util;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import java.io.*;
import java.util.Map;

/**
 * Created by dm
 */
public class FreeMarkerUtils {

    /**
     * 根据参数获取模板
     * @param templatePath 模板路径，例如数据库各表对应的实体类要存放的位置
     * @param templateFileName  模板文件名称，例如model.ftl等，但不包括后缀".ftl"，即model
     * @return
     */
    private static Template getTemplate(String templatePath,String templateFileName){
        Configuration configuration = new Configuration();
        Template template =null;
        try {
            configuration.setDirectoryForTemplateLoading(new File(templatePath));
            configuration.setObjectWrapper(new DefaultObjectWrapper());
            configuration.setDefaultEncoding("UTF-8");   //设置编码
            //模板文件
            template=configuration.getTemplate(templateFileName + ".ftl");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return template;
    }

    /**
     * 根据参数生成文件
     * @param input
     * @param templatePath
     * @param templateFileName
     * @param savePath
     * @param fileName
     */
    public static void genteratorFile(Map<String,String> input,String templatePath,String templateFileName,String savePath,String fileName){
        Template template=getTemplate(templatePath,templateFileName);
        File file = new File(savePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        Writer writer = null;
        try {
            writer=new OutputStreamWriter(new FileOutputStream(savePath+"\\"+fileName), "UTF-8");
            template.process(input, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void appendgenteratorFile(Map<String,String> input,String template_path,String templateFileName,String savePath,String fileName){
        Template template=getTemplate(template_path,templateFileName);
        File file = new File(savePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        Writer writer = null;
        try {
            writer=new OutputStreamWriter(new FileOutputStream(savePath+"\\"+fileName,true), "UTF-8");
            template.process(input, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

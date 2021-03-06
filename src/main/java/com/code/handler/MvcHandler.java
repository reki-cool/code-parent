package com.code.handler;

import com.code.bean.Table;
import com.code.constant.Constant;
import com.code.util.FreeMarkerUtils;
import com.code.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * MVC处理器
 */
public class MvcHandler {

    // 获取MVC模板要生成的路径
    String templateFile = Constant.template_path;

    /**
     * 逆向生成实体类文件（entity包）
     * 前提：所有数据库的表名都是小写形式，且单词间用下划线隔开
     * @param table
     */
    public void generateEntity(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", Constant.ENTITY_PACKAGE_NAME);
        // 处理表名，转换成驼峰形式，获取表名驼峰但首字母小写的形式
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        // 根据表名获取类名的文件名
        String fileName = table.getClassName() + ".java";
        // 获取model保存路径
        String savePath = Constant.ENTITY_SAVE_PATH;
        String templateName = "entity";
        // 生成实体类文件
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeClient_dm_common(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "templateFile");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Client" + ".java";
        String savePath = Constant.client_dm_save_path + "//";
        String templateName = "client_dm_common";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeClientFallBack_dm(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "templateFile");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = table.getClassName() + "ClientFallBack" + ".java";
        String savePath = Constant.client_dm_fallback_save_path + "//";
        String templateName = "client_dm_fallback";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeClient_dm_item(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "templateFile");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Client" + ".java";
        String savePath = Constant.client_dm_save_path + "//";
        String templateName = "client_dm_item";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeClient_dm_order(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "templateFile");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Client" + ".java";
        String savePath = Constant.client_dm_save_path + "//";
        String templateName = "client_dm_order";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeClient_dm_pay(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "templateFile");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Client" + ".java";
        String savePath = Constant.client_dm_save_path + "//";
        String templateName = "client_dm_pay";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeClient_dm_scheduler(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "templateFile");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Client" + ".java";
        String savePath = Constant.client_dm_save_path + "//";
        String templateName = "client_dm_scheduler";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeClient_dm_user(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "templateFile");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Client" + ".java";
        String savePath = Constant.client_dm_save_path + "//";
        String templateName = "client_dm_user";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeService_dm_item(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "templateFile");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Service" + ".java";
        String savePath = Constant.service_dm_item_save_path + "//";
        String templateName = "service_dm";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeService_dm_order(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "templateFile");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Service" + ".java";
        String savePath = Constant.service_dm_order_save_path + "//";
        String templateName = "service_dm";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeService_dm_pay(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "templateFile");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Service" + ".java";
        String savePath = Constant.service_dm_pay_save_path + "//";
        String templateName = "service_dm";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeService_dm_scheduler(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "templateFile");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Service" + ".java";
        String savePath = Constant.service_dm_scheduler_save_path + "//";
        String templateName = "service_dm";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeService_dm_user(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "templateFile");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Service" + ".java";
        String savePath = Constant.service_dm_user_save_path + "//";
        String templateName = "service_dm";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeService_dm_common(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "templateFile");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Service" + ".java";
        String savePath = Constant.service_dm_common_save_path + "//";
        String templateName = "service_dm";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    /**
     * 根据表信息生成对应的Mapper接口的XML文件
     * @param table
     */
    public void generateMapperXML(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("entityPackage", Constant.ENTITY_PACKAGE_NAME);
        input.put("mapperPackage", Constant.MAPPER_PACKAGE_NAME);
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = table.getClassName() + "Mapper" + ".xml";
        String savePath = Constant.MAPPER_XML_SAVE_PATH + "//";
        String templateName = "mapper";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    /**
     * 根据表信息生成对应的Mapper接口文件
     * @param table
     */
    public void generateClazzMapper(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("entityPackage", Constant.ENTITY_PACKAGE_NAME);
        input.put("mapperPackage", Constant.MAPPER_PACKAGE_NAME);
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = table.getClassName() + "Mapper" + ".java";
        String savePath = Constant.MAPPER_CLASS_SAVE_PATH +"//";
        String templateName = "clazzMapper";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

}

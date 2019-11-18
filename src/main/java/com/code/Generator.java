package com.code;

import com.code.bean.Table;
import com.code.handler.MvcHandler;
import com.code.handler.TableHandler;

import java.util.List;

/**
 * Created by duyanhan
 */
public class Generator {

    public static void main(String args[]) throws Exception {
        TableHandler tableHandler = new TableHandler();
        MvcHandler mvcHandler = new MvcHandler();
        List<Table> tableList = tableHandler.getTables();
        for (Table table : tableList) {
            // 逆向生成实体类文件
            mvcHandler.generateEntity(table);//0k
            // 逆向生成Mapper接口对应的XML文件
            mvcHandler.generateMapperXML(table);//ok
            // 逆向生成Mapper接口文件
            mvcHandler.generateClazzMapper(table);//ok

//              common模块对应的client接口
//              mvcHandler.executeClient_dm_common(table);//ok
//              mvcHandler.executeClientFallBack_dm(table);//ok

//            item模块对应的client接口
//             mvcHandler.executeClient_dm_item(table);//ok
//             mvcHandler.executeClientFallBack_dm(table);//ok

//             order模块对应的client接口
//             mvcHandler.executeClient_dm_order(table);//ok
//             mvcHandler.executeClientFallBack_dm(table);//ok

//             pay模块对应的client接口
//            mvcHandler.executeClient_dm_pay(table);//ok
//            mvcHandler.executeClientFallBack_dm(table);//ok

//             scheduler模块对应的client接口
//            mvcHandler.executeClient_dm_scheduler(table);//ok
//            mvcHandler.executeClientFallBack_dm(table);//ok

//             user模块对应的client接口
            mvcHandler.executeClient_dm_user(table);//ok
            mvcHandler.executeClientFallBack_dm(table);//ok

//             item模块对应的provider实现
            mvcHandler.executeService_dm_item(table);//ok

//             order模块对应的provider实现
//            mvcHandler.executeService_dm_order(table);//ok

//             pay模块对应的provider实现
//            mvcHandler.executeService_dm_pay(table);//ok

//             shceduler模块对应的provider实现
//            mvcHandler.executeService_dm_scheduler(table);//ok

//             user模块对应的provider实现
//            mvcHandler.executeService_dm_user(table);//ok

//             common模块对应的provider实现
//            mvcHandler.executeService_dm_common(table);//ok

        }
    }
}
package org.test;

import java.io.File;

import jxl.SheetSettings;
import jxl.Workbook;
import jxl.format.UnderlineStyle;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class TestExecl {

	/**
	 * @param args 你可以下载 打印 执行计划xls 这个执行计划表单可以让你的制作工程更加规范
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		   WritableWorkbook wwb = null;   
	            //首先要使用Workbook类的工厂方法创建一个可写入的工作薄(Workbook)对象   
	       wwb = Workbook.createWorkbook(new File("llll.xls"));
	        if(wwb!=null){   
	            //创建一个可写入的工作表   
	            //Workbook的createSheet方法有两个参数，第一个是工作表的名称，第二个是工作表在工作薄中的位置   
	            WritableSheet ws = wwb.createSheet("刘一江xxxx; prject", 0);  
	            SheetSettings sheetSettings = ws.getSettings();
	            sheetSettings.setPrintGridLines(true);
	            //ws.setColumnView(0, 50); // 设置列的宽度
	            ws.setRowView(0, 500);// 设置行的高度
	            ws.setColumnView(0, 30); // 设置列的宽度
	            ws.setColumnView(1, 30); // 设置列的宽度
	            ws.setRowView(2, 600); // 设置行的高度
	            ws.setColumnView(2, 30); // 设置行的高度
//	            ws.setColumnView(1, 30); // 设置列的宽度
//	            ws.setColumnView(2, 30); // 设置列的宽度
//	            ws.setRowView(6, 1000); // 设置行的高度
//	            ws.setRowView(4, 1000); // 设置行的高度
//	            ws.setRowView(5, 1000); // 设置行的高度
	            
	            WritableFont wf_table = new WritableFont(WritableFont.ARIAL, 8,  
		                WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE,  
		                jxl.format.Colour.BLACK); // 定义格式 字体 下划线 斜体 粗体 颜色  
	            
	            WritableCellFormat wcf_title = new WritableCellFormat(); // 单元格定义  
		        wcf_title.setAlignment(jxl.format.Alignment.RIGHT); // 设置对齐方式  
	            
//		        WritableCellFormat body_style = new WritableCellFormat(); // 单元格定义  
//		        wcf_title.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式  
		        
	            Label header = new Label(0, 0, "刘一江xxxx; prject");  
	            ws.addCell(header);
	            //下面开始添加单元格   
	            Label day = new Label(0, 1, "日期：2013-12-12");
	            Label ps = new Label(1, 1, "目标完成总进度的10%",wcf_title);
	            ws.addCell(day);
	            ws.addCell(ps);
	            
	            Label body = new Label(0, 2, "dawdawdadawdacascascacacacsac");
	            ws.addCell(body);
//	            
	            Label com = new Label(0, 3, "是否完成：    ",wcf_title);
	            ws.addCell(com);
	            
	            ws.mergeCells(0, 0, 2, 0); // 合并单元格  
	            ws.mergeCells(1, 1, 2, 1); // 合并单元格  
	            ws.mergeCells(0, 2, 2, 2); // 合并单元格  
	            ws.mergeCells(0, 3, 2, 3); // 合并单元格  
	            
	                wwb.write();   
	                //关闭资源，释放内存   
	                wwb.close();   
	        }   
	    }    
}

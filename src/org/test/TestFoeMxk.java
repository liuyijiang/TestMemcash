package org.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import jxl.SheetSettings;
import jxl.Workbook;
import jxl.format.UnderlineStyle;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class TestFoeMxk {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		List<UserProjectLogVO> list = new ArrayList<UserProjectLogVO>();
		UserProjectLogVO v1 = new UserProjectLogVO();
		v1.setExeTime("2012-12-22");
		v1.setLogbl(20.0);
		v1.setLoginfo("dasdasdadsadadasdadasd");
		list.add(v1);
		UserProjectLogVO v2 = new UserProjectLogVO();
		v2.setExeTime("2012-12-22");
		v2.setLogbl(20.0);
		v2.setLoginfo("dasdasdadsadadasdadasd");
		list.add(v2);
		UserProjectLogVO v3 = new UserProjectLogVO();
		v3.setExeTime("2012-12-22");
		v3.setLogbl(20.0);
		v3.setLoginfo("dasdasdadsadadasdadasd");
		list.add(v3);
		UserProjectLogVO v4 = new UserProjectLogVO();
		v4.setExeTime("2012-12-4");
		v4.setLogbl(40.0);
		v4.setLoginfo("dasdasdadsadadasdadasd");
		list.add(v4);
		UserProjectLogVO v5 = new UserProjectLogVO();
		v5.setExeTime("2012-12-25");
		v5.setLogbl(50.0);
		v5.setLoginfo("dasd555555555555555555555555555asdadsadadasdadasd");
		list.add(v5);
		UserProjectLogVO v6 = new UserProjectLogVO();
		v6.setExeTime("2012-12-26");
		v6.setLogbl(60.0);
		v6.setLoginfo("dasdasdad666666666sadadasdadasd");
		list.add(v6);
		WritableWorkbook wwb = null;
		if (list != null && !list.isEmpty()) {
			 WritableCellFormat style = new WritableCellFormat(); // 单元格定义 样式
			 style.setAlignment(jxl.format.Alignment.RIGHT);
			
			 WritableFont headerFont = new WritableFont(WritableFont.ARIAL, 16,  
		                WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE,  
		                jxl.format.Colour.BLACK); 
			 WritableCellFormat headerStyle = new WritableCellFormat(headerFont); // 单元格定义 样式
			 headerStyle.setAlignment(jxl.format.Alignment.CENTRE);
			 
			 WritableCellFormat bodyStyle = new WritableCellFormat(); // 单元格定义 样式
			 bodyStyle.setAlignment(jxl.format.Alignment.CENTRE);
			 
			 
			wwb = Workbook.createWorkbook(new File("llll222.xls"));
			WritableSheet ws = wwb.createSheet("hhhhhssss留意激昂", 0);
			SheetSettings sheetSettings = ws.getSettings();
			sheetSettings.setPrintGridLines(true);// 打印是显示网格
			Label header = new Label(0, 0, "刘一江xxxx; prject",headerStyle);  
	        ws.addCell(header);
			ws.setRowView(0, 500);// 设置行的高度
			ws.setColumnView(0, 30); // 设置列的宽度
			ws.mergeCells(0, 0, 4, 0); // 合并单元格
			int cell = 1;
			for (UserProjectLogVO vo : list) {
				int next = cell + 1;
				int nextn = cell + 2;
				Label day = new Label(0, cell, "日期：" + vo.getExeTime());
				Label ps = new Label(1, cell, "计划完成总进度的" + vo.getLogbl() + "%",
						style);
				Label body = new Label(0, next, vo.loginfo,bodyStyle);
				Label com = new Label(0, nextn, "是否完成：    ",style);
		        ws.addCell(com);
				
				ws.setRowView(next, 600); // 设置行的高度
				ws.setColumnView(next, 30); // 设置行的高度
				
				ws.addCell(day);
				ws.addCell(ps);
				ws.addCell(body);
				
				ws.mergeCells(1, cell, 4, cell); // 合并单元格
				ws.mergeCells(0, next, 4, next); // 合并单元格
				ws.mergeCells(0, nextn, 4, nextn); // 合并单元格
				cell = cell + 3;
			}
			Label root = new Label(0, cell, "好的计划可以帮助你更有效的开展工作 --@模范网");  
			ws.addCell(root);
			ws.setRowView(cell, 500);// 设置行的高度
			ws.mergeCells(0, cell, 4, cell); // 合并单元格
			wwb.write();
			wwb.close();
		}

	}

}

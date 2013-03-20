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
	 * @param args ��������� ��ӡ ִ�мƻ�xls ���ִ�мƻ�������������������̸��ӹ淶
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		   WritableWorkbook wwb = null;   
	            //����Ҫʹ��Workbook��Ĺ�����������һ����д��Ĺ�����(Workbook)����   
	       wwb = Workbook.createWorkbook(new File("llll.xls"));
	        if(wwb!=null){   
	            //����һ����д��Ĺ�����   
	            //Workbook��createSheet������������������һ���ǹ���������ƣ��ڶ����ǹ������ڹ������е�λ��   
	            WritableSheet ws = wwb.createSheet("��һ��xxxx; prject", 0);  
	            SheetSettings sheetSettings = ws.getSettings();
	            sheetSettings.setPrintGridLines(true);
	            //ws.setColumnView(0, 50); // �����еĿ��
	            ws.setRowView(0, 500);// �����еĸ߶�
	            ws.setColumnView(0, 30); // �����еĿ��
	            ws.setColumnView(1, 30); // �����еĿ��
	            ws.setRowView(2, 600); // �����еĸ߶�
	            ws.setColumnView(2, 30); // �����еĸ߶�
//	            ws.setColumnView(1, 30); // �����еĿ��
//	            ws.setColumnView(2, 30); // �����еĿ��
//	            ws.setRowView(6, 1000); // �����еĸ߶�
//	            ws.setRowView(4, 1000); // �����еĸ߶�
//	            ws.setRowView(5, 1000); // �����еĸ߶�
	            
	            WritableFont wf_table = new WritableFont(WritableFont.ARIAL, 8,  
		                WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE,  
		                jxl.format.Colour.BLACK); // �����ʽ ���� �»��� б�� ���� ��ɫ  
	            
	            WritableCellFormat wcf_title = new WritableCellFormat(); // ��Ԫ����  
		        wcf_title.setAlignment(jxl.format.Alignment.RIGHT); // ���ö��뷽ʽ  
	            
//		        WritableCellFormat body_style = new WritableCellFormat(); // ��Ԫ����  
//		        wcf_title.setAlignment(jxl.format.Alignment.CENTRE); // ���ö��뷽ʽ  
		        
	            Label header = new Label(0, 0, "��һ��xxxx; prject");  
	            ws.addCell(header);
	            //���濪ʼ��ӵ�Ԫ��   
	            Label day = new Label(0, 1, "���ڣ�2013-12-12");
	            Label ps = new Label(1, 1, "Ŀ������ܽ��ȵ�10%",wcf_title);
	            ws.addCell(day);
	            ws.addCell(ps);
	            
	            Label body = new Label(0, 2, "dawdawdadawdacascascacacacsac");
	            ws.addCell(body);
//	            
	            Label com = new Label(0, 3, "�Ƿ���ɣ�    ",wcf_title);
	            ws.addCell(com);
	            
	            ws.mergeCells(0, 0, 2, 0); // �ϲ���Ԫ��  
	            ws.mergeCells(1, 1, 2, 1); // �ϲ���Ԫ��  
	            ws.mergeCells(0, 2, 2, 2); // �ϲ���Ԫ��  
	            ws.mergeCells(0, 3, 2, 3); // �ϲ���Ԫ��  
	            
	                wwb.write();   
	                //�ر���Դ���ͷ��ڴ�   
	                wwb.close();   
	        }   
	    }    
}

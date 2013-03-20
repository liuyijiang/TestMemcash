package org.test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import jxl.Workbook;
import jxl.format.UnderlineStyle;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class TestEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("/yyyy-MM-dd/");  
	    String datePath = sdf.format(new Date());  
	    datePath = "�й�ʯ�������ܵ����������ӵ����ĵ�" + datePath;  
	    // �����ļ���  
	    try {  
	        WritableWorkbook wwb = Workbook.createWorkbook(new File(  
	                "pp.xls"));  
	  
	        WritableSheet sheet1= wwb.createSheet("ǰ���վ��", 0);  
//	        WritableSheet sheet2 = wwb.createSheet("������վ��", 1);  
//	        WritableSheet sheet3 = wwb.createSheet("������վ��", 2);  
	          
	        sheet1.setColumnView(0, 30); // �����еĿ��  
	        sheet1.setColumnView(1, 30); // �����еĿ��  
	        sheet1.setColumnView(2, 30); // �����еĿ��  
	        sheet1.setColumnView(3, 30); // �����еĿ��  
	        sheet1.setColumnView(4, 30); // �����еĿ��  
	        sheet1.setColumnView(5, 30); // �����еĿ��  
	          
	        sheet1.setRowView(0, 1000); // �����еĸ߶�  
	        sheet1.setRowView(1, 500); // �����еĸ߶�  
	          
	        /** 
	         * ���嵥Ԫ����ʽ 
	         */  
	        WritableFont wf_title = new WritableFont(WritableFont.ARIAL, 20,  
	                WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE,  
	                jxl.format.Colour.RED); // �����ʽ ���� �»��� б�� ���� ��ɫ  
	        WritableFont wf_head = new WritableFont(WritableFont.ARIAL, 10,  
	                WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE,  
	                jxl.format.Colour.GREEN); // �����ʽ ���� �»��� б�� ���� ��ɫ  
	        WritableFont wf_table = new WritableFont(WritableFont.ARIAL, 8,  
	                WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE,  
	                jxl.format.Colour.BLACK); // �����ʽ ���� �»��� б�� ���� ��ɫ  
	      
	        WritableCellFormat wcf_title = new WritableCellFormat(wf_title); // ��Ԫ����  
	        wcf_title.setBackground(jxl.format.Colour.BLACK); // ���õ�Ԫ��ı�����ɫ  
	        wcf_title.setAlignment(jxl.format.Alignment.CENTRE); // ���ö��뷽ʽ  
	      
	        WritableCellFormat wcf_head = new WritableCellFormat(wf_head);   
	        wcf_head.setBackground(jxl.format.Colour.BLACK);  
	        wcf_head.setAlignment(jxl.format.Alignment.CENTRE);   
	      
	        WritableCellFormat wcf_table = new WritableCellFormat(wf_table);   
	        wcf_table.setBackground(jxl.format.Colour.BLACK);   
	        wcf_table.setAlignment(jxl.format.Alignment.CENTRE);   
	          
	        /** 
	         * ʹ����ʽ�ĵ�Ԫ�� 
	         */  
	        // 1.���Label��������������˼�����У��У�ֵ��  
	        sheet1.addCell(new Label(0, 0, "����", wcf_title)); // ��ͨ�Ĵ��ж����ʽ�ĵ�Ԫ��  
	        sheet1.addCell(new Label(0, 1, "��ͷ1", wcf_head));  
	        sheet1.addCell(new Label(1, 1, "��ͷ2", wcf_head));  
	        sheet1.addCell(new Label(2, 1, "��ͷ3", wcf_head));  
	        sheet1.addCell(new Label(3, 1, "��ͷ4", wcf_head));  
	        sheet1.addCell(new Label(4, 1, "��ͷ5", wcf_head));  
	        sheet1.addCell(new Label(5, 1, "��ͷ6", wcf_head));  
	          
	        sheet1.mergeCells(0, 0, 5, 0); // �ϲ���Ԫ��  
	          
	  
	          
	  
	        // д��Exel������  
	        wwb.write();  
	        // �ر�Excel����������  
	        wwb.close();  
	          
	  
	    } catch (Exception e) {  
	        e.printStackTrace();  
	    }  
	      
	}  

}

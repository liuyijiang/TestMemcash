package org.test;

public class UserProjectLogVO {

	public String id;
	public String projectid;
	public String loginfo;
	public String createTime;
	public String exeTime;// ִ��ʱ��
	public String userid;

	public double logbl;// �ƻ�����ܼƻ��ı���
	public String workstutic;// ״̬ ������ɵ�����
	public String logfback;// ��� f bcak
	private double fbackbl;// ʵ������ܼƻ��ı���

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProjectid() {
		return projectid;
	}

	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}

	public String getLoginfo() {
		return loginfo;
	}

	public void setLoginfo(String loginfo) {
		this.loginfo = loginfo;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getExeTime() {
		return exeTime;
	}

	public void setExeTime(String exeTime) {
		this.exeTime = exeTime;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public double getLogbl() {
		return logbl;
	}

	public void setLogbl(double logbl) {
		this.logbl = logbl;
	}

	public String getWorkstutic() {
		return workstutic;
	}

	public void setWorkstutic(String workstutic) {
		this.workstutic = workstutic;
	}

	public String getLogfback() {
		return logfback;
	}

	public void setLogfback(String logfback) {
		this.logfback = logfback;
	}

	public double getFbackbl() {
		return fbackbl;
	}

	public void setFbackbl(double fbackbl) {
		this.fbackbl = fbackbl;
	}

}

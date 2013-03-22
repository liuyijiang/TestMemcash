package org.test;

public class UserProjectLogVO {

	public String id;
	public String projectid;
	public String loginfo;
	public String createTime;
	public String exeTime;// 执行时间
	public String userid;

	public double logbl;// 计划完成总计划的比例
	public String workstutic;// 状态 今天完成的评级
	public String logfback;// 完成 f bcak
	private double fbackbl;// 实际完成总计划的比例

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

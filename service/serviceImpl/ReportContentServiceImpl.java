package cn.edu.bjtu.weibo.service.impl;

import cn.edu.bjtu.weibo.dao.ReportDAO;
import cn.edu.bjtu.weibo.dao.impl.ReportDAOImpl;
import cn.edu.bjtu.weibo.service.ReportContentService;

public class ReportContentServiceImpl implements ReportContentService{
	public boolean reportWeibo(String userId, String weiboId) {
		ReportDAO reportDao=new ReportDAOImpl();
		if(reportDao.ReportWeibo(weiboId, userId)){
			return true;
		}
		return false;
	}

	public boolean reportComment(String userId, String commentId) {
		return true;
	}
}

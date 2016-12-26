package cn.edu.bjtu.weibo.service.impl;

import cn.edu.bjtu.weibo.dao.ReportDAO;
import cn.edu.bjtu.weibo.service.ReportContentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportContentServiceImpl implements ReportContentService{
	@Autowired
	ReportDAO reportDAO;
	
	public boolean reportWeibo(String userId, String weiboId) {
		if(reportDAO.ReportWeibo(weiboId, userId)){
			return true;
		}
		return false;
	}

	public boolean reportComment(String userId, String commentId) {
		if(reportDAO.ReportComment(userId, commentId)){
			return true;
		}
		return false;
	}
}

package com.ssd.efoot.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssd.efoot.domain.Account;
import com.ssd.efoot.domain.GroupBuying;

public interface ShareMapper {
	GroupBuying getGroupBuying(@Param("gbid") String gbId);
	List<GroupBuying> getGroupBuyingList(); /* ���� ���� �������� ��� ��ȯ*/
	List<GroupBuying> getGroupBuyingListByHeader(String userId); /*����ڰ� �����ϴ� �������� ��� ��ȯ*/
	List<Account> getApplyerOfGroupBuying(String gbId); /*�ش� ���������� ��û�� ��� ��ȯ*/
	List<GroupBuying> getMyGroupBuying(String userId);  /*�ش� ����ڰ� ��û�� �������� ��� ��ȯ*/
	
	void insertGroupBuying(GroupBuying gb);
	void updateGroupBuying(GroupBuying gb);
	void deleteGroupBuying(String gbId);
	
	void applyGroupBuying(String gbId, String userId); /* �ش� ����ڰ� �ش� �������Ÿ� ��û */
	void cancelApplyGroupBuying(String gbId, String userId); /* �ش� �������Ÿ� ��û�ߴ� �ش� ����ڰ� ��û�� ��� */
}

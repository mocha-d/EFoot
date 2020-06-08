package com.ssd.efoot.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssd.efoot.domain.GroupBuying;
import com.ssd.efoot.domain.Account;

/*DAO메소드들을 모두 표현 */
public interface GroupBuyingMapper { 
	
	GroupBuying getGroupBuying(@Param("gbid") String gbId);
	List<GroupBuying> getGroupBuyingList(); /* 진행 중인 공동구매 목록 반환*/
	List<GroupBuying> getGroupBuyingListByHeader(String userId); /*사용자가 진행하는 공동구매 목록 반환*/
	List<Account> getApplyerOfGroupBuying(String gbId); /*해당 공동구매의 신청자 목록 반환*/
	List<GroupBuying> getMyGroupBuying(String userId);  /*해당 사용자가 신청한 공동구매 목록 반환*/
	
	void insertGroupBuying(GroupBuying gb);
	void updateGroupBuying(GroupBuying gb);
	void deleteGroupBuying(String gbId);
	
	void applyGroupBuying(String gbId, String userId); /* 해당 사용자가 해당 공동구매를 신청 */
	void cancelApplyGroupBuying(String gbId, String userId); /* 해당 공동구매를 신청했던 해당 사용자가 신청을 취소 */

}

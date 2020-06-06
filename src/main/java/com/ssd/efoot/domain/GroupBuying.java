package com.ssd.efoot.domain;

import java.util.Date;
import java.util.List;

public class GroupBuying {
	private String gbId;
	private String userId;
	private int count;
	private Date deadLind;
	private String place;
	private String comment;
	private String gbName;
	private List<Account> gbApplyer;
	private Item item;
	private Date timestamp;
	public String getGbId() {
		return gbId;
	}
	public void setGbId(String gbId) {
		this.gbId = gbId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Date getDeadLind() {
		return deadLind;
	}
	public void setDeadLind(Date deadLind) {
		this.deadLind = deadLind;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getGbName() {
		return gbName;
	}
	public void setGbName(String gbName) {
		this.gbName = gbName;
	}
	public List<Account> getGbApplyer() {
		return gbApplyer;
	}
	public void setGbApplyer(List<Account> gbApplyer) {
		this.gbApplyer = gbApplyer;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	

	
}

package com.ssd.efoot.controller;

import java.io.Serializable;
import org.springframework.beans.support.PagedListHolder;

import com.ssd.efoot.domain.Account;
import com.ssd.efoot.domain.Product;

/**
 * @author Juergen Hoeller
 * @since 30.11.2003
 */
@SuppressWarnings("serial")
public class UserSession implements Serializable {

	private Account account;

	private PagedListHolder<Product> myList;

	public UserSession(Account account) {
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

	public void setMyList(PagedListHolder<Product> myList) {
		this.myList = myList;
	}

	public PagedListHolder<Product> getMyList() {
		return myList;
	}
}

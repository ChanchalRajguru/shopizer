package com.salesmanager.shop.model.content.page;

import com.salesmanager.core.model.content.ContentType;
import com.salesmanager.shop.model.content.common.Content;

public class ReadableContentPage extends Content {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean isDisplayedInMenu;
	private String path;
	
	public ReadableContentPage() {
		super.setContentType(ContentType.PAGE.name());
	}

	public boolean isDisplayedInMenu() {
		return isDisplayedInMenu;
	}

	public void setDisplayedInMenu(boolean isDisplayedInMenu) {
		this.isDisplayedInMenu = isDisplayedInMenu;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}

package com.javademo.pageuis;

import com.javademo.common.BasePageUI;
import com.javademo.common.CommonUIBean;

import macaca.client.common.GetElementWay;

public class BaiDuPageUI extends BasePageUI{

	public static final CommonUIBean SEARCH_FIELD = new CommonUIBean(GetElementWay.CLASS_NAME, "android.widget.EditText",GetElementWay.CLASS_NAME,"TextField", "搜索框");
	public static final CommonUIBean SEARCH_BTN = new CommonUIBean(GetElementWay.CLASS_NAME, "android.widget.Button",GetElementWay.NAME,"百度一下", "搜索按钮");
}
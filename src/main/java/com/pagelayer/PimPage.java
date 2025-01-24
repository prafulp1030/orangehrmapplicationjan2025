package com.pagelayer;

import com.baselayer.BaseClass;

public class PimPage extends BaseClass{

	public String valdiatePimPageURL()
	{
		return driver.getCurrentUrl();
	}
}

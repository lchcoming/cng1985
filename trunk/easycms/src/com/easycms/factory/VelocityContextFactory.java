package com.easycms.factory;

import org.apache.velocity.VelocityContext;

public class VelocityContextFactory {
	public static VelocityContext creteDefault() {
		VelocityContext context = new VelocityContext();
		context.put("title", "西安宝亿电子");
		context.put("telone", "029-868954566");
		context.put("WebEmail", "029-868954566");
		context.put("WebEmailName", "客服邮箱");
		context.put("WebCopyright", "Copyright © 2008 - 2010 SongCMS. All Rights Reserved. SongCMS Version 3.x");
		return context;
	}
}

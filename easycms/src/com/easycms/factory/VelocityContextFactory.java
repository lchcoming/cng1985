package com.easycms.factory;

import org.apache.velocity.VelocityContext;

public class VelocityContextFactory {
	public static VelocityContext creteDefault() {
		VelocityContext context = new VelocityContext();
		context.put("title", "西安宝亿电子");
		context.put("telone", "029-868954566");
		
		return context;
	}
}

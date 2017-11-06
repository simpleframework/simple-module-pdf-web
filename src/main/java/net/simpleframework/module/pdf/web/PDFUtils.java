package net.simpleframework.module.pdf.web;

import net.simpleframework.common.Base64;
import net.simpleframework.common.StringUtils;
import net.simpleframework.common.web.HttpUtils;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         https://github.com/simpleframework
 *         http://www.simpleframework.net
 */
public abstract class PDFUtils {

	public static String getViewerUrl(final String file, final boolean inline) {
		final StringBuilder sb = new StringBuilder("/pdf/viewer?file=");
		if (StringUtils.hasText(file)) {
			sb.append(HttpUtils.encodeUrl(Base64.encodeToString(file)));
		}
		if (inline) {
			sb.append("&inline=true");
		}
		return sb.toString();
	}
}

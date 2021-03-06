package net.simpleframework.module.pdf.web;

import net.simpleframework.ctx.common.bean.AttachmentFile;
import net.simpleframework.module.pdf.PDFRef;
import net.simpleframework.mvc.PageParameter;
import net.simpleframework.mvc.common.DownloadUtils;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         https://github.com/simpleframework
 *         http://www.simpleframework.net
 */
public class PDFWebRef extends PDFRef {

	public String getPreviewUrl(final PageParameter pp, final AttachmentFile pdf) {
		final String durl = DownloadUtils.getDownloadHref(pdf, null, true, null);
		return PDFUtils.getViewerUrl(durl, false, pdf.getTopic());
	}
}

package net.simpleframework.module.pdf.web.page;

import java.util.Collection;
import java.util.Map;

import net.simpleframework.common.StringUtils;
import net.simpleframework.common.coll.KVMap;
import net.simpleframework.common.web.HttpUtils;
import net.simpleframework.mvc.PageMapping;
import net.simpleframework.mvc.PageParameter;
import net.simpleframework.mvc.common.element.Meta;
import net.simpleframework.mvc.template.AbstractTemplatePage;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         https://github.com/simpleframework
 *         http://www.simpleframework.net
 */
@PageMapping(url = "/pdf/viewer")
public class PDFViewerPage extends AbstractTemplatePage {
	@Override
	public void onHttpRequestMeta(final PageParameter pp, final Collection<Meta> coll) {
	}

	@Override
	public Map<String, Object> createVariables(final PageParameter pp) {
		String url = url(PDFViewerFramePage.class,
				"file=" + HttpUtils.encodeUrl(StringUtils.blank(pp.getParameter("file"))));
		url = HttpUtils.addParameters(url, "hideToolbar=" + pp.getBoolParameter("hideToolbar"));
		return ((KVMap) super.createVariables(pp)).add("mobile", pp.isMobile()).add("viewerUrl", url);
	}
}

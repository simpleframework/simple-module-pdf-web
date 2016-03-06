package net.simpleframework.module.pdf.web.page;

import java.util.Map;

import net.simpleframework.common.coll.KVMap;
import net.simpleframework.mvc.PageParameter;
import net.simpleframework.mvc.template.AbstractTemplatePage;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885) https://github.com/simpleframework
 *         http://www.simpleframework.net
 */
public class PDFViewerFramePage extends AbstractTemplatePage {

	@Override
	protected void onForward(final PageParameter pp) throws Exception {
		super.onForward(pp);

		pp.addImportCSS(PDFViewerFramePage.class, "/viewer.css");
	}

	@Override
	public Map<String, Object> createVariables(final PageParameter pp) {
		return ((KVMap) super.createVariables(pp))
				.add("rpath", pp.getResourceHomePath(PDFViewerFramePage.class))
				.add("csspath", pp.getCssResourceHomePath(PDFViewerFramePage.class));
	}

	@Override
	public void onHttpRequestCSS(final PageParameter pp, final StringBuilder sb) {
		sb.setLength(0);
	}

	@Override
	public String[] getDefaultCssPath(final PageParameter pp) {
		return NULL_ARR;
	}

	@Override
	public String[] getDefaultJavascriptPath(final PageParameter pp) {
		return NULL_ARR;
	}
}

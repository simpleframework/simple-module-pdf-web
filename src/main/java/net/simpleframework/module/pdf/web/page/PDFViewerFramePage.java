package net.simpleframework.module.pdf.web.page;

import static net.simpleframework.common.I18n.$m;

import java.util.Map;

import net.simpleframework.common.coll.KVMap;
import net.simpleframework.mvc.PageParameter;
import net.simpleframework.mvc.common.element.LinkElement;
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
				.add("csspath", pp.getCssResourceHomePath(PDFViewerFramePage.class))
				.add("homeLink",
						new LinkElement($m("LinkElement.0")).addStyle(
								"font-size: 9pt; color:#fff; text-decoration: none; margin: 8px 4px 0 0;")
								.setOnclick("parent.$Actions.loc('" + settings.getFilterPath() + "');"));
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

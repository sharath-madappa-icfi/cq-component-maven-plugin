package com.citytechinc.cq.component.dialog.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.citytechinc.cq.component.annotations.config.Widget;
import com.citytechinc.cq.component.annotations.widgets.Selection;
import com.citytechinc.cq.component.dialog.AbstractWidget;
import com.citytechinc.cq.component.dialog.DialogElement;
import com.citytechinc.cq.component.dialog.maker.impl.SelectionWidgetMaker;

@Widget(annotationClass =Selection.class, makerClass =SelectionWidgetMaker.class, xtypes = SelectionWidget.XTYPE)
public class SelectionWidget extends AbstractWidget {

	public static final String XTYPE = "selection";
	private static final String PRIMARY_TYPE = "cq:Widget";
	private final String type;

	public SelectionWidget(String type, String name, String fieldLabel, String fieldName, String fieldDescription,
		Boolean required, boolean hideLabel, String defaultValue, Map<String, String> additionalProperties,
		List<DialogElement> options) {
		super(XTYPE, fieldLabel, fieldDescription, !required, hideLabel, defaultValue, name, PRIMARY_TYPE, null,
			fieldName, additionalProperties, Arrays.asList(new DialogElement[] { new WidgetCollection(options,
				"options") }));
		this.type = type;
	}

	public String getType() {
		return type;
	}
}

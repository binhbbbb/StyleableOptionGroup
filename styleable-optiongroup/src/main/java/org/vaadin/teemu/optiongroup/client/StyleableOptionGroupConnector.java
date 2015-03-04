package org.vaadin.teemu.optiongroup.client;

import org.vaadin.teemu.optiongroup.StyleableOptionGroup;

import com.vaadin.client.ui.optiongroup.OptionGroupConnector;
import com.vaadin.shared.ui.Connect;

@Connect(StyleableOptionGroup.class)
public class StyleableOptionGroupConnector extends OptionGroupConnector {

    @Override
    public StyleableOptionGroupWidget getWidget() {
        return (StyleableOptionGroupWidget) super.getWidget();
    }

}

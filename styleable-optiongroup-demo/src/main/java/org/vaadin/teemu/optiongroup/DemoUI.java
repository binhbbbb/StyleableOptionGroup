package org.vaadin.teemu.optiongroup;

import javax.servlet.annotation.WebServlet;

import org.vaadin.addons.StyleableOptionGroup;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@Theme("demo")
@Title("StyleableOptionGroup Add-on Demo")
@SuppressWarnings("serial")
public class DemoUI extends UI {

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = DemoUI.class, widgetset = "org.vaadin.teemu.optiongroup.DemoWidgetSet")
    public static class Servlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest request) {
        final StyleableOptionGroup radioButtons = new StyleableOptionGroup();
        radioButtons.addItem("red");
        radioButtons.addItem("green");
        radioButtons.addItem("blue");
        radioButtons.setItemStyleName("red", "red");
        radioButtons.setItemStyleName("green", "green");
        radioButtons.setItemStyleName("blue", "blue");
        radioButtons.setValue("red");
        radioButtons.addStyleName(ValoTheme.OPTIONGROUP_LARGE);

        final StyleableOptionGroup checkboxes = new StyleableOptionGroup();
        checkboxes.addItem("red");
        checkboxes.addItem("green");
        checkboxes.addItem("blue");
        checkboxes.setItemStyleName("red", "red");
        checkboxes.setItemStyleName("green", "green");
        checkboxes.setItemStyleName("blue", "blue");
        checkboxes.setValue("red");
        checkboxes.setMultiSelect(true);
        checkboxes.addStyleName(ValoTheme.OPTIONGROUP_LARGE);

        // Show it in the middle of the screen
        HorizontalLayout wrapper = new HorizontalLayout(radioButtons,
                checkboxes);
        wrapper.setSpacing(true);
        final VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();
        layout.addComponent(wrapper);
        layout.setComponentAlignment(wrapper, Alignment.MIDDLE_CENTER);
        setContent(layout);

    }

}

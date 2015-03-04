package org.vaadin.teemu.optiongroup;

import java.util.HashMap;
import java.util.Map;

import com.vaadin.server.PaintException;
import com.vaadin.server.PaintTarget;
import com.vaadin.ui.OptionGroup;

/**
 * Extends the {@link OptionGroup} by providing style names for items.
 */
public class StyleableOptionGroup extends OptionGroup {

    private final Map<Object, String> itemStyles = new HashMap<Object, String>();

    @Override
    protected void paintItem(PaintTarget target, Object itemId)
            throws PaintException {
        super.paintItem(target, itemId);

        String itemStyle = getItemStyleName(itemId);
        if (itemStyle != null && itemStyle.length() > 0) {
            target.addAttribute("style", itemStyle);
        }
    }

    public String getItemStyleName(Object itemId) {
        return itemStyles.get(itemId);
    }

    public void setItemStyleName(Object itemId, String styleName) {
        itemStyles.put(itemId, styleName);
    }

}

package org.vaadin.teemu.optiongroup.client;

import java.util.Iterator;

import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.UIDL;
import com.vaadin.client.ui.VOptionGroup;

public class StyleableOptionGroupWidget extends VOptionGroup {

    @Override
    public void buildOptions(UIDL uidl) {
        super.buildOptions(uidl);

        // Update styles.
        final Iterator<?> it = uidl.getChildIterator();
        for (Widget op : panel) {
            final UIDL opUidl = (UIDL) it.next();

            String opStyle = opUidl.getStringAttribute("style");
            if (opStyle != null) {
                op.addStyleName(opStyle);
            }
        }
    }

}

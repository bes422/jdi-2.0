package com.epam.jdi.uitests.core.actions.common;

/**
 * Created by Roman Iovlev on 14.02.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import com.epam.jdi.tools.func.JFunc1;

public abstract class LinkActions {
    // () -> element.getAttribute("href") -> String
    public static JFunc1<Object, String> getRef;
    // () -> element.getAlt() -> String
    public static JFunc1<Object, String> getTooltip;
}

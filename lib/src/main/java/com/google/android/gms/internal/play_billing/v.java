package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class v {
    static int a(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}

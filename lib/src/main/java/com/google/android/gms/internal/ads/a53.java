package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class a53 {
    static boolean a(Collection collection, Object obj) {
        Objects.requireNonNull(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
abstract class v43 implements Map.Entry {
    v43() {
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (d33.a(getKey(), entry.getKey()) && d33.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public abstract Object getKey();

    @Override // java.util.Map.Entry
    public abstract Object getValue();

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return String.valueOf(getKey()) + "=" + String.valueOf(getValue());
    }
}

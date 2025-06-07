package com.google.android.material.internal;

import android.widget.Checkable;

/* loaded from: classes.dex */
public interface h extends Checkable {

    public interface a {
        void a(Object obj, boolean z10);
    }

    int getId();

    void setInternalOnCheckedChangeListener(a aVar);
}

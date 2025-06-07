package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    final List f19387a = new ArrayList();

    protected x() {
    }

    public abstract q a(String str, r4 r4Var, List list);

    final q b(String str) {
        if (this.f19387a.contains(s5.e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}

package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class e33 implements Serializable {
    e33() {
    }

    public static e33 c() {
        return l23.f11307m;
    }

    public static e33 d(Object obj) {
        return obj == null ? l23.f11307m : new n33(obj);
    }

    public abstract e33 a(w23 w23Var);

    public abstract Object b(Object obj);
}

package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class f7 {
    public static b7 a(b7 b7Var) {
        return ((b7Var instanceof d7) || (b7Var instanceof c7)) ? b7Var : b7Var instanceof Serializable ? new c7(b7Var) : new d7(b7Var);
    }

    public static b7 b(Object obj) {
        return new e7(obj);
    }
}

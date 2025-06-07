package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class m33 {
    public static j33 a(j33 j33Var, j33 j33Var2) {
        Objects.requireNonNull(j33Var);
        Objects.requireNonNull(j33Var2);
        return new l33(Arrays.asList(j33Var, j33Var2), null);
    }
}

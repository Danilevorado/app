package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class u53 {
    static int a(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    static int b(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}

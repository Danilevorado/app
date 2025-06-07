package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class q63 {
    public static ArrayList a(int i10) {
        y43.a(i10, "initialArraySize");
        return new ArrayList(i10);
    }

    public static List b(List list, w23 w23Var) {
        return new p63(list, w23Var);
    }
}

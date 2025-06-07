package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class z34 {
    static HashSet a(int i10) {
        return new HashSet(d(i10));
    }

    public static LinkedHashMap b(int i10) {
        return new LinkedHashMap(d(i10));
    }

    public static List c(int i10) {
        return i10 == 0 ? Collections.emptyList() : new ArrayList(i10);
    }

    private static int d(int i10) {
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}

package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class u40 {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet f16161a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private static String f16162b = "media3.common";

    public static synchronized String a() {
        return f16162b;
    }

    public static synchronized void b(String str) {
        if (f16161a.add(str)) {
            f16162b = f16162b + ", " + str;
        }
    }
}

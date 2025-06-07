package com.google.firebase.messaging;

import java.util.Locale;

/* loaded from: classes.dex */
public final class r0 extends Exception {

    /* renamed from: m, reason: collision with root package name */
    private final int f21564m;

    r0(String str) {
        super(str);
        this.f21564m = a(str);
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        switch (lowerCase) {
        }
        return 0;
    }
}

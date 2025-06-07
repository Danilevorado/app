package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.view.g0;
import androidx.core.view.i0;

/* loaded from: classes.dex */
public abstract class d {
    public static void a(Window window, boolean z10, Integer num, Integer num2) {
        boolean z11 = num == null || num.intValue() == 0;
        boolean z12 = num2 == null || num2.intValue() == 0;
        if (z11 || z12) {
            int iB = i5.a.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z11) {
                num = Integer.valueOf(iB);
            }
            if (z12) {
                num2 = Integer.valueOf(iB);
            }
        }
        g0.b(window, !z10);
        int iC = c(window.getContext(), z10);
        int iB2 = b(window.getContext(), z10);
        window.setStatusBarColor(iC);
        window.setNavigationBarColor(iB2);
        boolean zD = d(iC, i5.a.f(num.intValue()));
        boolean zD2 = d(iB2, i5.a.f(num2.intValue()));
        i0 i0VarA = g0.a(window, window.getDecorView());
        if (i0VarA != null) {
            i0VarA.b(zD);
            i0VarA.a(zD2);
        }
    }

    private static int b(Context context, boolean z10) {
        if (z10 && Build.VERSION.SDK_INT < 27) {
            return androidx.core.graphics.a.j(i5.a.b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z10) {
            return 0;
        }
        return i5.a.b(context, R.attr.navigationBarColor, -16777216);
    }

    private static int c(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return i5.a.b(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean d(int i10, boolean z10) {
        return i5.a.f(i10) || (i10 == 0 && z10);
    }
}

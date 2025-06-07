package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f1385a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    static final int[] f1386b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f1387c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f1388d = {R.attr.state_activated};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f1389e = {R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f1390f = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f1391g = {R.attr.state_selected};

    /* renamed from: h, reason: collision with root package name */
    static final int[] f1392h = {-16842919, -16842908};

    /* renamed from: i, reason: collision with root package name */
    static final int[] f1393i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f1394j = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f.j.f23545y0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(f.j.D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList colorStateListE = e(context, i10);
        if (colorStateListE != null && colorStateListE.isStateful()) {
            return colorStateListE.getColorForState(f1386b, colorStateListE.getDefaultColor());
        }
        TypedValue typedValueF = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueF, true);
        return d(context, i10, typedValueF.getFloat());
    }

    public static int c(Context context, int i10) {
        int[] iArr = f1394j;
        iArr[0] = i10;
        z0 z0VarU = z0.u(context, null, iArr);
        try {
            return z0VarU.b(0, 0);
        } finally {
            z0VarU.w();
        }
    }

    static int d(Context context, int i10, float f5) {
        return androidx.core.graphics.a.j(c(context, i10), Math.round(Color.alpha(r0) * f5));
    }

    public static ColorStateList e(Context context, int i10) {
        int[] iArr = f1394j;
        iArr[0] = i10;
        z0 z0VarU = z0.u(context, null, iArr);
        try {
            return z0VarU.c(0);
        } finally {
            z0VarU.w();
        }
    }

    private static TypedValue f() {
        ThreadLocal threadLocal = f1385a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}

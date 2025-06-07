package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements androidx.lifecycle.l {

    /* renamed from: b, reason: collision with root package name */
    private static int f346b;

    /* renamed from: c, reason: collision with root package name */
    private static Field f347c;

    /* renamed from: d, reason: collision with root package name */
    private static Field f348d;

    /* renamed from: e, reason: collision with root package name */
    private static Field f349e;

    /* renamed from: a, reason: collision with root package name */
    private Activity f350a;

    ImmLeaksCleaner(Activity activity) {
        this.f350a = activity;
    }

    private static void h() throws NoSuchFieldException {
        try {
            f346b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f348d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f349e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f347c = declaredField3;
            declaredField3.setAccessible(true);
            f346b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.l
    public void d(n nVar, j.b bVar) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (bVar != j.b.ON_DESTROY) {
            return;
        }
        if (f346b == 0) {
            h();
        }
        if (f346b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f350a.getSystemService("input_method");
            try {
                Object obj = f347c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f348d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f349e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (ClassCastException unused2) {
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}

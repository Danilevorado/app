package androidx.core.text;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static Method f2340a;

    static class a {
        static String a(Locale locale) {
            return locale.getScript();
        }
    }

    /* renamed from: androidx.core.text.b$b, reason: collision with other inner class name */
    static class C0030b {
        static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f2340a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e5) {
                throw new IllegalStateException(e5);
            }
        }
    }

    public static String a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0030b.c(C0030b.a(C0030b.b(locale)));
        }
        try {
            return a.a((Locale) f2340a.invoke(null, locale));
        } catch (IllegalAccessException | InvocationTargetException e5) {
            Log.w("ICUCompat", e5);
            return a.a(locale);
        }
    }
}

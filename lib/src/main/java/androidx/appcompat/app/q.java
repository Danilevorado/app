package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private static Field f589a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f590b;

    /* renamed from: c, reason: collision with root package name */
    private static Class f591c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f592d;

    /* renamed from: e, reason: collision with root package name */
    private static Field f593e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f594f;

    /* renamed from: g, reason: collision with root package name */
    private static Field f595g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f596h;

    static class a {
        static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    static void a(Resources resources) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        if (i10 >= 24) {
            c(resources);
        } else {
            b(resources);
        }
    }

    private static void b(Resources resources) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (!f590b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f589a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e5);
            }
            f590b = true;
        }
        Object obj = null;
        Field field = f589a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e10);
            }
        }
        if (obj == null) {
            return;
        }
        d(obj);
    }

    private static void c(Resources resources) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Object obj;
        if (!f596h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f595g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e5);
            }
            f596h = true;
        }
        Field field = f595g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e10) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e10);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f590b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f589a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e11);
            }
            f590b = true;
        }
        Field field2 = f589a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e12);
            }
        }
        if (obj2 != null) {
            d(obj2);
        }
    }

    private static void d(Object obj) throws NoSuchFieldException {
        if (!f592d) {
            try {
                f591c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e5) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e5);
            }
            f592d = true;
        }
        Class cls = f591c;
        if (cls == null) {
            return;
        }
        if (!f594f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f593e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e10);
            }
            f594f = true;
        }
        Field field = f593e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e11);
        }
        if (longSparseArray != null) {
            a.a(longSparseArray);
        }
    }
}

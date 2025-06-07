package pl.droidsonroids.gif;

import android.content.Context;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static Context f26010a;

    private static Context a() {
        if (f26010a == null) {
            try {
                f26010a = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e5) {
                throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e5);
            }
        }
        return f26010a;
    }

    static void b() {
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            dc.c.a(a(), "pl_droidsonroids_gif");
        }
    }
}

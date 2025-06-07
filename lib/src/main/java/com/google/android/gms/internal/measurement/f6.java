package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* loaded from: classes.dex */
final class f6 implements c6 {

    /* renamed from: c, reason: collision with root package name */
    private static f6 f18940c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f18941a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentObserver f18942b;

    private f6() {
        this.f18941a = null;
        this.f18942b = null;
    }

    private f6(Context context) {
        this.f18941a = context;
        e6 e6Var = new e6(this, null);
        this.f18942b = e6Var;
        context.getContentResolver().registerContentObserver(r5.f19246a, true, e6Var);
    }

    static f6 a(Context context) {
        f6 f6Var;
        synchronized (f6.class) {
            if (f18940c == null) {
                f18940c = androidx.core.content.c.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new f6(context) : new f6();
            }
            f6Var = f18940c;
        }
        return f6Var;
    }

    static synchronized void d() {
        Context context;
        f6 f6Var = f18940c;
        if (f6Var != null && (context = f6Var.f18941a) != null && f6Var.f18942b != null) {
            context.getContentResolver().unregisterContentObserver(f18940c.f18942b);
        }
        f18940c = null;
    }

    @Override // com.google.android.gms.internal.measurement.c6
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String x(final String str) {
        if (this.f18941a == null) {
            return null;
        }
        try {
            return (String) a6.a(new b6() { // from class: com.google.android.gms.internal.measurement.d6
                @Override // com.google.android.gms.internal.measurement.b6
                public final Object a() {
                    return this.f18899a.c(str);
                }
            });
        } catch (IllegalStateException | NullPointerException | SecurityException e5) {
            Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e5);
            return null;
        }
    }

    final /* synthetic */ String c(String str) {
        return r5.a(this.f18941a.getContentResolver(), str, null);
    }
}

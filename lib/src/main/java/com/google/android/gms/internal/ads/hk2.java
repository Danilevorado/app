package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class hk2 {

    /* renamed from: e, reason: collision with root package name */
    private static hk2 f9162e;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f9163a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f9164b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Object f9165c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private int f9166d = 0;

    private hk2(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new gj2(this, null), intentFilter);
    }

    public static synchronized hk2 b(Context context) {
        if (f9162e == null) {
            f9162e = new hk2(context);
        }
        return f9162e;
    }

    static /* synthetic */ void c(hk2 hk2Var, int i10) {
        synchronized (hk2Var.f9165c) {
            if (hk2Var.f9166d == i10) {
                return;
            }
            hk2Var.f9166d = i10;
            Iterator it = hk2Var.f9164b.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                il4 il4Var = (il4) weakReference.get();
                if (il4Var != null) {
                    il4Var.f9791a.h(i10);
                } else {
                    hk2Var.f9164b.remove(weakReference);
                }
            }
        }
    }

    public final int a() {
        int i10;
        synchronized (this.f9165c) {
            i10 = this.f9166d;
        }
        return i10;
    }

    public final void d(final il4 il4Var) {
        Iterator it = this.f9164b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.f9164b.remove(weakReference);
            }
        }
        this.f9164b.add(new WeakReference(il4Var));
        this.f9163a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.dg2
            @Override // java.lang.Runnable
            public final void run() {
                hk2 hk2Var = this.f7293m;
                il4 il4Var2 = il4Var;
                il4Var2.f9791a.h(hk2Var.a());
            }
        });
    }
}

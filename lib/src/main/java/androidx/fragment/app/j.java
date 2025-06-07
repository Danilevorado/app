package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public abstract class j extends g {

    /* renamed from: m, reason: collision with root package name */
    private final Activity f2855m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f2856n;

    /* renamed from: o, reason: collision with root package name */
    private final Handler f2857o;

    /* renamed from: p, reason: collision with root package name */
    private final int f2858p;

    /* renamed from: q, reason: collision with root package name */
    final m f2859q;

    j(Activity activity, Context context, Handler handler, int i10) {
        this.f2859q = new n();
        this.f2855m = activity;
        this.f2856n = (Context) androidx.core.util.h.g(context, "context == null");
        this.f2857o = (Handler) androidx.core.util.h.g(handler, "handler == null");
        this.f2858p = i10;
    }

    j(e eVar) {
        this(eVar, eVar, new Handler(), 0);
    }

    Activity g() {
        return this.f2855m;
    }

    Context h() {
        return this.f2856n;
    }

    Handler i() {
        return this.f2857o;
    }

    public abstract Object j();

    public abstract LayoutInflater k();

    public abstract boolean l(Fragment fragment);

    public void m(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.a.l(this.f2856n, intent, bundle);
    }

    public abstract void o();
}

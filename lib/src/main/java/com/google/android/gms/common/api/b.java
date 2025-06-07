package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import b5.i;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.m0;
import d4.c0;
import d4.j;
import d4.s;
import e4.e;
import e4.p;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5608a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5609b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.api.a f5610c;

    /* renamed from: d, reason: collision with root package name */
    private final a.d f5611d;

    /* renamed from: e, reason: collision with root package name */
    private final d4.b f5612e;

    /* renamed from: f, reason: collision with root package name */
    private final Looper f5613f;

    /* renamed from: g, reason: collision with root package name */
    private final int f5614g;

    /* renamed from: h, reason: collision with root package name */
    private final GoogleApiClient f5615h;

    /* renamed from: i, reason: collision with root package name */
    private final j f5616i;

    /* renamed from: j, reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.c f5617j;

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f5618c = new C0093a().a();

        /* renamed from: a, reason: collision with root package name */
        public final j f5619a;

        /* renamed from: b, reason: collision with root package name */
        public final Looper f5620b;

        /* renamed from: com.google.android.gms.common.api.b$a$a, reason: collision with other inner class name */
        public static class C0093a {

            /* renamed from: a, reason: collision with root package name */
            private j f5621a;

            /* renamed from: b, reason: collision with root package name */
            private Looper f5622b;

            public a a() {
                if (this.f5621a == null) {
                    this.f5621a = new d4.a();
                }
                if (this.f5622b == null) {
                    this.f5622b = Looper.getMainLooper();
                }
                return new a(this.f5621a, this.f5622b);
            }
        }

        private a(j jVar, Account account, Looper looper) {
            this.f5619a = jVar;
            this.f5620b = looper;
        }
    }

    private b(Context context, Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        p.m(context, "Null context is not permitted.");
        p.m(aVar, "Api must not be null.");
        p.m(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) p.m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f5608a = context2;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : g(context);
        this.f5609b = attributionTag;
        this.f5610c = aVar;
        this.f5611d = dVar;
        this.f5613f = aVar2.f5620b;
        d4.b bVarA = d4.b.a(aVar, dVar, attributionTag);
        this.f5612e = bVarA;
        this.f5615h = new s(this);
        com.google.android.gms.common.api.internal.c cVarT = com.google.android.gms.common.api.internal.c.t(context2);
        this.f5617j = cVarT;
        this.f5614g = cVarT.k();
        this.f5616i = aVar2.f5619a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            k.u(activity, cVarT, bVarA);
        }
        cVarT.E(this);
    }

    public b(Context context, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        this(context, null, aVar, dVar, aVar2);
    }

    private final com.google.android.gms.common.api.internal.b o(int i10, com.google.android.gms.common.api.internal.b bVar) {
        bVar.l();
        this.f5617j.z(this, i10, bVar);
        return bVar;
    }

    private final i p(int i10, f fVar) {
        b5.j jVar = new b5.j();
        this.f5617j.A(this, i10, fVar, jVar, this.f5616i);
        return jVar.a();
    }

    protected e.a c() {
        e.a aVar = new e.a();
        aVar.d(null);
        aVar.c(Collections.emptySet());
        aVar.e(this.f5608a.getClass().getName());
        aVar.b(this.f5608a.getPackageName());
        return aVar;
    }

    public i d(f fVar) {
        return p(2, fVar);
    }

    public i e(f fVar) {
        return p(0, fVar);
    }

    public com.google.android.gms.common.api.internal.b f(com.google.android.gms.common.api.internal.b bVar) {
        o(1, bVar);
        return bVar;
    }

    protected String g(Context context) {
        return null;
    }

    public final d4.b h() {
        return this.f5612e;
    }

    public Context i() {
        return this.f5608a;
    }

    protected String j() {
        return this.f5609b;
    }

    public Looper k() {
        return this.f5613f;
    }

    public final int l() {
        return this.f5614g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f m(Looper looper, m0 m0Var) {
        e eVarA = c().a();
        a.f fVarC = ((a.AbstractC0091a) p.l(this.f5610c.a())).c(this.f5608a, looper, eVarA, this.f5611d, m0Var, m0Var);
        String strJ = j();
        if (strJ != null && (fVarC instanceof e4.c)) {
            ((e4.c) fVarC).T(strJ);
        }
        return fVarC;
    }

    public final c0 n(Context context, Handler handler) {
        return new c0(context, handler, c().a());
    }
}

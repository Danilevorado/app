package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import f3.a;

/* loaded from: classes.dex */
public final class ql {

    /* renamed from: a, reason: collision with root package name */
    private k3.q0 f14387a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14388b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14389c;

    /* renamed from: d, reason: collision with root package name */
    private final k3.t2 f14390d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14391e;

    /* renamed from: f, reason: collision with root package name */
    private final a.AbstractC0129a f14392f;

    /* renamed from: g, reason: collision with root package name */
    private final l30 f14393g = new l30();

    /* renamed from: h, reason: collision with root package name */
    private final k3.g4 f14394h = k3.g4.f24647a;

    public ql(Context context, String str, k3.t2 t2Var, int i10, a.AbstractC0129a abstractC0129a) {
        this.f14388b = context;
        this.f14389c = str;
        this.f14390d = t2Var;
        this.f14391e = i10;
        this.f14392f = abstractC0129a;
    }

    public final void a() {
        try {
            k3.q0 q0VarD = k3.t.a().d(this.f14388b, k3.h4.h(), this.f14389c, this.f14393g);
            this.f14387a = q0VarD;
            if (q0VarD != null) {
                if (this.f14391e != 3) {
                    this.f14387a.c2(new k3.n4(this.f14391e));
                }
                this.f14387a.m4(new dl(this.f14392f, this.f14389c));
                this.f14387a.C1(this.f14394h.a(this.f14388b, this.f14390d));
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }
}

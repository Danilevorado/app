package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* loaded from: classes.dex */
public abstract class qw2 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    private rw2 f14521a;

    /* renamed from: b, reason: collision with root package name */
    protected final jw2 f14522b;

    public qw2(jw2 jw2Var) {
        this.f14522b = jw2Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        rw2 rw2Var = this.f14521a;
        if (rw2Var != null) {
            rw2Var.a(this);
        }
    }

    public final void b(rw2 rw2Var) {
        this.f14521a = rw2Var;
    }
}

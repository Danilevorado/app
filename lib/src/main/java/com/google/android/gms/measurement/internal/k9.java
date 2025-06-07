package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class k9 implements t9 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n9 f20138a;

    k9(n9 n9Var) {
        this.f20138a = n9Var;
    }

    @Override // com.google.android.gms.measurement.internal.t9
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f20138a.B().y(new i9(this, str, "_err", bundle));
            return;
        }
        n9 n9Var = this.f20138a;
        if (n9Var.f20221l != null) {
            n9Var.f20221l.b().p().b("AppId not known when logging event", "_err");
        }
    }
}

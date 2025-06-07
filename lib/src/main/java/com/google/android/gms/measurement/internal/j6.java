package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class j6 implements t9 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v6 f20090a;

    j6(v6 v6Var) {
        this.f20090a = v6Var;
    }

    @Override // com.google.android.gms.measurement.internal.t9
    public final void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f20090a.p("auto", "_err", bundle);
        } else {
            this.f20090a.r("auto", "_err", bundle, str);
        }
    }
}

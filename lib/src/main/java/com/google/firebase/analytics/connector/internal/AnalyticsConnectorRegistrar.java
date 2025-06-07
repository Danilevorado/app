package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import x5.d;
import x5.e;
import x5.h;
import x5.i;
import x5.q;

@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements i {
    @Override // x5.i
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<d> getComponents() {
        return Arrays.asList(d.c(w5.a.class).b(q.i(v5.d.class)).b(q.i(Context.class)).b(q.i(e6.d.class)).f(new h() { // from class: com.google.firebase.analytics.connector.internal.a
            @Override // x5.h
            public final Object a(e eVar) {
                return w5.b.c((v5.d) eVar.a(v5.d.class), (Context) eVar.a(Context.class), (e6.d) eVar.a(e6.d.class));
            }
        }).e().d(), q6.h.b("fire-analytics", "21.1.0"));
    }
}

package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.a;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import p2.g;
import r2.t;
import x5.d;
import x5.e;
import x5.h;
import x5.i;
import x5.q;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g lambda$getComponents$0(e eVar) {
        t.f((Context) eVar.a(Context.class));
        return t.c().g(a.f5507h);
    }

    @Override // x5.i
    public List<d> getComponents() {
        return Arrays.asList(d.c(g.class).b(q.i(Context.class)).f(new h() { // from class: y5.a
            @Override // x5.h
            public final Object a(e eVar) {
                return TransportRegistrar.lambda$getComponents$0(eVar);
            }
        }).d(), q6.h.b("fire-transport", "18.1.5"));
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class tu2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16055a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f16056b;

    /* renamed from: c, reason: collision with root package name */
    private final ef0 f16057c;

    /* renamed from: d, reason: collision with root package name */
    private final cu2 f16058d;

    tu2(Context context, Executor executor, ef0 ef0Var, cu2 cu2Var) {
        this.f16055a = context;
        this.f16056b = executor;
        this.f16057c = ef0Var;
        this.f16058d = cu2Var;
    }

    final /* synthetic */ void a(String str) {
        this.f16057c.o(str);
    }

    final /* synthetic */ void b(String str, au2 au2Var) {
        ot2 ot2VarA = nt2.a(this.f16055a, 14);
        ot2VarA.g();
        ot2VarA.B0(this.f16057c.o(str));
        if (au2Var == null) {
            this.f16058d.b(ot2VarA.l());
        } else {
            au2Var.a(ot2VarA);
            au2Var.g();
        }
    }

    public final void c(final String str, final au2 au2Var) {
        if (cu2.a() && ((Boolean) vs.f16843d.e()).booleanValue()) {
            this.f16056b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ru2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14973m.b(str, au2Var);
                }
            });
        } else {
            this.f16056b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.qu2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14500m.a(str);
                }
            });
        }
    }

    public final void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c((String) it.next(), null);
        }
    }
}

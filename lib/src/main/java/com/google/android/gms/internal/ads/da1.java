package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class da1 {

    /* renamed from: a, reason: collision with root package name */
    private final jb1 f7233a;

    /* renamed from: b, reason: collision with root package name */
    private final nk0 f7234b;

    public da1(jb1 jb1Var, nk0 nk0Var) {
        this.f7233a = jb1Var;
        this.f7234b = nk0Var;
    }

    public static final x81 h(lt2 lt2Var) {
        return new x81(lt2Var, of0.f13191f);
    }

    public static final x81 i(ob1 ob1Var) {
        return new x81(ob1Var, of0.f13191f);
    }

    public final View a() {
        nk0 nk0Var = this.f7234b;
        if (nk0Var == null) {
            return null;
        }
        return nk0Var.P();
    }

    public final View b() {
        nk0 nk0Var = this.f7234b;
        if (nk0Var != null) {
            return nk0Var.P();
        }
        return null;
    }

    public final nk0 c() {
        return this.f7234b;
    }

    public final x81 d(Executor executor) {
        final nk0 nk0Var = this.f7234b;
        return new x81(new a61() { // from class: com.google.android.gms.internal.ads.ba1
            @Override // com.google.android.gms.internal.ads.a61
            public final void a() {
                l3.r rVarG0;
                nk0 nk0Var2 = nk0Var;
                if (nk0Var2 == null || (rVarG0 = nk0Var2.g0()) == null) {
                    return;
                }
                rVarG0.b();
            }
        }, executor);
    }

    public final jb1 e() {
        return this.f7233a;
    }

    public Set f(h01 h01Var) {
        return Collections.singleton(new x81(h01Var, of0.f13191f));
    }

    public Set g(h01 h01Var) {
        return Collections.singleton(new x81(h01Var, of0.f13191f));
    }
}

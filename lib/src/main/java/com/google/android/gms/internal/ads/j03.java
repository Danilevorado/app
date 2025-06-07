package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class j03 {
    public static ab3 a(b5.i iVar) {
        final i03 i03Var = new i03(iVar);
        iVar.c(hb3.b(), new b5.d() { // from class: com.google.android.gms.internal.ads.h03
            @Override // b5.d
            public final void a(b5.i iVar2) {
                i03 i03Var2 = i03Var;
                if (iVar2.l()) {
                    i03Var2.cancel(false);
                    return;
                }
                if (iVar2.n()) {
                    i03Var2.h(iVar2.j());
                    return;
                }
                Exception excI = iVar2.i();
                if (excI == null) {
                    throw new IllegalStateException();
                }
                i03Var2.i(excI);
            }
        });
        return i03Var;
    }
}

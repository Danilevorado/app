package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Executor;
import n.d;

/* loaded from: classes.dex */
public final class r02 implements az1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14565a;

    /* renamed from: b, reason: collision with root package name */
    private final bb1 f14566b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f14567c;

    /* renamed from: d, reason: collision with root package name */
    private final gn2 f14568d;

    public r02(Context context, Executor executor, bb1 bb1Var, gn2 gn2Var) {
        this.f14565a = context;
        this.f14566b = bb1Var;
        this.f14567c = executor;
        this.f14568d = gn2Var;
    }

    private static String d(hn2 hn2Var) {
        try {
            return hn2Var.f9275w.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final ab3 a(final un2 un2Var, final hn2 hn2Var) {
        String strD = d(hn2Var);
        final Uri uri = strD != null ? Uri.parse(strD) : null;
        return qa3.m(qa3.h(null), new w93() { // from class: com.google.android.gms.internal.ads.p02
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f13503a.c(uri, un2Var, hn2Var, obj);
            }
        }, this.f14567c);
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final boolean b(un2 un2Var, hn2 hn2Var) {
        Context context = this.f14565a;
        return (context instanceof Activity) && ks.g(context) && !TextUtils.isEmpty(d(hn2Var));
    }

    final /* synthetic */ ab3 c(Uri uri, un2 un2Var, hn2 hn2Var, Object obj) {
        try {
            n.d dVarA = new d.a().a();
            dVarA.f25427a.setData(uri);
            l3.i iVar = new l3.i(dVarA.f25427a, null);
            final tf0 tf0Var = new tf0();
            aa1 aa1VarC = this.f14566b.c(new tx0(un2Var, hn2Var, null), new da1(new jb1() { // from class: com.google.android.gms.internal.ads.q02
                @Override // com.google.android.gms.internal.ads.jb1
                public final void a(boolean z10, Context context, y11 y11Var) {
                    tf0 tf0Var2 = tf0Var;
                    try {
                        j3.t.k();
                        l3.s.a(context, (AdOverlayInfoParcel) tf0Var2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            tf0Var.e(new AdOverlayInfoParcel(iVar, null, aa1VarC.h(), null, new ff0(0, 0, false, false, false), null, null));
            this.f14568d.a();
            return qa3.h(aa1VarC.i());
        } catch (Throwable th) {
            ze0.e("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;

/* loaded from: classes.dex */
public final class al0 {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.nk0, java.lang.Object] */
    public static final nk0 a(final Context context, final em0 em0Var, final String str, final boolean z10, final boolean z11, final bg bgVar, final ls lsVar, final ff0 ff0Var, as asVar, final j3.l lVar, final j3.a aVar, final pm pmVar, final hn2 hn2Var, final ln2 ln2Var) throws zk0 {
        ir.a(context);
        try {
            final as asVar2 = null;
            z33 z33Var = new z33(context, em0Var, str, z10, z11, bgVar, lsVar, ff0Var, asVar2, lVar, aVar, pmVar, hn2Var, ln2Var) { // from class: com.google.android.gms.internal.ads.wk0

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ Context f17182m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ em0 f17183n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ String f17184o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ boolean f17185p;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ boolean f17186q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ bg f17187r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ ls f17188s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ ff0 f17189t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ j3.l f17190u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ j3.a f17191v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ pm f17192w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ hn2 f17193x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ ln2 f17194y;

                {
                    this.f17190u = lVar;
                    this.f17191v = aVar;
                    this.f17192w = pmVar;
                    this.f17193x = hn2Var;
                    this.f17194y = ln2Var;
                }

                @Override // com.google.android.gms.internal.ads.z33
                public final Object a() {
                    Context context2 = this.f17182m;
                    em0 em0Var2 = this.f17183n;
                    String str2 = this.f17184o;
                    boolean z12 = this.f17185p;
                    boolean z13 = this.f17186q;
                    bg bgVar2 = this.f17187r;
                    ls lsVar2 = this.f17188s;
                    ff0 ff0Var2 = this.f17189t;
                    j3.l lVar2 = this.f17190u;
                    j3.a aVar2 = this.f17191v;
                    pm pmVar2 = this.f17192w;
                    hn2 hn2Var2 = this.f17193x;
                    ln2 ln2Var2 = this.f17194y;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i10 = hl0.f9168k0;
                        dl0 dl0Var = new dl0(new hl0(new dm0(context2), em0Var2, str2, z12, z13, bgVar2, lsVar2, ff0Var2, null, lVar2, aVar2, pmVar2, hn2Var2, ln2Var2));
                        dl0Var.setWebViewClient(j3.t.s().d(dl0Var, pmVar2, z13));
                        dl0Var.setWebChromeClient(new mk0(dl0Var));
                        return dl0Var;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return z33Var.a();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new zk0("Webview initialization failed.", th);
        }
    }
}

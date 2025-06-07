package s3;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.ab3;
import com.google.android.gms.internal.ads.au2;
import com.google.android.gms.internal.ads.bb3;
import com.google.android.gms.internal.ads.bg;
import com.google.android.gms.internal.ads.bp2;
import com.google.android.gms.internal.ads.cg;
import com.google.android.gms.internal.ads.cu2;
import com.google.android.gms.internal.ads.dn1;
import com.google.android.gms.internal.ads.ff0;
import com.google.android.gms.internal.ads.ga3;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.km0;
import com.google.android.gms.internal.ads.nt2;
import com.google.android.gms.internal.ads.od0;
import com.google.android.gms.internal.ads.of0;
import com.google.android.gms.internal.ads.ot2;
import com.google.android.gms.internal.ads.qa3;
import com.google.android.gms.internal.ads.qd0;
import com.google.android.gms.internal.ads.qi1;
import com.google.android.gms.internal.ads.sm1;
import com.google.android.gms.internal.ads.t70;
import com.google.android.gms.internal.ads.tu2;
import com.google.android.gms.internal.ads.v93;
import com.google.android.gms.internal.ads.vd0;
import com.google.android.gms.internal.ads.vs;
import com.google.android.gms.internal.ads.w23;
import com.google.android.gms.internal.ads.w70;
import com.google.android.gms.internal.ads.w93;
import com.google.android.gms.internal.ads.y33;
import com.google.android.gms.internal.ads.ze0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k3.c4;
import m3.z0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c extends qd0 {
    protected static final List O = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List P = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List Q = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List R = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int S = 0;
    private final ff0 H;
    private String I;
    private final List K;
    private final List L;
    private final List M;
    private final List N;

    /* renamed from: m, reason: collision with root package name */
    private final km0 f26779m;

    /* renamed from: n, reason: collision with root package name */
    private Context f26780n;

    /* renamed from: o, reason: collision with root package name */
    private final bg f26781o;

    /* renamed from: p, reason: collision with root package name */
    private final bp2 f26782p;

    /* renamed from: r, reason: collision with root package name */
    private final bb3 f26784r;

    /* renamed from: s, reason: collision with root package name */
    private final ScheduledExecutorService f26785s;

    /* renamed from: t, reason: collision with root package name */
    private w70 f26786t;

    /* renamed from: x, reason: collision with root package name */
    private final v f26790x;

    /* renamed from: y, reason: collision with root package name */
    private final dn1 f26791y;

    /* renamed from: z, reason: collision with root package name */
    private final tu2 f26792z;

    /* renamed from: q, reason: collision with root package name */
    private sm1 f26783q = null;

    /* renamed from: u, reason: collision with root package name */
    private Point f26787u = new Point();

    /* renamed from: v, reason: collision with root package name */
    private Point f26788v = new Point();

    /* renamed from: w, reason: collision with root package name */
    private final Set f26789w = Collections.newSetFromMap(new WeakHashMap());
    private final AtomicInteger G = new AtomicInteger(0);
    private final boolean A = ((Boolean) k3.w.c().b(ir.T6)).booleanValue();
    private final boolean B = ((Boolean) k3.w.c().b(ir.S6)).booleanValue();
    private final boolean C = ((Boolean) k3.w.c().b(ir.U6)).booleanValue();
    private final boolean D = ((Boolean) k3.w.c().b(ir.W6)).booleanValue();
    private final String E = (String) k3.w.c().b(ir.V6);
    private final String F = (String) k3.w.c().b(ir.X6);
    private final String J = (String) k3.w.c().b(ir.Y6);

    public c(km0 km0Var, Context context, bg bgVar, bp2 bp2Var, bb3 bb3Var, ScheduledExecutorService scheduledExecutorService, dn1 dn1Var, tu2 tu2Var, ff0 ff0Var) {
        List listJ6;
        this.f26779m = km0Var;
        this.f26780n = context;
        this.f26781o = bgVar;
        this.f26782p = bp2Var;
        this.f26784r = bb3Var;
        this.f26785s = scheduledExecutorService;
        this.f26790x = km0Var.q();
        this.f26791y = dn1Var;
        this.f26792z = tu2Var;
        this.H = ff0Var;
        if (((Boolean) k3.w.c().b(ir.Z6)).booleanValue()) {
            this.K = j6((String) k3.w.c().b(ir.f9889a7));
            this.L = j6((String) k3.w.c().b(ir.f9900b7));
            this.M = j6((String) k3.w.c().b(ir.f9911c7));
            listJ6 = j6((String) k3.w.c().b(ir.f9922d7));
        } else {
            this.K = O;
            this.L = P;
            this.M = Q;
            listJ6 = R;
        }
        this.N = listJ6;
    }

    static /* bridge */ /* synthetic */ void R5(c cVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (cVar.Z5((Uri) it.next())) {
                cVar.G.getAndIncrement();
                return;
            }
        }
    }

    static /* bridge */ /* synthetic */ void S5(final c cVar, final String str, final String str2, final sm1 sm1Var) {
        if (((Boolean) k3.w.c().b(ir.E6)).booleanValue()) {
            if (((Boolean) k3.w.c().b(ir.K6)).booleanValue()) {
                of0.f13186a.execute(new Runnable() { // from class: s3.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f26775m.U5(str, str2, sm1Var);
                    }
                });
            } else {
                cVar.f26790x.d(str, str2, sm1Var);
            }
        }
    }

    static final /* synthetic */ Uri b6(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? i6(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final s3.a0 c6(android.content.Context r8, java.lang.String r9, java.lang.String r10, k3.h4 r11, k3.c4 r12) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.bo2 r0 = new com.google.android.gms.internal.ads.bo2
            r0.<init>()
            java.lang.String r1 = "REWARDED"
            boolean r2 = r1.equals(r10)
            java.lang.String r3 = "REWARDED_INTERSTITIAL"
            r4 = 3
            r5 = 2
            if (r2 == 0) goto L19
            com.google.android.gms.internal.ads.on2 r2 = r0.F()
            r2.a(r5)
            goto L26
        L19:
            boolean r2 = r3.equals(r10)
            if (r2 == 0) goto L26
            com.google.android.gms.internal.ads.on2 r2 = r0.F()
            r2.a(r4)
        L26:
            com.google.android.gms.internal.ads.km0 r2 = r7.f26779m
            s3.z r2 = r2.r()
            com.google.android.gms.internal.ads.s01 r6 = new com.google.android.gms.internal.ads.s01
            r6.<init>()
            r6.e(r8)
            if (r9 != 0) goto L38
            java.lang.String r9 = "adUnitId"
        L38:
            r0.J(r9)
            if (r12 != 0) goto L46
            k3.d4 r9 = new k3.d4
            r9.<init>()
            k3.c4 r12 = r9.a()
        L46:
            r0.e(r12)
            r9 = 1
            if (r11 != 0) goto Laa
            int r11 = r10.hashCode()
            r12 = 4
            switch(r11) {
                case -1999289321: goto L79;
                case -428325382: goto L6f;
                case 543046670: goto L67;
                case 1854800829: goto L5f;
                case 1951953708: goto L55;
                default: goto L54;
            }
        L54:
            goto L83
        L55:
            java.lang.String r11 = "BANNER"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L83
            r11 = 0
            goto L84
        L5f:
            boolean r11 = r10.equals(r3)
            if (r11 == 0) goto L83
            r11 = r5
            goto L84
        L67:
            boolean r11 = r10.equals(r1)
            if (r11 == 0) goto L83
            r11 = r9
            goto L84
        L6f:
            java.lang.String r11 = "APP_OPEN_AD"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L83
            r11 = r12
            goto L84
        L79:
            java.lang.String r11 = "NATIVE"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L83
            r11 = r4
            goto L84
        L83:
            r11 = -1
        L84:
            if (r11 == 0) goto La3
            if (r11 == r9) goto L9e
            if (r11 == r5) goto L9e
            if (r11 == r4) goto L99
            if (r11 == r12) goto L94
            k3.h4 r11 = new k3.h4
            r11.<init>()
            goto Laa
        L94:
            k3.h4 r11 = k3.h4.h()
            goto Laa
        L99:
            k3.h4 r11 = k3.h4.v()
            goto Laa
        L9e:
            k3.h4 r11 = k3.h4.x()
            goto Laa
        La3:
            k3.h4 r11 = new k3.h4
            d3.g r12 = d3.g.f22837i
            r11.<init>(r8, r12)
        Laa:
            r0.I(r11)
            r0.O(r9)
            com.google.android.gms.internal.ads.do2 r8 = r0.g()
            r6.i(r8)
            com.google.android.gms.internal.ads.u01 r8 = r6.j()
            r2.b(r8)
            s3.e r8 = new s3.e
            r8.<init>()
            r8.a(r10)
            s3.g r9 = new s3.g
            r10 = 0
            r9.<init>(r8, r10)
            r2.a(r9)
            com.google.android.gms.internal.ads.a71 r8 = new com.google.android.gms.internal.ads.a71
            r8.<init>()
            s3.a0 r8 = r2.d()
            com.google.android.gms.internal.ads.sm1 r9 = r8.a()
            r7.f26783q = r9
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.c.c6(android.content.Context, java.lang.String, java.lang.String, k3.h4, k3.c4):s3.a0");
    }

    private final ab3 d6(final String str) {
        final qi1[] qi1VarArr = new qi1[1];
        ab3 ab3VarM = qa3.m(this.f26782p.a(), new w93() { // from class: s3.d0
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f26803a.v6(qi1VarArr, str, (qi1) obj);
            }
        }, this.f26784r);
        ab3VarM.b(new Runnable() { // from class: s3.e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f26807m.T5(qi1VarArr);
            }
        }, this.f26784r);
        return qa3.e(qa3.l((ga3) qa3.n(ga3.D(ab3VarM), ((Integer) k3.w.c().b(ir.f9986j7)).intValue(), TimeUnit.MILLISECONDS, this.f26785s), new w23() { // from class: s3.o0
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                int i10 = c.S;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.f26784r), Exception.class, new w23() { // from class: s3.c0
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                int i10 = c.S;
                ze0.e("", (Exception) obj);
                return null;
            }
        }, this.f26784r);
    }

    private final void e6(List list, final l4.a aVar, t70 t70Var, boolean z10) {
        ab3 ab3VarG;
        if (!((Boolean) k3.w.c().b(ir.f9975i7)).booleanValue()) {
            ze0.g("The updating URL feature is not enabled.");
            try {
                t70Var.s("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e5) {
                ze0.e("", e5);
                return;
            }
        }
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (Z5((Uri) it.next())) {
                i10++;
            }
        }
        if (i10 > 1) {
            ze0.g("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (Z5(uri)) {
                ab3VarG = this.f26784r.g(new Callable() { // from class: s3.j0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f26820a.m6(uri, aVar);
                    }
                });
                if (h6()) {
                    ab3VarG = qa3.m(ab3VarG, new w93() { // from class: s3.k0
                        @Override // com.google.android.gms.internal.ads.w93
                        public final ab3 a(Object obj) {
                            c cVar = this.f26826a;
                            return qa3.l(cVar.d6("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new w23() { // from class: s3.f0
                                @Override // com.google.android.gms.internal.ads.w23
                                public final Object a(Object obj2) {
                                    return c.b6(uri, (String) obj2);
                                }
                            }, cVar.f26784r);
                        }
                    }, this.f26784r);
                } else {
                    ze0.f("Asset view map is empty.");
                }
            } else {
                ze0.g("Not a Google URL: ".concat(String.valueOf(uri)));
                ab3VarG = qa3.h(uri);
            }
            arrayList.add(ab3VarG);
        }
        qa3.q(qa3.d(arrayList), new r0(this, t70Var, z10), this.f26779m.b());
    }

    private final void f6(final List list, final l4.a aVar, t70 t70Var, boolean z10) {
        if (!((Boolean) k3.w.c().b(ir.f9975i7)).booleanValue()) {
            try {
                t70Var.s("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e5) {
                ze0.e("", e5);
                return;
            }
        }
        ab3 ab3VarG = this.f26784r.g(new Callable() { // from class: s3.l0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f26828a.O5(list, aVar);
            }
        });
        if (h6()) {
            ab3VarG = qa3.m(ab3VarG, new w93() { // from class: s3.m0
                @Override // com.google.android.gms.internal.ads.w93
                public final ab3 a(Object obj) {
                    return this.f26833a.w6((ArrayList) obj);
                }
            }, this.f26784r);
        } else {
            ze0.f("Asset view map is empty.");
        }
        qa3.q(ab3VarG, new q0(this, t70Var, z10), this.f26779m.b());
    }

    private static boolean g6(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean h6() {
        Map map;
        w70 w70Var = this.f26786t;
        return (w70Var == null || (map = w70Var.f17011n) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri i6(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i10 = iIndexOf + 1;
        return Uri.parse(string.substring(0, i10) + str + "=" + str2 + "&" + string.substring(i10));
    }

    private static final List j6(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!y33.d(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* bridge */ /* synthetic */ au2 r6(ab3 ab3Var, vd0 vd0Var) {
        if (!cu2.a() || !((Boolean) vs.f16844e.e()).booleanValue()) {
            return null;
        }
        try {
            au2 au2VarB = ((a0) qa3.o(ab3Var)).b();
            au2VarB.d(new ArrayList(Collections.singletonList(vd0Var.f16654n)));
            c4 c4Var = vd0Var.f16656p;
            au2VarB.b(c4Var == null ? "" : c4Var.B);
            return au2VarB;
        } catch (ExecutionException e5) {
            j3.t.q().u(e5, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.rd0
    public final void D5(List list, l4.a aVar, t70 t70Var) {
        e6(list, aVar, t70Var, true);
    }

    @Override // com.google.android.gms.internal.ads.rd0
    public final void J4(List list, l4.a aVar, t70 t70Var) {
        f6(list, aVar, t70Var, false);
    }

    final /* synthetic */ ArrayList N5(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uriI6 = (Uri) it.next();
            if (a6(uriI6) && !TextUtils.isEmpty(str)) {
                uriI6 = i6(uriI6, "nas", str);
            }
            arrayList.add(uriI6);
        }
        return arrayList;
    }

    final /* synthetic */ ArrayList O5(List list, l4.a aVar) throws Exception {
        String strD = this.f26781o.c() != null ? this.f26781o.c().d(this.f26780n, (View) l4.b.L0(aVar), null) : "";
        if (TextUtils.isEmpty(strD)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uriI6 = (Uri) it.next();
            if (a6(uriI6)) {
                uriI6 = i6(uriI6, "ms", strD);
            } else {
                ze0.g("Not a Google URL: ".concat(String.valueOf(uriI6)));
            }
            arrayList.add(uriI6);
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.rd0
    public final void R(l4.a aVar) {
        if (((Boolean) k3.w.c().b(ir.f9975i7)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) l4.b.L0(aVar);
            w70 w70Var = this.f26786t;
            this.f26787u = z0.a(motionEvent, w70Var == null ? null : w70Var.f17010m);
            if (motionEvent.getAction() == 0) {
                this.f26788v = this.f26787u;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.f26787u;
            motionEventObtain.setLocation(point.x, point.y);
            this.f26781o.d(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    final /* synthetic */ void T5(qi1[] qi1VarArr) {
        qi1 qi1Var = qi1VarArr[0];
        if (qi1Var != null) {
            this.f26782p.b(qa3.h(qi1Var));
        }
    }

    final /* synthetic */ void U5(String str, String str2, sm1 sm1Var) {
        this.f26790x.d(str, str2, sm1Var);
    }

    @Override // com.google.android.gms.internal.ads.rd0
    public final void W0(w70 w70Var) {
        this.f26786t = w70Var;
        this.f26782p.c(1);
    }

    final boolean Z5(Uri uri) {
        return g6(uri, this.K, this.L);
    }

    final boolean a6(Uri uri) {
        return g6(uri, this.M, this.N);
    }

    @Override // com.google.android.gms.internal.ads.rd0
    public final void b5(l4.a aVar, final vd0 vd0Var, od0 od0Var) {
        ab3 ab3VarH;
        ab3 ab3VarC;
        Context context = (Context) l4.b.L0(aVar);
        this.f26780n = context;
        ot2 ot2VarA = nt2.a(context, 22);
        ot2VarA.g();
        if (((Boolean) k3.w.c().b(ir.f10119v9)).booleanValue()) {
            bb3 bb3Var = of0.f13186a;
            ab3VarH = bb3Var.g(new Callable() { // from class: s3.h0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f26815a.q6(vd0Var);
                }
            });
            ab3VarC = qa3.m(ab3VarH, new w93() { // from class: s3.i0
                @Override // com.google.android.gms.internal.ads.w93
                public final ab3 a(Object obj) {
                    return ((a0) obj).c();
                }
            }, bb3Var);
        } else {
            a0 a0VarC6 = c6(this.f26780n, vd0Var.f16653m, vd0Var.f16654n, vd0Var.f16655o, vd0Var.f16656p);
            ab3VarH = qa3.h(a0VarC6);
            ab3VarC = a0VarC6.c();
        }
        qa3.q(ab3VarC, new p0(this, ab3VarH, vd0Var, od0Var, ot2VarA, j3.t.b().a()), this.f26779m.b());
    }

    @Override // com.google.android.gms.internal.ads.rd0
    public final void d1(List list, l4.a aVar, t70 t70Var) {
        e6(list, aVar, t70Var, false);
    }

    @Override // com.google.android.gms.internal.ads.rd0
    public final void i0(l4.a aVar) {
        if (((Boolean) k3.w.c().b(ir.K8)).booleanValue()) {
            if (((Boolean) k3.w.c().b(ir.L8)).booleanValue()) {
                if (!((Boolean) k3.w.c().b(ir.O8)).booleanValue()) {
                    qa3.q(((Boolean) k3.w.c().b(ir.f10119v9)).booleanValue() ? qa3.k(new v93() { // from class: s3.n0
                        @Override // com.google.android.gms.internal.ads.v93
                        public final ab3 a() {
                            return this.f26836a.u6();
                        }
                    }, of0.f13186a) : c6(this.f26780n, null, d3.b.BANNER.name(), null, null).c(), new s0(this), this.f26779m.b());
                }
            }
            WebView webView = (WebView) l4.b.L0(aVar);
            if (webView == null) {
                ze0.d("The webView cannot be null.");
            } else if (this.f26789w.contains(webView)) {
                ze0.f("This webview has already been registered.");
            } else {
                this.f26789w.add(webView);
                webView.addJavascriptInterface(new a(webView, this.f26781o, this.f26791y, this.f26792z), "gmaSdk");
            }
        }
    }

    final /* synthetic */ Uri m6(Uri uri, l4.a aVar) throws Exception {
        try {
            uri = this.f26781o.a(uri, this.f26780n, (View) l4.b.L0(aVar), null);
        } catch (cg e5) {
            ze0.h("", e5);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ a0 q6(vd0 vd0Var) {
        return c6(this.f26780n, vd0Var.f16653m, vd0Var.f16654n, vd0Var.f16655o, vd0Var.f16656p);
    }

    final /* synthetic */ ab3 u6() {
        return c6(this.f26780n, null, d3.b.BANNER.name(), null, null).c();
    }

    @Override // com.google.android.gms.internal.ads.rd0
    public final void v4(List list, l4.a aVar, t70 t70Var) {
        f6(list, aVar, t70Var, true);
    }

    final /* synthetic */ ab3 v6(qi1[] qi1VarArr, String str, qi1 qi1Var) throws JSONException {
        qi1VarArr[0] = qi1Var;
        Context context = this.f26780n;
        w70 w70Var = this.f26786t;
        Map map = w70Var.f17011n;
        JSONObject jSONObjectD = z0.d(context, map, map, w70Var.f17010m, null);
        JSONObject jSONObjectG = z0.g(this.f26780n, this.f26786t.f17010m);
        JSONObject jSONObjectF = z0.f(this.f26786t.f17010m);
        JSONObject jSONObjectE = z0.e(this.f26780n, this.f26786t.f17010m);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectD);
        jSONObject.put("ad_view_signal", jSONObjectG);
        jSONObject.put("scroll_view_signal", jSONObjectF);
        jSONObject.put("lock_screen_signal", jSONObjectE);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", z0.c(null, this.f26780n, this.f26788v, this.f26787u));
        }
        return qi1Var.d(str, jSONObject);
    }

    final /* synthetic */ ab3 w6(final ArrayList arrayList) {
        return qa3.l(d6("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new w23() { // from class: s3.g0
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                return this.f26812a.N5(arrayList, (String) obj);
            }
        }, this.f26784r);
    }
}

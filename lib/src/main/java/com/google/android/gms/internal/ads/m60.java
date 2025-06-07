package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m60 extends n60 implements gy {

    /* renamed from: c, reason: collision with root package name */
    private final nk0 f11944c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f11945d;

    /* renamed from: e, reason: collision with root package name */
    private final WindowManager f11946e;

    /* renamed from: f, reason: collision with root package name */
    private final rq f11947f;

    /* renamed from: g, reason: collision with root package name */
    DisplayMetrics f11948g;

    /* renamed from: h, reason: collision with root package name */
    private float f11949h;

    /* renamed from: i, reason: collision with root package name */
    int f11950i;

    /* renamed from: j, reason: collision with root package name */
    int f11951j;

    /* renamed from: k, reason: collision with root package name */
    private int f11952k;

    /* renamed from: l, reason: collision with root package name */
    int f11953l;

    /* renamed from: m, reason: collision with root package name */
    int f11954m;

    /* renamed from: n, reason: collision with root package name */
    int f11955n;

    /* renamed from: o, reason: collision with root package name */
    int f11956o;

    public m60(nk0 nk0Var, Context context, rq rqVar) {
        super(nk0Var, "");
        this.f11950i = -1;
        this.f11951j = -1;
        this.f11953l = -1;
        this.f11954m = -1;
        this.f11955n = -1;
        this.f11956o = -1;
        this.f11944c = nk0Var;
        this.f11945d = context;
        this.f11947f = rqVar;
        this.f11946e = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final /* synthetic */ void a(Object obj, Map map) throws JSONException {
        int iX;
        JSONObject jSONObjectPut;
        this.f11948g = new DisplayMetrics();
        Display defaultDisplay = this.f11946e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f11948g);
        this.f11949h = this.f11948g.density;
        this.f11952k = defaultDisplay.getRotation();
        k3.t.b();
        DisplayMetrics displayMetrics = this.f11948g;
        this.f11950i = se0.x(displayMetrics, displayMetrics.widthPixels);
        k3.t.b();
        DisplayMetrics displayMetrics2 = this.f11948g;
        this.f11951j = se0.x(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityI = this.f11944c.i();
        if (activityI == null || activityI.getWindow() == null) {
            this.f11953l = this.f11950i;
            iX = this.f11951j;
        } else {
            j3.t.r();
            int[] iArrL = m3.b2.l(activityI);
            k3.t.b();
            this.f11953l = se0.x(this.f11948g, iArrL[0]);
            k3.t.b();
            iX = se0.x(this.f11948g, iArrL[1]);
        }
        this.f11954m = iX;
        if (this.f11944c.I().i()) {
            this.f11955n = this.f11950i;
            this.f11956o = this.f11951j;
        } else {
            this.f11944c.measure(0, 0);
        }
        e(this.f11950i, this.f11951j, this.f11953l, this.f11954m, this.f11949h, this.f11952k);
        l60 l60Var = new l60();
        rq rqVar = this.f11947f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        l60Var.e(rqVar.a(intent));
        rq rqVar2 = this.f11947f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        l60Var.c(rqVar2.a(intent2));
        l60Var.a(this.f11947f.b());
        l60Var.d(this.f11947f.c());
        l60Var.b(true);
        boolean z10 = l60Var.f11341a;
        boolean z11 = l60Var.f11342b;
        boolean z12 = l60Var.f11343c;
        boolean z13 = l60Var.f11344d;
        boolean z14 = l60Var.f11345e;
        nk0 nk0Var = this.f11944c;
        try {
            jSONObjectPut = new JSONObject().put("sms", z10).put("tel", z11).put("calendar", z12).put("storePicture", z13).put("inlineVideo", z14);
        } catch (JSONException e5) {
            ze0.e("Error occurred while obtaining the MRAID capabilities.", e5);
            jSONObjectPut = null;
        }
        nk0Var.a("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        this.f11944c.getLocationOnScreen(iArr);
        h(k3.t.b().e(this.f11945d, iArr[0]), k3.t.b().e(this.f11945d, iArr[1]));
        if (ze0.j(2)) {
            ze0.f("Dispatching Ready Event.");
        }
        d(this.f11944c.m().f8252m);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[PHI: r2
  0x006f: PHI (r2v4 int) = (r2v3 int), (r2v8 int) binds: [B:11:0x0046, B:17:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f11945d
            boolean r0 = r0 instanceof android.app.Activity
            r1 = 0
            if (r0 == 0) goto L15
            j3.t.r()
            android.content.Context r0 = r6.f11945d
            android.app.Activity r0 = (android.app.Activity) r0
            int[] r0 = m3.b2.m(r0)
            r0 = r0[r1]
            goto L16
        L15:
            r0 = r1
        L16:
            com.google.android.gms.internal.ads.nk0 r2 = r6.f11944c
            com.google.android.gms.internal.ads.em0 r2 = r2.I()
            if (r2 == 0) goto L2a
            com.google.android.gms.internal.ads.nk0 r2 = r6.f11944c
            com.google.android.gms.internal.ads.em0 r2 = r2.I()
            boolean r2 = r2.i()
            if (r2 != 0) goto L88
        L2a:
            com.google.android.gms.internal.ads.nk0 r2 = r6.f11944c
            int r2 = r2.getWidth()
            com.google.android.gms.internal.ads.nk0 r3 = r6.f11944c
            int r3 = r3.getHeight()
            com.google.android.gms.internal.ads.zq r4 = com.google.android.gms.internal.ads.ir.R
            com.google.android.gms.internal.ads.gr r5 = k3.w.c()
            java.lang.Object r4 = r5.b(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L6f
            if (r2 != 0) goto L5c
            com.google.android.gms.internal.ads.nk0 r2 = r6.f11944c
            com.google.android.gms.internal.ads.em0 r2 = r2.I()
            if (r2 == 0) goto L5b
            com.google.android.gms.internal.ads.nk0 r2 = r6.f11944c
            com.google.android.gms.internal.ads.em0 r2 = r2.I()
            int r2 = r2.f7901c
            goto L5c
        L5b:
            r2 = r1
        L5c:
            if (r3 != 0) goto L6f
            com.google.android.gms.internal.ads.nk0 r3 = r6.f11944c
            com.google.android.gms.internal.ads.em0 r3 = r3.I()
            if (r3 == 0) goto L70
            com.google.android.gms.internal.ads.nk0 r1 = r6.f11944c
            com.google.android.gms.internal.ads.em0 r1 = r1.I()
            int r1 = r1.f7900b
            goto L70
        L6f:
            r1 = r3
        L70:
            com.google.android.gms.internal.ads.se0 r3 = k3.t.b()
            android.content.Context r4 = r6.f11945d
            int r2 = r3.e(r4, r2)
            r6.f11955n = r2
            com.google.android.gms.internal.ads.se0 r2 = k3.t.b()
            android.content.Context r3 = r6.f11945d
            int r1 = r2.e(r3, r1)
            r6.f11956o = r1
        L88:
            int r0 = r8 - r0
            int r1 = r6.f11955n
            int r2 = r6.f11956o
            r6.b(r7, r0, r1, r2)
            com.google.android.gms.internal.ads.nk0 r0 = r6.f11944c
            com.google.android.gms.internal.ads.cm0 r0 = r0.G()
            r0.K(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m60.h(int, int):void");
    }
}

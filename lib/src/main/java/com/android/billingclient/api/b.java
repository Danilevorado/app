package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.h6;
import com.google.android.gms.internal.play_billing.j5;
import com.google.android.gms.internal.play_billing.k5;
import com.google.android.gms.internal.play_billing.q4;
import com.google.android.gms.internal.play_billing.u4;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

/* loaded from: classes.dex */
class b extends a {
    private boolean A;
    private ExecutorService B;

    /* renamed from: a, reason: collision with root package name */
    private volatile int f5139a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5140b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f5141c;

    /* renamed from: d, reason: collision with root package name */
    private volatile e0 f5142d;

    /* renamed from: e, reason: collision with root package name */
    private Context f5143e;

    /* renamed from: f, reason: collision with root package name */
    private u f5144f;

    /* renamed from: g, reason: collision with root package name */
    private volatile h6 f5145g;

    /* renamed from: h, reason: collision with root package name */
    private volatile r f5146h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5147i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f5148j;

    /* renamed from: k, reason: collision with root package name */
    private int f5149k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f5150l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f5151m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f5152n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f5153o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f5154p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f5155q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f5156r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f5157s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f5158t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f5159u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f5160v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f5161w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f5162x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f5163y;

    /* renamed from: z, reason: collision with root package name */
    private e f5164z;

    private b(Context context, e eVar, k1.g gVar, String str, String str2, k1.i iVar, u uVar, ExecutorService executorService) {
        this.f5139a = 0;
        this.f5141c = new Handler(Looper.getMainLooper());
        this.f5149k = 0;
        this.f5140b = str;
        i(context, gVar, eVar, iVar, str, null);
    }

    b(String str, Context context, u uVar, ExecutorService executorService) {
        this.f5139a = 0;
        this.f5141c = new Handler(Looper.getMainLooper());
        this.f5149k = 0;
        String strN = N();
        this.f5140b = strN;
        this.f5143e = context.getApplicationContext();
        j5 j5VarF = k5.F();
        j5VarF.t(strN);
        j5VarF.s(this.f5143e.getPackageName());
        this.f5144f = new w(this.f5143e, (k5) j5VarF.e());
        this.f5143e.getPackageName();
    }

    b(String str, e eVar, Context context, k1.g gVar, k1.i iVar, u uVar, ExecutorService executorService) {
        this(context, eVar, gVar, N(), null, iVar, null, null);
    }

    b(String str, e eVar, Context context, k1.g gVar, k1.p pVar, u uVar, ExecutorService executorService) {
        String strN = N();
        this.f5139a = 0;
        this.f5141c = new Handler(Looper.getMainLooper());
        this.f5149k = 0;
        this.f5140b = strN;
        j(context, gVar, eVar, null, strN, null);
    }

    b(String str, e eVar, Context context, k1.v vVar, u uVar, ExecutorService executorService) {
        this.f5139a = 0;
        this.f5141c = new Handler(Looper.getMainLooper());
        this.f5149k = 0;
        this.f5140b = N();
        this.f5143e = context.getApplicationContext();
        j5 j5VarF = k5.F();
        j5VarF.t(N());
        j5VarF.s(this.f5143e.getPackageName());
        this.f5144f = new w(this.f5143e, (k5) j5VarF.e());
        com.google.android.gms.internal.play_billing.a0.i("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f5142d = new e0(this.f5143e, null, null, null, null, this.f5144f);
        this.f5164z = eVar;
        this.f5143e.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler K() {
        return Looper.myLooper() == null ? this.f5141c : new Handler(Looper.myLooper());
    }

    private final d L(final d dVar) {
        if (Thread.interrupted()) {
            return dVar;
        }
        this.f5141c.post(new Runnable() { // from class: com.android.billingclient.api.f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f5211m.C(dVar);
            }
        });
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d M() {
        return (this.f5139a == 0 || this.f5139a == 3) ? v.f5273m : v.f5270j;
    }

    private static String N() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "7.0.0";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Future O(Callable callable, long j10, final Runnable runnable, Handler handler) {
        if (this.B == null) {
            this.B = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.a0.f19454a, new n(this));
        }
        try {
            final Future futureSubmit = this.B.submit(callable);
            handler.postDelayed(new Runnable() { // from class: k1.c0
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.a0.i("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j10 * 0.95d));
            return futureSubmit;
        } catch (Exception e5) {
            com.google.android.gms.internal.play_billing.a0.j("BillingClient", "Async task throws exception!", e5);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(q4 q4Var) {
        this.f5144f.a(q4Var, this.f5149k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(u4 u4Var) {
        this.f5144f.c(u4Var, this.f5149k);
    }

    private final void R(String str, final k1.f fVar) {
        if (!c()) {
            d dVar = v.f5273m;
            P(t.a(2, 11, dVar));
            fVar.a(dVar, null);
        } else if (O(new o(this, str, fVar), 30000L, new Runnable() { // from class: com.android.billingclient.api.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f5239m.F(fVar);
            }
        }, K()) == null) {
            d dVarM = M();
            P(t.a(25, 11, dVarM));
            fVar.a(dVarM, null);
        }
    }

    private final boolean S() {
        return this.f5160v && this.f5164z.b();
    }

    static /* bridge */ /* synthetic */ s Y(b bVar, String str) {
        com.google.android.gms.internal.play_billing.a0.h("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleC = com.google.android.gms.internal.play_billing.a0.c(bVar.f5152n, bVar.f5160v, bVar.f5164z.a(), bVar.f5164z.b(), bVar.f5140b);
        String string = null;
        while (bVar.f5150l) {
            try {
                Bundle bundleH2 = bVar.f5145g.H2(6, bVar.f5143e.getPackageName(), str, string, bundleC);
                a0 a0VarA = b0.a(bundleH2, "BillingClient", "getPurchaseHistory()");
                d dVarA = a0VarA.a();
                if (dVarA != v.f5272l) {
                    bVar.P(t.a(a0VarA.b(), 11, dVarA));
                    return new s(dVarA, null);
                }
                ArrayList<String> stringArrayList = bundleH2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleH2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleH2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z10 = false;
                for (int i10 = 0; i10 < stringArrayList2.size(); i10++) {
                    String str2 = stringArrayList2.get(i10);
                    String str3 = stringArrayList3.get(i10);
                    com.google.android.gms.internal.play_billing.a0.h("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i10))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str2, str3);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.b())) {
                            com.google.android.gms.internal.play_billing.a0.i("BillingClient", "BUG: empty/null token!");
                            z10 = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e5) {
                        com.google.android.gms.internal.play_billing.a0.j("BillingClient", "Got an exception trying to decode the purchase!", e5);
                        d dVar = v.f5270j;
                        bVar.P(t.a(51, 11, dVar));
                        return new s(dVar, null);
                    }
                }
                if (z10) {
                    bVar.P(t.a(26, 11, v.f5270j));
                }
                string = bundleH2.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.a0.h("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    return new s(v.f5272l, arrayList);
                }
            } catch (RemoteException e10) {
                com.google.android.gms.internal.play_billing.a0.j("BillingClient", "Got exception trying to get purchase history, try to reconnect", e10);
                d dVar2 = v.f5273m;
                bVar.P(t.a(59, 11, dVar2));
                return new s(dVar2, null);
            }
        }
        com.google.android.gms.internal.play_billing.a0.i("BillingClient", "getPurchaseHistory is not supported on current device");
        return new s(v.f5277q, null);
    }

    private void i(Context context, k1.g gVar, e eVar, k1.i iVar, String str, u uVar) {
        this.f5143e = context.getApplicationContext();
        j5 j5VarF = k5.F();
        j5VarF.t(str);
        j5VarF.s(this.f5143e.getPackageName());
        if (uVar == null) {
            uVar = new w(this.f5143e, (k5) j5VarF.e());
        }
        this.f5144f = uVar;
        if (gVar == null) {
            com.google.android.gms.internal.play_billing.a0.i("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f5142d = new e0(this.f5143e, gVar, null, null, iVar, this.f5144f);
        this.f5164z = eVar;
        this.A = iVar != null;
    }

    private void j(Context context, k1.g gVar, e eVar, k1.p pVar, String str, u uVar) {
        this.f5143e = context.getApplicationContext();
        j5 j5VarF = k5.F();
        j5VarF.t(str);
        j5VarF.s(this.f5143e.getPackageName());
        if (uVar == null) {
            uVar = new w(this.f5143e, (k5) j5VarF.e());
        }
        this.f5144f = uVar;
        if (gVar == null) {
            com.google.android.gms.internal.play_billing.a0.i("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f5142d = new e0(this.f5143e, gVar, null, pVar, null, this.f5144f);
        this.f5164z = eVar;
        this.A = pVar != null;
        this.f5143e.getPackageName();
    }

    final /* synthetic */ void B(k1.b bVar) {
        d dVar = v.f5274n;
        P(t.a(24, 3, dVar));
        bVar.a(dVar);
    }

    final /* synthetic */ void C(d dVar) {
        if (this.f5142d.d() != null) {
            this.f5142d.d().e(dVar, null);
        } else {
            com.google.android.gms.internal.play_billing.a0.i("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    final /* synthetic */ void D(k1.e eVar, k1.d dVar) {
        d dVar2 = v.f5274n;
        P(t.a(24, 4, dVar2));
        eVar.a(dVar2, dVar.a());
    }

    final /* synthetic */ void F(k1.f fVar) {
        d dVar = v.f5274n;
        P(t.a(24, 11, dVar));
        fVar.a(dVar, null);
    }

    final /* synthetic */ void G(k1.h hVar) {
        d dVar = v.f5274n;
        P(t.a(24, 8, dVar));
        hVar.a(dVar, null);
    }

    final /* synthetic */ Bundle U(int i10, String str, String str2, c cVar, Bundle bundle) {
        return this.f5145g.l2(i10, this.f5143e.getPackageName(), str, str2, null, bundle);
    }

    final /* synthetic */ Bundle V(String str, String str2) {
        return this.f5145g.H4(3, this.f5143e.getPackageName(), str, str2, null);
    }

    @Override // com.android.billingclient.api.a
    public final void a(final k1.a aVar, final k1.b bVar) {
        if (!c()) {
            d dVar = v.f5273m;
            P(t.a(2, 3, dVar));
            bVar.a(dVar);
            return;
        }
        if (TextUtils.isEmpty(aVar.a())) {
            com.google.android.gms.internal.play_billing.a0.i("BillingClient", "Please provide a valid purchase token.");
            d dVar2 = v.f5269i;
            P(t.a(26, 3, dVar2));
            bVar.a(dVar2);
            return;
        }
        if (!this.f5152n) {
            d dVar3 = v.f5262b;
            P(t.a(27, 3, dVar3));
            bVar.a(dVar3);
        } else if (O(new Callable() { // from class: com.android.billingclient.api.h0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f5226a.c0(aVar, bVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f5231m.B(bVar);
            }
        }, K()) == null) {
            d dVarM = M();
            P(t.a(25, 3, dVarM));
            bVar.a(dVarM);
        }
    }

    @Override // com.android.billingclient.api.a
    public final void b(final k1.d dVar, final k1.e eVar) {
        if (!c()) {
            d dVar2 = v.f5273m;
            P(t.a(2, 4, dVar2));
            eVar.a(dVar2, dVar.a());
        } else if (O(new Callable() { // from class: com.android.billingclient.api.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f5233a.d0(dVar, eVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f5236m.D(eVar, dVar);
            }
        }, K()) == null) {
            d dVarM = M();
            P(t.a(25, 4, dVarM));
            eVar.a(dVarM, dVar.a());
        }
    }

    @Override // com.android.billingclient.api.a
    public final boolean c() {
        return (this.f5139a != 2 || this.f5145g == null || this.f5146h == null) ? false : true;
    }

    final /* synthetic */ Object c0(k1.a aVar, k1.b bVar) {
        try {
            h6 h6Var = this.f5145g;
            String packageName = this.f5143e.getPackageName();
            String strA = aVar.a();
            String str = this.f5140b;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            Bundle bundleR5 = h6Var.r5(9, packageName, strA, bundle);
            bVar.a(v.a(com.google.android.gms.internal.play_billing.a0.b(bundleR5, "BillingClient"), com.google.android.gms.internal.play_billing.a0.e(bundleR5, "BillingClient")));
            return null;
        } catch (Exception e5) {
            com.google.android.gms.internal.play_billing.a0.j("BillingClient", "Error acknowledge purchase!", e5);
            d dVar = v.f5273m;
            P(t.a(28, 3, dVar));
            bVar.a(dVar);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03ee A[Catch: Exception -> 0x0454, CancellationException -> 0x0469, TimeoutException -> 0x046b, TRY_ENTER, TryCatch #4 {CancellationException -> 0x0469, TimeoutException -> 0x046b, Exception -> 0x0454, blocks: (B:166:0x03ee, B:168:0x03fe, B:170:0x0412, B:173:0x042e, B:175:0x043a), top: B:193:0x03ec }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03fe A[Catch: Exception -> 0x0454, CancellationException -> 0x0469, TimeoutException -> 0x046b, TryCatch #4 {CancellationException -> 0x0469, TimeoutException -> 0x046b, Exception -> 0x0454, blocks: (B:166:0x03ee, B:168:0x03fe, B:170:0x0412, B:173:0x042e, B:175:0x043a), top: B:193:0x03ec }] */
    @Override // com.android.billingclient.api.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.android.billingclient.api.d d(android.app.Activity r32, final com.android.billingclient.api.c r33) {
        /*
            Method dump skipped, instructions count: 1165
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.b.d(android.app.Activity, com.android.billingclient.api.c):com.android.billingclient.api.d");
    }

    final /* synthetic */ Object d0(k1.d dVar, k1.e eVar) {
        int iP1;
        String strE;
        String strA = dVar.a();
        try {
            com.google.android.gms.internal.play_billing.a0.h("BillingClient", "Consuming purchase with token: " + strA);
            if (this.f5152n) {
                h6 h6Var = this.f5145g;
                String packageName = this.f5143e.getPackageName();
                boolean z10 = this.f5152n;
                String str = this.f5140b;
                Bundle bundle = new Bundle();
                if (z10) {
                    bundle.putString("playBillingLibraryVersion", str);
                }
                Bundle bundleV1 = h6Var.V1(9, packageName, strA, bundle);
                iP1 = bundleV1.getInt("RESPONSE_CODE");
                strE = com.google.android.gms.internal.play_billing.a0.e(bundleV1, "BillingClient");
            } else {
                iP1 = this.f5145g.P1(3, this.f5143e.getPackageName(), strA);
                strE = "";
            }
            d dVarA = v.a(iP1, strE);
            if (iP1 == 0) {
                com.google.android.gms.internal.play_billing.a0.h("BillingClient", "Successfully consumed purchase.");
            } else {
                com.google.android.gms.internal.play_billing.a0.i("BillingClient", "Error consuming purchase with token. Response code: " + iP1);
                P(t.a(23, 4, dVarA));
            }
            eVar.a(dVarA, strA);
            return null;
        } catch (Exception e5) {
            com.google.android.gms.internal.play_billing.a0.j("BillingClient", "Error consuming purchase!", e5);
            d dVar2 = v.f5273m;
            P(t.a(29, 4, dVar2));
            eVar.a(dVar2, strA);
            return null;
        }
    }

    final /* synthetic */ Object e0(String str, List list, String str2, k1.h hVar) {
        String strE;
        int i10;
        Bundle bundleW2;
        q4 q4VarA;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i11 = 0;
        while (true) {
            strE = "Error trying to decode SkuDetails.";
            if (i11 >= size) {
                strE = "";
                i10 = 0;
                break;
            }
            int i12 = i11 + 20;
            ArrayList<String> arrayList2 = new ArrayList<>(list.subList(i11, i12 > size ? size : i12));
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle.putString("playBillingLibraryVersion", this.f5140b);
            try {
                if (this.f5153o) {
                    h6 h6Var = this.f5145g;
                    String packageName = this.f5143e.getPackageName();
                    int i13 = this.f5149k;
                    boolean zA = this.f5164z.a();
                    boolean zS = S();
                    String str3 = this.f5140b;
                    Bundle bundle2 = new Bundle();
                    if (i13 >= 9) {
                        bundle2.putString("playBillingLibraryVersion", str3);
                    }
                    if (i13 >= 9 && zA) {
                        bundle2.putBoolean("enablePendingPurchases", true);
                    }
                    if (zS) {
                        bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                    }
                    bundleW2 = h6Var.J1(10, packageName, str, bundle, bundle2);
                } else {
                    bundleW2 = this.f5145g.w2(3, this.f5143e.getPackageName(), str, bundle);
                }
                if (bundleW2 == null) {
                    com.google.android.gms.internal.play_billing.a0.i("BillingClient", "querySkuDetailsAsync got null sku details list");
                    q4VarA = t.a(44, 8, v.C);
                    break;
                }
                if (bundleW2.containsKey("DETAILS_LIST")) {
                    ArrayList<String> stringArrayList = bundleW2.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        com.google.android.gms.internal.play_billing.a0.i("BillingClient", "querySkuDetailsAsync got null response list");
                        q4VarA = t.a(46, 8, v.C);
                        break;
                    }
                    for (int i14 = 0; i14 < stringArrayList.size(); i14++) {
                        try {
                            SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i14));
                            com.google.android.gms.internal.play_billing.a0.h("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                            arrayList.add(skuDetails);
                        } catch (JSONException e5) {
                            com.google.android.gms.internal.play_billing.a0.j("BillingClient", "Got a JSON exception trying to decode SkuDetails.", e5);
                            P(t.a(47, 8, v.a(6, "Error trying to decode SkuDetails.")));
                            i10 = 6;
                            arrayList = null;
                            hVar.a(v.a(i10, strE), arrayList);
                            return null;
                        }
                    }
                    i11 = i12;
                } else {
                    int iB = com.google.android.gms.internal.play_billing.a0.b(bundleW2, "BillingClient");
                    strE = com.google.android.gms.internal.play_billing.a0.e(bundleW2, "BillingClient");
                    if (iB != 0) {
                        com.google.android.gms.internal.play_billing.a0.i("BillingClient", "getSkuDetails() failed. Response code: " + iB);
                        P(t.a(23, 8, v.a(iB, strE)));
                        i10 = iB;
                    } else {
                        com.google.android.gms.internal.play_billing.a0.i("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                        P(t.a(45, 8, v.a(6, strE)));
                        i10 = 6;
                    }
                }
            } catch (Exception e10) {
                com.google.android.gms.internal.play_billing.a0.j("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e10);
                P(t.a(43, 8, v.f5273m));
                i10 = -1;
                strE = "Service connection is disconnected.";
            }
        }
        P(q4VarA);
        strE = "Item is unavailable for purchase.";
        arrayList = null;
        i10 = 4;
        hVar.a(v.a(i10, strE), arrayList);
        return null;
    }

    @Override // com.android.billingclient.api.a
    public final void f(String str, k1.f fVar) {
        R(str, fVar);
    }

    @Override // com.android.billingclient.api.a
    public final void g(f fVar, final k1.h hVar) {
        if (!c()) {
            d dVar = v.f5273m;
            P(t.a(2, 8, dVar));
            hVar.a(dVar, null);
            return;
        }
        final String strA = fVar.a();
        final List listB = fVar.b();
        if (TextUtils.isEmpty(strA)) {
            com.google.android.gms.internal.play_billing.a0.i("BillingClient", "Please fix the input params. SKU type can't be empty.");
            d dVar2 = v.f5266f;
            P(t.a(49, 8, dVar2));
            hVar.a(dVar2, null);
            return;
        }
        if (listB == null) {
            com.google.android.gms.internal.play_billing.a0.i("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            d dVar3 = v.f5265e;
            P(t.a(48, 8, dVar3));
            hVar.a(dVar3, null);
            return;
        }
        final String str = null;
        if (O(new Callable(strA, listB, str, hVar) { // from class: com.android.billingclient.api.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f5223b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ List f5224c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ k1.h f5225d;

            {
                this.f5225d = hVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f5222a.e0(this.f5223b, this.f5224c, null, this.f5225d);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f5229m.G(hVar);
            }
        }, K()) == null) {
            d dVarM = M();
            P(t.a(25, 8, dVarM));
            hVar.a(dVarM, null);
        }
    }

    @Override // com.android.billingclient.api.a
    public final void h(k1.c cVar) {
        if (c()) {
            com.google.android.gms.internal.play_billing.a0.h("BillingClient", "Service connection is valid. No need to re-initialize.");
            Q(t.c(6));
            cVar.a(v.f5272l);
            return;
        }
        int i10 = 1;
        if (this.f5139a == 1) {
            com.google.android.gms.internal.play_billing.a0.i("BillingClient", "Client is already in the process of connecting to billing service.");
            d dVar = v.f5264d;
            P(t.a(37, 6, dVar));
            cVar.a(dVar);
            return;
        }
        if (this.f5139a == 3) {
            com.google.android.gms.internal.play_billing.a0.i("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            d dVar2 = v.f5273m;
            P(t.a(38, 6, dVar2));
            cVar.a(dVar2);
            return;
        }
        this.f5139a = 1;
        com.google.android.gms.internal.play_billing.a0.h("BillingClient", "Starting in-app billing setup.");
        this.f5146h = new r(this, cVar, null);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.f5143e.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i10 = 41;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    com.google.android.gms.internal.play_billing.a0.i("BillingClient", "The device doesn't have valid Play Store.");
                    i10 = 40;
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f5140b);
                    if (this.f5143e.bindService(intent2, this.f5146h, 1)) {
                        com.google.android.gms.internal.play_billing.a0.h("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        com.google.android.gms.internal.play_billing.a0.i("BillingClient", "Connection to Billing service is blocked.");
                        i10 = 39;
                    }
                }
            }
        }
        this.f5139a = 0;
        com.google.android.gms.internal.play_billing.a0.h("BillingClient", "Billing service unavailable on device.");
        d dVar3 = v.f5263c;
        P(t.a(i10, 6, dVar3));
        cVar.a(dVar3);
    }
}

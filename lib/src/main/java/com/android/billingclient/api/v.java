package com.android.billingclient.api;

import com.android.billingclient.api.d;

/* loaded from: classes.dex */
abstract class v {
    static final d A;
    static final d B;
    static final d C;
    static final d D;
    static final d E;
    static final d F;

    /* renamed from: a, reason: collision with root package name */
    static final d f5261a;

    /* renamed from: b, reason: collision with root package name */
    static final d f5262b;

    /* renamed from: c, reason: collision with root package name */
    static final d f5263c;

    /* renamed from: d, reason: collision with root package name */
    static final d f5264d;

    /* renamed from: e, reason: collision with root package name */
    static final d f5265e;

    /* renamed from: f, reason: collision with root package name */
    static final d f5266f;

    /* renamed from: g, reason: collision with root package name */
    static final d f5267g;

    /* renamed from: h, reason: collision with root package name */
    static final d f5268h;

    /* renamed from: i, reason: collision with root package name */
    static final d f5269i;

    /* renamed from: j, reason: collision with root package name */
    static final d f5270j;

    /* renamed from: k, reason: collision with root package name */
    static final d f5271k;

    /* renamed from: l, reason: collision with root package name */
    static final d f5272l;

    /* renamed from: m, reason: collision with root package name */
    static final d f5273m;

    /* renamed from: n, reason: collision with root package name */
    static final d f5274n;

    /* renamed from: o, reason: collision with root package name */
    static final d f5275o;

    /* renamed from: p, reason: collision with root package name */
    static final d f5276p;

    /* renamed from: q, reason: collision with root package name */
    static final d f5277q;

    /* renamed from: r, reason: collision with root package name */
    static final d f5278r;

    /* renamed from: s, reason: collision with root package name */
    static final d f5279s;

    /* renamed from: t, reason: collision with root package name */
    static final d f5280t;

    /* renamed from: u, reason: collision with root package name */
    static final d f5281u;

    /* renamed from: v, reason: collision with root package name */
    static final d f5282v;

    /* renamed from: w, reason: collision with root package name */
    static final d f5283w;

    /* renamed from: x, reason: collision with root package name */
    static final d f5284x;

    /* renamed from: y, reason: collision with root package name */
    static final d f5285y;

    /* renamed from: z, reason: collision with root package name */
    static final d f5286z;

    static {
        d.a aVarC = d.c();
        aVarC.c(3);
        aVarC.b("Google Play In-app Billing API version is less than 3");
        f5261a = aVarC.a();
        d.a aVarC2 = d.c();
        aVarC2.c(3);
        aVarC2.b("Google Play In-app Billing API version is less than 9");
        f5262b = aVarC2.a();
        d.a aVarC3 = d.c();
        aVarC3.c(3);
        aVarC3.b("Billing service unavailable on device.");
        f5263c = aVarC3.a();
        d.a aVarC4 = d.c();
        aVarC4.c(5);
        aVarC4.b("Client is already in the process of connecting to billing service.");
        f5264d = aVarC4.a();
        d.a aVarC5 = d.c();
        aVarC5.c(5);
        aVarC5.b("The list of SKUs can't be empty.");
        f5265e = aVarC5.a();
        d.a aVarC6 = d.c();
        aVarC6.c(5);
        aVarC6.b("SKU type can't be empty.");
        f5266f = aVarC6.a();
        d.a aVarC7 = d.c();
        aVarC7.c(5);
        aVarC7.b("Product type can't be empty.");
        f5267g = aVarC7.a();
        d.a aVarC8 = d.c();
        aVarC8.c(-2);
        aVarC8.b("Client does not support extra params.");
        f5268h = aVarC8.a();
        d.a aVarC9 = d.c();
        aVarC9.c(5);
        aVarC9.b("Invalid purchase token.");
        f5269i = aVarC9.a();
        d.a aVarC10 = d.c();
        aVarC10.c(6);
        aVarC10.b("An internal error occurred.");
        f5270j = aVarC10.a();
        d.a aVarC11 = d.c();
        aVarC11.c(5);
        aVarC11.b("SKU can't be null.");
        f5271k = aVarC11.a();
        d.a aVarC12 = d.c();
        aVarC12.c(0);
        f5272l = aVarC12.a();
        d.a aVarC13 = d.c();
        aVarC13.c(-1);
        aVarC13.b("Service connection is disconnected.");
        f5273m = aVarC13.a();
        d.a aVarC14 = d.c();
        aVarC14.c(2);
        aVarC14.b("Timeout communicating with service.");
        f5274n = aVarC14.a();
        d.a aVarC15 = d.c();
        aVarC15.c(-2);
        aVarC15.b("Client does not support subscriptions.");
        f5275o = aVarC15.a();
        d.a aVarC16 = d.c();
        aVarC16.c(-2);
        aVarC16.b("Client does not support subscriptions update.");
        f5276p = aVarC16.a();
        d.a aVarC17 = d.c();
        aVarC17.c(-2);
        aVarC17.b("Client does not support get purchase history.");
        f5277q = aVarC17.a();
        d.a aVarC18 = d.c();
        aVarC18.c(-2);
        aVarC18.b("Client does not support price change confirmation.");
        f5278r = aVarC18.a();
        d.a aVarC19 = d.c();
        aVarC19.c(-2);
        aVarC19.b("Play Store version installed does not support cross selling products.");
        f5279s = aVarC19.a();
        d.a aVarC20 = d.c();
        aVarC20.c(-2);
        aVarC20.b("Client does not support multi-item purchases.");
        f5280t = aVarC20.a();
        d.a aVarC21 = d.c();
        aVarC21.c(-2);
        aVarC21.b("Client does not support offer_id_token.");
        f5281u = aVarC21.a();
        d.a aVarC22 = d.c();
        aVarC22.c(-2);
        aVarC22.b("Client does not support ProductDetails.");
        f5282v = aVarC22.a();
        d.a aVarC23 = d.c();
        aVarC23.c(-2);
        aVarC23.b("Client does not support in-app messages.");
        f5283w = aVarC23.a();
        d.a aVarC24 = d.c();
        aVarC24.c(-2);
        aVarC24.b("Client does not support user choice billing.");
        f5284x = aVarC24.a();
        d.a aVarC25 = d.c();
        aVarC25.c(-2);
        aVarC25.b("Play Store version installed does not support external offer.");
        f5285y = aVarC25.a();
        d.a aVarC26 = d.c();
        aVarC26.c(5);
        aVarC26.b("Unknown feature");
        f5286z = aVarC26.a();
        d.a aVarC27 = d.c();
        aVarC27.c(-2);
        aVarC27.b("Play Store version installed does not support get billing config.");
        A = aVarC27.a();
        d.a aVarC28 = d.c();
        aVarC28.c(-2);
        aVarC28.b("Query product details with serialized docid is not supported.");
        B = aVarC28.a();
        d.a aVarC29 = d.c();
        aVarC29.c(4);
        aVarC29.b("Item is unavailable for purchase.");
        C = aVarC29.a();
        d.a aVarC30 = d.c();
        aVarC30.c(-2);
        aVarC30.b("Query product details with developer specified account is not supported.");
        D = aVarC30.a();
        d.a aVarC31 = d.c();
        aVarC31.c(-2);
        aVarC31.b("Play Store version installed does not support alternative billing only.");
        E = aVarC31.a();
        d.a aVarC32 = d.c();
        aVarC32.c(5);
        aVarC32.b("To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        F = aVarC32.a();
    }

    static d a(int i10, String str) {
        d.a aVarC = d.c();
        aVarC.c(i10);
        aVarC.b(str);
        return aVarC.a();
    }
}

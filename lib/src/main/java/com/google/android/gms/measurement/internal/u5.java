package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class u5 {

    /* renamed from: a, reason: collision with root package name */
    final Context f20440a;

    /* renamed from: b, reason: collision with root package name */
    String f20441b;

    /* renamed from: c, reason: collision with root package name */
    String f20442c;

    /* renamed from: d, reason: collision with root package name */
    String f20443d;

    /* renamed from: e, reason: collision with root package name */
    Boolean f20444e;

    /* renamed from: f, reason: collision with root package name */
    long f20445f;

    /* renamed from: g, reason: collision with root package name */
    com.google.android.gms.internal.measurement.n1 f20446g;

    /* renamed from: h, reason: collision with root package name */
    boolean f20447h;

    /* renamed from: i, reason: collision with root package name */
    final Long f20448i;

    /* renamed from: j, reason: collision with root package name */
    String f20449j;

    public u5(Context context, com.google.android.gms.internal.measurement.n1 n1Var, Long l10) {
        this.f20447h = true;
        e4.p.l(context);
        Context applicationContext = context.getApplicationContext();
        e4.p.l(applicationContext);
        this.f20440a = applicationContext;
        this.f20448i = l10;
        if (n1Var != null) {
            this.f20446g = n1Var;
            this.f20441b = n1Var.f19125r;
            this.f20442c = n1Var.f19124q;
            this.f20443d = n1Var.f19123p;
            this.f20447h = n1Var.f19122o;
            this.f20445f = n1Var.f19121n;
            this.f20449j = n1Var.f19127t;
            Bundle bundle = n1Var.f19126s;
            if (bundle != null) {
                this.f20444e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}

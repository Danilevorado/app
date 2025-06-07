package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ds1 implements ct1 {

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f7486h = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a, reason: collision with root package name */
    private final cr1 f7487a;

    /* renamed from: b, reason: collision with root package name */
    private final bb3 f7488b;

    /* renamed from: c, reason: collision with root package name */
    private final do2 f7489c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f7490d;

    /* renamed from: e, reason: collision with root package name */
    private final ex1 f7491e;

    /* renamed from: f, reason: collision with root package name */
    private final au2 f7492f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f7493g;

    ds1(Context context, do2 do2Var, cr1 cr1Var, bb3 bb3Var, ScheduledExecutorService scheduledExecutorService, ex1 ex1Var, au2 au2Var) {
        this.f7493g = context;
        this.f7489c = do2Var;
        this.f7487a = cr1Var;
        this.f7488b = bb3Var;
        this.f7490d = scheduledExecutorService;
        this.f7491e = ex1Var;
        this.f7492f = au2Var;
    }

    @Override // com.google.android.gms.internal.ads.ct1
    public final ab3 a(k90 k90Var) {
        ab3 ab3VarB = this.f7487a.b(k90Var);
        ot2 ot2VarA = nt2.a(this.f7493g, 11);
        zt2.d(ab3VarB, ot2VarA);
        ab3 ab3VarM = qa3.m(ab3VarB, new w93() { // from class: com.google.android.gms.internal.ads.as1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f6225a.c((InputStream) obj);
            }
        }, this.f7488b);
        if (((Boolean) k3.w.c().b(ir.f5)).booleanValue()) {
            ab3VarM = qa3.f(qa3.n(ab3VarM, ((Integer) k3.w.c().b(ir.f9951g5)).intValue(), TimeUnit.SECONDS, this.f7490d), TimeoutException.class, new w93() { // from class: com.google.android.gms.internal.ads.bs1
                @Override // com.google.android.gms.internal.ads.w93
                public final ab3 a(Object obj) {
                    return qa3.g(new yq1(5));
                }
            }, of0.f13191f);
        }
        zt2.a(ab3VarM, this.f7492f, ot2VarA);
        qa3.q(ab3VarM, new cs1(this), of0.f13191f);
        return ab3VarM;
    }

    final /* synthetic */ ab3 c(InputStream inputStream) {
        return qa3.h(new un2(new rn2(this.f7489c), tn2.a(new InputStreamReader(inputStream))));
    }
}

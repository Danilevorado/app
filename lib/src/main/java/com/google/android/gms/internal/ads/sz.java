package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class sz implements ga {

    /* renamed from: a, reason: collision with root package name */
    private volatile fz f15604a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f15605b;

    public sz(Context context) {
        this.f15605b = context;
    }

    static /* bridge */ /* synthetic */ void c(sz szVar) {
        if (szVar.f15604a == null) {
            return;
        }
        szVar.f15604a.q();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.ga
    public final ja a(oa oaVar) throws xa {
        Parcelable.Creator<gz> creator = gz.CREATOR;
        Map mapQ = oaVar.q();
        int size = mapQ.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i10 = 0;
        int i11 = 0;
        for (Map.Entry entry : mapQ.entrySet()) {
            strArr[i11] = (String) entry.getKey();
            strArr2[i11] = (String) entry.getValue();
            i11++;
        }
        gz gzVar = new gz(oaVar.p(), strArr, strArr2);
        long jB = j3.t.b().b();
        try {
            tf0 tf0Var = new tf0();
            this.f15604a = new fz(this.f15605b, j3.t.v().b(), new qz(this, tf0Var), new rz(this, tf0Var));
            this.f15604a.u();
            oz ozVar = new oz(this, gzVar);
            bb3 bb3Var = of0.f13186a;
            ab3 ab3VarN = qa3.n(qa3.m(tf0Var, ozVar, bb3Var), ((Integer) k3.w.c().b(ir.f9930e4)).intValue(), TimeUnit.MILLISECONDS, of0.f13189d);
            ab3VarN.b(new pz(this), bb3Var);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ab3VarN.get();
            m3.n1.k("Http assets remote cache took " + (j3.t.b().b() - jB) + "ms");
            iz izVar = (iz) new h90(parcelFileDescriptor).f(iz.CREATOR);
            if (izVar == null) {
                return null;
            }
            if (izVar.f10219m) {
                throw new xa(izVar.f10220n);
            }
            if (izVar.f10223q.length != izVar.f10224r.length) {
                return null;
            }
            HashMap map = new HashMap();
            while (true) {
                String[] strArr3 = izVar.f10223q;
                if (i10 >= strArr3.length) {
                    return new ja(izVar.f10221o, izVar.f10222p, map, izVar.f10225s, izVar.f10226t);
                }
                map.put(strArr3[i10], izVar.f10224r[i10]);
                i10++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            m3.n1.k("Http assets remote cache took " + (j3.t.b().b() - jB) + "ms");
            return null;
        } catch (Throwable th) {
            m3.n1.k("Http assets remote cache took " + (j3.t.b().b() - jB) + "ms");
            throw th;
        }
    }
}

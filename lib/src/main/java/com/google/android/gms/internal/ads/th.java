package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class th extends ui {

    /* renamed from: j, reason: collision with root package name */
    private static final vi f15840j = new vi();

    /* renamed from: i, reason: collision with root package name */
    private final Context f15841i;

    public th(dh dhVar, String str, String str2, xc xcVar, int i10, int i11, Context context, qc qcVar) {
        super(dhVar, "AEKrzIydHngo8q7U2b8x25JI4cfZS+4qAP315Zd3WikH6poIulxYQwD/LrG8ezMS", "vKrEk100dPKKqaxICALjJbVlJ7Gg4dfwKwDEqSKZDKo=", xcVar, i10, 27);
        this.f15841i = context;
    }

    private final String d() throws ExecutionException, InterruptedException {
        try {
            if (this.f16342b.l() != null) {
                this.f16342b.l().get();
            }
            vd vdVarC = this.f16342b.c();
            if (vdVarC == null || !vdVarC.u0()) {
                return null;
            }
            return vdVarC.J0();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() {
        int i10;
        le leVar;
        AtomicReference atomicReferenceA = f15840j.a(this.f15841i.getPackageName());
        synchronized (atomicReferenceA) {
            le leVar2 = (le) atomicReferenceA.get();
            if (leVar2 == null || hh.d(leVar2.f11517b) || leVar2.f11517b.equals("E") || leVar2.f11517b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (hh.d(null)) {
                    hh.d(null);
                    Boolean.FALSE.booleanValue();
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                Boolean boolValueOf = Boolean.valueOf(i10 == 3);
                Boolean bool = (Boolean) k3.w.c().b(ir.f9917d2);
                String strC = ((Boolean) k3.w.c().b(ir.f9906c2)).booleanValue() ? c() : null;
                if (bool.booleanValue() && this.f16342b.p() && hh.d(strC)) {
                    strC = d();
                }
                le leVar3 = new le((String) this.f16346f.invoke(null, this.f15841i, boolValueOf, strC));
                if (hh.d(leVar3.f11517b) || leVar3.f11517b.equals("E")) {
                    int i11 = i10 - 1;
                    if (i11 == 3) {
                        String strD = d();
                        if (!hh.d(strD)) {
                            leVar3.f11517b = strD;
                        }
                    } else if (i11 == 4) {
                        throw null;
                    }
                }
                atomicReferenceA.set(leVar3);
            }
            leVar = (le) atomicReferenceA.get();
        }
        synchronized (this.f16345e) {
            if (leVar != null) {
                this.f16345e.z0(leVar.f11517b);
                this.f16345e.S(leVar.f11518c);
                this.f16345e.U(leVar.f11519d);
                this.f16345e.k0(leVar.f11520e);
                this.f16345e.y0(leVar.f11521f);
            }
        }
    }

    protected final String c() throws PackageManager.NameNotFoundException, CertificateException {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrF = hh.f((String) k3.w.c().b(ir.f9928e2));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrF)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(hh.f((String) k3.w.c().b(ir.f9938f2)))));
            }
            Context context = this.f15841i;
            String packageName = context.getPackageName();
            this.f16342b.k();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final kb3 kb3VarD = kb3.D();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.wi
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    kb3 kb3Var = kb3VarD;
                    if (list == null) {
                        kb3Var.h(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ApkChecksum apkChecksum = (ApkChecksum) list.get(i10);
                            if (apkChecksum.getType() == 8) {
                                kb3Var.h(hh.b(apkChecksum.getValue()));
                                return;
                            }
                        }
                        kb3Var.h(null);
                    } catch (Throwable unused) {
                        kb3Var.h(null);
                    }
                }
            });
            return (String) kb3VarD.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}

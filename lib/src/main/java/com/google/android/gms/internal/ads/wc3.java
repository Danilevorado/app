package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class wc3 {

    /* renamed from: a, reason: collision with root package name */
    private final List f17058a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f17059b = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        Iterator it = this.f17058a.iterator();
        while (it.hasNext()) {
            ((uc3) it.next()).f16281a = false;
        }
    }

    public final wc3 a(uc3 uc3Var) {
        if (uc3Var.f16286f != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (uc3Var.f16281a) {
            d();
        }
        uc3Var.f16286f = this;
        this.f17058a.add(uc3Var);
        return this;
    }

    public final zc3 b() throws GeneralSecurityException {
        int i10;
        if (this.f17059b) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.f17059b = true;
        xs3 xs3VarM = bt3.M();
        List list = this.f17058a;
        for (int i11 = 0; i11 < list.size() - 1; i11++) {
            if (((uc3) list.get(i11)).f16285e == vc3.f16652a && ((uc3) list.get(i11 + 1)).f16285e != vc3.f16652a) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (uc3 uc3Var : this.f17058a) {
            qc3 unused = uc3Var.f16282b;
            if (uc3Var.f16285e == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i12 = 3;
            if (uc3Var.f16285e == vc3.f16652a) {
                i10 = 0;
                while (true) {
                    if (i10 != 0 && !hashSet.contains(Integer.valueOf(i10))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[4];
                    int i13 = 0;
                    while (i13 == 0) {
                        secureRandom.nextBytes(bArr);
                        i13 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    }
                    i10 = i13;
                }
            } else {
                vc3 unused2 = uc3Var.f16285e;
                i10 = 0;
            }
            Integer numValueOf = Integer.valueOf(i10);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException("Id " + i10 + " is used twice in the keyset");
            }
            hashSet.add(numValueOf);
            uc3.a(uc3Var);
            ed3 ed3Var = uc3Var.f16284d;
            qc3 qc3VarC = uc3Var.c();
            if (!qc3.f14237b.equals(qc3VarC)) {
                if (qc3.f14238c.equals(qc3VarC)) {
                    i12 = 4;
                } else {
                    if (!qc3.f14239d.equals(qc3VarC)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i12 = 5;
                }
            }
            kl3 kl3VarA = ((gk3) ed3Var).a();
            ns3 ns3VarC = qd3.c(kl3VarA.b());
            zs3 zs3VarM = at3.M();
            zs3VarM.v(i10);
            zs3VarM.y(i12);
            zs3VarM.u(ns3VarC);
            zs3VarM.w(kl3VarA.b().N());
            xs3VarM.u((at3) zs3VarM.m());
            if (uc3Var.f16281a) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                num = numValueOf;
            }
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        xs3VarM.v(num.intValue());
        return zc3.a((bt3) xs3VarM.m());
    }
}

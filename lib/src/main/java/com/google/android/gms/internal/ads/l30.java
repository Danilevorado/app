package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* loaded from: classes.dex */
public final class l30 extends n30 {

    /* renamed from: m, reason: collision with root package name */
    private static final p50 f11311m = new p50();

    @Override // com.google.android.gms.internal.ads.o30
    public final boolean W(String str) {
        try {
            return o3.a.class.isAssignableFrom(Class.forName(str, false, l30.class.getClassLoader()));
        } catch (Throwable unused) {
            ze0.g("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.o30
    public final l50 Y(String str) {
        return new y50((RtbAdapter) Class.forName(str, false, p50.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // com.google.android.gms.internal.ads.o30
    public final boolean s(String str) {
        try {
            return p3.a.class.isAssignableFrom(Class.forName(str, false, l30.class.getClassLoader()));
        } catch (Throwable unused) {
            ze0.g("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.o30
    public final r30 x(String str) throws RemoteException {
        n40 n40Var;
        try {
            try {
                Class<?> cls = Class.forName(str, false, l30.class.getClassLoader());
                if (o3.f.class.isAssignableFrom(cls)) {
                    return new n40((o3.f) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (o3.a.class.isAssignableFrom(cls)) {
                    return new n40((o3.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                ze0.g("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable th) {
                ze0.h("Could not instantiate mediation adapter: " + str + ". ", th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            ze0.b("Reflection failed, retrying using direct instantiation");
            if (!"com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    n40Var = new n40(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
            n40Var = new n40(new AdMobAdapter());
            return n40Var;
        }
    }
}

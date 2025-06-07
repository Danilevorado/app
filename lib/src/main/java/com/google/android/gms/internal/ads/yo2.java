package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class yo2 {

    /* renamed from: d, reason: collision with root package name */
    private static yo2 f18240d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f18241a;

    /* renamed from: b, reason: collision with root package name */
    private final k3.i1 f18242b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f18243c = new AtomicReference();

    yo2(Context context, k3.i1 i1Var) {
        this.f18241a = context;
        this.f18242b = i1Var;
    }

    static k3.i1 a(Context context) {
        try {
            return k3.h1.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e5) {
            ze0.e("Failed to retrieve lite SDK info.", e5);
            return null;
        }
    }

    public static yo2 d(Context context) {
        synchronized (yo2.class) {
            yo2 yo2Var = f18240d;
            if (yo2Var != null) {
                return yo2Var;
            }
            Context applicationContext = context.getApplicationContext();
            long jLongValue = ((Long) gt.f8879b.e()).longValue();
            k3.i1 i1VarA = null;
            if (jLongValue > 0 && jLongValue <= 231004600) {
                i1VarA = a(applicationContext);
            }
            yo2 yo2Var2 = new yo2(applicationContext, i1VarA);
            f18240d = yo2Var2;
            return yo2Var2;
        }
    }

    public final o30 b() {
        return (o30) this.f18243c.get();
    }

    public final ff0 c(int i10, boolean z10, int i11) {
        j3.t.r();
        boolean zW = m3.b2.W(this.f18241a);
        ff0 ff0Var = new ff0(231004000, i11, true, zW);
        if (!((Boolean) gt.f8880c.e()).booleanValue()) {
            return ff0Var;
        }
        k3.i1 i1Var = this.f18242b;
        k3.c3 liteSdkVersion = null;
        if (i1Var != null) {
            try {
                liteSdkVersion = i1Var.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return liteSdkVersion == null ? ff0Var : new ff0(231004000, liteSdkVersion.f(), true, zW);
    }

    public final void e(o30 o30Var) {
        o30 adapterCreator;
        if (!((Boolean) gt.f8878a.e()).booleanValue()) {
            xo2.a(this.f18243c, null, o30Var);
            return;
        }
        k3.i1 i1Var = this.f18242b;
        if (i1Var == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = i1Var.getAdapterCreator();
            } catch (RemoteException unused) {
            }
        }
        AtomicReference atomicReference = this.f18243c;
        if (adapterCreator != null) {
            o30Var = adapterCreator;
        }
        xo2.a(atomicReference, null, o30Var);
    }
}

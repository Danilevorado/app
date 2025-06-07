package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class kk2 {
    public static void a(AtomicReference atomicReference, jk2 jk2Var) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            jk2Var.a(obj);
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        } catch (NullPointerException e10) {
            ze0.h("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }
}

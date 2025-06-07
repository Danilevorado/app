package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
final class ne implements Runnable {
    /* synthetic */ ne(me meVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            oe.f13167b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        } catch (Throwable th) {
            oe.f13170e.countDown();
            throw th;
        }
        oe.f13170e.countDown();
    }
}

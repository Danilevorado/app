package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public abstract class pk {

    /* renamed from: b, reason: collision with root package name */
    private static MessageDigest f13920b;

    /* renamed from: a, reason: collision with root package name */
    protected final Object f13921a = new Object();

    protected final MessageDigest a() {
        synchronized (this.f13921a) {
            MessageDigest messageDigest = f13920b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i10 = 0; i10 < 2; i10++) {
                try {
                    f13920b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f13920b;
        }
    }

    abstract byte[] b(String str);
}

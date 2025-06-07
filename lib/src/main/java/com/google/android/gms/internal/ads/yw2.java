package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class yw2 {

    /* renamed from: c, reason: collision with root package name */
    protected static final byte[] f18293c = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* renamed from: d, reason: collision with root package name */
    protected static final byte[] f18294d = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f18295a = f18294d;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f18296b = f18293c;

    public final boolean a(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] x509CertificateArrA = t9.a(file.getAbsolutePath());
            if (x509CertificateArrA.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(x509CertificateArrA[0][0].getEncoded());
            if (Arrays.equals(this.f18296b, bArrDigest)) {
                return true;
            }
            return !"user".equals(Build.TYPE) && Arrays.equals(this.f18295a, bArrDigest);
        } catch (q9 e5) {
            throw new GeneralSecurityException("Package is not signed", e5);
        } catch (IOException e10) {
            e = e10;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e11) {
            e = e11;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}

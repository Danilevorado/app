package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
final class rk {

    /* renamed from: a, reason: collision with root package name */
    ByteArrayOutputStream f14828a = new ByteArrayOutputStream(4096);

    /* renamed from: b, reason: collision with root package name */
    Base64OutputStream f14829b = new Base64OutputStream(this.f14828a, 10);

    public final String toString() throws IOException {
        String string;
        try {
            this.f14829b.close();
        } catch (IOException e5) {
            ze0.e("HashManager: Unable to convert to Base64.", e5);
        }
        try {
            try {
                this.f14828a.close();
                string = this.f14828a.toString();
            } catch (IOException e10) {
                ze0.e("HashManager: Unable to convert to Base64.", e10);
                string = "";
            }
            return string;
        } finally {
            this.f14828a = null;
            this.f14829b = null;
        }
    }
}

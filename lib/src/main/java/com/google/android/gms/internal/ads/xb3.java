package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class xb3 {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f17501a;

    private xb3(InputStream inputStream) {
        this.f17501a = inputStream;
    }

    public static xb3 b(byte[] bArr) {
        return new xb3(new ByteArrayInputStream(bArr));
    }

    public final bt3 a() throws IOException {
        try {
            return bt3.P(this.f17501a, qx3.a());
        } finally {
            this.f17501a.close();
        }
    }
}

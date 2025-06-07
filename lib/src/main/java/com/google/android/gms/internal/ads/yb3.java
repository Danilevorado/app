package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class yb3 {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f17955a;

    private yb3(OutputStream outputStream) {
        this.f17955a = outputStream;
    }

    public static yb3 b(OutputStream outputStream) {
        return new yb3(outputStream);
    }

    public final void a(bt3 bt3Var) throws IOException {
        try {
            bt3Var.g(this.f17955a);
        } finally {
            this.f17955a.close();
        }
    }
}

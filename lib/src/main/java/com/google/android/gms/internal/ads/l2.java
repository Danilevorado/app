package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f11295a;

    /* renamed from: b, reason: collision with root package name */
    private final DataOutputStream f11296b;

    public l2() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f11295a = byteArrayOutputStream;
        this.f11296b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] a(k2 k2Var) throws IOException {
        this.f11295a.reset();
        try {
            b(this.f11296b, k2Var.f10779m);
            String str = k2Var.f10780n;
            if (str == null) {
                str = "";
            }
            b(this.f11296b, str);
            this.f11296b.writeLong(k2Var.f10781o);
            this.f11296b.writeLong(k2Var.f10782p);
            this.f11296b.write(k2Var.f10783q);
            this.f11296b.flush();
            return this.f11295a.toByteArray();
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }
}

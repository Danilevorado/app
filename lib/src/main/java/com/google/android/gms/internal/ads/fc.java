package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes.dex */
public final class fc extends k34 {
    private long A;
    private double B;
    private float C;
    private v34 D;
    private long E;

    /* renamed from: x, reason: collision with root package name */
    private Date f8215x;

    /* renamed from: y, reason: collision with root package name */
    private Date f8216y;

    /* renamed from: z, reason: collision with root package name */
    private long f8217z;

    public fc() {
        super("mvhd");
        this.B = 1.0d;
        this.C = 1.0f;
        this.D = v34.f16568j;
    }

    @Override // com.google.android.gms.internal.ads.i34
    public final void d(ByteBuffer byteBuffer) {
        long jE;
        h(byteBuffer);
        if (g() == 1) {
            this.f8215x = q34.a(bc.f(byteBuffer));
            this.f8216y = q34.a(bc.f(byteBuffer));
            this.f8217z = bc.e(byteBuffer);
            jE = bc.f(byteBuffer);
        } else {
            this.f8215x = q34.a(bc.e(byteBuffer));
            this.f8216y = q34.a(bc.e(byteBuffer));
            this.f8217z = bc.e(byteBuffer);
            jE = bc.e(byteBuffer);
        }
        this.A = jE;
        this.B = bc.b(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.C = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        bc.d(byteBuffer);
        bc.e(byteBuffer);
        bc.e(byteBuffer);
        this.D = new v34(bc.b(byteBuffer), bc.b(byteBuffer), bc.b(byteBuffer), bc.b(byteBuffer), bc.a(byteBuffer), bc.a(byteBuffer), bc.a(byteBuffer), bc.b(byteBuffer), bc.b(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.E = bc.e(byteBuffer);
    }

    public final long i() {
        return this.A;
    }

    public final long j() {
        return this.f8217z;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f8215x + ";modificationTime=" + this.f8216y + ";timescale=" + this.f8217z + ";duration=" + this.A + ";rate=" + this.B + ";volume=" + this.C + ";matrix=" + this.D + ";nextTrackId=" + this.E + "]";
    }
}

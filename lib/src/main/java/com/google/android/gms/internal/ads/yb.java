package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class yb implements zb {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f17952b = Logger.getLogger(yb.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final ThreadLocal f17953a = new xb(this);

    @Override // com.google.android.gms.internal.ads.zb
    public final cc a(o34 o34Var, dc dcVar) throws EOFException {
        int iM;
        long jD;
        long jB = o34Var.b();
        ((ByteBuffer) this.f17953a.get()).rewind().limit(8);
        do {
            iM = o34Var.M((ByteBuffer) this.f17953a.get());
            if (iM == 8) {
                ((ByteBuffer) this.f17953a.get()).rewind();
                long jE = bc.e((ByteBuffer) this.f17953a.get());
                byte[] bArr = null;
                if (jE < 8 && jE > 1) {
                    Logger logger = f17952b;
                    Level level = Level.SEVERE;
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Plausibility check failed: size < 8 (size = ");
                    sb2.append(jE);
                    sb2.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb2.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.f17953a.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (jE == 1) {
                        ((ByteBuffer) this.f17953a.get()).limit(16);
                        o34Var.M((ByteBuffer) this.f17953a.get());
                        ((ByteBuffer) this.f17953a.get()).position(8);
                        jD = bc.f((ByteBuffer) this.f17953a.get()) - 16;
                    } else {
                        jD = jE == 0 ? o34Var.d() - o34Var.b() : jE - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) this.f17953a.get()).limit(((ByteBuffer) this.f17953a.get()).limit() + 16);
                        o34Var.M((ByteBuffer) this.f17953a.get());
                        bArr = new byte[16];
                        for (int iPosition = ((ByteBuffer) this.f17953a.get()).position() - 16; iPosition < ((ByteBuffer) this.f17953a.get()).position(); iPosition++) {
                            bArr[iPosition - (((ByteBuffer) this.f17953a.get()).position() - 16)] = ((ByteBuffer) this.f17953a.get()).get(iPosition);
                        }
                        jD -= 16;
                    }
                    long j10 = jD;
                    cc ccVarB = b(str, bArr, dcVar instanceof cc ? ((cc) dcVar).a() : "");
                    ccVarB.e(dcVar);
                    ((ByteBuffer) this.f17953a.get()).rewind();
                    ccVarB.c(o34Var, (ByteBuffer) this.f17953a.get(), j10, this);
                    return ccVarB;
                } catch (UnsupportedEncodingException e5) {
                    throw new RuntimeException(e5);
                }
            }
        } while (iM >= 0);
        o34Var.h(jB);
        throw new EOFException();
    }

    public abstract cc b(String str, byte[] bArr, String str2);
}

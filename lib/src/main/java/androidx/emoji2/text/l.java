package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
abstract class l {

    private static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f2643a;

        a(ByteBuffer byteBuffer) {
            this.f2643a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.l.c
        public void a(int i10) {
            ByteBuffer byteBuffer = this.f2643a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // androidx.emoji2.text.l.c
        public long b() {
            return l.c(this.f2643a.getInt());
        }

        @Override // androidx.emoji2.text.l.c
        public int c() {
            return this.f2643a.getInt();
        }

        @Override // androidx.emoji2.text.l.c
        public long getPosition() {
            return this.f2643a.position();
        }

        @Override // androidx.emoji2.text.l.c
        public int readUnsignedShort() {
            return l.d(this.f2643a.getShort());
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f2644a;

        /* renamed from: b, reason: collision with root package name */
        private final long f2645b;

        b(long j10, long j11) {
            this.f2644a = j10;
            this.f2645b = j11;
        }

        long a() {
            return this.f2644a;
        }
    }

    private interface c {
        void a(int i10);

        long b();

        int c();

        long getPosition();

        int readUnsignedShort();
    }

    private static b a(c cVar) throws IOException {
        long jB;
        cVar.a(4);
        int unsignedShort = cVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.a(6);
        int i10 = 0;
        while (true) {
            if (i10 >= unsignedShort) {
                jB = -1;
                break;
            }
            int iC = cVar.c();
            cVar.a(4);
            jB = cVar.b();
            cVar.a(4);
            if (1835365473 == iC) {
                break;
            }
            i10++;
        }
        if (jB != -1) {
            cVar.a((int) (jB - cVar.getPosition()));
            cVar.a(12);
            long jB2 = cVar.b();
            for (int i11 = 0; i11 < jB2; i11++) {
                int iC2 = cVar.c();
                long jB3 = cVar.b();
                long jB4 = cVar.b();
                if (1164798569 == iC2 || 1701669481 == iC2) {
                    return new b(jB3 + jB, jB4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static g0.b b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).a());
        return g0.b.h(byteBufferDuplicate);
    }

    static long c(int i10) {
        return i10 & 4294967295L;
    }

    static int d(short s10) {
        return s10 & 65535;
    }
}

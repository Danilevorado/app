package a2;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class k implements ImageHeaderParser {

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f27a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f28b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f29a;

        a(ByteBuffer byteBuffer) {
            this.f29a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // a2.k.c
        public int a(byte[] bArr, int i10) {
            int iMin = Math.min(i10, this.f29a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f29a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // a2.k.c
        public short b() throws c.a {
            if (this.f29a.remaining() >= 1) {
                return (short) (this.f29a.get() & 255);
            }
            throw new c.a();
        }

        @Override // a2.k.c
        public int c() {
            return (b() << 8) | b();
        }

        @Override // a2.k.c
        public long skip(long j10) {
            int iMin = (int) Math.min(this.f29a.remaining(), j10);
            ByteBuffer byteBuffer = this.f29a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f30a;

        b(byte[] bArr, int i10) {
            this.f30a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        private boolean c(int i10, int i11) {
            return this.f30a.remaining() - i10 >= i11;
        }

        short a(int i10) {
            if (c(i10, 2)) {
                return this.f30a.getShort(i10);
            }
            return (short) -1;
        }

        int b(int i10) {
            if (c(i10, 4)) {
                return this.f30a.getInt(i10);
            }
            return -1;
        }

        int d() {
            return this.f30a.remaining();
        }

        void e(ByteOrder byteOrder) {
            this.f30a.order(byteOrder);
        }
    }

    private interface c {

        public static final class a extends IOException {
            a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a(byte[] bArr, int i10);

        short b();

        int c();

        long skip(long j10);
    }

    private static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        private final InputStream f31a;

        d(InputStream inputStream) {
            this.f31a = inputStream;
        }

        @Override // a2.k.c
        public int a(byte[] bArr, int i10) throws c.a {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f31a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 == 0 && i12 == -1) {
                throw new c.a();
            }
            return i11;
        }

        @Override // a2.k.c
        public short b() throws IOException {
            int i10 = this.f31a.read();
            if (i10 != -1) {
                return (short) i10;
            }
            throw new c.a();
        }

        @Override // a2.k.c
        public int c() {
            return (b() << 8) | b();
        }

        @Override // a2.k.c
        public long skip(long j10) throws IOException {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long jSkip = this.f31a.skip(j11);
                if (jSkip <= 0) {
                    if (this.f31a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j11 -= jSkip;
            }
            return j10 - j11;
        }
    }

    private static int e(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    private int f(c cVar, u1.b bVar) {
        try {
            int iC = cVar.c();
            if (!h(iC)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iC);
                }
                return -1;
            }
            int iJ = j(cVar);
            if (iJ == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) bVar.e(iJ, byte[].class);
            try {
                return l(cVar, bArr, iJ);
            } finally {
                bVar.d(bArr);
            }
        } catch (c.a unused) {
            return -1;
        }
    }

    private ImageHeaderParser.ImageType g(c cVar) {
        try {
            int iC = cVar.c();
            if (iC == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iB = (iC << 8) | cVar.b();
            if (iB == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iB2 = (iB << 8) | cVar.b();
            if (iB2 == -1991225785) {
                cVar.skip(21L);
                try {
                    return cVar.b() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iB2 != 1380533830) {
                return m(cVar, iB2) ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
            }
            cVar.skip(4L);
            if (((cVar.c() << 16) | cVar.c()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iC2 = (cVar.c() << 16) | cVar.c();
            if ((iC2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i10 = iC2 & 255;
            if (i10 == 88) {
                cVar.skip(4L);
                short sB = cVar.b();
                return (sB & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (sB & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i10 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            cVar.skip(4L);
            return (cVar.b() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static boolean h(int i10) {
        return (i10 & 65496) == 65496 || i10 == 19789 || i10 == 18761;
    }

    private boolean i(byte[] bArr, int i10) {
        boolean z10 = bArr != null && i10 > f27a.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f27a;
                if (i11 >= bArr2.length) {
                    break;
                }
                if (bArr[i11] != bArr2[i11]) {
                    return false;
                }
                i11++;
            }
        }
        return z10;
    }

    private int j(c cVar) {
        short sB;
        int iC;
        long j10;
        long jSkip;
        do {
            short sB2 = cVar.b();
            if (sB2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sB2));
                }
                return -1;
            }
            sB = cVar.b();
            if (sB == 218) {
                return -1;
            }
            if (sB == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            iC = cVar.c() - 2;
            if (sB == 225) {
                return iC;
            }
            j10 = iC;
            jSkip = cVar.skip(j10);
        } while (jSkip == j10);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) sB) + ", wanted to skip: " + iC + ", but actually skipped: " + jSkip);
        }
        return -1;
    }

    private static int k(b bVar) {
        ByteOrder byteOrder;
        StringBuilder sb2;
        String str;
        String string;
        short sA = bVar.a(6);
        if (sA != 18761) {
            if (sA != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) sA));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.e(byteOrder);
        int iB = bVar.b(10) + 6;
        short sA2 = bVar.a(iB);
        for (int i10 = 0; i10 < sA2; i10++) {
            int iE = e(iB, i10);
            short sA3 = bVar.a(iE);
            if (sA3 == 274) {
                short sA4 = bVar.a(iE + 2);
                if (sA4 >= 1 && sA4 <= 12) {
                    int iB2 = bVar.b(iE + 4);
                    if (iB2 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i10 + " tagType=" + ((int) sA3) + " formatCode=" + ((int) sA4) + " componentCount=" + iB2);
                        }
                        int i11 = iB2 + f28b[sA4];
                        if (i11 <= 4) {
                            int i12 = iE + 8;
                            if (i12 >= 0 && i12 <= bVar.d()) {
                                if (i11 >= 0 && i11 + i12 <= bVar.d()) {
                                    return bVar.a(i12);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    sb2 = new StringBuilder();
                                    sb2.append("Illegal number of bytes for TI tag data tagType=");
                                    sb2.append((int) sA3);
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                string = "Illegal tagValueOffset=" + i12 + " tagType=" + ((int) sA3);
                                Log.d("DfltImageHeaderParser", string);
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            sb2 = new StringBuilder();
                            str = "Got byte count > 4, not orientation, continuing, formatCode=";
                            sb2.append(str);
                            sb2.append((int) sA4);
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        string = "Negative tiff component count";
                        Log.d("DfltImageHeaderParser", string);
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    sb2 = new StringBuilder();
                    str = "Got invalid format code = ";
                    sb2.append(str);
                    sb2.append((int) sA4);
                }
                string = sb2.toString();
                Log.d("DfltImageHeaderParser", string);
            }
        }
        return -1;
    }

    private int l(c cVar, byte[] bArr, int i10) {
        int iA = cVar.a(bArr, i10);
        if (iA == i10) {
            if (i(bArr, i10)) {
                return k(new b(bArr, i10));
            }
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + iA);
        }
        return -1;
    }

    private boolean m(c cVar, int i10) {
        if (((cVar.c() << 16) | cVar.c()) != 1718909296) {
            return false;
        }
        int iC = (cVar.c() << 16) | cVar.c();
        if (iC == 1635150182 || iC == 1635150195) {
            return true;
        }
        cVar.skip(4L);
        int i11 = i10 - 16;
        if (i11 % 4 != 0) {
            return false;
        }
        int i12 = 0;
        while (i12 < 5 && i11 > 0) {
            int iC2 = (cVar.c() << 16) | cVar.c();
            if (iC2 == 1635150182 || iC2 == 1635150195) {
                return true;
            }
            i12++;
            i11 -= 4;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return g(new a((ByteBuffer) n2.k.d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(ByteBuffer byteBuffer, u1.b bVar) {
        return f(new a((ByteBuffer) n2.k.d(byteBuffer)), (u1.b) n2.k.d(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int c(InputStream inputStream, u1.b bVar) {
        return f(new d((InputStream) n2.k.d(inputStream)), (u1.b) n2.k.d(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType d(InputStream inputStream) {
        return g(new d((InputStream) n2.k.d(inputStream)));
    }
}

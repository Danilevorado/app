package q1;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import q1.a;

/* loaded from: classes.dex */
public class e implements a {

    /* renamed from: u, reason: collision with root package name */
    private static final String f26122u = "e";

    /* renamed from: a, reason: collision with root package name */
    private int[] f26123a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f26124b;

    /* renamed from: c, reason: collision with root package name */
    private final a.InterfaceC0177a f26125c;

    /* renamed from: d, reason: collision with root package name */
    private ByteBuffer f26126d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f26127e;

    /* renamed from: f, reason: collision with root package name */
    private short[] f26128f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f26129g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f26130h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f26131i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f26132j;

    /* renamed from: k, reason: collision with root package name */
    private int f26133k;

    /* renamed from: l, reason: collision with root package name */
    private c f26134l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f26135m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f26136n;

    /* renamed from: o, reason: collision with root package name */
    private int f26137o;

    /* renamed from: p, reason: collision with root package name */
    private int f26138p;

    /* renamed from: q, reason: collision with root package name */
    private int f26139q;

    /* renamed from: r, reason: collision with root package name */
    private int f26140r;

    /* renamed from: s, reason: collision with root package name */
    private Boolean f26141s;

    /* renamed from: t, reason: collision with root package name */
    private Bitmap.Config f26142t;

    public e(a.InterfaceC0177a interfaceC0177a) {
        this.f26124b = new int[256];
        this.f26142t = Bitmap.Config.ARGB_8888;
        this.f26125c = interfaceC0177a;
        this.f26134l = new c();
    }

    public e(a.InterfaceC0177a interfaceC0177a, c cVar, ByteBuffer byteBuffer, int i10) {
        this(interfaceC0177a);
        r(cVar, byteBuffer, i10);
    }

    private int j(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f26138p + i10; i18++) {
            byte[] bArr = this.f26131i;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f26123a[bArr[i18] & 255];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f26138p + i20; i21++) {
            byte[] bArr2 = this.f26131i;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f26123a[bArr2[i21] & 255];
            if (i22 != 0) {
                i13 += (i22 >> 24) & 255;
                i14 += (i22 >> 16) & 255;
                i15 += (i22 >> 8) & 255;
                i16 += i22 & 255;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    private void k(b bVar) {
        Boolean bool;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = this.f26132j;
        int i15 = bVar.f26097d;
        int i16 = this.f26138p;
        int i17 = i15 / i16;
        int i18 = bVar.f26095b / i16;
        int i19 = bVar.f26096c / i16;
        int i20 = bVar.f26094a / i16;
        boolean z10 = this.f26133k == 0;
        int i21 = this.f26140r;
        int i22 = this.f26139q;
        byte[] bArr = this.f26131i;
        int[] iArr2 = this.f26123a;
        Boolean bool2 = this.f26141s;
        int i23 = 8;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1;
        while (true) {
            bool = bool2;
            if (i24 >= i17) {
                break;
            }
            if (bVar.f26098e) {
                if (i25 >= i17) {
                    i10 = i17;
                    int i27 = i26 + 1;
                    if (i27 == 2) {
                        i26 = i27;
                        i25 = 4;
                    } else if (i27 != 3) {
                        i26 = i27;
                        if (i27 == 4) {
                            i25 = 1;
                            i23 = 2;
                        }
                    } else {
                        i26 = i27;
                        i23 = 4;
                        i25 = 2;
                    }
                } else {
                    i10 = i17;
                }
                i11 = i25 + i23;
            } else {
                i10 = i17;
                i11 = i25;
                i25 = i24;
            }
            int i28 = i25 + i18;
            boolean z11 = i16 == 1;
            if (i28 < i22) {
                int i29 = i28 * i21;
                int i30 = i29 + i20;
                int i31 = i30 + i19;
                int i32 = i29 + i21;
                if (i32 < i31) {
                    i31 = i32;
                }
                i12 = i11;
                int i33 = i24 * i16 * bVar.f26096c;
                if (z11) {
                    int i34 = i30;
                    while (true) {
                        i13 = i18;
                        if (i34 >= i31) {
                            break;
                        }
                        int i35 = iArr2[bArr[i33] & 255];
                        if (i35 != 0) {
                            iArr[i34] = i35;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i33 += i16;
                        i34++;
                        i18 = i13;
                    }
                } else {
                    i13 = i18;
                    int i36 = ((i31 - i30) * i16) + i33;
                    int i37 = i30;
                    while (true) {
                        i14 = i19;
                        if (i37 < i31) {
                            int iJ = j(i33, i36, bVar.f26096c);
                            if (iJ != 0) {
                                iArr[i37] = iJ;
                            } else if (z10 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i33 += i16;
                            i37++;
                            i19 = i14;
                        }
                    }
                    bool2 = bool;
                    i24++;
                    i18 = i13;
                    i19 = i14;
                    i17 = i10;
                    i25 = i12;
                }
            } else {
                i12 = i11;
                i13 = i18;
            }
            i14 = i19;
            bool2 = bool;
            i24++;
            i18 = i13;
            i19 = i14;
            i17 = i10;
            i25 = i12;
        }
        if (this.f26141s == null) {
            this.f26141s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    private void l(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f26132j;
        int i10 = bVar2.f26097d;
        int i11 = bVar2.f26095b;
        int i12 = bVar2.f26096c;
        int i13 = bVar2.f26094a;
        boolean z10 = this.f26133k == 0;
        int i14 = this.f26140r;
        byte[] bArr = this.f26131i;
        int[] iArr2 = this.f26123a;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = bVar2.f26096c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int i22 = i10;
                int i23 = b11 & 255;
                if (i23 != b10) {
                    int i24 = iArr2[i23];
                    if (i24 != 0) {
                        iArr[i21] = i24;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                i10 = i22;
            }
            i15++;
            bVar2 = bVar;
        }
        Boolean bool = this.f26141s;
        this.f26141s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f26141s == null && z10 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    private void m(b bVar) {
        int i10;
        int i11;
        short s10;
        e eVar = this;
        if (bVar != null) {
            eVar.f26126d.position(bVar.f26103j);
        }
        if (bVar == null) {
            c cVar = eVar.f26134l;
            i10 = cVar.f26110f;
            i11 = cVar.f26111g;
        } else {
            i10 = bVar.f26096c;
            i11 = bVar.f26097d;
        }
        int i12 = i10 * i11;
        byte[] bArr = eVar.f26131i;
        if (bArr == null || bArr.length < i12) {
            eVar.f26131i = eVar.f26125c.c(i12);
        }
        byte[] bArr2 = eVar.f26131i;
        if (eVar.f26128f == null) {
            eVar.f26128f = new short[4096];
        }
        short[] sArr = eVar.f26128f;
        if (eVar.f26129g == null) {
            eVar.f26129g = new byte[4096];
        }
        byte[] bArr3 = eVar.f26129g;
        if (eVar.f26130h == null) {
            eVar.f26130h = new byte[4097];
        }
        byte[] bArr4 = eVar.f26130h;
        int iQ = q();
        int i13 = 1 << iQ;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = iQ + 1;
        int i17 = (1 << i16) - 1;
        int i18 = 0;
        for (int i19 = 0; i19 < i13; i19++) {
            sArr[i19] = 0;
            bArr3[i19] = (byte) i19;
        }
        byte[] bArr5 = eVar.f26127e;
        int i20 = i16;
        int i21 = i15;
        int i22 = i17;
        int iP = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = -1;
        while (true) {
            if (i18 >= i12) {
                break;
            }
            if (iP == 0) {
                iP = p();
                if (iP <= 0) {
                    eVar.f26137o = 3;
                    break;
                }
                i23 = 0;
            }
            i25 += (bArr5[i23] & 255) << i24;
            i23++;
            iP--;
            int i30 = i24 + 8;
            int i31 = i21;
            int i32 = i20;
            int i33 = i29;
            int i34 = i16;
            int i35 = i27;
            while (true) {
                if (i30 < i32) {
                    i29 = i33;
                    i21 = i31;
                    i24 = i30;
                    eVar = this;
                    i27 = i35;
                    i16 = i34;
                    i20 = i32;
                    break;
                }
                int i36 = i15;
                int i37 = i25 & i22;
                i25 >>= i32;
                i30 -= i32;
                if (i37 == i13) {
                    i22 = i17;
                    i32 = i34;
                    i31 = i36;
                    i15 = i31;
                    i33 = -1;
                } else {
                    if (i37 == i14) {
                        i24 = i30;
                        i27 = i35;
                        i21 = i31;
                        i16 = i34;
                        i15 = i36;
                        i29 = i33;
                        i20 = i32;
                        eVar = this;
                        break;
                    }
                    if (i33 == -1) {
                        bArr2[i26] = bArr3[i37];
                        i26++;
                        i18++;
                        i33 = i37;
                        i35 = i33;
                        i15 = i36;
                        i30 = i30;
                    } else {
                        if (i37 >= i31) {
                            bArr4[i28] = (byte) i35;
                            i28++;
                            s10 = i33;
                        } else {
                            s10 = i37;
                        }
                        while (s10 >= i13) {
                            bArr4[i28] = bArr3[s10];
                            i28++;
                            s10 = sArr[s10];
                        }
                        i35 = bArr3[s10] & 255;
                        byte b10 = (byte) i35;
                        bArr2[i26] = b10;
                        while (true) {
                            i26++;
                            i18++;
                            if (i28 <= 0) {
                                break;
                            }
                            i28--;
                            bArr2[i26] = bArr4[i28];
                        }
                        byte[] bArr6 = bArr4;
                        if (i31 < 4096) {
                            sArr[i31] = (short) i33;
                            bArr3[i31] = b10;
                            i31++;
                            if ((i31 & i22) == 0 && i31 < 4096) {
                                i32++;
                                i22 += i31;
                            }
                        }
                        i33 = i37;
                        i15 = i36;
                        i30 = i30;
                        bArr4 = bArr6;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i26, i12, (byte) 0);
    }

    private Bitmap o() {
        Boolean bool = this.f26141s;
        Bitmap bitmapA = this.f26125c.a(this.f26140r, this.f26139q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f26142t);
        bitmapA.setHasAlpha(true);
        return bitmapA;
    }

    private int p() {
        int iQ = q();
        if (iQ <= 0) {
            return iQ;
        }
        ByteBuffer byteBuffer = this.f26126d;
        byteBuffer.get(this.f26127e, 0, Math.min(iQ, byteBuffer.remaining()));
        return iQ;
    }

    private int q() {
        return this.f26126d.get() & 255;
    }

    private Bitmap s(b bVar, b bVar2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f26132j;
        int i12 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f26135m;
            if (bitmap2 != null) {
                this.f26125c.f(bitmap2);
            }
            this.f26135m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f26100g == 3 && this.f26135m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i11 = bVar2.f26100g) > 0) {
            if (i11 == 2) {
                if (!bVar.f26099f) {
                    c cVar = this.f26134l;
                    int i13 = cVar.f26116l;
                    if (bVar.f26104k == null || cVar.f26114j != bVar.f26101h) {
                        i12 = i13;
                    }
                }
                int i14 = bVar2.f26097d;
                int i15 = this.f26138p;
                int i16 = i14 / i15;
                int i17 = bVar2.f26095b / i15;
                int i18 = bVar2.f26096c / i15;
                int i19 = bVar2.f26094a / i15;
                int i20 = this.f26140r;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f26140r;
                }
            } else if (i11 == 3 && (bitmap = this.f26135m) != null) {
                int i25 = this.f26140r;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f26139q);
            }
        }
        m(bVar);
        if (bVar.f26098e || this.f26138p != 1) {
            k(bVar);
        } else {
            l(bVar);
        }
        if (this.f26136n && ((i10 = bVar.f26100g) == 0 || i10 == 1)) {
            if (this.f26135m == null) {
                this.f26135m = o();
            }
            Bitmap bitmap3 = this.f26135m;
            int i26 = this.f26140r;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f26139q);
        }
        Bitmap bitmapO = o();
        int i27 = this.f26140r;
        bitmapO.setPixels(iArr, 0, i27, 0, 0, i27, this.f26139q);
        return bitmapO;
    }

    @Override // q1.a
    public int a() {
        return this.f26133k;
    }

    @Override // q1.a
    public synchronized Bitmap b() {
        if (this.f26134l.f26107c <= 0 || this.f26133k < 0) {
            String str = f26122u;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.f26134l.f26107c + ", framePointer=" + this.f26133k);
            }
            this.f26137o = 1;
        }
        int i10 = this.f26137o;
        if (i10 != 1 && i10 != 2) {
            this.f26137o = 0;
            if (this.f26127e == null) {
                this.f26127e = this.f26125c.c(255);
            }
            b bVar = (b) this.f26134l.f26109e.get(this.f26133k);
            int i11 = this.f26133k - 1;
            b bVar2 = i11 >= 0 ? (b) this.f26134l.f26109e.get(i11) : null;
            int[] iArr = bVar.f26104k;
            if (iArr == null) {
                iArr = this.f26134l.f26105a;
            }
            this.f26123a = iArr;
            if (iArr == null) {
                String str2 = f26122u;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No valid color table found for frame #" + this.f26133k);
                }
                this.f26137o = 1;
                return null;
            }
            if (bVar.f26099f) {
                System.arraycopy(iArr, 0, this.f26124b, 0, iArr.length);
                int[] iArr2 = this.f26124b;
                this.f26123a = iArr2;
                iArr2[bVar.f26101h] = 0;
                if (bVar.f26100g == 2 && this.f26133k == 0) {
                    this.f26141s = Boolean.TRUE;
                }
            }
            return s(bVar, bVar2);
        }
        String str3 = f26122u;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.f26137o);
        }
        return null;
    }

    @Override // q1.a
    public void c() {
        this.f26133k = (this.f26133k + 1) % this.f26134l.f26107c;
    }

    @Override // q1.a
    public void clear() {
        this.f26134l = null;
        byte[] bArr = this.f26131i;
        if (bArr != null) {
            this.f26125c.b(bArr);
        }
        int[] iArr = this.f26132j;
        if (iArr != null) {
            this.f26125c.d(iArr);
        }
        Bitmap bitmap = this.f26135m;
        if (bitmap != null) {
            this.f26125c.f(bitmap);
        }
        this.f26135m = null;
        this.f26126d = null;
        this.f26141s = null;
        byte[] bArr2 = this.f26127e;
        if (bArr2 != null) {
            this.f26125c.b(bArr2);
        }
    }

    @Override // q1.a
    public int d() {
        return this.f26134l.f26107c;
    }

    @Override // q1.a
    public int e() {
        int i10;
        if (this.f26134l.f26107c <= 0 || (i10 = this.f26133k) < 0) {
            return 0;
        }
        return n(i10);
    }

    @Override // q1.a
    public int f() {
        return this.f26126d.limit() + this.f26131i.length + (this.f26132j.length * 4);
    }

    @Override // q1.a
    public void g(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f26142t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    @Override // q1.a
    public ByteBuffer h() {
        return this.f26126d;
    }

    @Override // q1.a
    public void i() {
        this.f26133k = -1;
    }

    public int n(int i10) {
        if (i10 >= 0) {
            c cVar = this.f26134l;
            if (i10 < cVar.f26107c) {
                return ((b) cVar.f26109e.get(i10)).f26102i;
            }
        }
        return -1;
    }

    public synchronized void r(c cVar, ByteBuffer byteBuffer, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
        }
        int iHighestOneBit = Integer.highestOneBit(i10);
        this.f26137o = 0;
        this.f26134l = cVar;
        this.f26133k = -1;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f26126d = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f26126d.order(ByteOrder.LITTLE_ENDIAN);
        this.f26136n = false;
        Iterator it = cVar.f26109e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((b) it.next()).f26100g == 3) {
                this.f26136n = true;
                break;
            }
        }
        this.f26138p = iHighestOneBit;
        int i11 = cVar.f26110f;
        this.f26140r = i11 / iHighestOneBit;
        int i12 = cVar.f26111g;
        this.f26139q = i12 / iHighestOneBit;
        this.f26131i = this.f26125c.c(i11 * i12);
        this.f26132j = this.f26125c.e(this.f26140r * this.f26139q);
    }
}

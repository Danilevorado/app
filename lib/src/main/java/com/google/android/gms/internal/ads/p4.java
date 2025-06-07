package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class p4 implements k {

    /* renamed from: c0, reason: collision with root package name */
    public static final r f13540c0 = new r() { // from class: com.google.android.gms.internal.ads.l4
        @Override // com.google.android.gms.internal.ads.r
        public final /* synthetic */ k[] a(Uri uri, Map map) {
            int i10 = q.f14114a;
            r rVar = p4.f13540c0;
            return new k[]{new p4(0)};
        }
    };

    /* renamed from: d0, reason: collision with root package name */
    private static final byte[] f13541d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: e0, reason: collision with root package name */
    private static final byte[] f13542e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final byte[] f13543f0;

    /* renamed from: g0, reason: collision with root package name */
    private static final byte[] f13544g0;

    /* renamed from: h0, reason: collision with root package name */
    private static final UUID f13545h0;

    /* renamed from: i0, reason: collision with root package name */
    private static final Map f13546i0;
    private long A;
    private long B;
    private be2 C;
    private be2 D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private int J;
    private int K;
    private int[] L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private long R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private byte Z;

    /* renamed from: a, reason: collision with root package name */
    private final k4 f13547a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f13548a0;

    /* renamed from: b, reason: collision with root package name */
    private final r4 f13549b;

    /* renamed from: b0, reason: collision with root package name */
    private n f13550b0;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray f13551c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f13552d;

    /* renamed from: e, reason: collision with root package name */
    private final jm2 f13553e;

    /* renamed from: f, reason: collision with root package name */
    private final jm2 f13554f;

    /* renamed from: g, reason: collision with root package name */
    private final jm2 f13555g;

    /* renamed from: h, reason: collision with root package name */
    private final jm2 f13556h;

    /* renamed from: i, reason: collision with root package name */
    private final jm2 f13557i;

    /* renamed from: j, reason: collision with root package name */
    private final jm2 f13558j;

    /* renamed from: k, reason: collision with root package name */
    private final jm2 f13559k;

    /* renamed from: l, reason: collision with root package name */
    private final jm2 f13560l;

    /* renamed from: m, reason: collision with root package name */
    private final jm2 f13561m;

    /* renamed from: n, reason: collision with root package name */
    private final jm2 f13562n;

    /* renamed from: o, reason: collision with root package name */
    private ByteBuffer f13563o;

    /* renamed from: p, reason: collision with root package name */
    private long f13564p;

    /* renamed from: q, reason: collision with root package name */
    private long f13565q;

    /* renamed from: r, reason: collision with root package name */
    private long f13566r;

    /* renamed from: s, reason: collision with root package name */
    private long f13567s;

    /* renamed from: t, reason: collision with root package name */
    private long f13568t;

    /* renamed from: u, reason: collision with root package name */
    private o4 f13569u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f13570v;

    /* renamed from: w, reason: collision with root package name */
    private int f13571w;

    /* renamed from: x, reason: collision with root package name */
    private long f13572x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f13573y;

    /* renamed from: z, reason: collision with root package name */
    private long f13574z;

    static {
        int i10 = sv2.f15560a;
        f13542e0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(u23.f16142c);
        f13543f0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f13544g0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f13545h0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f13546i0 = Collections.unmodifiableMap(map);
    }

    public p4(int i10) {
        i4 i4Var = new i4();
        this.f13565q = -1L;
        this.f13566r = -9223372036854775807L;
        this.f13567s = -9223372036854775807L;
        this.f13568t = -9223372036854775807L;
        this.f13574z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f13547a = i4Var;
        i4Var.c(new n4(this, null));
        this.f13552d = true;
        this.f13549b = new r4();
        this.f13551c = new SparseArray();
        this.f13555g = new jm2(4);
        this.f13556h = new jm2(ByteBuffer.allocate(4).putInt(-1).array());
        this.f13557i = new jm2(4);
        this.f13553e = new jm2(i0.f9463a);
        this.f13554f = new jm2(4);
        this.f13558j = new jm2();
        this.f13559k = new jm2();
        this.f13560l = new jm2(8);
        this.f13561m = new jm2();
        this.f13562n = new jm2();
        this.L = new int[1];
    }

    private final int n(l lVar, o4 o4Var, int i10, boolean z10) throws oh0, EOFException, InterruptedIOException {
        int i11;
        if ("S_TEXT/UTF8".equals(o4Var.f12973b)) {
            v(lVar, f13541d0, i10);
        } else if ("S_TEXT/ASS".equals(o4Var.f12973b)) {
            v(lVar, f13543f0, i10);
        } else if ("S_TEXT/WEBVTT".equals(o4Var.f12973b)) {
            v(lVar, f13544g0, i10);
        } else {
            s0 s0Var = o4Var.X;
            if (!this.V) {
                if (o4Var.f12979h) {
                    this.O &= -1073741825;
                    if (!this.W) {
                        ((bo4) lVar).C(this.f13555g.h(), 0, 1, false);
                        this.S++;
                        if ((this.f13555g.h()[0] & 128) == 128) {
                            throw oh0.a("Extension bit is set in signal byte", null);
                        }
                        this.Z = this.f13555g.h()[0];
                        this.W = true;
                    }
                    byte b10 = this.Z;
                    if ((b10 & 1) == 1) {
                        int i12 = b10 & 2;
                        this.O |= 1073741824;
                        if (!this.f13548a0) {
                            ((bo4) lVar).C(this.f13560l.h(), 0, 8, false);
                            this.S += 8;
                            this.f13548a0 = true;
                            this.f13555g.h()[0] = (byte) ((i12 != 2 ? 0 : 128) | 8);
                            this.f13555g.f(0);
                            s0Var.d(this.f13555g, 1, 1);
                            this.T++;
                            this.f13560l.f(0);
                            s0Var.d(this.f13560l, 8, 1);
                            this.T += 8;
                        }
                        if (i12 == 2) {
                            if (!this.X) {
                                ((bo4) lVar).C(this.f13555g.h(), 0, 1, false);
                                this.S++;
                                this.f13555g.f(0);
                                this.Y = this.f13555g.s();
                                this.X = true;
                            }
                            int i13 = this.Y * 4;
                            this.f13555g.c(i13);
                            ((bo4) lVar).C(this.f13555g.h(), 0, i13, false);
                            this.S += i13;
                            int i14 = (this.Y >> 1) + 1;
                            int i15 = (i14 * 6) + 2;
                            ByteBuffer byteBuffer = this.f13563o;
                            if (byteBuffer == null || byteBuffer.capacity() < i15) {
                                this.f13563o = ByteBuffer.allocate(i15);
                            }
                            this.f13563o.position(0);
                            this.f13563o.putShort((short) i14);
                            int i16 = 0;
                            int i17 = 0;
                            while (true) {
                                i11 = this.Y;
                                if (i16 >= i11) {
                                    break;
                                }
                                int iV = this.f13555g.v();
                                if (i16 % 2 == 0) {
                                    this.f13563o.putShort((short) (iV - i17));
                                } else {
                                    this.f13563o.putInt(iV - i17);
                                }
                                i16++;
                                i17 = iV;
                            }
                            int i18 = (i10 - this.S) - i17;
                            if ((i11 & 1) == 1) {
                                this.f13563o.putInt(i18);
                            } else {
                                this.f13563o.putShort((short) i18);
                                this.f13563o.putInt(0);
                            }
                            this.f13561m.d(this.f13563o.array(), i15);
                            s0Var.d(this.f13561m, i15, 1);
                            this.T += i15;
                        }
                    }
                } else {
                    byte[] bArr = o4Var.f12980i;
                    if (bArr != null) {
                        this.f13558j.d(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(o4Var.f12973b) ? o4Var.f12977f > 0 : z10) {
                    this.O |= 268435456;
                    this.f13562n.c(0);
                    int iL = (this.f13558j.l() + i10) - this.S;
                    this.f13555g.c(4);
                    this.f13555g.h()[0] = (byte) ((iL >> 24) & 255);
                    this.f13555g.h()[1] = (byte) ((iL >> 16) & 255);
                    this.f13555g.h()[2] = (byte) ((iL >> 8) & 255);
                    this.f13555g.h()[3] = (byte) (iL & 255);
                    s0Var.d(this.f13555g, 4, 2);
                    this.T += 4;
                }
                this.V = true;
            }
            int iL2 = i10 + this.f13558j.l();
            if (!"V_MPEG4/ISO/AVC".equals(o4Var.f12973b) && !"V_MPEGH/ISO/HEVC".equals(o4Var.f12973b)) {
                if (o4Var.T != null) {
                    gt1.f(this.f13558j.l() == 0);
                    o4Var.T.d(lVar);
                }
                while (true) {
                    int i19 = this.S;
                    if (i19 >= iL2) {
                        break;
                    }
                    int iO = o(lVar, s0Var, iL2 - i19);
                    this.S += iO;
                    this.T += iO;
                }
            } else {
                byte[] bArrH = this.f13554f.h();
                bArrH[0] = 0;
                bArrH[1] = 0;
                bArrH[2] = 0;
                int i20 = o4Var.Y;
                int i21 = 4 - i20;
                while (this.S < iL2) {
                    int i22 = this.U;
                    if (i22 == 0) {
                        int iMin = Math.min(i20, this.f13558j.i());
                        ((bo4) lVar).C(bArrH, i21 + iMin, i20 - iMin, false);
                        if (iMin > 0) {
                            this.f13558j.b(bArrH, i21, iMin);
                        }
                        this.S += i20;
                        this.f13554f.f(0);
                        this.U = this.f13554f.v();
                        this.f13553e.f(0);
                        q0.b(s0Var, this.f13553e, 4);
                        this.T += 4;
                    } else {
                        int iO2 = o(lVar, s0Var, i22);
                        this.S += iO2;
                        this.T += iO2;
                        this.U -= iO2;
                    }
                }
            }
            if ("A_VORBIS".equals(o4Var.f12973b)) {
                this.f13556h.f(0);
                q0.b(s0Var, this.f13556h, 4);
                this.T += 4;
            }
        }
        int i23 = this.T;
        u();
        return i23;
    }

    private final int o(l lVar, s0 s0Var, int i10) {
        int i11 = this.f13558j.i();
        if (i11 <= 0) {
            return q0.a(s0Var, lVar, i10, false);
        }
        int iMin = Math.min(i10, i11);
        q0.b(s0Var, this.f13558j, iMin);
        return iMin;
    }

    private final long p(long j10) throws oh0 {
        long j11 = this.f13566r;
        if (j11 != -9223372036854775807L) {
            return sv2.x(j10, j11, 1000L);
        }
        throw oh0.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void q(int i10) throws oh0 {
        if (this.C == null || this.D == null) {
            throw oh0.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    private final void r(int i10) throws oh0 {
        if (this.f13569u != null) {
            return;
        }
        throw oh0.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d6 A[EDGE_INSN: B:63:0x00d6->B:52:0x00d6 BREAK  A[LOOP:0: B:46:0x00bb->B:51:0x00d3], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void s(com.google.android.gms.internal.ads.o4 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p4.s(com.google.android.gms.internal.ads.o4, long, int, int, int):void");
    }

    private final void t(l lVar, int i10) throws EOFException, InterruptedIOException {
        if (this.f13555g.l() >= i10) {
            return;
        }
        if (this.f13555g.j() < i10) {
            jm2 jm2Var = this.f13555g;
            int iJ = jm2Var.j();
            jm2Var.H(Math.max(iJ + iJ, i10));
        }
        ((bo4) lVar).C(this.f13555g.h(), this.f13555g.l(), i10 - this.f13555g.l(), false);
        this.f13555g.e(i10);
    }

    private final void u() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f13548a0 = false;
        this.f13558j.c(0);
    }

    private final void v(l lVar, byte[] bArr, int i10) throws EOFException, InterruptedIOException {
        int length = bArr.length;
        int i11 = length + i10;
        if (this.f13559k.j() < i11) {
            jm2 jm2Var = this.f13559k;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11 + i10);
            jm2Var.d(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.f13559k.h(), 0, length);
        }
        ((bo4) lVar).C(this.f13559k.h(), length, i10, false);
        this.f13559k.f(0);
        this.f13559k.e(i11);
    }

    private static byte[] w(long j10, String str, long j11) {
        gt1.d(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11)));
        int i13 = sv2.f15560a;
        return str2.getBytes(u23.f16142c);
    }

    private static int[] x(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        return length >= i10 ? iArr : new int[Math.max(length + length, i10)];
    }

    @Override // com.google.android.gms.internal.ads.k
    public final boolean a(l lVar) {
        return new q4().a(lVar);
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void d(n nVar) {
        this.f13550b0 = nVar;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final int e(l lVar, l0 l0Var) {
        this.F = false;
        while (!this.F) {
            if (!this.f13547a.d(lVar)) {
                for (int i10 = 0; i10 < this.f13551c.size(); i10++) {
                    o4 o4Var = (o4) this.f13551c.valueAt(i10);
                    Objects.requireNonNull(o4Var.X);
                    t0 t0Var = o4Var.T;
                    if (t0Var != null) {
                        t0Var.a(o4Var.X, o4Var.f12981j);
                    }
                }
                return -1;
            }
            long jE = lVar.e();
            if (this.f13573y) {
                this.A = jE;
                l0Var.f11275a = this.f13574z;
                this.f13573y = false;
                return 1;
            }
            if (this.f13570v) {
                long j10 = this.A;
                if (j10 != -1) {
                    l0Var.f11275a = j10;
                    this.A = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void f(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.f13547a.b();
        this.f13549b.e();
        u();
        for (int i10 = 0; i10 < this.f13551c.size(); i10++) {
            t0 t0Var = ((o4) this.f13551c.valueAt(i10)).T;
            if (t0Var != null) {
                t0Var.b();
            }
        }
    }

    protected final void g(int i10, int i11, l lVar) {
        int i12;
        long j10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = i10;
        int i18 = 1;
        int i19 = 0;
        if (i17 != 161 && i17 != 163) {
            if (i17 == 165) {
                if (this.G != 2) {
                    return;
                }
                o4 o4Var = (o4) this.f13551c.get(this.M);
                if (this.P != 4 || !"V_VP9".equals(o4Var.f12973b)) {
                    ((bo4) lVar).h(i11, false);
                    return;
                }
                this.f13562n.c(i11);
                ((bo4) lVar).C(this.f13562n.h(), 0, i11, false);
                return;
            }
            if (i17 == 16877) {
                r(i10);
                o4 o4Var2 = this.f13569u;
                if (o4Var2.f12978g != 1685485123 && o4Var2.f12978g != 1685480259) {
                    ((bo4) lVar).h(i11, false);
                    return;
                }
                byte[] bArr = new byte[i11];
                o4Var2.N = bArr;
                ((bo4) lVar).C(bArr, 0, i11, false);
                return;
            }
            if (i17 == 16981) {
                r(i10);
                byte[] bArr2 = new byte[i11];
                this.f13569u.f12980i = bArr2;
                ((bo4) lVar).C(bArr2, 0, i11, false);
                return;
            }
            if (i17 == 18402) {
                byte[] bArr3 = new byte[i11];
                ((bo4) lVar).C(bArr3, 0, i11, false);
                r(i10);
                this.f13569u.f12981j = new r0(1, bArr3, 0, 0);
                return;
            }
            if (i17 == 21419) {
                Arrays.fill(this.f13557i.h(), (byte) 0);
                ((bo4) lVar).C(this.f13557i.h(), 4 - i11, i11, false);
                this.f13557i.f(0);
                this.f13571w = (int) this.f13557i.A();
                return;
            }
            if (i17 == 25506) {
                r(i10);
                byte[] bArr4 = new byte[i11];
                this.f13569u.f12982k = bArr4;
                ((bo4) lVar).C(bArr4, 0, i11, false);
                return;
            }
            if (i17 != 30322) {
                throw oh0.a("Unexpected id: " + i17, null);
            }
            r(i10);
            byte[] bArr5 = new byte[i11];
            this.f13569u.f12993v = bArr5;
            ((bo4) lVar).C(bArr5, 0, i11, false);
            return;
        }
        int i20 = 8;
        if (this.G == 0) {
            this.M = (int) this.f13549b.d(lVar, false, true, 8);
            this.N = this.f13549b.a();
            this.I = -9223372036854775807L;
            this.G = 1;
            this.f13555g.c(0);
        }
        o4 o4Var3 = (o4) this.f13551c.get(this.M);
        if (o4Var3 == null) {
            ((bo4) lVar).h(i11 - this.N, false);
            this.G = 0;
            return;
        }
        Objects.requireNonNull(o4Var3.X);
        if (this.G == 1) {
            t(lVar, 3);
            int i21 = (this.f13555g.h()[2] & 6) >> 1;
            if (i21 == 0) {
                this.K = 1;
                int[] iArrX = x(this.L, 1);
                this.L = iArrX;
                iArrX[0] = (i11 - this.N) - 3;
            } else {
                t(lVar, 4);
                int i22 = (this.f13555g.h()[3] & 255) + 1;
                this.K = i22;
                int[] iArrX2 = x(this.L, i22);
                this.L = iArrX2;
                if (i21 == 2) {
                    int i23 = (i11 - this.N) - 4;
                    int i24 = this.K;
                    Arrays.fill(iArrX2, 0, i24, i23 / i24);
                } else {
                    if (i21 != 1) {
                        if (i21 != 3) {
                            throw oh0.a("Unexpected lacing value: 2", null);
                        }
                        int i25 = 0;
                        int i26 = 0;
                        int i27 = 4;
                        while (true) {
                            int i28 = this.K - 1;
                            if (i25 >= i28) {
                                this.L[i28] = ((i11 - this.N) - i27) - i26;
                                break;
                            }
                            this.L[i25] = i19;
                            i27++;
                            t(lVar, i27);
                            int i29 = i27 - 1;
                            if (this.f13555g.h()[i29] == 0) {
                                throw oh0.a("No valid varint length mask found", null);
                            }
                            int i30 = i19;
                            while (true) {
                                if (i30 >= i20) {
                                    j10 = 0;
                                    break;
                                }
                                int i31 = i18 << (7 - i30);
                                if ((this.f13555g.h()[i29] & i31) != 0) {
                                    i27 += i30;
                                    t(lVar, i27);
                                    j10 = (~i31) & this.f13555g.h()[i29] & 255;
                                    int i32 = i29 + 1;
                                    while (i32 < i27) {
                                        j10 = (j10 << i20) | (this.f13555g.h()[i32] & 255);
                                        i32++;
                                        i20 = 8;
                                    }
                                    if (i25 > 0) {
                                        j10 -= (1 << ((i30 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i30++;
                                    i18 = 1;
                                    i20 = 8;
                                }
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.L;
                            int i33 = (int) j10;
                            if (i25 != 0) {
                                i33 += iArr[i25 - 1];
                            }
                            iArr[i25] = i33;
                            i26 += i33;
                            i25++;
                            i18 = 1;
                            i19 = 0;
                            i20 = 8;
                        }
                        throw oh0.a("EBML lacing sample size out of range.", null);
                    }
                    int i34 = 0;
                    int i35 = 0;
                    int i36 = 4;
                    while (true) {
                        i13 = this.K - 1;
                        if (i34 >= i13) {
                            break;
                        }
                        this.L[i34] = 0;
                        do {
                            i36++;
                            t(lVar, i36);
                            i14 = this.f13555g.h()[i36 - 1] & 255;
                            int[] iArr2 = this.L;
                            i15 = iArr2[i34] + i14;
                            iArr2[i34] = i15;
                        } while (i14 == 255);
                        i35 += i15;
                        i34++;
                    }
                    this.L[i13] = ((i11 - this.N) - i36) - i35;
                }
            }
            this.H = this.B + p((this.f13555g.h()[0] << 8) | (this.f13555g.h()[1] & 255));
            if (o4Var3.f12975d == 2) {
                i16 = 1;
                this.O = i16;
                this.G = 2;
                this.J = 0;
                i12 = 163;
            } else {
                if (i17 == 163) {
                    if ((this.f13555g.h()[2] & 128) == 128) {
                        i17 = 163;
                        i16 = 1;
                        this.O = i16;
                        this.G = 2;
                        this.J = 0;
                        i12 = 163;
                    } else {
                        i17 = 163;
                    }
                }
                i16 = 0;
                this.O = i16;
                this.G = 2;
                this.J = 0;
                i12 = 163;
            }
        } else {
            i12 = 163;
        }
        if (i17 == i12) {
            while (true) {
                int i37 = this.J;
                if (i37 >= this.K) {
                    this.G = 0;
                    return;
                }
                s(o4Var3, ((this.J * o4Var3.f12976e) / AdError.NETWORK_ERROR_CODE) + this.H, this.O, n(lVar, o4Var3, this.L[i37], false), 0);
                this.J++;
            }
        } else {
            while (true) {
                int i38 = this.J;
                if (i38 >= this.K) {
                    return;
                }
                int[] iArr3 = this.L;
                iArr3[i38] = n(lVar, o4Var3, iArr3[i38], true);
                this.J++;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0314  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void h(int r22) {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p4.h(int):void");
    }

    protected final void i(int i10, double d10) {
        if (i10 == 181) {
            r(i10);
            this.f13569u.Q = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.f13567s = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                r(i10);
                this.f13569u.D = (float) d10;
                break;
            case 21970:
                r(i10);
                this.f13569u.E = (float) d10;
                break;
            case 21971:
                r(i10);
                this.f13569u.F = (float) d10;
                break;
            case 21972:
                r(i10);
                this.f13569u.G = (float) d10;
                break;
            case 21973:
                r(i10);
                this.f13569u.H = (float) d10;
                break;
            case 21974:
                r(i10);
                this.f13569u.I = (float) d10;
                break;
            case 21975:
                r(i10);
                this.f13569u.J = (float) d10;
                break;
            case 21976:
                r(i10);
                this.f13569u.K = (float) d10;
                break;
            case 21977:
                r(i10);
                this.f13569u.L = (float) d10;
                break;
            case 21978:
                r(i10);
                this.f13569u.M = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        r(i10);
                        this.f13569u.f12990s = (float) d10;
                        break;
                    case 30324:
                        r(i10);
                        this.f13569u.f12991t = (float) d10;
                        break;
                    case 30325:
                        r(i10);
                        this.f13569u.f12992u = (float) d10;
                        break;
                }
        }
    }

    protected final void j(int i10, long j10) {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw oh0.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw oh0.a("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case 131:
                r(i10);
                this.f13569u.f12975d = (int) j10;
                return;
            case 136:
                r(i10);
                this.f13569u.V = j10 == 1;
                return;
            case 155:
                this.I = p(j10);
                return;
            case 159:
                r(i10);
                this.f13569u.O = (int) j10;
                return;
            case 176:
                r(i10);
                this.f13569u.f12984m = (int) j10;
                return;
            case 179:
                q(i10);
                this.C.c(p(j10));
                return;
            case 186:
                r(i10);
                this.f13569u.f12985n = (int) j10;
                return;
            case 215:
                r(i10);
                this.f13569u.f12974c = (int) j10;
                return;
            case 231:
                this.B = p(j10);
                return;
            case 238:
                this.P = (int) j10;
                return;
            case 241:
                if (this.E) {
                    return;
                }
                q(i10);
                this.D.c(j10);
                this.E = true;
                return;
            case 251:
                this.Q = true;
                return;
            case 16871:
                r(i10);
                this.f13569u.f12978g = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw oh0.a("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw oh0.a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw oh0.a("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw oh0.a("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw oh0.a("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.f13572x = j10 + this.f13565q;
                return;
            case 21432:
                int i11 = (int) j10;
                r(i10);
                if (i11 == 0) {
                    this.f13569u.f12994w = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f13569u.f12994w = 2;
                    return;
                } else if (i11 == 3) {
                    this.f13569u.f12994w = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f13569u.f12994w = 3;
                    return;
                }
            case 21680:
                r(i10);
                this.f13569u.f12986o = (int) j10;
                return;
            case 21682:
                r(i10);
                this.f13569u.f12988q = (int) j10;
                return;
            case 21690:
                r(i10);
                this.f13569u.f12987p = (int) j10;
                return;
            case 21930:
                r(i10);
                this.f13569u.U = j10 == 1;
                return;
            case 21998:
                r(i10);
                this.f13569u.f12977f = (int) j10;
                return;
            case 22186:
                r(i10);
                this.f13569u.R = j10;
                return;
            case 22203:
                r(i10);
                this.f13569u.S = j10;
                return;
            case 25188:
                r(i10);
                this.f13569u.P = (int) j10;
                return;
            case 30114:
                this.R = j10;
                return;
            case 30321:
                r(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.f13569u.f12989r = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f13569u.f12989r = 1;
                    return;
                } else if (i12 == 2) {
                    this.f13569u.f12989r = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f13569u.f12989r = 3;
                    return;
                }
            case 2352003:
                r(i10);
                this.f13569u.f12976e = (int) j10;
                return;
            case 2807729:
                this.f13566r = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        r(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.f13569u.A = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f13569u.A = 1;
                            return;
                        }
                    case 21946:
                        r(i10);
                        int iB = bg4.b((int) j10);
                        if (iB != -1) {
                            this.f13569u.f12997z = iB;
                            return;
                        }
                        return;
                    case 21947:
                        r(i10);
                        this.f13569u.f12995x = true;
                        int iA = bg4.a((int) j10);
                        if (iA != -1) {
                            this.f13569u.f12996y = iA;
                            return;
                        }
                        return;
                    case 21948:
                        r(i10);
                        this.f13569u.B = (int) j10;
                        return;
                    case 21949:
                        r(i10);
                        this.f13569u.C = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    protected final void k(int i10, long j10, long j11) {
        gt1.b(this.f13550b0);
        if (i10 == 160) {
            this.Q = false;
            this.R = 0L;
            return;
        }
        if (i10 == 174) {
            this.f13569u = new o4();
            return;
        }
        if (i10 == 187) {
            this.E = false;
            return;
        }
        if (i10 == 19899) {
            this.f13571w = -1;
            this.f13572x = -1L;
            return;
        }
        if (i10 == 20533) {
            r(i10);
            this.f13569u.f12979h = true;
            return;
        }
        if (i10 == 21968) {
            r(i10);
            this.f13569u.f12995x = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f13565q;
            if (j12 != -1 && j12 != j10) {
                throw oh0.a("Multiple Segment elements not supported", null);
            }
            this.f13565q = j10;
            this.f13564p = j11;
            return;
        }
        if (i10 == 475249515) {
            this.C = new be2(32);
            this.D = new be2(32);
        } else if (i10 == 524531317 && !this.f13570v) {
            if (this.f13552d && this.f13574z != -1) {
                this.f13573y = true;
            } else {
                this.f13550b0.R(new n0(this.f13568t, 0L));
                this.f13570v = true;
            }
        }
    }

    protected final void l(int i10, String str) {
        if (i10 == 134) {
            r(i10);
            this.f13569u.f12973b = str;
            return;
        }
        if (i10 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw oh0.a("DocType " + str + " not supported", null);
        }
        if (i10 == 21358) {
            r(i10);
            this.f13569u.f12972a = str;
        } else {
            if (i10 != 2274716) {
                return;
            }
            r(i10);
            this.f13569u.W = str;
        }
    }
}

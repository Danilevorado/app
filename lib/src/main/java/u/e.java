package u;

import com.facebook.ads.internal.api.AdSizeApi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import u.d;
import v.l;
import v.n;
import v.p;

/* loaded from: classes.dex */
public class e {
    public static float K0 = 0.5f;
    int A0;
    boolean B0;
    boolean C0;
    public float[] D0;
    protected e[] E0;
    protected e[] F0;
    e G0;
    e H0;
    public int I0;
    public int J0;
    private boolean K;
    public d V;
    public d[] W;
    protected ArrayList X;
    private boolean[] Y;
    public b[] Z;

    /* renamed from: a0, reason: collision with root package name */
    public e f27449a0;

    /* renamed from: b0, reason: collision with root package name */
    int f27451b0;

    /* renamed from: c, reason: collision with root package name */
    public v.c f27452c;

    /* renamed from: c0, reason: collision with root package name */
    int f27453c0;

    /* renamed from: d, reason: collision with root package name */
    public v.c f27454d;

    /* renamed from: d0, reason: collision with root package name */
    public float f27455d0;

    /* renamed from: e0, reason: collision with root package name */
    protected int f27457e0;

    /* renamed from: f0, reason: collision with root package name */
    protected int f27459f0;

    /* renamed from: g0, reason: collision with root package name */
    protected int f27461g0;

    /* renamed from: h0, reason: collision with root package name */
    int f27463h0;

    /* renamed from: i0, reason: collision with root package name */
    int f27465i0;

    /* renamed from: j0, reason: collision with root package name */
    protected int f27467j0;

    /* renamed from: k0, reason: collision with root package name */
    protected int f27469k0;

    /* renamed from: l0, reason: collision with root package name */
    int f27471l0;

    /* renamed from: m0, reason: collision with root package name */
    protected int f27473m0;

    /* renamed from: n0, reason: collision with root package name */
    protected int f27475n0;

    /* renamed from: o, reason: collision with root package name */
    public String f27476o;

    /* renamed from: o0, reason: collision with root package name */
    float f27477o0;

    /* renamed from: p0, reason: collision with root package name */
    float f27479p0;

    /* renamed from: q0, reason: collision with root package name */
    private Object f27481q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f27483r0;

    /* renamed from: s0, reason: collision with root package name */
    private int f27485s0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f27487t0;

    /* renamed from: u0, reason: collision with root package name */
    private String f27489u0;

    /* renamed from: v0, reason: collision with root package name */
    private String f27491v0;

    /* renamed from: w0, reason: collision with root package name */
    boolean f27493w0;

    /* renamed from: x0, reason: collision with root package name */
    boolean f27495x0;

    /* renamed from: y0, reason: collision with root package name */
    boolean f27497y0;

    /* renamed from: z0, reason: collision with root package name */
    int f27499z0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f27448a = false;

    /* renamed from: b, reason: collision with root package name */
    public p[] f27450b = new p[2];

    /* renamed from: e, reason: collision with root package name */
    public l f27456e = null;

    /* renamed from: f, reason: collision with root package name */
    public n f27458f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f27460g = {true, true};

    /* renamed from: h, reason: collision with root package name */
    boolean f27462h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f27464i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f27466j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f27468k = true;

    /* renamed from: l, reason: collision with root package name */
    private int f27470l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f27472m = -1;

    /* renamed from: n, reason: collision with root package name */
    public t.a f27474n = new t.a(this);

    /* renamed from: p, reason: collision with root package name */
    private boolean f27478p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f27480q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f27482r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f27484s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f27486t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f27488u = -1;

    /* renamed from: v, reason: collision with root package name */
    private int f27490v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f27492w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f27494x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int[] f27496y = new int[2];

    /* renamed from: z, reason: collision with root package name */
    public int f27498z = 0;
    public int A = 0;
    public float B = 1.0f;
    public int C = 0;
    public int D = 0;
    public float E = 1.0f;
    int F = -1;
    float G = 1.0f;
    private int[] H = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    private float I = 0.0f;
    private boolean J = false;
    private boolean L = false;
    private int M = 0;
    private int N = 0;
    public d O = new d(this, d.b.LEFT);
    public d P = new d(this, d.b.TOP);
    public d Q = new d(this, d.b.RIGHT);
    public d R = new d(this, d.b.BOTTOM);
    public d S = new d(this, d.b.BASELINE);
    d T = new d(this, d.b.CENTER_X);
    d U = new d(this, d.b.CENTER_Y);

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27500a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f27501b;

        static {
            int[] iArr = new int[b.values().length];
            f27501b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27501b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27501b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27501b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f27500a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27500a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27500a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27500a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27500a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f27500a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f27500a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f27500a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f27500a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.V = dVar;
        this.W = new d[]{this.O, this.Q, this.P, this.R, this.S, dVar};
        this.X = new ArrayList();
        this.Y = new boolean[2];
        b bVar = b.FIXED;
        this.Z = new b[]{bVar, bVar};
        this.f27449a0 = null;
        this.f27451b0 = 0;
        this.f27453c0 = 0;
        this.f27455d0 = 0.0f;
        this.f27457e0 = -1;
        this.f27459f0 = 0;
        this.f27461g0 = 0;
        this.f27463h0 = 0;
        this.f27465i0 = 0;
        this.f27467j0 = 0;
        this.f27469k0 = 0;
        this.f27471l0 = 0;
        float f5 = K0;
        this.f27477o0 = f5;
        this.f27479p0 = f5;
        this.f27483r0 = 0;
        this.f27485s0 = 0;
        this.f27487t0 = false;
        this.f27489u0 = null;
        this.f27491v0 = null;
        this.f27497y0 = false;
        this.f27499z0 = 0;
        this.A0 = 0;
        this.D0 = new float[]{-1.0f, -1.0f};
        this.E0 = new e[]{null, null};
        this.F0 = new e[]{null, null};
        this.G0 = null;
        this.H0 = null;
        this.I0 = -1;
        this.J0 = -1;
        d();
    }

    private void N(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, int i15, float f5, float f10) {
        sb2.append(str);
        sb2.append(" :  {\n");
        v0(sb2, "      size", i10, 0);
        v0(sb2, "      min", i11, 0);
        v0(sb2, "      max", i12, Integer.MAX_VALUE);
        v0(sb2, "      matchMin", i14, 0);
        v0(sb2, "      matchDef", i15, 0);
        u0(sb2, "      matchPercent", f5, 1.0f);
        sb2.append("    },\n");
    }

    private void O(StringBuilder sb2, String str, d dVar) {
        if (dVar.f27433f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(dVar.f27433f);
        sb2.append("'");
        if (dVar.f27435h != Integer.MIN_VALUE || dVar.f27434g != 0) {
            sb2.append(",");
            sb2.append(dVar.f27434g);
            if (dVar.f27435h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(dVar.f27435h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    private void d() {
        this.X.add(this.O);
        this.X.add(this.P);
        this.X.add(this.Q);
        this.X.add(this.R);
        this.X.add(this.T);
        this.X.add(this.U);
        this.X.add(this.V);
        this.X.add(this.S);
    }

    private boolean d0(int i10) {
        int i11 = i10 * 2;
        d[] dVarArr = this.W;
        if (dVarArr[i11].f27433f != null && dVarArr[i11].f27433f.f27433f != dVarArr[i11]) {
            int i12 = i11 + 1;
            if (dVarArr[i12].f27433f != null && dVarArr[i12].f27433f.f27433f == dVarArr[i12]) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x057e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:388:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i(r.d r38, boolean r39, boolean r40, boolean r41, boolean r42, r.i r43, r.i r44, u.e.b r45, boolean r46, u.d r47, u.d r48, int r49, int r50, int r51, int r52, float r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58, int r59, int r60, int r61, int r62, float r63, boolean r64) {
        /*
            Method dump skipped, instructions count: 1465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.e.i(r.d, boolean, boolean, boolean, boolean, r.i, r.i, u.e$b, boolean, u.d, u.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private void u0(StringBuilder sb2, String str, float f5, float f10) {
        if (f5 == f10) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f5);
        sb2.append(",\n");
    }

    private void v0(StringBuilder sb2, String str, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    private void w0(StringBuilder sb2, String str, float f5, int i10) {
        if (f5 == 0.0f) {
            return;
        }
        sb2.append(str);
        sb2.append(" :  [");
        sb2.append(f5);
        sb2.append(",");
        sb2.append(i10);
        sb2.append("");
        sb2.append("],\n");
    }

    public int A() {
        return this.M;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0084 A[PHI: r0
  0x0084: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:45:0x0084, B:35:0x007d, B:23:0x004f, B:25:0x0055, B:27:0x0061, B:29:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0(java.lang.String r9) throws java.lang.NumberFormatException {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L8e
            int r1 = r9.length()
            if (r1 != 0) goto Lb
            goto L8e
        Lb:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L37
            int r6 = r2 + (-1)
            if (r3 >= r6) goto L37
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2c
            r1 = r4
            goto L35
        L2c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L35
            r1 = r5
        L35:
            int r4 = r3 + 1
        L37:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L75
            int r2 = r2 - r5
            if (r3 >= r2) goto L75
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L84
            int r3 = r9.length()
            if (r3 <= 0) goto L84
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.NumberFormatException -> L84
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L84
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L84
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L84
            if (r1 != r5) goto L6f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L6f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L75:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L84
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L84:
            r9 = r0
        L85:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8d
            r8.f27455d0 = r9
            r8.f27457e0 = r1
        L8d:
            return
        L8e:
            r8.f27455d0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.e.A0(java.lang.String):void");
    }

    public int B() {
        return this.N;
    }

    public void B0(int i10) {
        if (this.J) {
            int i11 = i10 - this.f27471l0;
            int i12 = this.f27453c0 + i11;
            this.f27461g0 = i11;
            this.P.s(i11);
            this.R.s(i12);
            this.S.s(i10);
            this.f27480q = true;
        }
    }

    public int C(int i10) {
        if (i10 == 0) {
            return U();
        }
        if (i10 == 1) {
            return v();
        }
        return 0;
    }

    public void C0(int i10, int i11) {
        if (this.f27478p) {
            return;
        }
        this.O.s(i10);
        this.Q.s(i11);
        this.f27459f0 = i10;
        this.f27451b0 = i11 - i10;
        this.f27478p = true;
    }

    public int D() {
        return this.H[1];
    }

    public void D0(int i10) {
        this.O.s(i10);
        this.f27459f0 = i10;
    }

    public int E() {
        return this.H[0];
    }

    public void E0(int i10) {
        this.P.s(i10);
        this.f27461g0 = i10;
    }

    public int F() {
        return this.f27475n0;
    }

    public void F0(int i10, int i11) {
        if (this.f27480q) {
            return;
        }
        this.P.s(i10);
        this.R.s(i11);
        this.f27461g0 = i10;
        this.f27453c0 = i11 - i10;
        if (this.J) {
            this.S.s(i10 + this.f27471l0);
        }
        this.f27480q = true;
    }

    public int G() {
        return this.f27473m0;
    }

    public void G0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f27459f0 = i10;
        this.f27461g0 = i11;
        if (this.f27485s0 == 8) {
            this.f27451b0 = 0;
            this.f27453c0 = 0;
            return;
        }
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.f27451b0)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.f27453c0)) {
            i17 = i14;
        }
        this.f27451b0 = i16;
        this.f27453c0 = i17;
        int i18 = this.f27475n0;
        if (i17 < i18) {
            this.f27453c0 = i18;
        }
        int i19 = this.f27473m0;
        if (i16 < i19) {
            this.f27451b0 = i19;
        }
        int i20 = this.A;
        if (i20 > 0 && bVarArr[0] == b.MATCH_CONSTRAINT) {
            this.f27451b0 = Math.min(this.f27451b0, i20);
        }
        int i21 = this.D;
        if (i21 > 0 && this.Z[1] == b.MATCH_CONSTRAINT) {
            this.f27453c0 = Math.min(this.f27453c0, i21);
        }
        int i22 = this.f27451b0;
        if (i16 != i22) {
            this.f27470l = i22;
        }
        int i23 = this.f27453c0;
        if (i17 != i23) {
            this.f27472m = i23;
        }
    }

    public e H(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.R).f27433f) != null && dVar2.f27433f == dVar) {
                return dVar2.f27431d;
            }
            return null;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f27433f;
        if (dVar4 == null || dVar4.f27433f != dVar3) {
            return null;
        }
        return dVar4.f27431d;
    }

    public void H0(boolean z10) {
        this.J = z10;
    }

    public e I() {
        return this.f27449a0;
    }

    public void I0(int i10) {
        this.f27453c0 = i10;
        int i11 = this.f27475n0;
        if (i10 < i11) {
            this.f27453c0 = i11;
        }
    }

    public e J(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.P).f27433f) != null && dVar2.f27433f == dVar) {
                return dVar2.f27431d;
            }
            return null;
        }
        d dVar3 = this.O;
        d dVar4 = dVar3.f27433f;
        if (dVar4 == null || dVar4.f27433f != dVar3) {
            return null;
        }
        return dVar4.f27431d;
    }

    public void J0(float f5) {
        this.f27477o0 = f5;
    }

    public int K() {
        return V() + this.f27451b0;
    }

    public void K0(int i10) {
        this.f27499z0 = i10;
    }

    public p L(int i10) {
        if (i10 == 0) {
            return this.f27456e;
        }
        if (i10 == 1) {
            return this.f27458f;
        }
        return null;
    }

    public void L0(int i10, int i11) {
        this.f27459f0 = i10;
        int i12 = i11 - i10;
        this.f27451b0 = i12;
        int i13 = this.f27473m0;
        if (i12 < i13) {
            this.f27451b0 = i13;
        }
    }

    public void M(StringBuilder sb2) {
        sb2.append("  " + this.f27476o + ":{\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("    actualWidth:");
        sb3.append(this.f27451b0);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f27453c0);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f27459f0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f27461g0);
        sb2.append("\n");
        O(sb2, "left", this.O);
        O(sb2, "top", this.P);
        O(sb2, "right", this.Q);
        O(sb2, "bottom", this.R);
        O(sb2, "baseline", this.S);
        O(sb2, "centerX", this.T);
        O(sb2, "centerY", this.U);
        N(sb2, "    width", this.f27451b0, this.f27473m0, this.H[0], this.f27470l, this.f27498z, this.f27492w, this.B, this.D0[0]);
        N(sb2, "    height", this.f27453c0, this.f27475n0, this.H[1], this.f27472m, this.C, this.f27494x, this.E, this.D0[1]);
        w0(sb2, "    dimensionRatio", this.f27455d0, this.f27457e0);
        u0(sb2, "    horizontalBias", this.f27477o0, K0);
        u0(sb2, "    verticalBias", this.f27479p0, K0);
        v0(sb2, "    horizontalChainStyle", this.f27499z0, 0);
        v0(sb2, "    verticalChainStyle", this.A0, 0);
        sb2.append("  }");
    }

    public void M0(b bVar) {
        this.Z[0] = bVar;
    }

    public void N0(int i10, int i11, int i12, float f5) {
        this.f27492w = i10;
        this.f27498z = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.A = i12;
        this.B = f5;
        if (f5 <= 0.0f || f5 >= 1.0f || i10 != 0) {
            return;
        }
        this.f27492w = 2;
    }

    public void O0(float f5) {
        this.D0[0] = f5;
    }

    public float P() {
        return this.f27479p0;
    }

    protected void P0(int i10, boolean z10) {
        this.Y[i10] = z10;
    }

    public int Q() {
        return this.A0;
    }

    public void Q0(boolean z10) {
        this.K = z10;
    }

    public b R() {
        return this.Z[1];
    }

    public void R0(int i10, int i11) {
        this.M = i10;
        this.N = i11;
        U0(false);
    }

    public int S() {
        int i10 = this.O != null ? 0 + this.P.f27434g : 0;
        return this.Q != null ? i10 + this.R.f27434g : i10;
    }

    public void S0(int i10) {
        this.H[1] = i10;
    }

    public int T() {
        return this.f27485s0;
    }

    public void T0(int i10) {
        this.H[0] = i10;
    }

    public int U() {
        if (this.f27485s0 == 8) {
            return 0;
        }
        return this.f27451b0;
    }

    public void U0(boolean z10) {
        this.f27464i = z10;
    }

    public int V() {
        e eVar = this.f27449a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f27459f0 : ((f) eVar).S0 + this.f27459f0;
    }

    public void V0(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f27475n0 = i10;
    }

    public int W() {
        e eVar = this.f27449a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f27461g0 : ((f) eVar).T0 + this.f27461g0;
    }

    public void W0(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f27473m0 = i10;
    }

    public boolean X() {
        return this.J;
    }

    public void X0(int i10, int i11) {
        this.f27459f0 = i10;
        this.f27461g0 = i11;
    }

    public boolean Y(int i10) {
        if (i10 == 0) {
            return (this.O.f27433f != null ? 1 : 0) + (this.Q.f27433f != null ? 1 : 0) < 2;
        }
        return ((this.P.f27433f != null ? 1 : 0) + (this.R.f27433f != null ? 1 : 0)) + (this.S.f27433f != null ? 1 : 0) < 2;
    }

    public void Y0(e eVar) {
        this.f27449a0 = eVar;
    }

    public boolean Z() {
        int size = this.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((d) this.X.get(i10)).l()) {
                return true;
            }
        }
        return false;
    }

    public void Z0(float f5) {
        this.f27479p0 = f5;
    }

    public boolean a0() {
        return (this.f27470l == -1 && this.f27472m == -1) ? false : true;
    }

    public void a1(int i10) {
        this.A0 = i10;
    }

    public boolean b0(int i10, int i11) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.O.f27433f;
            return dVar3 != null && dVar3.m() && (dVar2 = this.Q.f27433f) != null && dVar2.m() && (this.Q.f27433f.d() - this.Q.e()) - (this.O.f27433f.d() + this.O.e()) >= i11;
        }
        d dVar4 = this.P.f27433f;
        return dVar4 != null && dVar4.m() && (dVar = this.R.f27433f) != null && dVar.m() && (this.R.f27433f.d() - this.R.e()) - (this.P.f27433f.d() + this.P.e()) >= i11;
        return false;
    }

    public void b1(int i10, int i11) {
        this.f27461g0 = i10;
        int i12 = i11 - i10;
        this.f27453c0 = i12;
        int i13 = this.f27475n0;
        if (i12 < i13) {
            this.f27453c0 = i13;
        }
    }

    public void c0(d.b bVar, e eVar, d.b bVar2, int i10, int i11) {
        m(bVar).a(eVar.m(bVar2), i10, i11, true);
    }

    public void c1(b bVar) {
        this.Z[1] = bVar;
    }

    public void d1(int i10, int i11, int i12, float f5) {
        this.f27494x = i10;
        this.C = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.D = i12;
        this.E = f5;
        if (f5 <= 0.0f || f5 >= 1.0f || i10 != 0) {
            return;
        }
        this.f27494x = 2;
    }

    public void e(f fVar, r.d dVar, HashSet hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.O1(64));
        }
        if (i10 == 0) {
            HashSet hashSetC = this.O.c();
            if (hashSetC != null) {
                Iterator it = hashSetC.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f27431d.e(fVar, dVar, hashSet, i10, true);
                }
            }
            HashSet hashSetC2 = this.Q.c();
            if (hashSetC2 != null) {
                Iterator it2 = hashSetC2.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).f27431d.e(fVar, dVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet hashSetC3 = this.P.c();
        if (hashSetC3 != null) {
            Iterator it3 = hashSetC3.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).f27431d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet hashSetC4 = this.R.c();
        if (hashSetC4 != null) {
            Iterator it4 = hashSetC4.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).f27431d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet hashSetC5 = this.S.c();
        if (hashSetC5 != null) {
            Iterator it5 = hashSetC5.iterator();
            while (it5.hasNext()) {
                ((d) it5.next()).f27431d.e(fVar, dVar, hashSet, i10, true);
            }
        }
    }

    public boolean e0() {
        return this.f27482r;
    }

    public void e1(float f5) {
        this.D0[1] = f5;
    }

    boolean f() {
        return this instanceof g;
    }

    public boolean f0(int i10) {
        return this.Y[i10];
    }

    public void f1(int i10) {
        this.f27485s0 = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x05d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(r.d r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.e.g(r.d, boolean):void");
    }

    public boolean g0() {
        d dVar = this.O;
        d dVar2 = dVar.f27433f;
        if (dVar2 != null && dVar2.f27433f == dVar) {
            return true;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f27433f;
        return dVar4 != null && dVar4.f27433f == dVar3;
    }

    public void g1(int i10) {
        this.f27451b0 = i10;
        int i11 = this.f27473m0;
        if (i10 < i11) {
            this.f27451b0 = i11;
        }
    }

    public boolean h() {
        return this.f27485s0 != 8;
    }

    public boolean h0() {
        return this.K;
    }

    public void h1(int i10) {
        if (i10 < 0 || i10 > 3) {
            return;
        }
        this.f27490v = i10;
    }

    public boolean i0() {
        d dVar = this.P;
        d dVar2 = dVar.f27433f;
        if (dVar2 != null && dVar2.f27433f == dVar) {
            return true;
        }
        d dVar3 = this.R;
        d dVar4 = dVar3.f27433f;
        return dVar4 != null && dVar4.f27433f == dVar3;
    }

    public void i1(int i10) {
        this.f27459f0 = i10;
    }

    public void j(e eVar, float f5, int i10) {
        d.b bVar = d.b.CENTER;
        c0(bVar, eVar, bVar, i10, 0);
        this.I = f5;
    }

    public boolean j0() {
        return this.L;
    }

    public void j1(int i10) {
        this.f27461g0 = i10;
    }

    public void k(r.d dVar) {
        dVar.q(this.O);
        dVar.q(this.P);
        dVar.q(this.Q);
        dVar.q(this.R);
        if (this.f27471l0 > 0) {
            dVar.q(this.S);
        }
    }

    public boolean k0() {
        return this.f27464i && this.f27485s0 != 8;
    }

    public void k1(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.F == -1) {
            if (z12 && !z13) {
                this.F = 0;
            } else if (!z12 && z13) {
                this.F = 1;
                if (this.f27457e0 == -1) {
                    this.G = 1.0f / this.G;
                }
            }
        }
        if (this.F == 0 && (!this.P.n() || !this.R.n())) {
            this.F = 1;
        } else if (this.F == 1 && (!this.O.n() || !this.Q.n())) {
            this.F = 0;
        }
        if (this.F == -1 && (!this.P.n() || !this.R.n() || !this.O.n() || !this.Q.n())) {
            if (this.P.n() && this.R.n()) {
                this.F = 0;
            } else if (this.O.n() && this.Q.n()) {
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
        if (this.F == -1) {
            int i10 = this.f27498z;
            if (i10 > 0 && this.C == 0) {
                this.F = 0;
            } else {
                if (i10 != 0 || this.C <= 0) {
                    return;
                }
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
    }

    public void l() {
        if (this.f27456e == null) {
            this.f27456e = new l(this);
        }
        if (this.f27458f == null) {
            this.f27458f = new n(this);
        }
    }

    public boolean l0() {
        return this.f27478p || (this.O.m() && this.Q.m());
    }

    public void l1(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean zK = z10 & this.f27456e.k();
        boolean zK2 = z11 & this.f27458f.k();
        l lVar = this.f27456e;
        int i12 = lVar.f27771h.f27717g;
        n nVar = this.f27458f;
        int i13 = nVar.f27771h.f27717g;
        int i14 = lVar.f27772i.f27717g;
        int i15 = nVar.f27772i.f27717g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (zK) {
            this.f27459f0 = i12;
        }
        if (zK2) {
            this.f27461g0 = i13;
        }
        if (this.f27485s0 == 8) {
            this.f27451b0 = 0;
            this.f27453c0 = 0;
            return;
        }
        if (zK) {
            if (this.Z[0] == b.FIXED && i17 < (i11 = this.f27451b0)) {
                i17 = i11;
            }
            this.f27451b0 = i17;
            int i19 = this.f27473m0;
            if (i17 < i19) {
                this.f27451b0 = i19;
            }
        }
        if (zK2) {
            if (this.Z[1] == b.FIXED && i18 < (i10 = this.f27453c0)) {
                i18 = i10;
            }
            this.f27453c0 = i18;
            int i20 = this.f27475n0;
            if (i18 < i20) {
                this.f27453c0 = i20;
            }
        }
    }

    public d m(d.b bVar) {
        switch (a.f27500a[bVar.ordinal()]) {
            case 1:
                return this.O;
            case 2:
                return this.P;
            case 3:
                return this.Q;
            case 4:
                return this.R;
            case 5:
                return this.S;
            case 6:
                return this.V;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                return this.T;
            case 8:
                return this.U;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public boolean m0() {
        return this.f27480q || (this.P.m() && this.R.m());
    }

    public void m1(r.d dVar, boolean z10) {
        n nVar;
        l lVar;
        int iX = dVar.x(this.O);
        int iX2 = dVar.x(this.P);
        int iX3 = dVar.x(this.Q);
        int iX4 = dVar.x(this.R);
        if (z10 && (lVar = this.f27456e) != null) {
            v.f fVar = lVar.f27771h;
            if (fVar.f27720j) {
                v.f fVar2 = lVar.f27772i;
                if (fVar2.f27720j) {
                    iX = fVar.f27717g;
                    iX3 = fVar2.f27717g;
                }
            }
        }
        if (z10 && (nVar = this.f27458f) != null) {
            v.f fVar3 = nVar.f27771h;
            if (fVar3.f27720j) {
                v.f fVar4 = nVar.f27772i;
                if (fVar4.f27720j) {
                    iX2 = fVar3.f27717g;
                    iX4 = fVar4.f27717g;
                }
            }
        }
        int i10 = iX4 - iX2;
        if (iX3 - iX < 0 || i10 < 0 || iX == Integer.MIN_VALUE || iX == Integer.MAX_VALUE || iX2 == Integer.MIN_VALUE || iX2 == Integer.MAX_VALUE || iX3 == Integer.MIN_VALUE || iX3 == Integer.MAX_VALUE || iX4 == Integer.MIN_VALUE || iX4 == Integer.MAX_VALUE) {
            iX4 = 0;
            iX = 0;
            iX2 = 0;
            iX3 = 0;
        }
        G0(iX, iX2, iX3, iX4);
    }

    public int n() {
        return this.f27471l0;
    }

    public boolean n0() {
        return this.f27484s;
    }

    public float o(int i10) {
        if (i10 == 0) {
            return this.f27477o0;
        }
        if (i10 == 1) {
            return this.f27479p0;
        }
        return -1.0f;
    }

    public void o0() {
        this.f27482r = true;
    }

    public int p() {
        return W() + this.f27453c0;
    }

    public void p0() {
        this.f27484s = true;
    }

    public Object q() {
        return this.f27481q0;
    }

    public boolean q0() {
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public String r() {
        return this.f27489u0;
    }

    public void r0() {
        this.O.p();
        this.P.p();
        this.Q.p();
        this.R.p();
        this.S.p();
        this.T.p();
        this.U.p();
        this.V.p();
        this.f27449a0 = null;
        this.I = 0.0f;
        this.f27451b0 = 0;
        this.f27453c0 = 0;
        this.f27455d0 = 0.0f;
        this.f27457e0 = -1;
        this.f27459f0 = 0;
        this.f27461g0 = 0;
        this.f27467j0 = 0;
        this.f27469k0 = 0;
        this.f27471l0 = 0;
        this.f27473m0 = 0;
        this.f27475n0 = 0;
        float f5 = K0;
        this.f27477o0 = f5;
        this.f27479p0 = f5;
        b[] bVarArr = this.Z;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f27481q0 = null;
        this.f27483r0 = 0;
        this.f27485s0 = 0;
        this.f27491v0 = null;
        this.f27493w0 = false;
        this.f27495x0 = false;
        this.f27499z0 = 0;
        this.A0 = 0;
        this.B0 = false;
        this.C0 = false;
        float[] fArr = this.D0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f27486t = -1;
        this.f27488u = -1;
        int[] iArr = this.H;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f27492w = 0;
        this.f27494x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.f27498z = 0;
        this.C = 0;
        this.f27462h = false;
        this.F = -1;
        this.G = 1.0f;
        this.f27497y0 = false;
        boolean[] zArr = this.f27460g;
        zArr[0] = true;
        zArr[1] = true;
        this.L = false;
        boolean[] zArr2 = this.Y;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f27464i = true;
        int[] iArr2 = this.f27496y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f27470l = -1;
        this.f27472m = -1;
    }

    public b s(int i10) {
        if (i10 == 0) {
            return y();
        }
        if (i10 == 1) {
            return R();
        }
        return null;
    }

    public void s0() {
        this.f27478p = false;
        this.f27480q = false;
        this.f27482r = false;
        this.f27484s = false;
        int size = this.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.X.get(i10)).q();
        }
    }

    public float t() {
        return this.f27455d0;
    }

    public void t0(r.c cVar) {
        this.O.r(cVar);
        this.P.r(cVar);
        this.Q.r(cVar);
        this.R.r(cVar);
        this.S.r(cVar);
        this.V.r(cVar);
        this.T.r(cVar);
        this.U.r(cVar);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f27491v0 != null) {
            str = "type: " + this.f27491v0 + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f27489u0 != null) {
            str2 = "id: " + this.f27489u0 + " ";
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f27459f0);
        sb2.append(", ");
        sb2.append(this.f27461g0);
        sb2.append(") - (");
        sb2.append(this.f27451b0);
        sb2.append(" x ");
        sb2.append(this.f27453c0);
        sb2.append(")");
        return sb2.toString();
    }

    public int u() {
        return this.f27457e0;
    }

    public int v() {
        if (this.f27485s0 == 8) {
            return 0;
        }
        return this.f27453c0;
    }

    public float w() {
        return this.f27477o0;
    }

    public int x() {
        return this.f27499z0;
    }

    public void x0(int i10) {
        this.f27471l0 = i10;
        this.J = i10 > 0;
    }

    public b y() {
        return this.Z[0];
    }

    public void y0(Object obj) {
        this.f27481q0 = obj;
    }

    public int z() {
        d dVar = this.O;
        int i10 = dVar != null ? 0 + dVar.f27434g : 0;
        d dVar2 = this.Q;
        return dVar2 != null ? i10 + dVar2.f27434g : i10;
    }

    public void z0(String str) {
        this.f27489u0 = str;
    }
}

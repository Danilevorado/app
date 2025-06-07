package v;

import u.e;
import v.f;
import v.p;

/* loaded from: classes.dex */
public class l extends p {

    /* renamed from: k, reason: collision with root package name */
    private static int[] f27736k = new int[2];

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27737a;

        static {
            int[] iArr = new int[p.b.values().length];
            f27737a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27737a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27737a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(u.e eVar) {
        super(eVar);
        this.f27771h.f27715e = f.a.LEFT;
        this.f27772i.f27715e = f.a.RIGHT;
        this.f27769f = 0;
    }

    private void q(int[] iArr, int i10, int i11, int i12, int i13, float f5, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f5) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f5) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f5) + 0.5f);
        int i18 = (int) ((i15 / f5) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0296, code lost:
    
        if (r14 != 1) goto L134;
     */
    @Override // v.p, v.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(v.d r17) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.l.a(v.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01c2  */
    @Override // v.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void d() {
        /*
            Method dump skipped, instructions count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.l.d():void");
    }

    @Override // v.p
    public void e() {
        f fVar = this.f27771h;
        if (fVar.f27720j) {
            this.f27765b.i1(fVar.f27717g);
        }
    }

    @Override // v.p
    void f() {
        this.f27766c = null;
        this.f27771h.c();
        this.f27772i.c();
        this.f27768e.c();
        this.f27770g = false;
    }

    @Override // v.p
    boolean m() {
        return this.f27767d != e.b.MATCH_CONSTRAINT || this.f27765b.f27492w == 0;
    }

    void r() {
        this.f27770g = false;
        this.f27771h.c();
        this.f27771h.f27720j = false;
        this.f27772i.c();
        this.f27772i.f27720j = false;
        this.f27768e.f27720j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f27765b.r();
    }
}

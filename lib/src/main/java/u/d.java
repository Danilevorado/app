package u;

import com.facebook.ads.internal.api.AdSizeApi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import r.i;
import v.o;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private int f27429b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27430c;

    /* renamed from: d, reason: collision with root package name */
    public final e f27431d;

    /* renamed from: e, reason: collision with root package name */
    public final b f27432e;

    /* renamed from: f, reason: collision with root package name */
    public d f27433f;

    /* renamed from: i, reason: collision with root package name */
    r.i f27436i;

    /* renamed from: a, reason: collision with root package name */
    private HashSet f27428a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f27434g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f27435h = Integer.MIN_VALUE;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27437a;

        static {
            int[] iArr = new int[b.values().length];
            f27437a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27437a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27437a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27437a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27437a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27437a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27437a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27437a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27437a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f27431d = eVar;
        this.f27432e = bVar;
    }

    public boolean a(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            p();
            return true;
        }
        if (!z10 && !o(dVar)) {
            return false;
        }
        this.f27433f = dVar;
        if (dVar.f27428a == null) {
            dVar.f27428a = new HashSet();
        }
        HashSet hashSet = this.f27433f.f27428a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f27434g = i10;
        this.f27435h = i11;
        return true;
    }

    public void b(int i10, ArrayList arrayList, o oVar) {
        HashSet hashSet = this.f27428a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                v.i.a(((d) it.next()).f27431d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet c() {
        return this.f27428a;
    }

    public int d() {
        if (this.f27430c) {
            return this.f27429b;
        }
        return 0;
    }

    public int e() {
        d dVar;
        if (this.f27431d.T() == 8) {
            return 0;
        }
        return (this.f27435h == Integer.MIN_VALUE || (dVar = this.f27433f) == null || dVar.f27431d.T() != 8) ? this.f27434g : this.f27435h;
    }

    public final d f() {
        switch (a.f27437a[this.f27432e.ordinal()]) {
            case 1:
            case 6:
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f27431d.Q;
            case 3:
                return this.f27431d.O;
            case 4:
                return this.f27431d.R;
            case 5:
                return this.f27431d.P;
            default:
                throw new AssertionError(this.f27432e.name());
        }
    }

    public e g() {
        return this.f27431d;
    }

    public r.i h() {
        return this.f27436i;
    }

    public d i() {
        return this.f27433f;
    }

    public b j() {
        return this.f27432e;
    }

    public boolean k() {
        HashSet hashSet = this.f27428a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).f().n()) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        HashSet hashSet = this.f27428a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean m() {
        return this.f27430c;
    }

    public boolean n() {
        return this.f27433f != null;
    }

    public boolean o(d dVar) {
        if (dVar == null) {
            return false;
        }
        b bVarJ = dVar.j();
        b bVar = this.f27432e;
        if (bVarJ == bVar) {
            return bVar != b.BASELINE || (dVar.g().X() && g().X());
        }
        switch (a.f27437a[bVar.ordinal()]) {
            case 1:
                return (bVarJ == b.BASELINE || bVarJ == b.CENTER_X || bVarJ == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z10 = bVarJ == b.LEFT || bVarJ == b.RIGHT;
                if (dVar.g() instanceof g) {
                    return z10 || bVarJ == b.CENTER_X;
                }
                return z10;
            case 4:
            case 5:
                boolean z11 = bVarJ == b.TOP || bVarJ == b.BOTTOM;
                if (dVar.g() instanceof g) {
                    return z11 || bVarJ == b.CENTER_Y;
                }
                return z11;
            case 6:
                return (bVarJ == b.LEFT || bVarJ == b.RIGHT) ? false : true;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f27432e.name());
        }
    }

    public void p() {
        HashSet hashSet;
        d dVar = this.f27433f;
        if (dVar != null && (hashSet = dVar.f27428a) != null) {
            hashSet.remove(this);
            if (this.f27433f.f27428a.size() == 0) {
                this.f27433f.f27428a = null;
            }
        }
        this.f27428a = null;
        this.f27433f = null;
        this.f27434g = 0;
        this.f27435h = Integer.MIN_VALUE;
        this.f27430c = false;
        this.f27429b = 0;
    }

    public void q() {
        this.f27430c = false;
        this.f27429b = 0;
    }

    public void r(r.c cVar) {
        r.i iVar = this.f27436i;
        if (iVar == null) {
            this.f27436i = new r.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.k();
        }
    }

    public void s(int i10) {
        this.f27429b = i10;
        this.f27430c = true;
    }

    public String toString() {
        return this.f27431d.r() + ":" + this.f27432e.toString();
    }
}

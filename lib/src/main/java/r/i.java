package r;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class i implements Comparable {
    private static int D = 1;

    /* renamed from: m, reason: collision with root package name */
    public boolean f26393m;

    /* renamed from: n, reason: collision with root package name */
    private String f26394n;

    /* renamed from: r, reason: collision with root package name */
    public float f26398r;

    /* renamed from: v, reason: collision with root package name */
    a f26402v;

    /* renamed from: o, reason: collision with root package name */
    public int f26395o = -1;

    /* renamed from: p, reason: collision with root package name */
    int f26396p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f26397q = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f26399s = false;

    /* renamed from: t, reason: collision with root package name */
    float[] f26400t = new float[9];

    /* renamed from: u, reason: collision with root package name */
    float[] f26401u = new float[9];

    /* renamed from: w, reason: collision with root package name */
    b[] f26403w = new b[16];

    /* renamed from: x, reason: collision with root package name */
    int f26404x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f26405y = 0;

    /* renamed from: z, reason: collision with root package name */
    boolean f26406z = false;
    int A = -1;
    float B = 0.0f;
    HashSet C = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f26402v = aVar;
    }

    static void g() {
        D++;
    }

    public final void b(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f26404x;
            if (i10 >= i11) {
                b[] bVarArr = this.f26403w;
                if (i11 >= bVarArr.length) {
                    this.f26403w = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f26403w;
                int i12 = this.f26404x;
                bVarArr2[i12] = bVar;
                this.f26404x = i12 + 1;
                return;
            }
            if (this.f26403w[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f26395o - iVar.f26395o;
    }

    public final void i(b bVar) {
        int i10 = this.f26404x;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f26403w[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f26403w;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f26404x--;
                return;
            }
            i11++;
        }
    }

    public void k() {
        this.f26394n = null;
        this.f26402v = a.UNKNOWN;
        this.f26397q = 0;
        this.f26395o = -1;
        this.f26396p = -1;
        this.f26398r = 0.0f;
        this.f26399s = false;
        this.f26406z = false;
        this.A = -1;
        this.B = 0.0f;
        int i10 = this.f26404x;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f26403w[i11] = null;
        }
        this.f26404x = 0;
        this.f26405y = 0;
        this.f26393m = false;
        Arrays.fill(this.f26401u, 0.0f);
    }

    public void l(d dVar, float f5) {
        this.f26398r = f5;
        this.f26399s = true;
        this.f26406z = false;
        this.A = -1;
        this.B = 0.0f;
        int i10 = this.f26404x;
        this.f26396p = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f26403w[i11].A(dVar, this, false);
        }
        this.f26404x = 0;
    }

    public void m(a aVar, String str) {
        this.f26402v = aVar;
    }

    public final void n(d dVar, b bVar) {
        int i10 = this.f26404x;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f26403w[i11].B(dVar, bVar, false);
        }
        this.f26404x = 0;
    }

    public String toString() {
        StringBuilder sb2;
        if (this.f26394n != null) {
            sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(this.f26394n);
        } else {
            sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(this.f26395o);
        }
        return sb2.toString();
    }
}

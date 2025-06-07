package q0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class l implements u0.j, u0.i {

    /* renamed from: u, reason: collision with root package name */
    static final TreeMap f26082u = new TreeMap();

    /* renamed from: m, reason: collision with root package name */
    private volatile String f26083m;

    /* renamed from: n, reason: collision with root package name */
    final long[] f26084n;

    /* renamed from: o, reason: collision with root package name */
    final double[] f26085o;

    /* renamed from: p, reason: collision with root package name */
    final String[] f26086p;

    /* renamed from: q, reason: collision with root package name */
    final byte[][] f26087q;

    /* renamed from: r, reason: collision with root package name */
    private final int[] f26088r;

    /* renamed from: s, reason: collision with root package name */
    final int f26089s;

    /* renamed from: t, reason: collision with root package name */
    int f26090t;

    private l(int i10) {
        this.f26089s = i10;
        int i11 = i10 + 1;
        this.f26088r = new int[i11];
        this.f26084n = new long[i11];
        this.f26085o = new double[i11];
        this.f26086p = new String[i11];
        this.f26087q = new byte[i11][];
    }

    public static l e(String str, int i10) {
        TreeMap treeMap = f26082u;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (entryCeilingEntry == null) {
                l lVar = new l(i10);
                lVar.f(str, i10);
                return lVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            l lVar2 = (l) entryCeilingEntry.getValue();
            lVar2.f(str, i10);
            return lVar2;
        }
    }

    private static void g() {
        TreeMap treeMap = f26082u;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i10 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i10;
        }
    }

    @Override // u0.i
    public void G(int i10, long j10) {
        this.f26088r[i10] = 2;
        this.f26084n[i10] = j10;
    }

    @Override // u0.i
    public void L(int i10, byte[] bArr) {
        this.f26088r[i10] = 5;
        this.f26087q[i10] = bArr;
    }

    @Override // u0.j
    public String a() {
        return this.f26083m;
    }

    @Override // u0.j
    public void c(u0.i iVar) {
        for (int i10 = 1; i10 <= this.f26090t; i10++) {
            int i11 = this.f26088r[i10];
            if (i11 == 1) {
                iVar.v(i10);
            } else if (i11 == 2) {
                iVar.G(i10, this.f26084n[i10]);
            } else if (i11 == 3) {
                iVar.w(i10, this.f26085o[i10]);
            } else if (i11 == 4) {
                iVar.q(i10, this.f26086p[i10]);
            } else if (i11 == 5) {
                iVar.L(i10, this.f26087q[i10]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    void f(String str, int i10) {
        this.f26083m = str;
        this.f26090t = i10;
    }

    @Override // u0.i
    public void q(int i10, String str) {
        this.f26088r[i10] = 4;
        this.f26086p[i10] = str;
    }

    public void s() {
        TreeMap treeMap = f26082u;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f26089s), this);
            g();
        }
    }

    @Override // u0.i
    public void v(int i10) {
        this.f26088r[i10] = 1;
    }

    @Override // u0.i
    public void w(int i10, double d10) {
        this.f26088r[i10] = 3;
        this.f26085o[i10] = d10;
    }
}

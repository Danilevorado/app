package m3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f25229a;

    /* renamed from: b, reason: collision with root package name */
    private final double[] f25230b;

    /* renamed from: c, reason: collision with root package name */
    private final double[] f25231c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f25232d;

    /* renamed from: e, reason: collision with root package name */
    private int f25233e;

    /* synthetic */ h0(f0 f0Var, g0 g0Var) {
        int size = f0Var.f25220b.size();
        this.f25229a = (String[]) f0Var.f25219a.toArray(new String[size]);
        this.f25230b = c(f0Var.f25220b);
        this.f25231c = c(f0Var.f25221c);
        this.f25232d = new int[size];
        this.f25233e = 0;
    }

    private static final double[] c(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) list.get(i10)).doubleValue();
        }
        return dArr;
    }

    public final List a() {
        ArrayList arrayList = new ArrayList(this.f25229a.length);
        int i10 = 0;
        while (true) {
            String[] strArr = this.f25229a;
            if (i10 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i10];
            double d10 = this.f25231c[i10];
            double d11 = this.f25230b[i10];
            int i11 = this.f25232d[i10];
            arrayList.add(new e0(str, d10, d11, i11 / this.f25233e, i11));
            i10++;
        }
    }

    public final void b(double d10) {
        this.f25233e++;
        int i10 = 0;
        while (true) {
            double[] dArr = this.f25231c;
            if (i10 >= dArr.length) {
                return;
            }
            double d11 = dArr[i10];
            if (d11 <= d10 && d10 < this.f25230b[i10]) {
                int[] iArr = this.f25232d;
                iArr[i10] = iArr[i10] + 1;
            }
            if (d10 < d11) {
                return;
            } else {
                i10++;
            }
        }
    }
}
